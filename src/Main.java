public class Main {

    public static void main(String[] args) {
        Automobilis bmw320i = new Automobilis(3000, 1999, 68);
        Automobilis mercedes = new Automobilis(40000, 2017, 340);

        NuomosUzsakymas uzsakymas = new KainosPolitikaPaprasta();

        uzsakymas.PridetiAutomobili(bmw320i);
        uzsakymas.PridetiAutomobili(mercedes);

        uzsakymas.skaiciuotiKaina();

        uzsakymas = new KainosPolitikaSudetinga();

        uzsakymas.PridetiAutomobili(bmw320i);
        uzsakymas.PridetiAutomobili(mercedes);

        uzsakymas.skaiciuotiKaina();

    }
}
