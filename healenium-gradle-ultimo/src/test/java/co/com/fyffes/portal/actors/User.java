package co.com.fyffes.portal.actors;

public enum User {

    Ismael("david", "Abc+1234");

    public final String username;
    public final String password;

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
