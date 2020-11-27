package com.tomekl007.CH06.client.library.auth;

import java.util.Objects;

public class UsernamePasswordAuthStrategy implements AuthStrategy {
  private final String username;
  private final String password;

  public UsernamePasswordAuthStrategy(String username, String password) {
    this.username = username;
    this.password = password;
  }

  @Override
  public boolean authenticate(AuthRequest authRequest) {
    if (authRequest.getUsername() == null || authRequest.getPassword() == null) {
      return false;
    }

    return authRequest.getUsername().equals(username) && authRequest.getPassword().equals(password);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UsernamePasswordAuthStrategy that = (UsernamePasswordAuthStrategy) o;
    return Objects.equals(username, that.username) && Objects.equals(password, that.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password);
  }
}
