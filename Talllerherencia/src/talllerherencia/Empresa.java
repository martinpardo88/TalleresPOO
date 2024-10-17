/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talllerherencia;

import java.util.ArrayList;

/**
 *
 * @author martin
 */
public class Empresa {
    
    private ArrayList<Empleado> empleados;

    public Empresa() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    
    
    
    
    public void calcularNomina() {
        for (Empleado empleado : empleados) {
            System.out.println(empleado.getInformacion());
            System.out.println("salario total " + empleado.calcularSalarioNeto());
        }
    }
    
    
}
