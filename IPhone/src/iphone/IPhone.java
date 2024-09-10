package iphone;

import iphone.music.MusicPlayer;
import iphone.call.Phone;
import iphone.browser.WebBrowser;

import java.util.Scanner;

public class iPhone {
    private MusicPlayer musicPlayer;
    private Phone phone;
    private WebBrowser webBrowser;
    private Scanner scanner;

    public iPhone() {
        musicPlayer = new MusicPlayer();
        phone = new Phone();
        webBrowser = new WebBrowser();
        scanner = new Scanner(System.in);
    }

    public void showMenu() {
        while (true) {
            System.out.println("\n=== iPhone Menu ===");
            System.out.println("1. Music Player");
            System.out.println("2. Phone");
            System.out.println("3. Web Browser");
            System.out.println("4. Turn On All Devices");
            System.out.println("5. Turn Off All Devices");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (choice) {
                case 1:
                    musicPlayerMenu();
                    break;
                case 2:
                    phoneMenu();
                    break;
                case 3:
                    webBrowserMenu();
                    break;
                case 4:
                    turnOnAllDevices();
                    break;
                case 5:
                    turnOffAllDevices();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void musicPlayerMenu() {
        while (true) {
            System.out.println("\n=== Music Player ===");
            System.out.println("1. Select Track");
            System.out.println("2. Play");
            System.out.println("3. Pause");
            System.out.println("4. Back to Main Menu");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (choice) {
                case 1:
                    System.out.print("Enter track name: ");
                    String track = scanner.nextLine();
                    musicPlayer.selectTrack(track);
                    break;
                case 2:
                    musicPlayer.play();
                    break;
                case 3:
                    musicPlayer.pause();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void phoneMenu() {
        while (true) {
            System.out.println("\n=== Phone ===");
            System.out.println("1. Call");
            System.out.println("2. Answer");
            System.out.println("3. Start Voicemail");
            System.out.println("4. Back to Main Menu");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (choice) {
                case 1:
                    System.out.print("Enter phone number: ");
                    String number = scanner.nextLine();
                    phone.call(number);
                    break;
                case 2:
                    phone.answer();
                    break;
                case 3:
                    phone.startVoicemail();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void webBrowserMenu() {
        while (true) {
            System.out.println("\n=== Web Browser ===");
            System.out.println("1. Display Page");
            System.out.println("2. Add New Tab");
            System.out.println("3. Refresh Page");
            System.out.println("4. Back to Main Menu");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (choice) {
                case 1:
                    System.out.print("Enter URL: ");
                    String url = scanner.nextLine();
                    webBrowser.displayPage(url);
                    break;
                case 2:
                    System.out.print("Enter URL for new tab: ");
                    String newTabUrl = scanner.nextLine();
                    webBrowser.addNewTab(newTabUrl);
                    break;
                case 3:
                    webBrowser.refreshPage();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public void turnOnAllDevices() {
        musicPlayer.turnOn();
        phone.turnOn();
        webBrowser.turnOn();
        System.out.println("All devices are now ON.");
    }

    public void turnOffAllDevices() {
        musicPlayer.turnOff();
        phone.turnOff();
        webBrowser.turnOff();
        System.out.println("All devices are now OFF.");
    }

    public static void main(String[] args) {
        iPhone myiPhone = new iPhone();
        myiPhone.showMenu();
    }
}
