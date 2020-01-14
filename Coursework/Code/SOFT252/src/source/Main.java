package source;
import guis.MainMenu;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.parser.ParseException;

public class Main {

    public static void main(String[] args) throws IOException, FileNotFoundException, ParseException {
        Data root = Data.getInstance();
        root.setup();
        
        new MainMenu().setVisible(true);
        
        Runtime.getRuntime().addShutdownHook(new Thread() {            
            public void run() {                
                try {       
                    root.saveUsers();
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }        
        });        
    }
}
