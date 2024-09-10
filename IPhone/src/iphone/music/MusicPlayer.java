package iphone.music;

import iphone.device.ElectronicDevice;

public class MusicPlayer extends ElectronicDevice {
    private String currentTrack;

    public void selectTrack(String track) {
        this.currentTrack = track;
        System.out.println("Selected track: " + track);
    }

    public void play() {
        if (isOn()) {
            if (currentTrack != null) {
                System.out.println("Playing: " + currentTrack);
            } else {
                System.out.println("No track selected.");
            }
        } else {
            System.out.println("Music Player is OFF. Turn it on first.");
        }
    }

    public void pause() {
        if (isOn()) {
            if (currentTrack != null) {
                System.out.println("Paused: " + currentTrack);
            } else {
                System.out.println("No track to pause.");
            }
        } else {
            System.out.println("Music Player is OFF. Turn it on first.");
        }
    }
}
