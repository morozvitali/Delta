package org.modeus.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(firstMusicPlayer==secondMusicPlayer);
        System.out.println(firstMusicPlayer.toString());
        System.out.println(secondMusicPlayer.toString());

        firstMusicPlayer.setVolume(22);
        secondMusicPlayer.setVolume(23);
        System.out.println(secondMusicPlayer.getVolume());
        System.out.println(firstMusicPlayer.getVolume());

        // Вивести інформацію про програвач
        //System.out.println("Player Name: " + musicPlayer.getName());
        //System.out.println("Volume: " + musicPlayer.getVolume());

        // Програти всі треки
       //musicPlayer.playAllMusic();

        context.close();
    }
}