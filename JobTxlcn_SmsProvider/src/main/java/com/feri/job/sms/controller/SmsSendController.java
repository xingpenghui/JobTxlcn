package com.feri.job.sms.controller;

import com.feri.job.common.dto.JobSmsDto;
import com.feri.job.common.vo.R;
import com.feri.job.sms.service.SmsSendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: JobTxlcn
 * @description:
 * @author: Feri
 * @create: 2020-03-24 15:28
 */
@RestController
public class SmsSendController {
    @Autowired
    private SmsSendService smsSendService;

    //发送短信-投递成功通知短信
    @PostMapping("/provider/sms/sendtd.do")
    public R sendTd(@RequestBody JobSmsDto smsDto ){
        return smsSendService.sendTd(smsDto);
    }
}
