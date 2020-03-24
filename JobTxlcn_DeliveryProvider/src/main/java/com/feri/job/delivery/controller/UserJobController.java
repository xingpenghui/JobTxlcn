package com.feri.job.delivery.controller;

import com.feri.job.common.dto.UserJobDto;
import com.feri.job.common.vo.R;
import com.feri.job.delivery.service.UserJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: JobTxlcn
 * @description:
 * @author: Feri
 * @create: 2020-03-24 16:07
 */
@RestController
public class UserJobController {
    @Autowired
    private UserJobService service;

    @PostMapping("/provider/delivery/td.do")
    public R td(@RequestBody UserJobDto dto){
        return service.delivery(dto);
    }
}
