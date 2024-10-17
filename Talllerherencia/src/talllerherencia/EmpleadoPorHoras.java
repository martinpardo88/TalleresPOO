/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talllerherencia;

/**
 *
 * @author martin
 */
public class EmpleadoPorHoras extends Empleado {
   
    private int horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoPorHoras(String nombre, String apellido, String numeroSeguroSocial, double salarioBase, int horasTrabajadas, double tarifaPorHora) {
        super(nombre, apellido, numeroSeguroSocial, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    
    
    
    
    
    @Override
    public double calcularDevengado() {
        return horasTrabajadas * tarifaPorHora;
    }

    
    
    
    
    
    
    
    
    @Override
    public double calcularDeducciones() {
       
        return calcularDevengado() * 0.1; 
    }
    
    
}
