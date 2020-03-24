package com.feri.job.delivery.provider;

import com.feri.job.common.vo.R;
import com.feri.job.entity.QcjobLog;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @program: JobTxlcn
 * @description:
 * @author: Feri
 * @create: 2020-03-24 16:31
 */
@FeignClient("JobProvider")
public interface JobProvider {
    //新增职位投递记录
    @PostMapping("/provider/job/addjl.do")
    R td(@RequestBody QcjobLog log);
}