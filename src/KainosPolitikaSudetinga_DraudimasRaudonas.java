public class KainosPolitikaSudetinga_DraudimasRaudonas extends KainosPolitikaSudetinga{

    public float VariklioGalingumoIrDraudimoKainosKoeficientas(float kaina, float galingumas) {
        kaina = kaina + kaina * (galingumas / 100);
        return kaina;
    }

    @Override
    public float IkainuotiUzsakymoNuomosKaina(float kaina, int metai, int galingumas) {
        float uzsakymoKaina = ApskaiciuotiDraudimoKaina(kaina, metai, galingumas);
        uzsakymoKaina += KainosPolitika(kaina, metai);
        uzsakymoKaina += ApskaiciuotiDraudimoKaina(kaina, metai, galingumas);
        return uzsakymoKaina;
    }

    @Override
    public float ApskaiciuotiDraudimoKaina(float kaina, int metai, int galingumas) {
        return VariklioGalingumoIrDraudimoKainosKoeficientas(kaina, galingumas);
    }
}
