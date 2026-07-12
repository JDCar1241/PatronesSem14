package modelo;


public class MovistarFactory implements ProveedorFactory {

    @Override
    public PlanDatos crearPlanPersonal() {
        return new PlanPersonalMovistar();
    }

    @Override
    public PlanDatos crearPlanNegocio() {
        return new PlanNegocioMovistar();
    }

    @Override
    public PlanDatos crearPlanAcademico() {
        return new PlanAcademicoMovistar();
    }
}