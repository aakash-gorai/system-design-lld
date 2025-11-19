package SOLIDPrinciples.LiskovSubstitutionPrincipleLSP;

public class WritableFile extends ReadableFile implements Writable  {
    @Override
    public void write() {
        System.out.println("Writing the file");
    }
}
