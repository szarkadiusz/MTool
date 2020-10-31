package pl.MTool.Login;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.lang.NonNull;

import javax.validation.constraints.Size;

public class LoginForm {
    @NonNull
    @Size(min=11,max=11)
    private String email;

    @NonNull
    @Size(min=5,max=5)
    private String password;


    public String getEmail() {
        return email;
    }

    public LoginForm setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public LoginForm setPassword(String password) {
        this.password = password;
        return this;
    }

}
