package physicalBooks;
import titles.IAudioBook;

public class AudioBook extends PhysicalBook implements IAudioBook {

    private int durationInMinutes;

    public AudioBook(String title, String literatureType, int copies, int durationInMinutes) {
        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    protected double calculatePoints() {
        return (durationInMinutes/2) * convertLiteratureType(literatureType) * this.copies;
    }

}
