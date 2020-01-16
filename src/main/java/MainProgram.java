import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class MainProgram {
    private static final Logger logger = LogManager.getLogger(MainProgram.class.getName());
    public static void main(String[] args) {
        Visitor bob = new Visitor("Bob Marley", 25, "12 Oct 2002", "13:00", "None", "Kagiso");
        logger.info(bob.save());
        logger.info(bob.load("Bob Marley"));
        Visitor alice = new Visitor("Alice Cooper", 30, "21 January 2016", "14:00", "None", "Bob");
        logger.info(alice.save());
        logger.info(alice.load("Alice Cooper"));
        Visitor charlie = new Visitor("Charlie Sheen", 27, "18 February 2018", "12:35pm", "None", "Candice");
        logger.info(charlie.save());
        logger.info(charlie.load("Charlie Sheen"));
    }
}