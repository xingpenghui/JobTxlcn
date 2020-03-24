package com.feri.job.delivery.provider;

import com.feri.job.common.dto.JobSmsDto;
import com.feri.job.common.vo.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @program: JobTxlcn
 * @description:
 * @author: Feri
 * @create: 2020-03-24 16:32
 */
@FeignClient("SmsProvider")
public interface SmsProvider {
    //发送短信-投递成功通知短信
    @PostMapping("/provider/sms/sendtd.do")
    R sendTd(@RequestBody JobSmsDto smsDto);
}
