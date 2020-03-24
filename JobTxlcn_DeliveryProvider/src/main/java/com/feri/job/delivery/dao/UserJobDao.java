package com.feri.job.delivery.dao;

import com.feri.job.entity.Userjob;
import org.apache.ibatis.annotations.Insert;

/**
 * @program: JobTxlcn
 * @description:
 * @author: Feri
 * @create: 2020-03-24 16:04
 */
public interface UserJobDao {
    @Insert("insert into t_userjob(uid,jid,flag,cdate,ctime) values(#{uid},#{jid},1,now(),now())")
    int save(Userjob userjob);
}
