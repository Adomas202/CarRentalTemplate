public abstract class KainosPolitikaPaprasta extends NuomosUzsakymas {

    public float KainosPolitika(float kaina, int metai) {
        int mokesciai = 21;
        kaina = kaina * (mokesciai / 100);
        return kaina;
    }
}
