package com.jaagro.constant;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author tony
 */
public class UserInfo implements Serializable {

    private Integer id;

    private String loginName;

    private String password;

    private String phoneNumber;

    private String salt;

    private Integer status;

    private String userType;

    private String name;

    private Integer departmentId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salt='" + salt + '\'' +
                ", status=" + status +
                ", userType='" + userType + '\'' +
                ", name='" + name + '\'' +
                ", departmentId=" + departmentId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserInfo)) return false;
        UserInfo userInfo = (UserInfo) o;
        return Objects.equals(getId(), userInfo.getId()) &&
                Objects.equals(getLoginName(), userInfo.getLoginName()) &&
                Objects.equals(getPassword(), userInfo.getPassword()) &&
                Objects.equals(getPhoneNumber(), userInfo.getPhoneNumber()) &&
                Objects.equals(getSalt(), userInfo.getSalt()) &&
                Objects.equals(getStatus(), userInfo.getStatus()) &&
                Objects.equals(getUserType(), userInfo.getUserType()) &&
                Objects.equals(getName(), userInfo.getName()) &&
                Objects.equals(getDepartmentId(), userInfo.getDepartmentId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getLoginName(), getPassword(), getPhoneNumber(), getSalt(), getStatus(), getUserType(), getName(), getDepartmentId());
    }
}
