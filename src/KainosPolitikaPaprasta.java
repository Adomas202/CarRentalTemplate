public abstract class KainosPolitikaPaprasta extends NuomosUzsakymas {

    public abstract float ApskaiciuotiDraudimoKaina(float kaina, int metai, int galingumas);

    public float KainosPolitika(float kaina, int metai) {
        int mokesciai = 21;
        kaina = kaina * (mokesciai / 100);
        return kaina;
    }
}
