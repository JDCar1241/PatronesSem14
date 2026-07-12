package modelo;


public class LineaRapidaFactory implements ProveedorFactory {

    @Override
    public PlanDatos crearPlanPersonal() {
        return new PlanPersonalLR();
    }

    @Override
    public PlanDatos crearPlanNegocio() {
        return new PlanNegocioLR();
    }

    @Override
    public PlanDatos crearPlanAcademico() {
        return new PlanAcademicoLR();
    }
}