public class Book {
    int Book_id;
    String Book_Name;
    String Book_Author_Name;

    Book(int Book_id, String Book_Name, String Book_Author_Name) {
        this.Book_id = Book_id;
        this.Book_Name = Book_Name;
        this.Book_Author_Name = Book_Author_Name;
        System.out.println("Book_Id "+Book_id+"Book_Name "+Book_Name+"Book_Author_Name "+Book_Author_Name);
    }

    @Override
    public String toString() {
        return Book_id + " " + Book_Name + " " + Book_Author_Name;
    }
}
