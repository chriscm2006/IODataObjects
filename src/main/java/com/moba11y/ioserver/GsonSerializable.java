package com.moba11y.ioserver;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by chrismcmeeking on 9/18/17.
 */

public class GsonSerializable {

    public String toJson() {
        return new GsonBuilder().create().toJson(this);
    }

    public GsonSerializable fromJson(final String jsonString) {
        return new Gson().fromJson(jsonString, getClass());
    }
}
