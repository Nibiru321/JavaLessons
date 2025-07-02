import java.time.LocalDate;

public abstract class Item {

    private String id;
    private String title;
    private LocalDate publicationDate;
    private int maxCheckoutDays;

    public Item(String var1, String var2, LocalDate var3, int var4) {
        this.id = var1;
        this.title = var2;
        this.publicationDate = var3;
        this.maxCheckoutDays = var4;
    }

    public String getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public LocalDate getPublicationDate() {
        return this.publicationDate;
    }

    public int getMaxCheckoutDays() {
        return this.maxCheckoutDays;
    }

}

class Book extends Item {
    private String author;
    private int pages;   

    public Book(String id, String title, LocalDate publicationDate, String author, int pages) {
        super(id, title, publicationDate, 21);
        this.author = author;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }
}

class DVD extends Item {
    private String director;
    private int runningTime;

    public DVD(String id, String title, LocalDate publicationDate, String director, int runningTime) {
        super(id, title, publicationDate, 7);
        this.director = director;
        this.runningTime = runningTime;
    }

    public String getDirector() {
        return director;
    }

    public int getRunningTime() {
        return runningTime;
    }
}

class CD extends Item {
    private String artist;
    private int tracks;

    public CD(String id, String title, LocalDate publicationDate, String artist, int tracks) {
        super(id, title, publicationDate, 14);
        this.artist = artist;
        this.tracks = tracks;
    }

    public String getArtist() {
        return artist;
    }

    public int getTracks() {
        return tracks;
    }
}

class Main {
    public static void main(String[] args) {
        Book book = new Book("B001", "1984", LocalDate.of(1949, 6, 8), "George Orweel", 328);
        DVD dvd = new DVD("D001", "Inception", LocalDate.of(2010, 7, 16), "Christopher Nolan", 148);
        CD cd = new CD("C001", "Thriller", LocalDate.of(1982, 11,30), "Michael Jackson", 9);
        
        System.out.println(book.getAuthor());
        System.out.println(book.getPages());
        System.out.println(dvd.getDirector());
        System.out.println(dvd.getRunningTime());
        System.out.println(cd.getArtist());
        System.out.println(cd.getTracks());
    }
}