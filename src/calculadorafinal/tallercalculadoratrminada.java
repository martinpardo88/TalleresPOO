/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadorafinal;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



/**
 *
 * @author martin
 */
public class tallercalculadoratrminada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame ventana = new JFrame("BIENVENIDO A MI CALCULADORA");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(800, 800);
        ventana.setLayout(null);
        JLabel etiqueta = new JLabel("CALCULADORA UAM.", SwingConstants.CENTER);
        etiqueta.setBounds(270,0,200,100);
        etiqueta.setFont(new Font("Arial", Font.PLAIN, 14));
        ventana.add(etiqueta);

        
        
        
       
        JLabel etiquetanum1 = new JLabel("INGRESE EN NUMERO 1");
        etiquetanum1.setBounds(100,80,200,100);
        ventana.add(etiquetanum1);      
        
        
        JTextField camponum1 = new JTextField();
        camponum1.setBounds(99,150,132,21);
        ventana.add(camponum1);
       
        
        JLabel etiquetanum2 = new JLabel("INGRESE EN NUMERO 2");
        etiquetanum2.setBounds(510,80,200,100);
        ventana.add(etiquetanum2);      
        
        
        JTextField camponum2 = new JTextField();
        camponum2.setBounds(510,150,132,21);
        ventana.add(camponum2);
        
        
        
        
        String[] opcion = new String[5];
            opcion[0]= "SELECCIONE UNA OPCION";
            opcion[1]= "sumar";
            opcion[2]= "restar";        
            opcion[3]= "dividir";       
            opcion[4]= "multiplicar";     
            JComboBox combo1 = new JComboBox(opcion);
            combo1.setBounds(270,200,180,50);
            ventana.add(combo1);
            
          
        
            
            
            
            
            
            
            
        
        JButton boton1 = new JButton("1");                                                                                                                               
        boton1.setBounds(270,295,50,50);
        ventana.add(boton1);
        
        JButton boton2 = new JButton("2");                                                                                                                               
        boton2.setBounds(336,295,50,50);
        ventana.add(boton2);
        
        JButton boton3 = new JButton("3");                                                                                                                               
        boton3.setBounds(400,295,50,50);
        ventana.add(boton3);
        
        
       
        
        JButton boton4 = new JButton("4");                                                                                                                               
        boton4.setBounds(270,370,50,50);
        ventana.add(boton4);
        
        JButton boton5 = new JButton("5");                                                                                                                               
        boton5.setBounds(336,370,50,50);
        ventana.add(boton5);
        
        JButton boton6 = new JButton("6");                                                                                                                               
        boton6.setBounds(400,370,50,50);
        ventana.add(boton6);
        
        
        
        
        JButton boton7 = new JButton("7");                                                                                                                               
        boton7.setBounds(270,445,50,50);
        ventana.add(boton7);
        
        JButton boton8 = new JButton("8");                                                                                                                               
        boton8.setBounds(336,445,50,50);
        ventana.add(boton8);
        
        JButton boton9 = new JButton("9");                                                                                                                               
        boton9.setBounds(400,445,50,50);
        ventana.add(boton9);
        
        
        
         JButton boton0 = new JButton("0");                                                                                                                               
        boton0.setBounds(336,520,50,50);
        ventana.add(boton0);
        
        
        
       
        
        
        
        JButton botoncalcular = new JButton("CALCULAR");                                                                                                                               
        botoncalcular.setBounds(270,590,180,50);
        ventana.add(botoncalcular);
        
        
        
        
        boton1.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                String numero1 = "1";
                String primerNumero = camponum1.getText(); //OBTENER TEXTO DEL CAMPO DEL NUMERO 1 PARA SABER SI YA TIENE UN NUMERO
                String segundoNumero = camponum2.getText();
                    if(primerNumero.equals("")){ //verificar que el campo este vacio para poner el numero
                        camponum1.setText(numero1);
                    }
                    else if(segundoNumero.equals("")){ //verificar que el campo este vacio para poner el numero
                        camponum2.setText(numero1);
                         }
                    else{ //SI YA TIENE NUMERO, MENSAJE INFORMATIVO.
                        JOptionPane.showMessageDialog(null,"NO SE PUEDEN INGRESAR MAS NUMERO","INFO",JOptionPane.INFORMATION_MESSAGE);
                     }       
                        } 
                            });  
      



