import java.util.Scanner;
import java.util.ArrayList;
public class SystemBookApp{

    public static void main(String[] args){
    
        Scanner userInput = new Scanner(System.in);
    
      
             while(true){
            System.out.printf(""" 
       
       %n---------------- Welcome to the Book Suggestion App System -------------------
             If you want to add a book press 1
             If you want to remove a book press 2
             If you want to update books press 3
             If you want to show all books press 4
             If you dont want either of the options press 0 to exit"""    
             );   


                     System.out.println("Choose an operation:  ");
                     int operation = userInput.nextInt();
        
       
        }
        
        switch(userInput){
        
            case 1 -> {
                System.out.println("Enter The book for the day and the book title: ");
                   int bookChioce = userInput.nextInt();
                      if(userInput == 0){
                            }
                            break;      
              
              }
              
            case 2 -> { 
                while(true){ 
                System.out.println("Enter book title: ");
                String bookName = userInput.nextInt();
                bookApp.addNewBooks(bookName);
                System.out.println("The book has been added successfully!");
              
               if(bookName == 0){

               break;
                }         
                }
                }
            case 3 -> {
                while(true){
                 System.out.println("""     
              -------BOOK--------
              System.out.println("""   
                System.out.println("Enter book title: ");
                String nameOfTheBook = userInput.nextInt();
                bookApp.removeBooks(nameOfTheBook);
                System.out.println("The book has removed successfully!");

                if(nameOfTheBooks == 0){     
                break;
                }
                }  
                }        
            case 4 -> {

                System.out.println("Enter the old book title: ");
                String oldBookTitle = userInput.nextInt();
                System.out.println("Enter the new book title: ");
                String newBookTitle = userInput.nextInt();
                bookApp.updateBooks(oldBookTitle, newBookTitle);
                System.out.println("The book has been updated successfully!");
                 )    
                break;
                }     
            case 5 -> {
                System.out.println("All Books");
                
                ArrayList<String> books = bookApp.showBooks();
                int counter = 1;
                for(String book : books){
                
                    System.out.printf("%d. %s%n", counter,book);
                    counter++;
                }
                break;

        }
    
    
    
        }
    
    
    }
