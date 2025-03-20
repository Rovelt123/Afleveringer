package netBooks;
import titles.Title;

public abstract class NetBook extends Title {

    //Jeg ville bruge protected istedet for private.
    protected int availability;
    protected int reach;
    protected int use;

    public NetBook(String title, String literatureType, int availability, int reach, int use) {
        super(title, literatureType);
        this.availability = availability;
        this.reach = reach;
        this.use = use;
    }

    public double getPseudoCopies() {
        return availability * reach;
    }

    //Bør vel være public, da det er en getter? - Derudover blev den ikke brugt?
    public int getUseFactor() {
        return use;
    }

}