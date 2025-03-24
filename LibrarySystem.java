import java.util.*;
import java.io.*;

class Book {
    private String author;
    private String title;
    private String genre;
    private String description;
    private int year;
    private List<String> tags;
    private double rating;
    private int isbn;
}

    public Book(String author, String title, String genre, String description, int year, List<String> tags, double rating, int isbn) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.description = description;
        this.year = year;
        this.tags = tags;
        this.rating = rating;
        this.isbn = isbn;
    }

    public String getAuthor() { return author; }
    public String getTitle() { return title; }
    public String getGenre() { return genre; }
    public String getDescription() { return description; }
    public int getYear() { return year; }
    public List<String> getTags() { return tags; }
    public double getRating() { return rating; }
    public int getIsbn() { return isbn; }

    public void displayInfo() {
        System.out.println("Заглавие: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Жанр: " + genre);
        System.out.println("Описание: " + description);
        System.out.println("Година на издаване: " + year);
        System.out.println("Ключови думи: " + String.join(", ", tags));
        System.out.println("Рейтинг: " + rating);
        System.out.println("ISBN: " + isbn);
    }
}
class User {
    private String username;
    private String password;
    private boolean isAdmin;

    // Конструктор
    public User(String username, String password, boolean isAdmin) {
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    // Проверка на паролата
    public boolean checkPassword(String pass) {
        return this.password.equals(pass);
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public String getUsername() {
        return username;
    }
}
