package ru.mirea.humanoid;

public class Leg {
    String legOrientation; // записываем левая или правая нога

    public Leg(String legOrientation) {
        this.legOrientation = legOrientation;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "legOrientation='" + legOrientation + '\'' +
                '}';
    }
}
