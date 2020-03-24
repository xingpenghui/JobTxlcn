package com.feri.job.consumer.api;

import com.feri.job.common.dto.UserJobDto;
import com.feri.job.common.vo.R;
import com.feri.job.consumer.service.DeliveryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: JobTxlcn
 * @description:
 * @author: Feri
 * @create: 2020-03-24 15:47
 */
@RestController
@Api(value = "简历投递",tags = "简历投递")
public class DeliveryApi {
    @Autowired
    private DeliveryService service;
    @ApiOperation(value = "实现简历的投递",notes = "实现简历的投递")
    @PostMapping("api/delivery/td.do")
    public R td(@RequestBody UserJobDto dto){
        return service.td(dto);
    }

}
