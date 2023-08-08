package model;

public class Book {



    private int id;
    private String name;
    private String description;
    private String author;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;

        return name;
    }

    public String getDescription() {
        return description;
    }

    public String setDescription(String description) {
        this.description = description;


        return description;
    }

    public String getAuthor() {
        return author;
    }

    public String setAuthor(String author) {
        this.author = author;
        return author;
    }

    public Book(int id, String name, String description, String author) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.author = author;
    }



    public String getInfo() {
        return " ------------------------------- \n" +
                id + ".Book \n"+
                " name: " + name + "\n"+
                " desrciption: " + description + "\n" +
                " author: " + author + "\n" +
                "----------------------------------\n ";
    }
}
