package ru.spring.lesson02;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "ApplicationContext.xml"
        );
        //Music music = context.getBean("musicBean",Music.class);

        //MusicPlayer musicPlayer = new MusicPlayer(music);
        //musicPlayer.playMusic();
        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        musicPlayer.playMusicList();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

//        System.out.println(music.getSong());
        context.close();
    }
}





