package designpatterns5041.assignment04;

import designpatterns5041.assignment04.newmediaplayers.Mp4Player;
import designpatterns5041.assignment04.newmediaplayers.VlcPlayer;

public class CombinedMediaPlayerAdapter implements MediaPlayer {
    private Mp4Player mp4Player;
    private VlcPlayer vlcPlayer;

    public CombinedMediaPlayerAdapter() {
        mp4Player = new Mp4Player();
        vlcPlayer = new VlcPlayer();
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4")) {
            mp4Player.playMp4(fileName);
        } else if (audioType.equalsIgnoreCase("vlc")) {
            vlcPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp3")) {
            mp4Player.playMp3(fileName);
        }
        else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
    
    
    
}
