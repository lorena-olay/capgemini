package org.example;

import java.util.SortedMap;

public class ProgramaEmpleados {
    public static void main(String[] args) {
        Empleado em1 = new Empleado();
        Empleado em2 = new Empleado("EmpleadoNombre","4932300dni","432423tlf","cargo",10);
        System.out.println(em2.getNombre());
        em2.setNombre("Roberto");
        System.out.println(em2.getNombre());
        Jefe Victor = new Jefe(em1.getNombre(), em1.getDni(), em1.getTlf(), em1.getCargo(),em1.getSueldo(),"DEPARTAMENTO.TESTING");
        Currito Chope = new Currito("Pocho", em1.getDni(), em1.getTlf(), em1.getCargo(), em1.getSueldo(), true);
        System.out.println(Victor.toString());
        System.out.println(Chope.toString());



    }
}
