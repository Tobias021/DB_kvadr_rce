/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kvadraticka_rce_solver;

import java.awt.Color;
import javax.swing.JFormattedTextField;
import javax.swing.UIManager;

/**
 *
 * @author tobias
 */
public class Graphics {
    public void hasFocus(JFormattedTextField pole){
        pole.setBackground(Color.green);
    }
    
    public void noFocus(JFormattedTextField pole){
        pole.setBackground( UIManager.getColor("JFormattedTextField.background"));
    }
    
    public Color getDefaultBackground(Object object){
        try{
            return UIManager.getColor(object.toString()+".background");
        }catch(Exception e){
            return Color.white;
        }
    }
}
