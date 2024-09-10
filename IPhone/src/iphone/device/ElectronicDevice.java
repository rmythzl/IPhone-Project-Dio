package iphone.device;

public class ElectronicDevice {
    private boolean isOn;

    public void turnOn() {
        isOn = true;
        System.out.println(this.getClass().getSimpleName() + " is now ON.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println(this.getClass().getSimpleName() + " is now OFF.");
    }

    public boolean isOn() {
        return isOn;
    }
}
