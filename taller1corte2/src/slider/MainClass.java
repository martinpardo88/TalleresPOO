package slider; 

import javax.swing.JFrame;

public class MainClass {

    public static void main(String[] args) {
        // Crea el JFrame
        JFrame mainFrame = new JFrame("Panel Slider");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Crea una instancia de tu JPanel
        panelslider panel = new panelslider();
        
        // Añade el JPanel al JFrame
        mainFrame.add(panel);
        
        // Configura el tamaño del JFrame y lo hace visible
        mainFrame.setSize(400, 300); // Ajusta el tamaño según lo que necesites
        mainFrame.setVisible(true);
    }
}