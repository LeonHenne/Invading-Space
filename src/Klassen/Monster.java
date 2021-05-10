package Klassen;

import java.util.Set;

public class Monster extends BeweglicheObjekte {
    private int punkte;
    private String name;

    public Monster(int xKoor, int yKoor, int punkte) {
        super(xKoor, yKoor);
        this.punkte = punkte;
    }

    public int getPunkte() {
        return this.punkte;
    }

    // Monster nach rechts, links, oben und unten bewegen.
    //  Altes Monster "entfernen"
    //  Neue Koordinaten berechnen
    //  "Neues" Monster zeichnen
    // todo: Ablauf erstellen
    public void bewegenRechts() {
        zeichneSchwarz();
        this.xKoor =  getXKoor() + BEWEGUNG;
        zeichneWeiss();
    }

    public void bewegenLinks() {
        zeichneSchwarz();
        this.xKoor = getXKoor() - BEWEGUNG;
        zeichneWeiss();
    }

    public void bewegenRunter() {
        zeichneSchwarz();
        this.yKoor = getYKoor() + BEWEGUNG;
        zeichneWeiss();
    }

    public void bewegenHoch() {
        zeichneSchwarz();
        this.yKoor = getYKoor() - BEWEGUNG;
        zeichneWeiss();
    }

    public void schiessen() {
        // Aufrufen der Klasse Schuss
    }

    // Macht kreiereMonster überhaupt Sinn? Ein Monster wird ja mit dem Konstruktor erstellt.
    //  Das müsste dann gleich beim hinzufügen in die Datenstruktur passieren.
    // Das Löschen macht dementsprechend eigentlich auch keinen Sinn.
    //  Das würde dann mit dem entfernen aus der Datenstruktur passieren.
}
