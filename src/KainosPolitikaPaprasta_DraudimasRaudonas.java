import Utils.Skaiciavimas;

public class KainosPolitikaPaprasta_DraudimasRaudonas extends KainosPolitikaPaprasta {

    @Override
    public float IkainuotiUzsakymoNuomosKaina(float kaina, int metai, int galingumas) {
        float uzsakymoKaina = ApskaiciuotiDraudimoKaina(kaina, metai, galingumas);
        uzsakymoKaina += Skaiciavimas.KainosPolitikaPaprastasSkaiciavimas(kaina, metai);
        uzsakymoKaina += ApskaiciuotiDraudimoKaina(kaina, metai, galingumas);
        return uzsakymoKaina;
    }

    @Override
    public float ApskaiciuotiDraudimoKaina(float kaina, int metai, int galingumas) {
        return Skaiciavimas.VariklioDraudimoKoeficientasRaudonas(kaina, galingumas);
    }
}
