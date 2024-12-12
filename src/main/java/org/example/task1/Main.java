package org.example.task1;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        AuthMethod authMethod = AuthMethod.FACEBOOK;

        User user = null;
        switch (authMethod) {
            case FACEBOOK:
                FacebookUser facebookUser = new FacebookUser("test@facebook.com", "FainaUkraina", LocalDateTime.now());
                user = new FacebookUserAdapter(facebookUser);
                break;
            case TWITTER:
                TwitterUser twitterUser = new TwitterUser("test@twitter.com", "FainaUkraina", LocalDateTime.now());
                user = new TwitterUserAdapter(twitterUser);
                break;
            default:
                break;
        }

        MessageSender messageSender = new MessageSender();
        messageSender.send(user, "text");

    }

}
