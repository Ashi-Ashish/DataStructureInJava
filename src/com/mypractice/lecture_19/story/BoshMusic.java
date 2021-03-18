package com.mypractice.lecture_19.story;

public class BoshMusic implements MusicPlayer {
    @Override
    public void start() {
        System.out.println("Play bosh Music");
    }

    @Override
    public void stop() {
        System.out.println("Stop bosh Music");
    }
}
