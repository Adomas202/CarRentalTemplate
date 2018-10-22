package Utils;

public class Skaiciavimas {

    public static float KainosPolitikaSudetingasSkaiciavimas(float kaina, int metai) {
        if (metai > 2000) {
            kaina *= 0.1;
        } else if (metai < 1980) {
            kaina *= 0.5;
        } else if (metai > 2017) {
            kaina *= 0.8;
        }
        return kaina;
    }

    public static float KainosPolitikaPaprastasSkaiciavimas(float kaina, int metai) {
        int mokesciai = 21;
        kaina = kaina * (mokesciai / 100);
        return kaina;
    }

    public static float VariklioDraudimoKoeficientasZalias(float kaina, float galingumas) {
        if (galingumas < 100) {
            return kaina;
        } else {
            kaina = kaina + kaina * (galingumas / 100);
            return kaina;
        }
    }

    public static float VariklioDraudimoKoeficientasRaudonas(float kaina, float galingumas) {
        if (galingumas > 200)
            kaina = kaina * 2;
        return kaina;
    }
}
