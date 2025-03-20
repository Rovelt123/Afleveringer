package netBooks;

import titles.IAudioBook;

public class EAudiobook extends NetBook implements IAudioBook {

    private int durationInMinutes;

    public EAudiobook(String title, String literatureType, int availability, int reach, int use, int durationInMinutes) {
        super(title, literatureType, availability, reach, use);
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    protected double calculatePoints() {
        return (durationInMinutes /2) * convertLiteratureType(literatureType) * ((availability*0.5)+ (reach*5) + use);
    }

}