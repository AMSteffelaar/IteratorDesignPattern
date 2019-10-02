package model;

public interface Iterator {
    // Zijn er nog meer elementen?
    boolean hasNext();

    // Geef het volgende element terug
    Object next();
}
