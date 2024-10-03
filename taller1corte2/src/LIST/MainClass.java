package LIST;

import javax.swing.JFrame;

public class MainClass {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Lista de Productos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new list());
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}