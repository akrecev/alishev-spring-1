package com.kretsev.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private String name;
    private Integer volume;
    private Music music;

    public MusicPlayer() {
    }

    @Autowired
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer(Integer volume, Music music) {
        this.volume = volume;
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public Integer getVolume() {
        return volume;
    }

    public Music getMusic() {
        return music;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Player name: " + getName());
        System.out.println("Playing song: " + music.getSong());
        System.out.println("Volume level: " + getVolume());
    }

}
