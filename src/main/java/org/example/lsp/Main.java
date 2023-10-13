package org.example.lsp;

public class Main {
    public static void main(String[] args) {
        Alive alive = new Human();
        alive.eats();

        Alive alive1 = new Fish();
        alive1.eats();

        //TODO Subclasses must be designed so that they can be used in place of superclasses
    }
}
