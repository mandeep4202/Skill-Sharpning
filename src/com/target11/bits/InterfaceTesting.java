package com.target11.bits;

interface First {
    public static final String  first = "first";
    void display();
}

interface Second {
    public static final String first = "second";
    void display();
}

class Impl implements First, Second {

    @Override
    public void display() {
        System.out.println(" Display of InterfaceTesting ");
    }
}

public class InterfaceTesting {
    public static void main(String[] args) {
        Second impl = new Impl();
        System.out.println(" impl " + First.first);
        impl.display();
    }

}

