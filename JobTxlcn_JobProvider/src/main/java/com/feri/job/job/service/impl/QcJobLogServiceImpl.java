package com.feri.job.job.service.impl;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.codingapi.txlcn.tc.annotation.TccTransaction;
import com.feri.job.common.vo.R;
import com.feri.job.entity.QcjobLog;
import com.feri.job.job.dao.QcJobLogDao;
import com.feri.job.job.service.QcJobLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: JobTxlcn
 * @description:
 * @author: Feri
 * @create: 2020-03-24 15:35
 */
@Service
public class QcJobLogServiceImpl implements QcJobLogService {
    @Autowired
    private QcJobLogDao dao;


    @Transactional
    @LcnTransaction
    @Override
    public R save(QcjobLog log) {
        if(dao.save(log)>0){
            return R.ok();
        }else {
            return R.fail();
        }
    }
}
