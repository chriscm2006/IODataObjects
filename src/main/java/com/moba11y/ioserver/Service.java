package com.moba11y.ioserver;

/**
 * Created by chrismcmeeking on 9/18/17.
 */

public class Service {

    public enum Category {
        RIDE_SHARE,
        GAME_NIGHT,
        OTHER
    }

    public String userEmail;
    public String description;
    public Category category;
}