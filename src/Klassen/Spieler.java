package Klassen;

public class Spieler {

    private String name;
    private int punkte;

    public Spieler(String name) throws DelimException {
        if (name.contains(",")) {
            throw new DelimException("Der Spielername darf kein Komma beinhalten.");
        } else {
            this.name = name;
        }
    }

    public void setzePunkte(int punkte) {
        this.punkte = punkte;
    }

    public int erhaltePunkte() {
        return punkte;
    }

    public String erhalteName() {
        return name;
    }

    public String zuString() {
        // passende Formatierung für csv Speicherart in spielerdaten.txt
        return name + "," + punkte;
    }
}
