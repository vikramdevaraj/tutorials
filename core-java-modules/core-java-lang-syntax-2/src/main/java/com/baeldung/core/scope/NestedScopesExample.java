package com.baeldung.core.scope;

public class NestedScopesExample {

    String title = "Baeldung";

    public void printTitle() {
        System.out.println(title);
        String title = "John Dosa";
        System.out.println(title);
    }
}
