/* Back in 2015 I had no idea why the previous version of this code didn't work.
    Now in 2023 finally fixed it. So, there is this class called Book that has a title and can be borrowed.
    The, I test if it returns the title and the status of the book*/

class Book { String title; boolean borrowed;

    public Book(String bookTitle) {title = bookTitle; borrowed = false;} // Creates a new Book
    
    public void borrow() {borrowed = true;} // Marks the book as rented
    
    public void returned() {borrowed = false;} // Marks the book as not rented
    
    public boolean isBorrowed() {return borrowed;} // Returns true if the book is rented, false otherwise
    
    public String getTitle() {return title;} // Returns the title of the book
}

public class Main{ 
    public static void main(String[] arguments){
        Book example = new Book("The Da Vinci Code");
        
        System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
        
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        
        System.out.println("I'm now borrowing the book."); 
        example.borrow();       // Borrowing the book
        
        System.out.println("Borrowed? (should be true): " + example.isBorrowed()); 
        
        System.out.println("I'm now returning the book.");
        example.returned();     // Returning the book.
        
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());}}
