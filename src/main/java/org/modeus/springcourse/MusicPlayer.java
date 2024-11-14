package org.modeus.springcourse;

public class MusicPlayer {


    private Music music;
    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    // IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer () {}

    public void setMusic (Music music) {
        this.music = music;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic() {
        System.out.println("Playing music " + music.getSong());
    }
}
