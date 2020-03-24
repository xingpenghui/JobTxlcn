package com.feri.job.entity;

import lombok.Data;

import java.util.Date;

/**
 * @program: JobTxlcn
 * @description:
 * @author: Feri
 * @create: 2020-03-24 16:00
 */
@Data
public class SmsLog {
    private Integer id;
    private String phone;
    private String msg;
    private Date ctime;
}
