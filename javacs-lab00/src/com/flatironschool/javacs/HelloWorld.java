package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
        String ver = System.getProperty("java.specification.version");
        System.out.println(ver);
        Double dver = Double.parseDouble(ver);
        return dver;
    }

    public static void main(String[] args) {
        System.out.println("The version is " + getVersion());
    }
};
