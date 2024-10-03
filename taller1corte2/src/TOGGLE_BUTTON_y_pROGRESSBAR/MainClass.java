package TOGGLE_BUTTON_y_pROGRESSBAR;

import javax.swing.JFrame;

public class MainClass {

    public static void main(String[] args) {
      
        JFrame mainFrame = new JFrame("Ejercicio de Progreso");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
      
        ejertres panel = new ejertres();
        
        
        mainFrame.add(panel);
        
      
        mainFrame.setSize(400, 300); 
        mainFrame.setVisible(true);
    }
}
