package com.bottini;

public class Foo {
    int x; 
    public Foo(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Foo " + Integer.toString(x);
    }
}
