package designpatterns5041.assignment04;

public class Main {

    public static void main(String[] args) {

        // Original
        // MediaSystem mediaSystem = new MediaSystem(
        //     new OldMediaPlayer()
        // );
        // mediaSystem.playMedia();

        // Task 1
    //    MediaSystem mediaSystem2 = new MediaSystem(
    //        new Mp4MediaPlayerAdapter()
    //    );
    //    mediaSystem2.playMedia();

        // Task 2
    //    MediaSystem mediaSystem3 = new MediaSystem(
    //        new VlcMediaPlayerAdapter()
    //    );

    //    mediaSystem3.playMedia();

        // Task 3
       MediaSystem mediaSystem4 = new MediaSystem(
           new CombinedMediaPlayerAdapter()
       );
       mediaSystem4.playMedia();
    }
}