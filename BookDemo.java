import Lesson05.Homework.Book;

public class BookDemo {
    public static void main(String[] args) {

        Book book1 = new Book();

        book1.title = "war and peace";
        book1.author = "Lev Tolstoy";
        book1.year = 1869;
        book1.isIssued = true;

        System.out.println("Первая книга");
        System.out.println("Название книги :" + book1.title);
        System.out.println("Автор книги :" + book1.author);
        System.out.println("Год издания:" + book1.year);
        System.out.println("Книга выдана:" + book1.isIssued);

        Book book2 = new Book();

        book2.title = "Three comrades";
        book2.author = "Eri Maria Remark";
        book2.year = 1929;
        book2.isIssued = true;

        System.out.println("Вторая книга");
        System.out.println("Название книги :" + book2.title);
        System.out.println("Автор книги :" + book2.author);
        System.out.println("Год издания:" + book2.year);
        System.out.println("Книга выдана:" + book2.isIssued);
    }
    }
}
