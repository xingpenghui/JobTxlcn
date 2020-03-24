package com.feri.job.job.dao;

import com.feri.job.entity.QcjobLog;
import org.apache.ibatis.annotations.Insert;

/**
 * @program: JobTxlcn
 * @description:
 * @author: Feri
 * @create: 2020-03-24 15:35
 */
public interface QcJobLogDao {
    //新增
    @Insert("insert into t_qcjob_log(jid,uid,ctime) values(#{jid},#{uid},now())")
    int save(QcjobLog log);

}
