package com.kretsev.study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName() + ", volume: " + musicPlayer.getVolume());
        musicPlayer.playMusic(Jenre.CLASSICAL);
        musicPlayer.playMusic(Jenre.ROCK);
        musicPlayer.playMusic(Jenre.CLASSICAL);
        musicPlayer.playMusic(Jenre.ROCK);

        context.close();
    }
}
