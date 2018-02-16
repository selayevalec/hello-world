package org.evernotets.evernotetst;



public class EvernoteLogin {

    protected String username;
    protected String login;

    public EvernoteLogin(String username, String login){
        setUsername(username);
        setLoging(login);
    }

    public void setLoging(String login) {
        this.login = login;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
