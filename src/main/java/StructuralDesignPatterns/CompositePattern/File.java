package StructuralDesignPatterns.CompositePattern;

public class File implements FileSystemComponent {
    private String filename;

    File(String filename) {
        this.filename = filename;
    }

    @Override
    public void showDetails() {
        System.out.println("File Name " + filename);
    }
}
