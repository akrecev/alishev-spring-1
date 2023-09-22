package com.kretsev.study;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music {
    private final List<Song> classicalMusicSongList = Arrays.asList(
            new Song(Jenre.CLASSICAL, "Fur Elise"),
            new Song(Jenre.CLASSICAL, "Carmen"),
            new Song(Jenre.CLASSICAL, "Moonlight")
    );

    @Override
    public String getSong() {
        return classicalMusicSongList.get(new Random().nextInt(3)).getName();
    }
}
