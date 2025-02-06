package designpatterns5041.assignment04;

import designpatterns5041.assignment04.newmediaplayers.VlcPlayer;

public class VlcMediaPlayerAdapter implements MediaPlayer {
    private VlcPlayer vlcPlayer;

    public VlcMediaPlayerAdapter() {
        vlcPlayer = new VlcPlayer();
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            vlcPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp3")) {
            vlcPlayer.playMp3(fileName);
        }
        else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
