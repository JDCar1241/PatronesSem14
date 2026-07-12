package modelo;


public interface ProveedorFactory {

    PlanDatos crearPlanPersonal();

    PlanDatos crearPlanNegocio();

    PlanDatos crearPlanAcademico();
}