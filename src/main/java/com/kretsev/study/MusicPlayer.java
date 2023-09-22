package com.kretsev.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private final Music classicalMusic;
    private final Music rockMusic;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1, @Qualifier("rockMusic") Music music2) {
        this.classicalMusic = music1;
        this.rockMusic = music2;
    }

    public void playMusic(Jenre jenre) {
        System.out.println(jenre == Jenre.CLASSICAL ? classicalMusic.getSong() : rockMusic.getSong());
    }

}
