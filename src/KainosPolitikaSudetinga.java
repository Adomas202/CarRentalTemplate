public abstract class KainosPolitikaSudetinga extends NuomosUzsakymas {

    public abstract float ApskaiciuotiDraudimoKaina(float kaina, int metai, int galingumas);

    public float KainosPolitika(float kaina, int metai) {
        if (metai > 2000) {
            kaina *= 0.1;
        } else if (metai < 1980) {
            kaina *= 0.5;
        } else if (metai > 2017) {
            kaina *= 0.8;
        }
        return kaina;
    }
}