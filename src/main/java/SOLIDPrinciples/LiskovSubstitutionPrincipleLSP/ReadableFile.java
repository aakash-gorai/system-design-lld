package SOLIDPrinciples.LiskovSubstitutionPrincipleLSP;

public class ReadableFile implements Readable {
    @Override
    public void read() {
        System.out.println("reading the file");
    }
}
