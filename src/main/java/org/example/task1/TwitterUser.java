package org.example.task1;

import lombok.ToString;

import java.time.LocalDateTime;

@ToString
public class TwitterUser {

    private String email;
    private String country;
    private LocalDateTime lastActiveTime;

    public TwitterUser(String email, String country, LocalDateTime lastActiveTime) {
        this.email = email;
        this.country = country;
        this.lastActiveTime = lastActiveTime;
    }

    public String getUserMail() {
        return email;
    }

    public String getCountry() {
        return country;
    }

    public LocalDateTime getLastActiveTime() {
        return lastActiveTime;
    }

}
