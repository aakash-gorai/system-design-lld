package StructuralDesignPatterns.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent {
    private String folderName;

    private List<FileSystemComponent> components= new ArrayList<>();

    Folder(String folderName) {
        this.folderName = folderName;
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }
    @Override
    public void showDetails() {
        System.out.println("Folder Name " + folderName);
        for(FileSystemComponent component: components) {
            component.showDetails();
        }
    }
}
