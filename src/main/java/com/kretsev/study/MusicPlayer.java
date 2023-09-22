package com.kretsev.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private Integer volume;
    private final Music classicalMusic;
    private final Music rockMusic;

    public String getName() {
        return name;
    }

    public Integer getVolume() {
        return volume;
    }

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1, @Qualifier("rockMusic") Music music2) {
        this.classicalMusic = music1;
        this.rockMusic = music2;
    }

    public void playMusic(Jenre jenre) {
        System.out.println(jenre == Jenre.CLASSICAL ? classicalMusic.getSong() : rockMusic.getSong());
    }

}
