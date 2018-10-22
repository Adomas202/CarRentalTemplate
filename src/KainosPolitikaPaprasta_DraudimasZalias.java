import Utils.Skaiciavimas;

public class KainosPolitikaPaprasta_DraudimasZalias extends KainosPolitikaPaprasta {

    @Override
    public float IkainuotiUzsakymoNuomosKaina(float kaina, int metai, int galingumas) {
        float uzsakymoKaina = ApskaiciuotiDraudimoKaina(kaina, metai, galingumas);
        uzsakymoKaina += Skaiciavimas.KainosPolitikaSudetingasSkaiciavimas(kaina, metai);
        uzsakymoKaina += ApskaiciuotiDraudimoKaina(kaina, metai, galingumas);
        return uzsakymoKaina;
    }

    @Override
    public float ApskaiciuotiDraudimoKaina(float kaina, int metai, int galingumas) {
        return Skaiciavimas.VariklioDraudimoKoeficientasZalias(kaina, galingumas);
    }
}
