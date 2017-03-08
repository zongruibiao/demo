package com.ule.fenxiao.vo;

/**
 * Created by zongruibiao on 2017/2/27.
 */
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@MappedSuperclass
public class BaseEntity implements Serializable {


    private static final long serialVersionUID = 1L;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "`create_time`")
    Date createTime;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "`update_time`")
    Date updateTime;

    public BaseEntity() {
        this.createTime = new Date();
        this.updateTime = new Date();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
