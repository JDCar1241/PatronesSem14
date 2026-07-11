package modelo;

public class PlanPersonalMovistar extends PlanDatos {

    public PlanPersonalMovistar() {
    nombre = "Personal Movistar";
}

    @Override
    public void setTasa() {
        tasa = 0.8f;
    }
}
