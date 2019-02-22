package com.company;

import java.io.*;
import java.sql.SQLOutput;

public class Main {
    public static class valueStatic{                                        // створення класу статичних змінних для контроля процесу
        public static int control_1 = -1;                                   // контроль процесу вводу 1-го параметра, римського алфавіту
        public static int control_2 = -1;                                   // контроль математичного знака
        public static int control_3;                                        // вибір математичної операції

        public static int number_1;
        public static int number_2;
    }

    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
               // public static int control = -1;
        String numberSystem;
      //  String string = bufferedReader.readLine();
        String number_1;
        System.out.println("По замовчуванню вибрана арабська система числення");
        System.out.print("Для вибору римської системи числення натисніть клавішу - 'R' або 'r' , та натисніть клавішу - Enter : ");


        numberSystem = bufferedReader.readLine();
                if (numberSystem.equals("r")) { numberSystem = "R";
                }

                             switch (numberSystem) {

                                case "R": {  System.out.println("Ви вибрали римську систему числення");
                                    System.out.println("1 - I. 2 - II. 3 - III. 4 - IV. 5 - V. 6 - VI. 7 - VII. 8 - VIII. 9 - IX. 10 - X");
                                    System.out.println("****************  УВАГА!!!   ВВОДИМО ТІЛЬКИ ВЕЛИКІ СИМВОЛИ!!!   **************** ");
                                    System.out.println("Введіть чило №1 : ");


                                    while (valueStatic.control_1 == -1) {                                          // check data of inputting, можна спробувати замінити методом
                                            String example = bufferedReader.readLine();
                                           // int a = Integer.parseInt(example);

                                          int a = math.translate(example);
                                                valueStatic.number_1 = a;



                                        if (a <= 10) {
                                            break;
                                        } else { System.out.println("Erorr!!!! Введіть правильний формат числа");}
                                               }


                                    valueStatic.control_1 = -1;

                                            System.out.println("Введіть математичну операцію: ");



                                    while (valueStatic.control_2 == -1) {
                                        String example = bufferedReader.readLine();
                                            Main.valueStatic.control_3 = math.translate_math(example);
                                        if ((example.equals("+")) || (example.equals("-")) || (example.equals("/")) || (example.equals("*"))) {
                                            break;
                                        } else { System.out.println("Erorr!!!! Введіть правильний формат числа");}

                                    }
                                    valueStatic.control_2 = -1;                                                 // скидання змінної


                                    while (valueStatic.control_1 == -1) {                                          // check data of inputting, можна спробувати замінити методом
                                        System.out.println("Введіть чило №2 : ");
                                        String example = bufferedReader.readLine();
                                        int b = math.translate(example);
                                        valueStatic.number_2 = b;

                                        if (b <= 10) {
                                            break;

                                        } else { System.out.println("Erorr!!!! Введіть правильний формат числа");}

                                    }

                                    if (Main.valueStatic.control_3 == 1) {
                                        System.out.println(" " + valueStatic.number_1 + " + " + valueStatic.number_2 + " = " + math.add(valueStatic.number_1, valueStatic.number_2));
                                    }

                                    if (Main.valueStatic.control_3 == 2) {
                                        System.out.println(" " + valueStatic.number_1 + " - " + valueStatic.number_2 + " = " + math.subtract(valueStatic.number_1, valueStatic.number_2));
                                    }

                                    if (Main.valueStatic.control_3 == 3) {
                                        System.out.println(" " + valueStatic.number_1 + " * " + valueStatic.number_2 + " = " + math.multiply(valueStatic.number_1, valueStatic.number_2));
                                    }

                                    if (Main.valueStatic.control_3 == 4) {
                                        System.out.println(" " + valueStatic.number_1 + " / " + valueStatic.number_2 + " = " + math.divide(valueStatic.number_1, valueStatic.number_2));
                                    }

                                    break;}

                                 default:  {  System.out.println("Ви вибрали арабську систему числення");
                                     System.out.println("Введіть чило №1 : ");

                                     String example_1 = bufferedReader.readLine();
                                     int a = Integer.parseInt(example_1);
                                     valueStatic.number_1 = a;


                                                System.out.println("Введіть математичну операцію: ");
                                                     while (valueStatic.control_2 == -1) {
                                                    String example_2 = bufferedReader.readLine();
                                                    Main.valueStatic.control_3 = math.translate_math(example_2);
                                                     if ((example_2.equals("+")) || (example_2.equals("-")) || (example_2.equals("/")) || (example_2.equals("*"))) {
                                                         break;
                                                    } else { System.out.println("Erorr!!!! Введіть правильний формат числа");}
                                                }


                                     System.out.println("Введіть чило №2 : ");
                                     String example_3 = bufferedReader.readLine();
                                     int b = Integer.parseInt(example_3);
                                     valueStatic.number_2 = b;



                                     if (Main.valueStatic.control_3 == 1) {
                                         System.out.println(" " + valueStatic.number_1 + " + " + valueStatic.number_2 + " = " + math.add(valueStatic.number_1, valueStatic.number_2));
                                     }

                                     if (Main.valueStatic.control_3 == 2) {
                                         System.out.println(" " + valueStatic.number_1 + " - " + valueStatic.number_2 + " = " + math.subtract(valueStatic.number_1, valueStatic.number_2));
                                     }

                                     if (Main.valueStatic.control_3 == 3) {
                                         System.out.println(" " + valueStatic.number_1 + " * " + valueStatic.number_2 + " = " + math.multiply(valueStatic.number_1, valueStatic.number_2));
                                     }

                                     if (Main.valueStatic.control_3 == 4) {
                                         System.out.println(" " + valueStatic.number_1 + " / " + valueStatic.number_2 + " = " + math.divide(valueStatic.number_1, valueStatic.number_2));
                                     }


                                 break;}
                }





        // write your code here
    }
}
