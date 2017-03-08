package com.ule.fenxiao.vo;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="User_Info")
public class UserInfo extends BaseEntity {

    /**
     * auther:gexingyu
     * date:2016/08/11
     * Entity中不映射成列的字段得加@Transient 注解，不加注解也会映射成列
     */
    private static final long serialVersionUID = -1417492593005363998L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private long id;

    @Column(name="userInfo_name")
    private String userInfoName;

    @Column(name="userInfo_email")
    private String userInfoEmail;

    @Column(name="userInfo_tel")
    private String userInfoTel;

    @Column(name="userInfo_address")
    private String userInfoAddress;

    @Column(name="merchantIds")
    private long[] merchantIds;

    @Column(name="userInfo_em0")
    private String em0;//备用字段

    @Column(name="userInfo_em1")
    private String em1;//备用字段

    @Column(name="userInfo_em2")
    private String em2;//备用字段

    @Column(name="userInfo_em3")
    private String em3;//备用字段

    @Column(name="userInfo_em4")
    private String em4;//备用字段

    @Column(name="userInfo_em5")
    private String em5;//备用字段

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserInfoName() {
        return userInfoName;
    }

    public void setUserInfoName(String userInfoName) {
        this.userInfoName = userInfoName;
    }

    public String getUserInfoEmail() {
        return userInfoEmail;
    }

    public void setUserInfoEmail(String userInfoEmail) {
        this.userInfoEmail = userInfoEmail;
    }

    public String getUserInfoTel() {
        return userInfoTel;
    }

    public void setUserInfoTel(String userInfoTel) {
        this.userInfoTel = userInfoTel;
    }

    public String getUserInfoAddress() {
        return userInfoAddress;
    }

    public void setUserInfoAddress(String userInfoAddress) {
        this.userInfoAddress = userInfoAddress;
    }

    public long[] getMerchantIds() {
        return merchantIds;
    }

    public void setMerchantIds(long[] merchantIds) {
        this.merchantIds = merchantIds;
    }

    public String getEm0() {
        return em0;
    }

    public void setEm0(String em0) {
        this.em0 = em0;
    }

    public String getEm1() {
        return em1;
    }

    public void setEm1(String em1) {
        this.em1 = em1;
    }

    public String getEm2() {
        return em2;
    }

    public void setEm2(String em2) {
        this.em2 = em2;
    }

    public String getEm3() {
        return em3;
    }

    public void setEm3(String em3) {
        this.em3 = em3;
    }

    public String getEm4() {
        return em4;
    }

    public void setEm4(String em4) {
        this.em4 = em4;
    }

    public String getEm5() {
        return em5;
    }

    public void setEm5(String em5) {
        this.em5 = em5;
    }

    @Override
    public String toString() {
        return "UserInfo [id=" + id + ", userInfoName=" + userInfoName
                + ", userInfoEmail=" + userInfoEmail + ", userInfoTel="
                + userInfoTel + ", userInfoAddress=" + userInfoAddress
                + ", merchantIds=" + Arrays.toString(merchantIds) + ", em0="
                + em0 + ", em1=" + em1 + ", em2=" + em2 + ", em3=" + em3
                + ", em4=" + em4 + ", em5=" + em5 + "]";
    }

}
