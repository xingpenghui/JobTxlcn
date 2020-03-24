package com.feri.job.sms.service.impl;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.codingapi.txlcn.tc.annotation.TccTransaction;
import com.feri.job.common.dto.JobSmsDto;
import com.feri.job.common.vo.R;
import com.feri.job.entity.SmsLog;
import com.feri.job.sms.core.AliyunSmsUtil;
import com.feri.job.sms.dao.SmsLogDao;
import com.feri.job.sms.service.SmsSendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: JobTxlcn
 * @description:
 * @author: Feri
 * @create: 2020-03-24 15:28
 */
@Service
public class SmsSendServiceImpl implements SmsSendService {

    @Autowired
    private SmsLogDao dao;

    @Transactional
    @LcnTransaction
    @Override
    public R sendTd(JobSmsDto smsDto) {
        SmsLog log=new SmsLog();
        log.setMsg("用户投递职位："+smsDto.getJid());
        log.setPhone(smsDto.getPhone());
        if(dao.save(log)>0){
            return R.ok();
        }else {
            return R.fail();
        }
//        if(AliyunSmsUtil.sendSms(smsDto.getPhone(),smsDto.getJid())){
//            return R.ok();
//        }else {
//            return R.fail();
//        }
    }
}
