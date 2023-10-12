package org.example.isp;

public interface Animal {

    void flies();

    void runs();

    void swims();
    /*
    In this way, we violate solid principles.
    We have to write it separately according to the methods of this interface.
    Because a bird cannot swim, a fish cannot run, etc.
     */

}
