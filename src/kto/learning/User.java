package kto.learning;


public class User {

    private Long id;
    private String login;
    private String password;

    public User(Long id, String login, String password) {

        this.id = id;
        this.login = login;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAuthorized(String password) {
        return this.password.equals(password);
    }

}
