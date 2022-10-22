
package Common;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.UIManager;

/**
 *
 * @author Jorge
 */
public class FontDialog {

    public static void errorMessage(String message) {

        UIManager.put("control", Color.WHITE);

        JLabel label = new JLabel(message);

        //JOptionPane: type must be one of JOptionPane.ERROR_MESSAGE, JOptionPane.INFORMATION_MESSAGE, JOptionPane.WARNING_MESSAGE,
        //JOptionPane.QUESTION_MESSAGE or JOptionPane.PLAIN_MESSAGE
        label.setFont(new Font("Arial", Font.PLAIN, 24));
        label.setForeground(new Color(102, 102, 102));
        label.setBackground(Color.white);
        //label.setOpaque(false);

        JOptionPane.showMessageDialog(null, label, "Error", JOptionPane.ERROR_MESSAGE);

    }
    //https://stackoverflow.com/questions/9064943/how-to-change-background-color-of-joptionpane
    
    public static void confirmationMessage(String message){
        
        UIManager.put("control", Color.WHITE);

        JLabel label = new JLabel(message);

        //JOptionPane: type must be one of JOptionPane.ERROR_MESSAGE, JOptionPane.INFORMATION_MESSAGE, JOptionPane.WARNING_MESSAGE,
        //JOptionPane.QUESTION_MESSAGE or JOptionPane.PLAIN_MESSAGE
        label.setFont(new Font("Arial", Font.PLAIN, 24));
        label.setForeground(new Color(102, 102, 102));
        label.setBackground(Color.white);
        //label.setOpaque(false);

        JOptionPane.showMessageDialog(null, label, "Aviso", JOptionPane.INFORMATION_MESSAGE);
    }
}
