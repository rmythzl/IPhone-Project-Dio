package iphone.call;

import iphone.device.ElectronicDevice;

public class Phone extends ElectronicDevice {
    public void call(String number) {
        if (isOn()) {
            System.out.println("Calling: " + number);
        } else {
            System.out.println("Phone is OFF. Turn it on first.");
        }
    }

    public void answer() {
        if (isOn()) {
            System.out.println("Answering the call...");
        } else {
            System.out.println("Phone is OFF. Turn it on first.");
        }
    }

    public void startVoicemail() {
        if (isOn()) {
            System.out.println("Starting voicemail...");
        } else {
            System.out.println("Phone is OFF. Turn it on first.");
        }
    }
}
