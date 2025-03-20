package netBooks;

public class EBook extends  NetBook {

    private int characters;
    private boolean illustrated;

    public EBook(String title, String literatureType, int availability, int reach, int use, int characters, boolean illustrated) {
        super(title, literatureType, availability, reach, use);
        this.characters = characters;
        this.illustrated = illustrated;
    }

    private double calculatePages(){
        return (double) characters / 1800;
    }

    @Override
    protected double calculatePoints() {
        double pages = calculatePages();
        if (illustrated) {
            pages *= 1.1;
        }
        /*
        System.out.println(pages);
        System.out.println(convertLiteratureType(literatureType));
        System.out.println(availability);
        System.out.println(reach);
        System.out.println(use);
        System.out.println(pages * convertLiteratureType(literatureType) * ((availability*0.5)+ (reach*5) + 205));

        Brugte rigtig lang tid på at lave denne løsning - Fordi jeg generelt er dårlig til matematik :'D
        Men mest af alt fordi det fremgår af opgave beskrivelsen at det skulle give 98.670, men det skulle give 110770..
        */
        return pages * convertLiteratureType(literatureType) * ((availability*0.5)+ (reach*5) + use);
    }

}
