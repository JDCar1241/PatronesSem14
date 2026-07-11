package modelo;

public class PlanNegocioMovistar extends PlanDatos {

    public PlanNegocioMovistar() {
        nombre = "Personal Movistar";
    }

    @Override
    public void setTasa() {
        tasa = 0.8f;
    }
}
