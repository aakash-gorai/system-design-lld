package StructuralDesignPatterns.ProxyPattern;

import BehaviouralDesignPatterns.ObserverPattern.DisplayDevice;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadRealImage();
    }

    private void loadRealImage() {
        System.out.println("Loading image " + fileName);
    }
    @Override
    public void display() {
        System.out.println("Displaying image " + fileName);
    }
}
