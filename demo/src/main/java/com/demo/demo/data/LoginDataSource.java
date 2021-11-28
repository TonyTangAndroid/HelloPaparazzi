package com.demo.demo.data;

import com.demo.demo.data.model.LoggedInUser;
import java.io.IOException;

/** Class that handles authentication w/ login credentials and retrieves user information. */
public class LoginDataSource {

  public Result<LoggedInUser> login(String username, String password) {

    try {
      if (username.equals("tony@gmail.com") && password.equals("123456")) {
        return new Result.Success<>(new LoggedInUser(username, password));
      } else {
        return new Result.Error(
            new RuntimeException(
                String.format("Incorrect username:%s or password:%s.", username, password)));
      }
    } catch (Exception e) {
      return new Result.Error(new IOException("Error logging in", e));
    }
  }

  public void logout() {
    // TODO: revoke authentication
  }
}
