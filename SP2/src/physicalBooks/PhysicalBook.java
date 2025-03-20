package physicalBooks;
import titles.Title;

public abstract class PhysicalBook extends Title {

    protected int copies;

    public PhysicalBook(String title, String literatureType, int copies) {
        super(title, literatureType);
        this.copies = copies;
    }

}