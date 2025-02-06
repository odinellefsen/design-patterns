package designpatterns5041.assignment04;

// | ------------------------------------------------ |
// |     You are NOT allowed to change this class     |
// | ------------------------------------------------ |

public class MediaSystem {

    private final MediaPlayer mediaPlayer;

    public MediaSystem(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    public void playMedia() {
        mediaPlayer.play("mp3", "beyond the horizon.mp3");
        mediaPlayer.play("mp4", "alone.mp4");
        mediaPlayer.play("vlc", "far far away.vlc");
        mediaPlayer.play("avi", "mind me.avi");
    }
}
