package com.feri.job.delivery.service;

import com.feri.job.common.dto.UserJobDto;
import com.feri.job.common.vo.R;

/**
 * @program: JobTxlcn
 * @description:
 * @author: Feri
 * @create: 2020-03-24 16:05
 */
public interface UserJobService {
    R delivery(UserJobDto dto);
}
