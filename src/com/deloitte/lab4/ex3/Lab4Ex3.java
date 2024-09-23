package com.deloitte.lab4.ex3;

abstract class Item {
    private int id;
    private String title;
    private int numberOfCopies;

    public Item(int id, String title, int numberOfCopies) {
        this.id = id;
        this.title = title;
        this.numberOfCopies = numberOfCopies;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void checkIn() {
        numberOfCopies++;
    }

    public void checkOut() {
        if (numberOfCopies > 0) numberOfCopies--;
    }

    public void print() {
        System.out.println("ID: " + id + ", Title: " + title + ", Copies: " + numberOfCopies);
    }
}

abstract class WrittenItem extends Item {
    private String author;

    public WrittenItem(int id, String title, int numberOfCopies, String author) {
        super(id, title, numberOfCopies);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Author: " + author);
    }
}

class Book extends WrittenItem {
    public Book(int id, String title, int numberOfCopies, String author) {
        super(id, title, numberOfCopies, author);
    }
}

class JournalPaper extends WrittenItem {
    private int yearPublished;

    public JournalPaper(int id, String title, int numberOfCopies, String author, int yearPublished) {
        super(id, title, numberOfCopies, author);
        this.yearPublished = yearPublished;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Year Published: " + yearPublished);
    }
}

abstract class MediaItem extends Item {
    private int runtime;

    public MediaItem(int id, String title, int numberOfCopies, int runtime) {
        super(id, title, numberOfCopies);
        this.runtime = runtime;
    }

    public int getRuntime() {
        return runtime;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Runtime: " + runtime + " minutes");
    }
}

class Video extends MediaItem {
    private String director;
    private String genre;
    private int yearReleased;

    public Video(int id, String title, int numberOfCopies, int runtime, String director, String genre, int yearReleased) {
        super(id, title, numberOfCopies, runtime);
        this.director = director;
        this.genre = genre;
        this.yearReleased = yearReleased;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Director: " + director + ", Genre: " + genre + ", Year Released: " + yearReleased);
    }
}

class CD extends MediaItem {
    private String artist;
    private String genre;

    public CD(int id, String title, int numberOfCopies, int runtime, String artist, String genre) {
        super(id, title, numberOfCopies, runtime);
        this.artist = artist;
        this.genre = genre;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Artist: " + artist + ", Genre: " + genre);
    }
}

public class Lab4Ex3 {
    public static void main(String[] args) {
        Book book = new Book(1, "Java Programming", 10, "Herbert Schildt");
        JournalPaper journal = new JournalPaper(2, "AI Research", 5, "John Doe", 2020);
        Video video = new Video(3, "Inception", 3, 120, "Christopher Nolan", "Sci-Fi", 2010);
        CD cd = new CD(4, "Thriller", 7, 42, "Michael Jackson", "Pop");

        book.print();
        journal.print();
        video.print();
        cd.print();
    }
}
