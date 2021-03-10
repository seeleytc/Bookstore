public class BookstoreRunner {
    private static Book[] availableBooks = new Book[10];
    public static void main(String[] args) {
        populateAvailableBooks();
        listAvailableBooks();
        determineBookSelection();

    }
    public void populateAvailableBooks() {
        Book b1 = new Book("Tom and Jerry", 19.99, "000034457");
        Book b2 = new Book( "Learn Java", 1.87, "000045643");
        Book b3 = new Book("Bible", 24.67, "000035678");
        Book b4 = new Book("Harry Potter", 8.97, "000065781");
        Book b5 = new Book("Cat in the hat", 5.42, "000087690");
        Book b6 = new Book("Dictionary", 29.99, "000038692");
        Book b7 = new Book("Hunger Games", 10.99, "000091234");
        Book b8 = new Book("Magic Tree House", 6.99, "000049075");
        Book b9 = new Book("The Martian", 8.99, "000065713");
        Book b10 =new Book("Green Eggs and Ham", 0.01 , "000098371");


        availableBooks[0] = b1;
        availableBooks[1] = b2;
        availableBooks[2] = b3;
        availableBooks[3] = b4;
        availableBooks[4] = b5;
        availableBooks[5] = b6;
        availableBooks[6] = b7;
        availableBooks[7] = b8;
        availableBooks[8] = b9;
        availableBooks[9] = b10;




    }
    public void listAvailableBooks() {

    }
    public void determineBookSelection() {

    }

}

