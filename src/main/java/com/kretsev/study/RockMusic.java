package com.kretsev.study;

import org.springframework.stereotype.Component;

public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Unforgiven";
    }
}
