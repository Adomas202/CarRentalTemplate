public class Main {

    public static void main(String[] args) {
        Automobilis bmw320i = new Automobilis(3000, 1999, 68, "C");
        Automobilis mercedes = new Automobilis(40000, 2017, 340, "A");

        NuomosUzsakymas uzsakymas = new KainosPolitikaPaprasta_DraudimasZalias();

        uzsakymas.PridetiAutomobili(bmw320i);
        uzsakymas.PridetiAutomobili(mercedes);

        uzsakymas.skaiciuotiKaina();

        uzsakymas = new KainosPolitikaPaprasta_DraudimasRaudonas();

        uzsakymas.PridetiAutomobili(bmw320i);
        uzsakymas.PridetiAutomobili(mercedes);

        uzsakymas.skaiciuotiKaina();

        uzsakymas = new KainosPolitikaSudetinga_DraudimasZalias();

        uzsakymas.PridetiAutomobili(bmw320i);
        uzsakymas.PridetiAutomobili(mercedes);

        uzsakymas.skaiciuotiKaina();

        uzsakymas = new KainosPolitikaSudetinga_DraudimasRaudonas();

        uzsakymas.PridetiAutomobili(bmw320i);
        uzsakymas.PridetiAutomobili(mercedes);

        uzsakymas.skaiciuotiKaina();

    }
}
