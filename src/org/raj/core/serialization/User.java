package org.raj.core.serialization;

import java.io.Serializable;

/**
 * Created by RJK on 10/21/2016.
 */
public class User implements Serializable{
    private final long serialVersionUID = 32243242123213L;
    private String userName;
    private String password;
    private String email;
    private String address;
    private String country;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getSerialVersionUID() {
        return serialVersionUID;
    }
}
