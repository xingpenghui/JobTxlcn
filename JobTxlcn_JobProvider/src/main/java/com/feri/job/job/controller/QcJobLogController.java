package com.feri.job.job.controller;

import com.feri.job.common.dto.UserJobDto;
import com.feri.job.common.vo.R;
import com.feri.job.entity.QcjobLog;
import com.feri.job.job.service.QcJobLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: JobTxlcn
 * @description:
 * @author: Feri
 * @create: 2020-03-24 15:36
 */
@RestController
public class QcJobLogController {
    @Autowired
    private QcJobLogService service;

    //新增职位投递记录
    @PostMapping("/provider/job/addjl.do")
    public R td(@RequestBody QcjobLog log){
        return service.save(log);
    }
}
