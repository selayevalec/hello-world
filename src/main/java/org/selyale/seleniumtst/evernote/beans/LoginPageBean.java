package org.selyale.seleniumtst.evernote.beans;

public class LoginPageBean {
    String userName;
    String userPassword;
    Boolean rememberMe;

    public LoginPageBean(String userName, String userPassword, Boolean rememberMe) {
        setRememberMe(rememberMe);
        setUserName(userName);
        setUserPassword(userPassword);
    }

    public Boolean getRememberMe() {
        return rememberMe;
    }

    public String getUserName() {
        return userName;
    }

    public void setRememberMe(Boolean rememberMe) {
        this.rememberMe = rememberMe;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() { return userPassword; }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
