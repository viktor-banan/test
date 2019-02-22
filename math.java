package com.company;

public  class math {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }




    public static int translate(String str) {

        int a;
        while (true) {
            if (str.equals("I")) {
                a = 1;
                Main.valueStatic.control_1 = 1;
                break;
            }
            if (str.equals("II")) {
                a = 2;
                Main.valueStatic.control_1 = 1;
                break;
            }
            if (str.equals("III")) {
                a = 3;
                Main.valueStatic.control_1 = 1;
                break;
            }
            if (str.equals("IV")) {
                a = 4;
                Main.valueStatic.control_1 = 1;
                break;
            }
            if (str.equals("V")) {
                a = 5;
                Main.valueStatic.control_1 = 1;
                break;
            }
            if (str.equals("VI")) {
                a = 6;
                Main.valueStatic.control_1 = 1;
                break;
            }
            if (str.equals("VII")) {
                a = 7;
                Main.valueStatic.control_1 = 1;
                break;
            }
            if (str.equals("VIII")) {
                a = 8;
                Main.valueStatic.control_1 = 1;
                break;
            }
            if (str.equals("IX")) {
                a = 9;
                Main.valueStatic.control_1 = 1;
                break;
            }
            if (str.equals("X")) {
                a = 10;
                Main.valueStatic.control_1 = 1;
                break;
            } else {
                a = 100;
                Main.valueStatic.control_1 = -1;
                break;
            }
        }
        return a;
    }

    public static int translate_math(String str) {

        int a;
        while (true) {
            if (str.equals("+")) {
                a = 1;
                Main.valueStatic.control_2 = 1;
                break;
            }
            if (str.equals("-")) {
                a = 2;
                Main.valueStatic.control_2 = 1;
                break;
            }
            if (str.equals("*")) {
                a = 3;
                Main.valueStatic.control_2 = 1;
                break;
            }
            if (str.equals("/")) {
                a = 4;
                Main.valueStatic.control_2 = 1;
                break;
            }

        }
        return a;
    }
}