package org.modeus.springcourse;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private List <Music> musicList = new ArrayList<>();

    private Music music;
    private String name;
    private int volume;

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public List getMusicList() {
        return musicList;
    }

    public void playAllMusic() {
        for (Music music : musicList) {
            System.out.println(("Playing: " + music.getSong()));
        }
    }


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
