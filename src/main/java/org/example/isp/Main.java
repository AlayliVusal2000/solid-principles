package org.example.isp;

public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.runs();
        fish.swims();

        Flies flies = new Swallow();
        flies.flies();

        //TODO
        /*
         According to this principle, a interface should be as specialized as possible,
         so that the classes that use it can only use properties that are their properties.

         */
    }
}
