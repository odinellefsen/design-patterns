package designpatterns5041.assignment04;

public class OldMediaPlayer implements MediaPlayer{
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        }
        else if (audioType.equalsIgnoreCase("mp4")) {
            System.out.println("Playing mp4 file. Name: " + fileName);
        }
        else if (audioType.equalsIgnoreCase("vlc")) {
            System.out.println("Playing vlc file. Name: " + fileName);
        }
        else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
