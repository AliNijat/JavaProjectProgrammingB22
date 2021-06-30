package Day50_Inheritance;

public class BookObjectTest {
    public static void main(String[] args) {

        Book book = new Book();
        book.author = "Ali"; book.price = 34.50;
        book.title = "Inheritance in Java"; book.type = "eBook";
        System.out.println("Author name: " + book.author + ", Title: " + book.title +", Price: $" + book.price + ", Type: " + book.type);

        System.out.println();

        AudioBook audioBook = new AudioBook();
        audioBook.title = "Loop in java"; audioBook.author = "Mohammad";
        audioBook.price = 40.99; audioBook.type = "AudioBook"; audioBook.length = 60;
        audioBook.narrator = "Zarina";
        System.out.println("Author Name: " + audioBook.author + ", Title: " + audioBook.title + ", Length: " + audioBook.length
        + "Min, Type: "+ audioBook.type + ", Price: $" + audioBook.price);
        audioBook.listen();

        System.out.println();

        eBook eBook = new eBook();
        eBook.author = "Ali"; eBook.type = "Java Book"; eBook.title = "Methods"; eBook.price = 80.99; eBook.pages = 150; eBook.size = 20;
        System.out.println("Author name: " + eBook.author + ", Type: "+eBook.type +", Title: "+ eBook.title
                +", Pages: " + eBook.pages +", Size: " + eBook.size +", Price: $" + eBook.price);
        eBook.readBook();
    }
}
