package modelo;

public class PlanPersonalLR extends PlanDatos {

    public PlanPersonalLR() {
        nombre = "Personal Linea Rapida";
    }

    @Override
    public void setTasa() {
        tasa = 0.5f;
    }
}