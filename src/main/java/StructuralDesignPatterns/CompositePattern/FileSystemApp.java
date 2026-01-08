package StructuralDesignPatterns.CompositePattern;

public class FileSystemApp {
    public static void main(String[] args) {
        FileSystemComponent file1 = new File("File1.txt");
        FileSystemComponent file2 = new File("File2.txt");

        Folder folder = new Folder("Folder");
        folder.addComponent(file1);
        folder.addComponent(file2);

        FileSystemComponent file3 = new File("File3.txt");
        Folder subFolder = new Folder("SubFolder");
        subFolder.addComponent(file3);

        folder.addComponent(subFolder);

        folder.showDetails();
    }
}