//////////////////////////////////////////////////////////////////// espacio donde hacemos que los botones den el numero en los campos ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        
     
     
        boton2.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                String numero1 = "2";
                String primerNumero = camponum1.getText(); //OBTENER TEXTO DEL CAMPO DEL NUMERO 1 PARA SABER SI YA TIENE UN NUMERO
                String segundoNumero = camponum2.getText();
                    if(primerNumero.equals("")){ //verificar que el campo este vacio para poner el numero
                        camponum1.setText(numero1);
                    }
                    else if(segundoNumero.equals("")){ //verificar que el campo este vacio para poner el numero
                        camponum2.setText(numero1);
                         }
                    else{ //SI YA TIENE NUMERO, MENSAJE INFORMATIVO.
                        JOptionPane.showMessageDialog(null,"NO SE PUEDEN INGRESAR MAS NUMERO","INFO",JOptionPane.INFORMATION_MESSAGE);
                     }       
                        } 
                            });
        
        
        
        
        boton3.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                String numero1 = "3";
                String primerNumero = camponum1.getText(); //OBTENER TEXTO DEL CAMPO DEL NUMERO 1 PARA SABER SI YA TIENE UN NUMERO
                String segundoNumero = camponum2.getText();
                    if(primerNumero.equals("")){ //verificar que el campo este vacio para poner el numero
                        camponum1.setText(numero1);
                    }
                    else if(segundoNumero.equals("")){ //verificar que el campo este vacio para poner el numero
                        camponum2.setText(numero1);
                         }
                    else{ //SI YA TIENE NUMERO, MENSAJE INFORMATIVO.
                        JOptionPane.showMessageDialog(null,"NO SE PUEDEN INGRESAR MAS NUMERO","INFO",JOptionPane.INFORMATION_MESSAGE);
                     }       
                        } 
                            });
        
        
        
        
        boton4.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                String numero1 = "4";
                String primerNumero = camponum1.getText(); //OBTENER TEXTO DEL CAMPO DEL NUMERO 1 PARA SABER SI YA TIENE UN NUMERO
                String segundoNumero = camponum2.getText();
                    if(primerNumero.equals("")){ //verificar que el campo este vacio para poner el numero
                        camponum1.setText(numero1);
                    }
                    else if(segundoNumero.equals("")){ //verificar que el campo este vacio para poner el numero
                        camponum2.setText(numero1);
                         }
                    else{ //SI YA TIENE NUMERO, MENSAJE INFORMATIVO.
                        JOptionPane.showMessageDialog(null,"NO SE PUEDEN INGRESAR MAS NUMERO","INFO",JOptionPane.INFORMATION_MESSAGE);
                     }       
                        } 
                            });
        
        
        
        
        boton5.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                String numero1 = "5";
                String primerNumero = camponum1.getText(); //OBTENER TEXTO DEL CAMPO DEL NUMERO 1 PARA SABER SI YA TIENE UN NUMERO
                String segundoNumero = camponum2.getText();
                    if(primerNumero.equals("")){ //verificar que el campo este vacio para poner el numero
                        camponum1.setText(numero1);
                    }
                    else if(segundoNumero.equals("")){ //verificar que el campo este vacio para poner el numero
                        camponum2.setText(numero1);
                         }
                    else{ //SI YA TIENE NUMERO, MENSAJE INFORMATIVO.
                        JOptionPane.showMessageDialog(null,"NO SE PUEDEN INGRESAR MAS NUMERO","INFO",JOptionPane.INFORMATION_MESSAGE);
                     }       
                        } 
                            });                    
        
        
        
        
        boton6.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                String numero1 = "6";
                String primerNumero = camponum1.getText(); //OBTENER TEXTO DEL CAMPO DEL NUMERO 1 PARA SABER SI YA TIENE UN NUMERO
                String segundoNumero = camponum2.getText();
                    if(primerNumero.equals("")){ //verificar que el campo este vacio para poner el numero
                        camponum1.setText(numero1);
                    }
                    else if(segundoNumero.equals("")){ //verificar que el campo este vacio para poner el numero
                        camponum2.setText(numero1);
                         }
                    else{ //SI YA TIENE NUMERO, MENSAJE INFORMATIVO.
                        JOptionPane.showMessageDialog(null,"NO SE PUEDEN INGRESAR MAS NUMERO","INFO",JOptionPane.INFORMATION_MESSAGE);
                     }       
                        } 
                            });                    
        
        
        
        
        boton7.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                String numero1 = "7";
                String primerNumero = camponum1.getText(); //OBTENER TEXTO DEL CAMPO DEL NUMERO 1 PARA SABER SI YA TIENE UN NUMERO
                String segundoNumero = camponum2.getText();
                    if(primerNumero.equals("")){ //verificar que el campo este vacio para poner el numero
                        camponum1.setText(numero1);
                    }
                    else if(segundoNumero.equals("")){ //verificar que el campo este vacio para poner el numero
                        camponum2.setText(numero1);
                         }
                    else{ //SI YA TIENE NUMERO, MENSAJE INFORMATIVO.
                        JOptionPane.showMessageDialog(null,"NO SE PUEDEN INGRESAR MAS NUMERO","INFO",JOptionPane.INFORMATION_MESSAGE);
                     }       
                        } 
                            });
        
        
        
        
        boton8.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                String numero1 = "8";
                String primerNumero = camponum1.getText(); //OBTENER TEXTO DEL CAMPO DEL NUMERO 1 PARA SABER SI YA TIENE UN NUMERO
                String segundoNumero = camponum2.getText();
                    if(primerNumero.equals("")){ //verificar que el campo este vacio para poner el numero
                        camponum1.setText(numero1);
                    }
                    else if(segundoNumero.equals("")){ //verificar que el campo este vacio para poner el numero
                        camponum2.setText(numero1);
                         }
                    else{ //SI YA TIENE NUMERO, MENSAJE INFORMATIVO.
                        JOptionPane.showMessageDialog(null,"NO SE PUEDEN INGRESAR MAS NUMERO","INFO",JOptionPane.INFORMATION_MESSAGE);
                     }       
                        } 
                            });
        
        
        
        
        boton9.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                String numero1 = "9";
                String primerNumero = camponum1.getText(); //OBTENER TEXTO DEL CAMPO DEL NUMERO 1 PARA SABER SI YA TIENE UN NUMERO
                String segundoNumero = camponum2.getText();
                    if(primerNumero.equals("")){ //verificar que el campo este vacio para poner el numero
                        camponum1.setText(numero1);
                    }
                    else if(segundoNumero.equals("")){ //verificar que el campo este vacio para poner el numero
                        camponum2.setText(numero1);
                         }
                    else{ //SI YA TIENE NUMERO, MENSAJE INFORMATIVO.
                        JOptionPane.showMessageDialog(null,"NO SE PUEDEN INGRESAR MAS NUMERO","INFO",JOptionPane.INFORMATION_MESSAGE);
                     }       
                        } 
                            });
        
        
        
        
        boton0.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                String numero1 = "0";
                String primerNumero = camponum1.getText(); //OBTENER TEXTO DEL CAMPO DEL NUMERO 1 PARA SABER SI YA TIENE UN NUMERO
                String segundoNumero = camponum2.getText();
                    if(primerNumero.equals("")){ //verificar que el campo este vacio para poner el numero
                        camponum1.setText(numero1);
                    }
                    else if(segundoNumero.equals("")){ //verificar que el campo este vacio para poner el numero
                        camponum2.setText(numero1);
                         }
                    else{ //SI YA TIENE NUMERO, MENSAJE INFORMATIVO.
                        JOptionPane.showMessageDialog(null,"NO SE PUEDEN INGRESAR MAS NUMERO","INFO",JOptionPane.INFORMATION_MESSAGE);
                     }       
                        } 
                            });
        botoncalcular.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
        
                String num1Str = camponum1.getText();  
                String num2Str = camponum2.getText();     
        try {
            
            double num1 = Double.parseDouble(num1Str);
            double num2 = Double.parseDouble(num2Str);

            
            String opcionSeleccionada = (String) combo1.getSelectedItem();

            // Variable para almacenar el resultado de la operación
            double resultado = 0;

            // Realizar la operación según la opción seleccionada en el JComboBox
            switch (opcionSeleccionada) {
                case "sumar":
                    resultado = num1 + num2;
                    break;
                case "restar":
                    resultado = num1 - num2;
                    break;
                case "dividir":
                    if (num2 == 0) {
                        JOptionPane.showMessageDialog(null, "No se puede dividir por cero", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    resultado = num1 / num2;
                    break;
                case "multiplicar":
                    resultado = num1 * num2;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Seleccione una operación válida", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
            }

        
            JOptionPane.showMessageDialog(null, "El resultado es: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException ex) {
        
            JOptionPane.showMessageDialog(null, "Por favor ingrese números válidos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
});
        
        ventana.setVisible(true);
        
        
    }
}

