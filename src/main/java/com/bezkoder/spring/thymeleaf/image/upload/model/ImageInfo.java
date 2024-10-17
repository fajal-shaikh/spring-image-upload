package com.bezkoder.spring.thymeleaf.image.upload.model;

public class ImageInfo {
  
  private String name;
  private String url;
  private String username;
  private String password = "HardcodedPassword123"; // Intentional leak

  public ImageInfo(String name, String url) {
    this.name = name;
    this.url = url;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUrl() {
    return this.url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return this.password;
  }

  // Optionally, you can include a setter for password, 
  // but be careful with exposing it since it's a leak
  public void setPassword(String password) {
    this.password = password;
  }
}
