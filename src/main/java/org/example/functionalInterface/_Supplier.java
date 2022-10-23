package org.example.functionalInterface;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnection());
        System.out.println(getDBConnectionUrlSupplier.get());

    }
    static String getDBConnection(){
        return "jbbc://localhost:5344567";
    }
    static Supplier<String>getDBConnectionUrlSupplier = () -> "jbbc://localhost:5344567";
}
