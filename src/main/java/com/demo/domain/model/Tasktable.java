package com.demo.domain.model;

import java.util.Date;

public class Tasktable {
    private Long tid;

    private Date stime;

    private Date etime;

    private String title;

    private Integer pubId;

    private Integer tag;

    private String content;

    private String pic;

    private Integer status;

    private Integer reward;

    private String position;

    private String info;

    private Integer paystatus;

    private Integer payway;

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public Date getStime() {
        return stime;
    }

    public void setStime(Date stime) {
        this.stime = stime;
    }

    public Date getEtime() {
        return etime;
    }

    public void setEtime(Date etime) {
        this.etime = etime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getPubId() {
        return pubId;
    }

    public void setPubId(Integer pubId) {
        this.pubId = pubId;
    }

    public Integer getTag() {
        return tag;
    }

    public void setTag(Integer tag) {
        this.tag = tag;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getReward() {
        return reward;
    }

    public void setReward(Integer reward) {
        this.reward = reward;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Integer getPaystatus() {
        return paystatus;
    }

    public void setPaystatus(Integer paystatus) {
        this.paystatus = paystatus;
    }

    public Integer getPayway() {
        return payway;
    }

    public void setPayway(Integer payway) {
        this.payway = payway;
    }

    @Override
    public String toString() {
        return "Tasktable{" +
                "tid=" + tid +
                ", stime=" + stime +
                ", etime=" + etime +
                ", title='" + title + '\'' +
                ", pubId=" + pubId +
                ", tag=" + tag +
                ", content='" + content + '\'' +
                ", pic='" + pic + '\'' +
                ", status=" + status +
                ", reward=" + reward +
                ", position='" + position + '\'' +
                ", paystatus=" + paystatus +
                ", payway=" + payway +
                '}';
    }
}