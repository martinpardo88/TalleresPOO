/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ejemplokeytype;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Minicalculadora extends javax.swing.JFrame {

    /**
     * Creates new form minicalculadora
     */
    public Minicalculadora() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonnumero1 = new javax.swing.JButton();
        botonnumero2 = new javax.swing.JButton();
        botonnumero3 = new javax.swing.JButton();
        camponumero1 = new javax.swing.JTextField();
        camporesultado = new javax.swing.JTextField();
        camponumero2 = new javax.swing.JTextField();
        labeltitulo = new javax.swing.JLabel();
        botonsumar = new javax.swing.JButton();
        botonnumero4 = new javax.swing.JButton();
        botonnumero6 = new javax.swing.JButton();
        botonnumero7 = new javax.swing.JButton();
        botonnumero8 = new javax.swing.JButton();
        botonnumero9 = new javax.swing.JButton();
        botonnumero0 = new javax.swing.JButton();
        botonnumero5 = new javax.swing.JButton();
        botonrestar = new javax.swing.JButton();
        botonmultiplicar = new javax.swing.JButton();
        botondividir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        botonnumero1.setText("1");
        botonnumero1.setFocusable(false);
        botonnumero1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonnumero1MouseClicked(evt);
            }
        });

        botonnumero2.setText("2");
        botonnumero2.setFocusable(false);
        botonnumero2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonnumero2MouseClicked(evt);
            }
        });

        botonnumero3.setText("3");
        botonnumero3.setFocusable(false);
        botonnumero3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonnumero3MouseClicked(evt);
            }
        });

        camponumero1.setEditable(false);
        camponumero1.setFocusable(false);
        camponumero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camponumero1ActionPerformed(evt);
            }
        });

        camporesultado.setFocusable(false);

        camponumero2.setEditable(false);
        camponumero2.setFocusable(false);

        labeltitulo.setText("mini calculadora");

        botonsumar.setText("sumar");
        botonsumar.setFocusable(false);
        botonsumar.setHideActionText(true);
        botonsumar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonsumarMouseClicked(evt);
            }
        });

        botonnumero4.setText("4");
        botonnumero4.setFocusable(false);
        botonnumero4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonnumero4MouseClicked(evt);
            }
        });

        botonnumero6.setText("6");
        botonnumero6.setFocusable(false);
        botonnumero6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonnumero6MouseClicked(evt);
            }
        });

        botonnumero7.setText("7");
        botonnumero7.setFocusable(false);
        botonnumero7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonnumero7MouseClicked(evt);
            }
        });

        botonnumero8.setText("8");
        botonnumero8.setFocusable(false);
        botonnumero8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonnumero8MouseClicked(evt);
            }
        });

        botonnumero9.setText("9");
        botonnumero9.setFocusable(false);
        botonnumero9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonnumero9MouseClicked(evt);
            }
        });

        botonnumero0.setText("0");
        botonnumero0.setFocusable(false);
        botonnumero0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonnumero0MouseClicked(evt);
            }
        });

        botonnumero5.setText("5");
        botonnumero5.setFocusable(false);
        botonnumero5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonnumero5MouseClicked(evt);
            }
        });

        botonrestar.setText("restar");
        botonrestar.setFocusable(false);
        botonrestar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonrestarMouseClicked(evt);
            }
        });

        botonmultiplicar.setText("multiplicar");
        botonmultiplicar.setFocusable(false);
        botonmultiplicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonmultiplicarMouseClicked(evt);
            }
        });

        botondividir.setText("dividir");
        botondividir.setFocusable(false);
        botondividir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botondividirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(camporesultado, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(botonnumero7, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                    .addComponent(botonnumero4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botonnumero1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(botonnumero2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                    .addComponent(botonnumero8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botonnumero0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(172, 172, 172)
                                .addComponent(camponumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(358, 358, 358)
                                .addComponent(botonnumero5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonnumero3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(camponumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonnumero6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonnumero9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(botonsumar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(botonrestar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(botonmultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(botondividir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(152, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labeltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(325, 325, 325))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labeltitulo)
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(camponumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(camponumero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonnumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonnumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonnumero3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(botonnumero6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonnumero4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(botonnumero5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonnumero9, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(botonnumero8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonnumero7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(botonnumero0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botondividir, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(botonsumar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(botonrestar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonmultiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addComponent(camporesultado, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void camponumero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camponumero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_camponumero1ActionPerformed

    
    
    
    
    
    
    
    
    

    
    
    
    private void botonnumero1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonnumero1MouseClicked
        // TODO add your handling code here:
            
      if (camponumero1.getText().equals("")) {
        camponumero1.setText("1");
      }
      
      else  if (camponumero2.getText().equals("")) {
          camponumero2.setText("1");   
      }
      
        
        
    }//GEN-LAST:event_botonnumero1MouseClicked

    private void botonnumero2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonnumero2MouseClicked
            
      if (camponumero1.getText().equals("")) {
        camponumero1.setText("2");
      }
      
      else  if (camponumero2.getText().equals("")) {
          camponumero2.setText("2");   
      }
      
        
        
    }//GEN-LAST:event_botonnumero2MouseClicked

    private void botonnumero3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonnumero3MouseClicked

            
      if (camponumero1.getText().equals("")) {
        camponumero1.setText("3");
      }
      
      else  if (camponumero2.getText().equals("")) {
          camponumero2.setText("3");   
      }
      

    }//GEN-LAST:event_botonnumero3MouseClicked

    private void botonsumarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonsumarMouseClicked

    int numero1 = Integer.parseInt(camponumero1.getText());
    int numero2 = Integer.parseInt(camponumero2.getText()); 
    int resultado = numero1+ numero2;
    camporesultado.setText(String.valueOf(resultado));
    camponumero1.setText("");  
    camponumero2.setText("");  


    }//GEN-LAST:event_botonsumarMouseClicked

   

    
    private void botonnumero4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonnumero4MouseClicked
       
          if (camponumero1.getText().equals("")) {
        camponumero1.setText("4");
      }
      
      else  if (camponumero2.getText().equals("")) {
          camponumero2.setText("4");   
                }
    }//GEN-LAST:event_botonnumero4MouseClicked

    private void botonnumero5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonnumero5MouseClicked
       
        if (camponumero1.getText().equals("")) {
        camponumero1.setText("5");
      }
      
      else  if (camponumero2.getText().equals("")) {
          camponumero2.setText("5");   
                }
        
        
    }//GEN-LAST:event_botonnumero5MouseClicked

    private void botonnumero6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonnumero6MouseClicked
       
        if (camponumero1.getText().equals("")) {
        camponumero1.setText("6");
      }
      
      else  if (camponumero2.getText().equals("")) {
          camponumero2.setText("6");   
                } 
        
        
        
    }//GEN-LAST:event_botonnumero6MouseClicked

    private void botonnumero7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonnumero7MouseClicked
       
      if (camponumero1.getText().equals("")) {
        camponumero1.setText("7");
      }
      
      else  if (camponumero2.getText().equals("")) {
          camponumero2.setText("7");   
                }  
        
        
        
    }//GEN-LAST:event_botonnumero7MouseClicked

    private void botonnumero8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonnumero8MouseClicked
       
        
       if (camponumero1.getText().equals("")) {
        camponumero1.setText("8");
      }
      
      else  if (camponumero2.getText().equals("")) {
          camponumero2.setText("8");   
                }  
        
    }//GEN-LAST:event_botonnumero8MouseClicked

    private void botonnumero9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonnumero9MouseClicked
       
    if (camponumero1.getText().equals("")) {
        camponumero1.setText("9");
      }
      
      else  if (camponumero2.getText().equals("")) {
          camponumero2.setText("9");   
                }      
        
        
    }//GEN-LAST:event_botonnumero9MouseClicked

    private void botonnumero0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonnumero0MouseClicked
       
    if (camponumero1.getText().equals("")) {
        camponumero1.setText("0");
      }
      
      else  if (camponumero2.getText().equals("")) {
          camponumero2.setText("0");   
                }    
        
        
        
    }//GEN-LAST:event_botonnumero0MouseClicked

    
    
    
    
    
    
    private void botonrestarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonrestarMouseClicked
     
    int numero1 = Integer.parseInt(camponumero1.getText());
    int numero2 = Integer.parseInt(camponumero2.getText()); 
    int resultado = numero1 - numero2;
    camporesultado.setText(String.valueOf(resultado));
    camponumero1.setText("");  
    camponumero2.setText("");
        
        
        
        
    }//GEN-LAST:event_botonrestarMouseClicked

    private void botonmultiplicarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonmultiplicarMouseClicked
      
    int numero1 = Integer.parseInt(camponumero1.getText());
    int numero2 = Integer.parseInt(camponumero2.getText()); 
    int resultado = numero1 * numero2;
    camporesultado.setText(String.valueOf(resultado));
    camponumero1.setText("");  
    camponumero2.setText("");
           
        
        
        
        
    }//GEN-LAST:event_botonmultiplicarMouseClicked

    private void botondividirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botondividirMouseClicked
     
    double numero1 = Double.parseDouble(camponumero1.getText());
    double numero2 = Double.parseDouble(camponumero2.getText()); 

    if(numero2 != 0) {  // Verificamos que no se divida entre 0
        double resultado = numero1 / numero2;
        camporesultado.setText(String.valueOf(resultado));
    } else {
        camporesultado.setText("0");
    }
    
    camponumero1.setText("");  
    camponumero2.setText("");    
        
        
        
        
        
    }//GEN-LAST:event_botondividirMouseClicked

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
       
        
        String numero = String.valueOf(evt.getKeyChar());
        if(numero.equals("1")){
           if(camponumero1.getText().equals("")){
            camponumero1.setText("1");
        }
           else if(camponumero2.getText().equals("")){
            camponumero2.setText("1");
        }    
    }
        if(numero.equals("2")){
           if(camponumero1.getText().equals("")){
            camponumero1.setText("2");
        }
           else if(camponumero2.getText().equals("")){
            camponumero2.setText("2");
           }
        }
        if(numero.equals("3")){
           if(camponumero1.getText().equals("")){
            camponumero1.setText("3");
        }
           else if(camponumero2.getText().equals("")){
            camponumero2.setText("3");
           }
        }
        
         if(numero.equals("4")){
           if(camponumero1.getText().equals("")){
            camponumero1.setText("4");
        }
           else if(camponumero2.getText().equals("")){
            camponumero2.setText("4");
           }
        }
        
         if(numero.equals("5")){
           if(camponumero1.getText().equals("")){
            camponumero1.setText("5");
        }
           else if(camponumero2.getText().equals("")){
            camponumero2.setText("5");
           }
        }
        
         if(numero.equals("6")){
           if(camponumero1.getText().equals("")){
            camponumero1.setText("6");
        }
           else if(camponumero2.getText().equals("")){
            camponumero2.setText("6");
           }
        }
         
         
        if(numero.equals("7")){
           if(camponumero1.getText().equals("")){
            camponumero1.setText("7");
        }
           else if(camponumero2.getText().equals("")){
            camponumero2.setText("7");
           }
        } 
         
         
         if(numero.equals("8")){
           if(camponumero1.getText().equals("")){
            camponumero1.setText("8");
        }
           else if(camponumero2.getText().equals("")){
            camponumero2.setText("8");
           }
        }
         
         
        if(numero.equals("9")){
           if(camponumero1.getText().equals("")){
            camponumero1.setText("9");
        }
           else if(camponumero2.getText().equals("")){
            camponumero2.setText("9");
           }
        }
         
         
        if(numero.equals("0")){
           if(camponumero1.getText().equals("")){
            camponumero1.setText("0");
        }
           else if(camponumero2.getText().equals("")){
            camponumero2.setText("0");
           }
        }
         
        
        
        
        
        
    }//GEN-LAST:event_formKeyTyped

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
     
     if (evt.getKeyCode() == KeyEvent.VK_ADD) {
            int numero1 = Integer.parseInt(camponumero1.getText());
            int numero2 = Integer.parseInt(camponumero2.getText());
            int resultado = numero1 + numero2;
            camporesultado.setText(String.valueOf(resultado));
            camponumero1.setText("");
            camponumero2.setText("");
        }
        if (evt.getKeyCode() == KeyEvent.VK_SUBTRACT) {
            int numero1 = Integer.parseInt(camponumero1.getText());
            int numero2 = Integer.parseInt(camponumero2.getText());
            int resultado = numero1 - numero2;
            camporesultado.setText(String.valueOf(resultado));
            camponumero1.setText("");
            camponumero2.setText("");
        }
        if (evt.getKeyCode() == KeyEvent.VK_MULTIPLY) {
            int numero1 = Integer.parseInt(camponumero1.getText());
            int numero2 = Integer.parseInt(camponumero2.getText());
            int resultado = numero1 * numero2;
            camporesultado.setText(String.valueOf(resultado));
            camponumero1.setText("");
            camponumero2.setText("");
        }
        if (evt.getKeyCode() == KeyEvent.VK_DIVIDE) {
            double numero1 = Double.parseDouble(camponumero1.getText());
            double numero2 = Double.parseDouble(camponumero2.getText());
            if (numero2 != 0) {
                double resultado = numero1 / numero2;
                camporesultado.setText(String.valueOf(resultado)); //El String.valueOF sirve para pasar de entero a string
                camponumero1.setText("");
                camponumero2.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "NO SE PUEDE REALIZAR DIVISON POR 0");
                camponumero1.setText("");
                camponumero2.setText("");
            }
        }   
        
        
    }//GEN-LAST:event_formKeyPressed

    
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Minicalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Minicalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Minicalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Minicalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Minicalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botondividir;
    private javax.swing.JButton botonmultiplicar;
    private javax.swing.JButton botonnumero0;
    private javax.swing.JButton botonnumero1;
    private javax.swing.JButton botonnumero2;
    private javax.swing.JButton botonnumero3;
    private javax.swing.JButton botonnumero4;
    private javax.swing.JButton botonnumero5;
    private javax.swing.JButton botonnumero6;
    private javax.swing.JButton botonnumero7;
    private javax.swing.JButton botonnumero8;
    private javax.swing.JButton botonnumero9;
    private javax.swing.JButton botonrestar;
    private javax.swing.JButton botonsumar;
    private javax.swing.JTextField camponumero1;
    private javax.swing.JTextField camponumero2;
    private javax.swing.JTextField camporesultado;
    private javax.swing.JLabel labeltitulo;
    // End of variables declaration//GEN-END:variables
}