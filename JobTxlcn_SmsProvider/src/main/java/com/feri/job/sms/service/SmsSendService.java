package com.feri.job.sms.service;

import com.feri.job.common.dto.JobSmsDto;
import com.feri.job.common.vo.R;

/**
 * @program: JobTxlcn
 * @description:
 * @author: Feri
 * @create: 2020-03-24 15:28
 */
public interface SmsSendService {
    R sendTd(JobSmsDto smsDto);
}
