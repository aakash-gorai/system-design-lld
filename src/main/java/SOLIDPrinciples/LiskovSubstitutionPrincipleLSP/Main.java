package SOLIDPrinciples.LiskovSubstitutionPrincipleLSP;

public class Main {
    public static void readAnyFile(ReadableFile file) {
        file.read();
    }
    public static void main(String[] args) {
        ReadableFile readFile = new ReadOnly();
        readFile.read();

        WritableFile writeFile = new WritableFile();
        writeFile.read();
        writeFile.write();

        readAnyFile(readFile);
        readAnyFile(writeFile); //because parent class of WritableFile is ReadableFile
    }
}
