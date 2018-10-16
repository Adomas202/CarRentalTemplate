public class Automobilis {
    private float kaina;
    private int metai;
    private int galingumas;
    private String ekologiskumas;

    public Automobilis(float kaina, int metai, int galingumas, String ekologiskumas) {
        this.kaina = kaina;
        this.metai = metai;
        this.galingumas = galingumas;
        this.ekologiskumas = ekologiskumas;
    }

    public float getKaina() {
        return kaina;
    }

    public int getMetai() {
        return metai;
    }

    public int getGalingumas() {
        return galingumas;
    }

    public String getEkologiskumas() {
        return ekologiskumas;
    }

    public void setEkologiskumas(String ekologiskumas) {
        this.ekologiskumas = ekologiskumas;
    }
}
