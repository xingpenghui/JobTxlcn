package com.feri.job.consumer.service;

import com.feri.job.common.dto.UserJobDto;
import com.feri.job.common.vo.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @program: JobTxlcn
 * @description:
 * @author: Feri
 * @create: 2020-03-24 16:12
 */
@FeignClient("DeliveryProvider")
public interface DeliveryService {
    @PostMapping("/provider/delivery/td.do")
    R td(@RequestBody UserJobDto dto);
}
