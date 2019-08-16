package ru.spring.lesson02;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private Music music;
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

    public  MusicPlayer(){

    }
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }
    public int getVolume() {
        return volume;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;

    }
    public void playMusic() {
            System.out.println("Playing: " + music.getSong());

    }
    public void playMusicList() {
        for(int i = 0;i < musicList.size();i++){
            System.out.println("Playing: " + musicList.get(i).getSong());
        }
    }
}
