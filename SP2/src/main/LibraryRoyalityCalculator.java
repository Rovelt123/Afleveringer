package main;
import authors.Author;
import netBooks.EAudiobook;
import netBooks.EBook;
import physicalBooks.AudioBook;
import physicalBooks.PrintedBook;
import titles.Title;

public class LibraryRoyalityCalculator {

    public static void main() {

        Author author = new Author("Olga Ravn");
        //Tilføjer fysiske bøger:
        author.addTitle(new PrintedBook("Celestine", "SKØN", 140, 166));
        author.addTitle(new AudioBook("Celestine Audio", "SKØN", 140, 192));

        //Tilføjer eBøger
        author.addTitle(new EBook("Celestine Net book", "FAG", 97, 50, 205, 360000, true));
        author.addTitle(new EAudiobook("Celestine eAudio", "SKØN", 2000, 12, 10, 250));

        //Printer min data (Kunne måske havde lavet en toString metode istedet)
        printData(author);
    }

    public static void printData(Author author) {
        String header1 = String.format("\n%s har lavet følgende bøger:", author.getName());
        String header2 = String.format("\n%s har omsat for i alt: %skr", author.getName(), author.calculateTotalPay());
        System.out.println(header1);
        for (Title title : author.getTitles()) {
            System.out.println(title.getTitle());
        }
        System.out.println(header2);
    }

}