package modelo;


public class ClaroFactory implements ProveedorFactory {

    @Override
    public PlanDatos crearPlanPersonal() {
        return new PlanPersonalClaro();
    }

    @Override
    public PlanDatos crearPlanNegocio() {
        return new PlanNegocioClaro();
    }

    @Override
    public PlanDatos crearPlanAcademico() {
        return new PlanAcademicoClaro();
    }
}