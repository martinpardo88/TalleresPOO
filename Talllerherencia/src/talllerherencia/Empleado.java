/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talllerherencia;

/**
 *
 * @author martin
 */
public class Empleado {
    
    private String nombre;
    private String apellido;
    private String numeroSeguroSocial;
    private double salarioBase;

    public Empleado(String nombre, String apellido, String numeroSeguroSocial, double salarioBase) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.salarioBase = salarioBase;
        
        
        
        
    }

    
    
    
    
    
    public double calcularDevengado() {
        return salarioBase;
    }

    
    
    
    
    public double calcularDeducciones() {
        return 0; 
    }

    public double calcularSalarioNeto() {
        return calcularDevengado() - calcularDeducciones();
    }

    
    
    
    
    public String getInformacion() {
        return "empleado: " + nombre + " apellido: " + apellido+ "numero: " + numeroSeguroSocial + "salrio base :  " +salarioBase;
    }   
    
    
    
}
