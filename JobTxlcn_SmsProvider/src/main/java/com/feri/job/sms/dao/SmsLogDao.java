package com.feri.job.sms.dao;

import com.feri.job.entity.SmsLog;
import org.apache.ibatis.annotations.Insert;

/**
 * @program: JobTxlcn
 * @description:
 * @author: Feri
 * @create: 2020-03-24 15:59
 */
public interface SmsLogDao {
    @Insert("insert into t_smslog(phone,msg,ctime) values(#{phone},#{msg},now())")
    int save(SmsLog log);
}
