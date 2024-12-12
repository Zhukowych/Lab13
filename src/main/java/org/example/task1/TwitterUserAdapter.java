package org.example.task1;

import java.time.LocalDateTime;

public class TwitterUserAdapter implements User{

    private TwitterUser user;

    public TwitterUserAdapter(TwitterUser user) {
        this.user = user;
    }

    @Override
    public String getEmail() {
        return user.getUserMail();
    }

    @Override
    public String getCountry() {
        return user.getCountry();
    }

    @Override
    public LocalDateTime getUserActiveTime() {
        return user.getLastActiveTime();
    }

    @Override
    public String toString() {
        return user.toString();
    }

}
