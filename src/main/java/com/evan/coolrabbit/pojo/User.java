package com.evan.coolrabbit.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;


@Entity
@Table(name = "user")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usUserId")
    int usUserId;

    String usUserName;
    String usPassword;
    String usEmail;
    int usAge;
    int usAdminId;
    String usAdminName;

    public int getUsUserId() {
        return usUserId;
    }

    public void setUsUserId(int usUserId) {
        this.usUserId = usUserId;
    }

    public String getUsUserName() {
        return usUserName;
    }

    public void setUsUserName(String usUserName) {
        this.usUserName = usUserName;
    }

    public String getUsPassword() {
        return usPassword;
    }

    public void setUsPassword(String usPassword) {
        this.usPassword = usPassword;
    }

    public String getUsEmail() {
        return usEmail;
    }

    public void setUsEmail(String usEmail) {
        this.usEmail = usEmail;
    }

    public int getUsAge() {
        return usAge;
    }

    public void setUsAge(int usAge) {
        this.usAge = usAge;
    }

    public int getUsAdminId() {
        return usAdminId;
    }

    public void setUsAdminId(int usAdminId) {
        this.usAdminId = usAdminId;
    }

    public String getUsAdminName() {
        return usAdminName;
    }

    public void setUsAdminName(String usAdminName) {
        this.usAdminName = usAdminName;
    }
}
