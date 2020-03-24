package com.feri.job.job.service;

import com.feri.job.common.vo.R;
import com.feri.job.entity.QcjobLog;

/**
 * @program: JobTxlcn
 * @description:
 * @author: Feri
 * @create: 2020-03-24 15:35
 */
public interface QcJobLogService {
    R save(QcjobLog log);
}
