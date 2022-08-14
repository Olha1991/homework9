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
        return "Название: "+ this. name + " Год: " + this. year + " Автор: " + this. author;
    }

    @Override
    public boolean equals (Object other) {
        if(this == other) return true;
        if(other == null || getClass() != other.getClass()) {
            return false;
        }
        Book book = (Book) other;
        return year == book.year && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }
    @Override
    public int hashCode(){
        return Objects.hash(year, author);
    }
}
