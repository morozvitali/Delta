package org.modeus.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        // Вивести інформацію про програвач
        //System.out.println("Player Name: " + musicPlayer.getName());
        //System.out.println("Volume: " + musicPlayer.getVolume());

        // Програти всі треки
        musicPlayer.playAllMusic();

        context.close();
    }
}