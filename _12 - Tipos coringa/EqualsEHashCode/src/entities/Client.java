package entities;

import java.util.Objects;

public class Client {
  private String name;
  private String email;

  public Client(String email, String name) {
    this.email = email;
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Client client = (Client) o;
    return Objects.equals(name, client.name) && Objects.equals(email, client.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, email);
  }
}
