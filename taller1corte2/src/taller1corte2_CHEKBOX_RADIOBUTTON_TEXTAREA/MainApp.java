package taller1corte2_CHEKBOX_RADIOBUTTON_TEXTAREA;

import javax.swing.JFrame;

public class MainApp {

    public static void main(String[] args) {
   
        JFrame frame = new JFrame("Inscripción para media maratón");

        chekbox panel = new chekbox();

        frame.add(panel);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.pack(); 
        frame.setVisible(true); 
        frame.setSize(500, 700); 
    }
}

