public abstract class Employee {
  private String username;
  private String password;
  
  public Employee() {
    // This is to instantiate a subclass with a no-arg constructor
  }
  
  // Constructor takes username
  public Employee(String username, String password) {
    this.username = username;
  }
  
  // Constructor takes password
  public Employee (String username, String password) {
    this.password = password;
  }
  
  public String getUsername() {
    return username;
  }
  
  public String getPassword() {
    return password;
  }
  
  public void setUsername(String username) {
    this.username = username;
  }
  
  public void setPassword(String password) {
    this.password = password;
  }
  
  // Implement in Employee subclasses
  public abstract void getMenu();
  
}