package com.kretsev.study;

public class Song {
    Jenre jenre;
    String name;

    public Song(Jenre jenre, String name) {
        this.jenre = jenre;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
