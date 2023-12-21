package JavaOOP.task4;

class Book {
    public String name;
    public String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String takebooksname() {
        String info = name + ": " + author;
        return info;
    }
}
