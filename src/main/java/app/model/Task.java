package app.model;

public class Task {

    // Beschreibung der Aufgabe
    private String aufgabe;

    // Status: erledigt oder nicht
    private boolean isDone;

    // Konstruktor
    public Task(String aufgabe) {
        this.aufgabe = aufgabe;
        this.isDone = false;
    }

    // Getter und Setter

    public String getAufgabe() {
        return aufgabe;
    }

    public void setAufgabe(String aufgabe) {
        this.aufgabe = aufgabe;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    // Methode zum Umschalten
    public void toggleDone() {
        isDone = !isDone;
    }

    // Darstellung im ListView
    @Override
    public String toString() {
        return (isDone ? "[✓] " : "[ ] ") + aufgabe;
    }
}