package com.blogspot.vadimaz;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // Music music = context.getBean("musicBean", Music.class);
        // MusicPlayer player = new MusicPlayer(music);
        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        player.playMusic();

        System.out.println(player.getName());
        System.out.println(player.getVolume());
        context.close();
    }
}
