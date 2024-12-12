package org.example.task1;


import lombok.ToString;

import java.time.LocalDateTime;

@ToString
public class FacebookUser {

    private String email;
    private String country;
    private LocalDateTime lastActiveTime;

    public FacebookUser(String email, String country, LocalDateTime lastActiveTime) {
        this.email = email;
        this.country = country;
        this.lastActiveTime = lastActiveTime;
    }

    public String getEmail() {
        return email;
    }

    public String getUserCountry() {
        return country;
    }

    public LocalDateTime getUserActiveTime() {
        return lastActiveTime;
    }

}
