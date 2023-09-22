package com.kretsev.study;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music{
    private final List<Song> rockMusicSongList = Arrays.asList(
            new Song(Jenre.ROCK, "Unforgiven"),
            new Song(Jenre.ROCK, "Highway to Hell"),
            new Song(Jenre.ROCK, "Eruption")
    );

    @Override
    public String getSong() {
        return rockMusicSongList.get(new Random().nextInt(3)).getName();
    }
}
