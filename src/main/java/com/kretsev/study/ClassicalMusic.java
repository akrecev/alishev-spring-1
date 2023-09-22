package com.kretsev.study;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "Piano Sonata No. 14";
    }
}
