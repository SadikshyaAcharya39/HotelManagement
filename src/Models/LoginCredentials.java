package Models;

public class LoginCredentials {
    private int loginId;
    private  String userRole ;
    private String password;

    public LoginCredentials() {
        this.loginId = 0;
        this.userRole = "";
        this.password = "";
    }
//overload
        public LoginCredentials(int loginId, String password) {
       //to initialize all the values
        this();
        this.loginId = loginId;
        this.password = password;
    }

    public int getLoginId() {
        return loginId;
    }

    public void setLoginId(int loginId) {
        this.loginId = loginId;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
