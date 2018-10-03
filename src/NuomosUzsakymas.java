import java.util.ArrayList;
import java.util.List;

public abstract class NuomosUzsakymas {
    private List<Automobilis> automobiliai;

    public NuomosUzsakymas() {
        this.automobiliai = new ArrayList<Automobilis>();
    }

    public void PridetiAutomobili(Automobilis automobilis) {
        this.automobiliai.add(automobilis);
    }

    public float skaiciuotiKaina() {
        float uzsakymoKaina = 0;
        for (Automobilis automobilis: automobiliai) {
            uzsakymoKaina += IkainuotiUzsakymoNuomosKaina(automobilis.getKaina(), automobilis.getMetai());
            uzsakymoKaina += PridetiDraudimoKaina(automobilis.getKaina(), automobilis.getMetai(), automobilis.getGalingumas());
        }
        System.out.println("Jūsų užsakymo kaina yra: "  + uzsakymoKaina);
        return uzsakymoKaina;
    }

    public abstract float PridetiDraudimoKaina(float kaina, int metai, int galingumas);
    public abstract float IkainuotiUzsakymoNuomosKaina(float kaina, int metai);
}
