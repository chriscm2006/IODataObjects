package com.moba11y.ioserver;

/**
 * Created by chrismcmeeking on 9/18/17.
 */

public class Service extends GsonSerializable {

    public String userEmail;
    public String description;
    public Category category;

    public enum Category {
        RIDE_SHARE,
        GAME_NIGHT,
        OTHER
    }
}