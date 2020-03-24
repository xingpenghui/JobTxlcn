package com.feri.job.entity;

import java.util.Date;


public class Qcjob {
    private Integer id;

    private String jobname;

    private String comname;

    private String workaddr;

    private String salaryrang;

    private Date utime;

    private String jobdetailurl;

    private Date ctime;

    private Integer jid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname == null ? null : jobname.trim();
    }

    public String getComname() {
        return comname;
    }

    public void setComname(String comname) {
        this.comname = comname == null ? null : comname.trim();
    }

    public String getWorkaddr() {
        return workaddr;
    }

    public void setWorkaddr(String workaddr) {
        this.workaddr = workaddr == null ? null : workaddr.trim();
    }

    public String getSalaryrang() {
        return salaryrang;
    }

    public void setSalaryrang(String salaryrang) {
        this.salaryrang = salaryrang == null ? null : salaryrang.trim();
    }

    public Date getUtime() {
        return utime;
    }

    public void setUtime(Date utime) {
        this.utime = utime;
    }

    public String getJobdetailurl() {
        return jobdetailurl;
    }

    public void setJobdetailurl(String jobdetailurl) {
        this.jobdetailurl = jobdetailurl == null ? null : jobdetailurl.trim();
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Integer getJid() {
        return jid;
    }

    public void setJid(Integer jid) {
        this.jid = jid;
    }
}