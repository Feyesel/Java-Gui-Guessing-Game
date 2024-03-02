
package Class;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Feyesel Sultan
 */
public class Gui { //start
    
    //give an icon for the frame
    public void setIconFrame(JFrame frame){
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Asset/titlebar.png")));
    }
    
    //filter intiger numbers only
    public static void _onlyIntiger(KeyEvent evt){//start intiger filter
        char _character = evt.getKeyChar();
        
        if(Character.isDigit(_character) || 
            _character == KeyEvent.VK_SPACE || 
            _character == KeyEvent.VK_DELETE ||
            _character == KeyEvent.VK_SLASH){
            //event would be processed depending on listner  
        }else{
            evt.consume(); //event will not be processed by default it would be consumed  
            Toolkit.getDefaultToolkit().beep(); //beep sound to notify
        }
    }//end intiger filter
    
    //create  prompt message
    public static void _message(String message, int errorType){ //msg start
        switch(errorType){
            case 0:
                JOptionPane.showMessageDialog(null,message,"ERROR", JOptionPane.ERROR_MESSAGE);
                break;
            case 1:
                JOptionPane.showMessageDialog(null,message,"SUCCESS", JOptionPane.PLAIN_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(null,message,"WARNING", JOptionPane.WARNING_MESSAGE);
                break;
            default:
                break;
        }
    }//msg end
    
}//end
