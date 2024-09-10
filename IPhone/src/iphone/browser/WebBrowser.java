package iphone.browser;

import iphone.device.ElectronicDevice;

public class WebBrowser extends ElectronicDevice {
    private String currentPage;

    public void displayPage(String url) {
        if (isOn()) {
            this.currentPage = url;
            System.out.println("Displaying page: " + url);
        } else {
            System.out.println("Web Browser is OFF. Turn it on first.");
        }
    }

    public void addNewTab(String url) {
        if (isOn()) {
            System.out.println("Adding new tab with page: " + url);
        } else {
            System.out.println("Web Browser is OFF. Turn it on first.");
        }
    }

    public void refreshPage() {
        if (isOn()) {
            if (currentPage != null) {
                System.out.println("Refreshing page: " + currentPage);
            } else {
                System.out.println("No page to refresh.");
            }
        } else {
            System.out.println("Web Browser is OFF. Turn it on first.");
        }
    }
}
