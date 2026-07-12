

import modelo.*;
import modelo.PlanDatos;

public class Main {

    public static void mostrarPlanes(ProveedorFactory factory, int megas) {

        PlanDatos personal = factory.crearPlanPersonal();
        personal.setTasa();

        PlanDatos negocio = factory.crearPlanNegocio();
        negocio.setTasa();

        PlanDatos academico = factory.crearPlanAcademico();
        academico.setTasa();

        System.out.println(personal + " Pago: " + personal.calculoPago(megas));
        System.out.println(negocio + " Pago: " + negocio.calculoPago(megas));
        System.out.println(academico + " Pago: " + academico.calculoPago(megas));
    }

    public static void main(String[] args) {

        int megas = 1000;

        System.out.println("===== LINEA RAPIDA =====");
        mostrarPlanes(new LineaRapidaFactory(), megas);

        System.out.println("\n===== CLARO =====");
        mostrarPlanes(new ClaroFactory(), megas);

        System.out.println("\n===== MOVISTAR =====");
        mostrarPlanes(new MovistarFactory(), megas);
    }
}