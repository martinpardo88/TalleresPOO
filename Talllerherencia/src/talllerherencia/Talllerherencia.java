/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package talllerherencia;

/**
 *
 * @author martin
 */
public class Talllerherencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empresa empresa = new Empresa();

        EmpleadoPorHoras empleado1 = new EmpleadoPorHoras("martin", "pardo", "3137455434634", 0, 40, 15);
        EmpleadoPorSueldo empleado2 = new EmpleadoPorSueldo("luis", "vallena", "54367458", 3000, 300, 100, 150, 200);
        EmpleadoGerente empleado3 = new EmpleadoGerente("geronimo", "narvaez", "4634777573", 5000, 500, 200, 300, 400, 1000, 500);

        empresa.agregarEmpleado(empleado1);
        empresa.agregarEmpleado(empleado2);
        empresa.agregarEmpleado(empleado3);

        empresa.calcularNomina();
        
        
    }
    
}
