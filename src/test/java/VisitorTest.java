import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class VisitorTest {
    Visitor bob = new Visitor("Bob Marley", 25, "12 Oct 2002", "13:00", "None", "Kagiso");
    @Test
    void save() {
        /*the below test will only pass if the file doesn't exist*/
        //assertEquals("results in visitor_bob_marley.txt",bob.save());

        /*expecting the program to return 'File already exists, results in visitor_bob_marley.txt'
          if the bob.save() method was instantiated already*/
        assertEquals("File already exists, results in visitor_bob_marley.txt",bob.save());
    }
    @Test
    void load() {
        assertEquals("Name: Bob Marley Age: 25 Date: 12 Oct 2002 Time: 13:00 Comments: None Assistant: Kagiso",bob.load("Bob Marley"));
    }
}