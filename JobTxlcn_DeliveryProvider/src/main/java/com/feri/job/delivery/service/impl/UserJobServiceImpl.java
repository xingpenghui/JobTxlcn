package com.feri.job.delivery.service.impl;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.codingapi.txlcn.tc.annotation.TccTransaction;
import com.codingapi.txlcn.tc.annotation.TxcTransaction;
import com.codingapi.txlcn.tc.support.DTXUserControls;
import com.feri.job.common.dto.JobSmsDto;
import com.feri.job.common.dto.UserJobDto;
import com.feri.job.common.vo.R;
import com.feri.job.delivery.dao.UserJobDao;
import com.feri.job.delivery.provider.JobProvider;
import com.feri.job.delivery.provider.SmsProvider;
import com.feri.job.delivery.service.UserJobService;
import com.feri.job.entity.QcjobLog;
import com.feri.job.entity.SmsLog;
import com.feri.job.entity.Userjob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: JobTxlcn
 * @description:
 * @author: Feri
 * @create: 2020-03-24 16:06
 */
@Service
public class UserJobServiceImpl implements UserJobService {
    @Autowired
    private UserJobDao dao;

    @Autowired
    private JobProvider jobProvider;
    @Autowired
    private SmsProvider smsProvider;

    //简历投递 需要调用其他2个服务实现响应的操作
    @Transactional
    @LcnTransaction
    @Override
    public R delivery(UserJobDto dto) {
        try{
            //发送短信
            JobSmsDto smsLog=new JobSmsDto();
            smsLog.setJid(dto.getJid());
            smsLog.setPhone(dto.getPhone());
            //调用短信服务的 发送短信方法
            smsProvider.sendTd(smsLog);

            //记录职位投递
            QcjobLog qcjobLog=new QcjobLog();
            qcjobLog.setJid(dto.getJid());
            qcjobLog.setUid(dto.getUid());

            //调用 职位服务的 职位投递方法
            jobProvider.td(qcjobLog);


            //记录用户的投递记录
            Userjob userjob=new Userjob();
            userjob.setUid(dto.getUid());
            userjob.setJid(dto.getJid());
            dao.save(userjob);
            //故意报错
            throw new RuntimeException("分布式事务");
        }catch (Exception e){
            DTXUserControls.rollbackCurrentGroup();
            return R.fail();
        }

    }
}
