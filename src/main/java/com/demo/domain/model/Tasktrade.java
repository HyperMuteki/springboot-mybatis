package com.demo.domain.model;

import java.util.Date;

public class Tasktrade {
    private Long trId;

    private Date trStartTime;

    private Date trEndTime;

    private Integer tid;

    private Integer status;

    private Integer acId;

    public Long getTrId() {
        return trId;
    }

    public void setTrId(Long trId) {
        this.trId = trId;
    }

    public Date getTrStartTime() {
        return trStartTime;
    }

    public void setTrStartTime(Date trStartTime) {
        this.trStartTime = trStartTime;
    }

    public Date getTrEndTime() {
        return trEndTime;
    }

    public void setTrEndTime(Date trEndTime) {
        this.trEndTime = trEndTime;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getAcId() {
        return acId;
    }

    public void setAcId(Integer acId) {
        this.acId = acId;
    }
}