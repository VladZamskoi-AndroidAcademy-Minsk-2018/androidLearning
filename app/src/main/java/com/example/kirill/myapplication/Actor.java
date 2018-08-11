package com.example.kirill.myapplication;

import android.net.Uri;

public class Actor {
    private final String name;
    private final Uri avatar;
    private final Uri bio;
    private final String textBio;

    public Actor(String name, Uri avatar,  Uri bio, String textBio) {
        this.name = name;
        this.avatar = avatar;
        this.bio = bio;
        this.textBio = textBio;
    }

    public String getName() { return name; }

}
