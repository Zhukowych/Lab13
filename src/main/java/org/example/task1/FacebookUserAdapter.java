package org.example.task1;

import java.time.LocalDateTime;

public class FacebookUserAdapter implements User {

    private FacebookUser user;

    public FacebookUserAdapter(FacebookUser user) {
        this.user = user;
    }

    @Override
    public String getEmail() {
        return user.getEmail();
    }

    @Override
    public String getCountry() {
        return user.getUserCountry();
    }

    @Override
    public LocalDateTime getUserActiveTime() {
        return user.getUserActiveTime();
    }

    @Override
    public String toString() {
        return user.toString();
    }

}
