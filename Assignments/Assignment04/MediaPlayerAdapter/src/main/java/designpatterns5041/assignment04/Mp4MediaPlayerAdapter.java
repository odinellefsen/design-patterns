package designpatterns5041.assignment04;

import designpatterns5041.assignment04.newmediaplayers.Mp4Player;

public class Mp4MediaPlayerAdapter implements MediaPlayer {
    private Mp4Player mp4Player;

    public Mp4MediaPlayerAdapter() {
        mp4Player = new Mp4Player();
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4")) {
            mp4Player.playMp4(fileName);
        } else if (audioType.equalsIgnoreCase("mp3")) {
            mp4Player.playMp3(fileName);
        }
        else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }

}
