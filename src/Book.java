import java.util.Objects;

public class Book {
    private final String name;
    private int year;

    private final Author author;

    public Book (String name, int year, Author author){
        this. name = name;
        this. year = year;
        this. author = author;

    }

    public String getName(){
        return this.name;
    }
    public int getYear(){
        return this.year;
    }
    public Author getAuthor(){
        return this.author;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public String toString(){
        return "Название: "+ name + " Год: " + year + " Автор: " + author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && name.equals(book.name) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year, author);
    }
}
