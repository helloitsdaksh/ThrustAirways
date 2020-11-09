package thrustairways;

import java.awt.event.*;
import java.awt.*; 



 
 


/**
 *
 * @author Aesha
 */
public class ThrustAirways {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        start s = new start();
        s.setVisible(true);
        try
           
        {
            Thread.sleep(5000);
            login o=new login();
            o.setVisible(true);
            s.setVisible(false);
        }
        catch( InterruptedException e)
        {
            
        }
        
        
            
    }
    
}
