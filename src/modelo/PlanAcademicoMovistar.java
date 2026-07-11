package modelo;

public class PlanAcademicoMovistar extends PlanDatos{

    public PlanAcademicoMovistar() {
        nombre = "Personal Movistar";
    }

    @Override
    public void setTasa() {
        tasa = 0.8f;
    }
}
