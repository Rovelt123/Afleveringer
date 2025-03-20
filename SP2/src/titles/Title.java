package titles;

public abstract class Title {

    private String title;
    protected String literatureType; //Tilføjede denne som protected, så mine sub klasser kan tilgå den.
    protected static double rate = 0.067574;

    public Title(String title, String literatureType) {
        this.title = title;
        this.literatureType = literatureType;
    }

    public double calculateRoyalty() {
        return calculatePoints() * rate;
    }

    protected abstract double calculatePoints();

    protected double convertLiteratureType(String type) {
        return switch (type) {
            case "BI", "TE" -> 3;
            case "LYRIK" -> 6;
            case "SKØN" -> 1.7;
            case "FAG" -> 1;
            default -> 0;
        };
    }

    //Getter metode for at få titler på bøgerne
    public String getTitle() {
        return title;
    }

}
