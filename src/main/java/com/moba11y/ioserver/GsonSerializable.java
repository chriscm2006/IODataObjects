package com.moba11y.ioserver;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by chrismcmeeking on 9/18/17.
 */

public class GsonSerializable<T> {

    public String toJson() {
        return new GsonBuilder().create().toJson(this);
    }

    public static GsonSerializable fromJson(final String jsonString, Class<? extends GsonSerializable> clazz) {
        return new Gson().fromJson(jsonString, clazz);
    }
}
