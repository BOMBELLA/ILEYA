import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class SystemBookAppTest{
    
    
    
    @Test
    public void testThatYouCanAddABookToTheList(){
       ArrayList<String> expectedBooks = bookApp.addNewBooks("Nnamdi her best brother");
       ArrayList<String> actualBooks = new ArrayList<String>("The Hobbit", "The Mystery", "Animal Farm", "Brave kingdom", "Nnamdi her best brother");
       assertEquals(expectedBooks, actualBooks);
       }
    
    
    @Test
    public void testThatYouCanRemoveABookFromTheList(){
       ArrayList<String> expectedBooks = bookApp.removeBooks("The Mystery");
       ArrayList<String> actualBooks = new ArrayList<String>("The Hobbit", "The Mystery", "Brave kingdom");
       assertEquals(expectedBooks, actualBooks);
      }
    
    
    @Test
    public void testThatYouCanUpdateABookTitleInTheList(){
       ArrayList<String> expectedBooks = bookApp.updateBooks("The Mystery", "Mystries of the world");
       ArrayList<String> actualBooks = new ArrayList<String>("The Hobbit", "The Mystery", "Animals", "Brave kingdom");
       assertEquals(expectedBooks, actualBooks);
      }
    
    @Test
    public void testThatYouCanShowAllBooksInTheList(){
       ArrayList<String> expectedBooks = bookApp.showBooks();
       ArrayList<String> actualBooks = new ArrayList<String>("The Hobbit", "The Mystery", "Animal Farm", "Brave kingdom" , "Nnamdi her best brother");
       assertEquals(expectedBooks, actualBooks);
      }
        
}
