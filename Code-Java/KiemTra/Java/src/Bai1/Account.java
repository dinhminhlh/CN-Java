package Bai1;
public class Account {
    private String username;
    private String password;
    private int loginAttemptsLeft;

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
        this.loginAttemptsLeft = 3;
    }

    public boolean checkLogin(String username, String password) {
        if (this.loginAttemptsLeft == 0) {
            return false;
        }
        if (this.username.equals(username) && this.password.equals(password)) {
            this.loginAttemptsLeft = 3;
            return true;
        }
        this.loginAttemptsLeft--;
        return false;
    }
}
