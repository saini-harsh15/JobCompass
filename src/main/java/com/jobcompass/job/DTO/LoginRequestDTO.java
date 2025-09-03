package com.jobcompass.job.DTO;

public class LoginRequestDTO {

    private String email;
    private String password;

    // Default constructor
    public LoginRequestDTO() {
    }

    // Parameterized constructor (optional, handy for testing)
    public LoginRequestDTO(String email, String password) {
        this.email = email;
        this.password = password;
    }

    // Getter & Setter for email
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter & Setter for password
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    // Optional: toString() for debugging
    @Override
    public String toString() {
        return "LoginRequestDTO{" +
                "email='" + email + '\'' +
                ", password='[PROTECTED]'" +
                '}';
    }
}
