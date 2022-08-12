public class Main {

    public static void main(String[] args) {

        Author author1 = new Author( "Carlo", "Collodi");
        Book book1 = new Book("Pinocchio", 1881, author1);
        Author author2 = new Author("Stephen", "King");
        Book book2 = new Book("Misery", 1987, author2);

        System.out.println("Название: " + book1.getName() + " Год: " + book1.getYear() + " Автор: " + book1.getAuthor());
        System.out.println("Название: " + book2.getName() + " Год: " + book2.getYear() + " Автор: " + book2.getAuthor());

        book1.setYear(1883);
        book2.setYear(1995);
        System.out.println("Сеттер - " + book1.getYear());
        System.out.println("Сеттер - " + book2.getYear());




    }

}