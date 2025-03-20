package authors;
import titles.Title;

import java.util.ArrayList;

public class Author {

    private String name;
    private ArrayList<Title> titles = new ArrayList<>();

    public Author(String name) {
        this.name = name;
    }

    public void addTitle(Title title) {
        titles.add(title);
    }

    public float calculateTotalPay(){
        float total = 0;
        for (Title t : titles) {
            total += t.calculateRoyalty();
        }
        return total;
    }

    public String getName() {
        return name;
    }

    // Tilføjet egen getter for at få bøgerne:
    public ArrayList<Title> getTitles() {
        return titles;
    }

}