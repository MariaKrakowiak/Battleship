package battleship;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


import static battleship.Player1.*;
import static battleship.Player1.arr;
import static battleship.Main.*;

public class Player2 {

    public static String[][] arr1;

    static String s5;
    static String s6;
    static String s7;
    static String s8;
    static String s9;
    static String s10;
    static String s11;
    static String s12;
    static String s13;
    static String s14;
    static String s15;
    static String s16;
    static String s17;
    static String s18;
    static String s19;
    static String s20;
    static String s21;

 /*   static ArrayList Aircraft2 = new ArrayList();
    static ArrayList Cruiser2 = new ArrayList();
    static ArrayList Destroyer2 = new ArrayList();
    static ArrayList Submarine2 = new ArrayList();
    static ArrayList Battleship2 = new ArrayList();
    static ArrayList All2 = new ArrayList();*/


    public static void createAircraft1(String[][] arr1) throws ArrayIndexOutOfBoundsException {

        Scanner sca = new Scanner(System.in);
        String air = sca.nextLine();
        char[] chars = air.toCharArray();
        String s = Arrays.toString(chars);
/*        System.out.println(chars.length);
        System.out.println(s);*/
/*        char c = s.charAt(1);
        char d = s.charAt(4);
        char a = s.charAt(10);
        char b = s.charAt(13);

        String first = s.substring(1, 2);
        String second = s.substring(4, 5);
        String third = s.substring(10, 11);
        String fourth = s.substring(13, 14);*/
        /*String five = s.substring(13,15);*/

        char c = 0;
        char d = 0;
        char a = 0;
        char b = 0;

        String first = null;
        String second = null;
        String third = null;
        String fourth = null;
        int czwarty = 0;
        int drugi = 0;



   /*     System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);


        System.out.println("==================");*/


        String reg1 = "[a-jA-J]";
        String reg2 = "([1-9]|10)";

/*        System.out.println(first.matches(reg1));
        System.out.println(third.matches(reg1));*/

      /*  int czwarty = Integer.parseInt(fourth);
        int drugi = Integer.parseInt(second);*/
        int trzeci = 0;
        int pierwszy = 0;

        String s1 = null;
        String s2 = null;

        String s3 = null;
        String s4 = null;

/*        System.out.println(pierwszy);
        System.out.println(drugi);
        System.out.println(trzeci);
        System.out.println(czwarty);
        System.out.println("================");
        System.out.println(czwarty - drugi);*/

   /*     System.out.println("Takie tam");
        System.out.println(second.equalsIgnoreCase(fourth));
        System.out.println((trzeci - pierwszy) == 4);
        System.out.println(pierwszy);
        System.out.println(trzeci);
        System.out.println(trzeci - pierwszy);*/
/*        System.out.println(second);
        System.out.println(fourth);*/

        //Przypadek typu a1 a5 oraz a1 e1
        if (s.length() == 15 && s.charAt(5) == ',' && s.charAt(11) == ',') {
            c = s.charAt(1);
            d = s.charAt(4);
            a = s.charAt(10);
            b = s.charAt(13);
            first = s.substring(1, 2);
            third = s.substring(10, 11);
            fourth = s.substring(13, 14);
            second = s.substring(4, 5);
            czwarty = Integer.parseInt(fourth);
            drugi = Integer.parseInt(second);
            trzeci = Character.getNumericValue(a) - 9;
            pierwszy = Character.getNumericValue(c) - 9;

        }
        //Przypadek typu a6 a10
        if (s.length() == 18 && s.charAt(5) == ',' && s.charAt(14) == ',' && s.charAt(7) != '0') {
            c = s.charAt(1);
            d = s.charAt(4);
            a = s.charAt(10);
            //Problem
            b = s.charAt(13);
            /* char f = s.charAt(16);*/
            first = s.substring(1, 2);
            fourth = s.substring(13, 17);
            third = s.substring(10, 11);
            second = s.substring(4, 5);
            s1 = fourth.replace(",", "");
            s2 = s1.replace(" ", "");
            czwarty = Integer.parseInt(s2);
            drugi = Integer.parseInt(second);
            trzeci = Character.getNumericValue(a) - 9;
            pierwszy = Character.getNumericValue(c) - 9;
        }


        //Pezypadek typu a10 e10
        if (s.length() == 21 && s.charAt(5) == ',' && s.charAt(8) == ',' && s.charAt(11) == ',' && s.charAt(17) == ',') {
            c = s.charAt(1);
            //Problem
            d = s.charAt(4);
            a = s.charAt(13);
            //Problem
            b = s.charAt(16);
            first = s.substring(1, 2);
            second = s.substring(4, 8);
            third = s.substring(13, 14);
            s1 = second.replace(",", "");
            s2 = s1.replace(" ", "");
            fourth = s.substring(16, 20);
            s3 = fourth.replace(",", "");
            s4 = s3.replace(" ", "");
            czwarty = Integer.parseInt(s4);
            drugi = Integer.parseInt(s2);
            trzeci = Character.getNumericValue(a) - 9;
            pierwszy = Character.getNumericValue(c) - 9;

        }

        //Przypadek typu a10 a6
        if (s.length() == 18 && s.charAt(2) == ',' && s.charAt(5) == ',' && s.charAt(8) == ',' && s.charAt(11) == ',' && s.charAt(14) == ',' && s.charAt(7) == '0') {
            c = s.charAt(1);
            d = s.charAt(4);
            a = s.charAt(13);
            b = s.charAt(16);
            first = s.substring(1, 2);
            second = s.substring(4, 8);
            third = s.substring(13, 14);
            fourth = s.substring(16, 17);
            s1 = second.replace(",", "");
            s2 = s1.replace(" ", "");
            czwarty = Integer.parseInt(fourth);
            drugi = Integer.parseInt(s2);
            trzeci = Character.getNumericValue(a) - 9;
            pierwszy = Character.getNumericValue(c) - 9;

        }


        boolean is = false;
        if (czwarty > drugi) {
            while (!is) {
                //Przypadek dla a1 a5
                if (first.matches(reg1) && third.matches(reg1) &&
                        second.matches(reg2)) {
                    if (fourth.matches(reg2)) {
                        if (first.equalsIgnoreCase(third) && !second.equalsIgnoreCase(fourth)) {

                            if ((czwarty - drugi) == 4 && s.length() == 15) {
                                s5 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1] = "O";
                                s6 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(second)] = "O";
                                s7 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 1] = "O";
                                s8 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 2] = "O";
                                s9 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 3] = "O";

                                /*Aircraft2.addAll(List.of(s5, s6, s7, s8, s9));*/
                                printSea(arr1);
                                is = true;
                                System.out.println("Enter the coordinates of the Battleship (4 cells):");
                                createBattleship1(sea1);


                            }

                            if ((czwarty - drugi) != 4) {
                                System.out.println("Error! Wrong length of the Aircraft! Try again:");
                                break;

                            }
                        }

                        if (!second.equalsIgnoreCase(fourth)) {
                            System.out.println("Error! Wrong ship location! Try again:");

                            break;
                        }
                        //tu się zamyka poniżej if z regexami
                    }
                    //Przypadek typu a6 a10

                    if (s2 != null) {
                        if (first.equalsIgnoreCase(third)) {
                            if ((czwarty - drugi) == 4 && s.length() == 18) {
                                s5 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1] = "O";
                                s6 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(second)] = "O";
                                s7 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 1] = "O";
                                s8 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 2] = "O";
                                s9 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 3] = "O";
                               /* Aircraft2.addAll(List.of(s5, s6, s7, s8, s9));*/

                                printSea(arr1);
                                is = true;
                                System.out.println("Enter the coordinates of the Battleship (4 cells):");
                                createBattleship1(sea1);


                            }

                            if ((czwarty - drugi) != 4) {
                                System.out.println("Error! Wrong length of the Aircraft! Try again:");
                                break;

                            }
                        }

                        if (!second.equalsIgnoreCase(s2)) {
                            System.out.println("Error! Wrong ship location! Try again:");

                            break;
                        }

                    }
                }


                if (second.equalsIgnoreCase(fourth)) {


                    //Przypadek typu a1 e1

                    if ((trzeci - pierwszy) == 4 && s.length() == 15) {
                        s5 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1] = "O";
                        s6 = arr1[Character.getNumericValue(c) - 9][Integer.parseInt(second) - 1] = "O";
                        s7 = arr1[Character.getNumericValue(c) - 8][Integer.parseInt(second) - 1] = "O";
                        s8 = arr1[Character.getNumericValue(c) - 7][Integer.parseInt(second) - 1] = "O";
                        s9 = arr1[Character.getNumericValue(c) - 6][Integer.parseInt(second) - 1] = "O";
                       /* Aircraft2.addAll(List.of(s5, s6, s7, s8, s9));*/
                        printSea(arr1);
                        is = true;

                        System.out.println("Enter the coordinates of the Battleship (4 cells):");
                        createBattleship1(sea1);

                    }


                    //Przypadek typu a10 e10, to działało i nie było elementu z s.length()
                    if ((trzeci - pierwszy) == 4 && s.length() == 21) {
                        s5 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(s2) - 1] = "O";
                        s6 = arr1[Character.getNumericValue(c) - 9][Integer.parseInt(s2) - 1] = "O";
                        s7 = arr1[Character.getNumericValue(c) - 8][Integer.parseInt(s2) - 1] = "O";
                        s8 = arr1[Character.getNumericValue(c) - 7][Integer.parseInt(s2) - 1] = "O";
                        s9 = arr1[Character.getNumericValue(c) - 6][Integer.parseInt(s2) - 1] = "O";
                        /*Aircraft2.addAll(List.of(s5, s6, s7, s8, s9));*/
                        printSea(arr1);
                        is = true;

                        System.out.println("Enter the coordinates of the Battleship (4 cells):");
                        createBattleship1(sea1);

                    }

                    if ((trzeci - pierwszy) != 4) {
                        System.out.println("Error! Wrong length of the Aircraft! Try again:");
                        break;

                    }
                }
                if (!first.equalsIgnoreCase(third) && !is) {
                    System.out.println("Error! Wrong ship location! Try again:");

                    break;
                }
            }
        } else {
            while (!is) {
                //Przypadek dla a5 a1
                if (first.matches(reg1) && third.matches(reg1) &&
                        second.matches(reg2)) {
                    if (fourth.matches(reg2)) {
                        if (first.equalsIgnoreCase(third) && !second.equalsIgnoreCase(fourth)) {

                            if ((drugi - czwarty) == 4 && s.length() == 15) {
                                s5 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) - 1] = "O";
                                s6 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(fourth)] = "O";
                                s7 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 1] = "O";
                                s8 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 2] = "O";
                                s9 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 3] = "O";
                                /*Aircraft2.addAll(List.of(s5, s6, s7, s8, s9));*/

                                printSea1(arr1);
                                is = true;
                                System.out.println("Enter the coordinates of the Battleship (4 cells):");
                                createBattleship1(sea1);


                            }

                            if ((drugi - czwarty) != 4) {
                                System.out.println("Error! Wrong length of the Aircraft! Try again:");
                                break;

                            }
                        }

                        if (!second.equalsIgnoreCase(fourth)) {
                            System.out.println("Error! Wrong ship location! Try again:");

                            break;
                        }
                    }
                }
                //Przypadek typu a10 a6
                if (first.matches(reg1) && third.matches(reg1) &&
                        fourth.matches(reg2)) {
                    if (s2 != null) {


                        if (first.equalsIgnoreCase(third) && !second.equalsIgnoreCase(fourth)) {
                            if ((drugi - czwarty) == 4 && s.length() == 18 && s.charAt(7) == '0') {
                                s5 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) - 1] = "O";
                                s6 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(fourth)] = "O";
                                s7 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 1] = "O";
                                s8 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 2] = "O";
                                s9 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 3] = "O";
                               /* Aircraft2.addAll(List.of(s5, s6, s7, s8, s9));*/

                                printSea1(arr1);
                                is = true;
                                System.out.println("Enter the coordinates of the Battleship (4 cells):");
                                createBattleship1(sea1);


                            }

                            if ((drugi - czwarty) != 4) {
                                System.out.println("Error! Wrong length of the Aircraft! Try again:");
                                break;

                            }
                        }

                        if (!second.equalsIgnoreCase(s2)) {
                            System.out.println("Error! Wrong ship location! Try again:");

                            break;
                        }

                    }
                }


                if (second.equalsIgnoreCase(fourth)) {


                    //Przypadek typu a1 e1

                    if ((trzeci - pierwszy) == 4 && s.length() == 15) {
                        s5 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) - 1] = "O";
                        s6 = arr1[Character.getNumericValue(c) - 9][Integer.parseInt(fourth) - 1] = "O";
                        s7 = arr1[Character.getNumericValue(c) - 8][Integer.parseInt(fourth) - 1] = "O";
                        s8 = arr1[Character.getNumericValue(c) - 7][Integer.parseInt(fourth) - 1] = "O";
                        s9 = arr1[Character.getNumericValue(c) - 6][Integer.parseInt(fourth) - 1] = "O";
                        /*Aircraft2.addAll(List.of(s5, s6, s7, s8, s9));*/
                        printSea1(arr1);
                        is = true;

                        System.out.println("Enter the coordinates of the Battleship (4 cells):");
                        createBattleship1(sea1);

                    }


                    //Przypadek typu a10 e10, to działało i nie było elementu z s.length()
                    if ((trzeci - pierwszy) == 4 && s.length() == 21) {
                        s5 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(s4) - 1] = "O";
                        s6 = arr1[Character.getNumericValue(c) - 9][Integer.parseInt(s4) - 1] = "O";
                        s7 = arr1[Character.getNumericValue(c) - 8][Integer.parseInt(s4) - 1] = "O";
                        s8 = arr1[Character.getNumericValue(c) - 7][Integer.parseInt(s4) - 1] = "O";
                        s9 = arr1[Character.getNumericValue(c) - 6][Integer.parseInt(s4) - 1] = "O";
                       /* Aircraft2.addAll(List.of(s5, s6, s7, s8, s9));*/
                        printSea1(arr1);
                        is = true;

                        System.out.println("Enter the coordinates of the Battleship (4 cells):");
                        createBattleship1(sea1);

                    }

                    if ((trzeci - pierwszy) != 4) {
                        System.out.println("Error! Wrong length of the Aircraft! Try again:");
                        break;

                    }
                }
                if (!first.equalsIgnoreCase(third) && !is) {
                    System.out.println("Error! Wrong ship location! Try again:");

                    break;
                }
            }
        }


        createAircraft1(arr1);


    }


    private static void createBattleship1(String[][] arr1) throws ArrayIndexOutOfBoundsException {
        Scanner sca = new Scanner(System.in);
        String air = sca.nextLine();
        char[] chars = air.toCharArray();
        String s = Arrays.toString(chars);

        char c = 0;
        char d = 0;
        char a = 0;
        char b = 0;

        String first = null;
        String second = null;
        String third = null;
        String fourth = null;
        int czwarty = 0;
        int drugi = 0;

        String s2 = null;
        String s1 = null;

        String s3 = null;
        String s4 = null;


        String reg1 = "[a-jA-J]";
        String reg2 = "([1-9]|10)";


        int trzeci = 0;
        int pierwszy = 0;

//Przypadek typu a1 a5 oraz a1 e1
        if (s.length() == 15 && s.charAt(5) == ',' && s.charAt(11) == ',') {
            c = s.charAt(1);
            d = s.charAt(4);
            a = s.charAt(10);
            b = s.charAt(13);
            first = s.substring(1, 2);
            third = s.substring(10, 11);
            fourth = s.substring(13, 14);
            second = s.substring(4, 5);
            czwarty = Integer.parseInt(fourth);
            drugi = Integer.parseInt(second);
            trzeci = Character.getNumericValue(a) - 9;
            pierwszy = Character.getNumericValue(c) - 9;
        }
        //Przypadek typu a6 a10
        if (s.length() == 18 && s.charAt(5) == ',' && s.charAt(14) == ',' && s.charAt(7) != '0') {
            c = s.charAt(1);
            d = s.charAt(4);
            a = s.charAt(10);
            //Problem
            b = s.charAt(13);
            first = s.substring(1, 2);
            fourth = s.substring(13, 17);
            third = s.substring(10, 11);
            second = s.substring(4, 5);
            s1 = fourth.replace(",", "");
            s2 = s1.replace(" ", "");
            czwarty = Integer.parseInt(s2);
            drugi = Integer.parseInt(second);

            trzeci = Character.getNumericValue(a) - 9;
            pierwszy = Character.getNumericValue(c) - 9;
        }
        //Pezypadek typu a10 e10
        if (s.length() == 21 && s.charAt(5) == ',' && s.charAt(8) == ',' && s.charAt(17) == ',' && s.charAt(11) == ',') {
            c = s.charAt(1);
            //Problem
            d = s.charAt(4);
            a = s.charAt(13);
            //Problem
            b = s.charAt(16);
            first = s.substring(1, 2);
            second = s.substring(4, 8);
            third = s.substring(13, 14);
            s1 = second.replace(",", "");
            s2 = s1.replace(" ", "");
            fourth = s.substring(16, 20);
            s3 = fourth.replace(",", "");
            s4 = s3.replace(" ", "");
            czwarty = Integer.parseInt(s4);
            drugi = Integer.parseInt(s2);

            trzeci = Character.getNumericValue(a) - 9;
            pierwszy = Character.getNumericValue(c) - 9;

        }

        if (s.length() == 18 && s.charAt(2) == ',' && s.charAt(5) == ',' && s.charAt(8) == ',' && s.charAt(11) == ',' && s.charAt(14) == ',' && s.charAt(7) == '0') {
            c = s.charAt(1);
            d = s.charAt(4);
            a = s.charAt(13);
            b = s.charAt(16);
            first = s.substring(1, 2);
            second = s.substring(4, 8);
            third = s.substring(13, 14);
            fourth = s.substring(16, 17);
            s1 = second.replace(",", "");
            s2 = s1.replace(" ", "");
            czwarty = Integer.parseInt(fourth);
            drugi = Integer.parseInt(s2);
            trzeci = Character.getNumericValue(a) - 9;
            pierwszy = Character.getNumericValue(c) - 9;

        }


/*        System.out.println(pierwszy);
        System.out.println(drugi);
        System.out.println(trzeci);
        System.out.println(czwarty);*/


        boolean is = false;
        if (czwarty > drugi) {
            while (!is) {
                /*  assert first != null;*/
                //Case a1 a5
                if (first.matches(reg1) && third.matches(reg1) &&
                        second.matches(reg2)) {
                    if (fourth.matches(reg2)) {
                        if (first.equalsIgnoreCase(third) && second.equalsIgnoreCase(fourth)) {
                            if ((czwarty - drugi) == 3 && s.length() == 15) {
                                s10 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1] = "O";
                                s11 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(second)] = "O";
                                s12 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 1] = "O";
                                s13 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 2] = "O";
                                /*      arr1[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 3] = "O";*/

                               /* Battleship2.addAll(List.of(s10, s11, s12, s13));*/
                                printSea1(arr1);
                                is = true;
                                System.out.println("Enter the coordinates of the Submarine (3 cells):");
                                createSubmarine1(sea1);


                            }
                            if ((czwarty - drugi) != 3) {


                                System.out.println("Error! Wrong length of the Battleship! Try again:");
                                break;

                            }
                        }
                        //testujemy
                        if (first.equalsIgnoreCase(third) && !second.equalsIgnoreCase(fourth)) {
                            if ((czwarty - drugi) == 3 && s.length() == 15) {
                                s10 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1] = "O";
                                s11 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(second)] = "O";
                                s12 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 1] = "O";
                                s13 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 2] = "O";
                                /*       arr1[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 3] = "O";*/

                               /* Battleship2.addAll(List.of(s10, s11, s12, s13));*/
                                printSea1(arr1);
                                is = true;
                                System.out.println("Enter the coordinates of the Submarine (3 cells):");
                                createSubmarine1(sea1);

                            }
                            if ((czwarty - drugi) != 3) {


                                System.out.println("Error! Wrong length of the Battleship! Try again:");
                                break;

                            }
                        }
                        //koniec testu
                        if (!second.equalsIgnoreCase(fourth)) {
                            System.out.println("Error! Wrong ship location! Try again:");

                            break;
                        }
                    }
                    //Case a6 a10

                    if (s2 != null) {
                        if (first.equalsIgnoreCase(third)) {
                            if ((czwarty - drugi) == 3 && s.length() == 18) {
                                s10 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1] = "O";
                                s11 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(second)] = "O";
                                s12 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 1] = "O";
                                s13 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 2] = "O";
                                /*      arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 3] = "O";*/
                              /*  Battleship2.addAll(List.of(s10, s11, s12, s13));*/

                                printSea1(arr1);
                                is = true;
                                System.out.println("Enter the coordinates of the Submarine (3 cells):");
                                createSubmarine1(sea1);


                            }
                            if ((czwarty - drugi) != 3) {


                                System.out.println("Error! Wrong length of the Battleship! Try again:");
                                break;

                            }
                        }
                        if (!second.equalsIgnoreCase(s2)) {
                            System.out.println("Error! Wrong ship location! Try again:");

                            break;
                        }
                    }
                    //Test


                    //koniec testu

                }
//Przypadek typu a1 e1
                if (second.equalsIgnoreCase(fourth)) {
                    if ((trzeci - pierwszy) == 3 && s.length() == 15) {
                        s10 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1] = "O";
                        s11 = arr1[Character.getNumericValue(c) - 9][Integer.parseInt(second) - 1] = "O";
                        s12 = arr1[Character.getNumericValue(c) - 8][Integer.parseInt(second) - 1] = "O";
                        s13 = arr1[Character.getNumericValue(c) - 7][Integer.parseInt(second) - 1] = "O";
                        /*             arr[Character.getNumericValue(c) - 6][Integer.parseInt(second) - 1] = "O";*/
                        /*Battleship2.addAll(List.of(s10, s11, s12, s13));*/
                        printSea1(arr1);
                        is = true;
                        System.out.println("Enter the coordinates of the Submarine (3 cells):");
                        createSubmarine1(sea1);

                    }
                    //Przypadek a10 e10

                    if ((trzeci - pierwszy) == 3 && s.length() == 21) {
                        s10 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(s2) - 1] = "O";
                        s11 = arr1[Character.getNumericValue(c) - 9][Integer.parseInt(s2) - 1] = "O";
                        s12 = arr1[Character.getNumericValue(c) - 8][Integer.parseInt(s2) - 1] = "O";
                        s13 = arr1[Character.getNumericValue(c) - 7][Integer.parseInt(s2) - 1] = "O";
                        /*             arr[Character.getNumericValue(c) - 6][Integer.parseInt(second) - 1] = "O";*/
                        /*Battleship2.addAll(List.of(s10, s11, s12, s13));*/
                        printSea1(arr1);
                        is = true;
                        System.out.println("Enter the coordinates of the Submarine (3 cells):");
                        createSubmarine1(sea1);

                    }
                    if ((trzeci - pierwszy) != 3) {
                        System.out.println("Error! Wrong length of the Battleship! Try again:");
                        break;

                    }
                }
                if (!first.equalsIgnoreCase(third) && !is) {
                    System.out.println("Error! Wrong ship location! Try again:");

                    break;
                }
            }
        } else {
            while (!is) {
                //Przypadek dla a5 a1
                if (first.matches(reg1) && third.matches(reg1) &&
                        second.matches(reg2)) {
                    if (fourth.matches(reg2)) {
                        if (first.equalsIgnoreCase(third) && !second.equalsIgnoreCase(fourth)) {

                            if ((drugi - czwarty) == 3 && s.length() == 15) {
                                s10 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) - 1] = "O";
                                s11 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(fourth)] = "O";
                                s12 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 1] = "O";
                                s13 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 2] = "O";
                                /*arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 3] = "O";*/
                                /*Battleship2.addAll(List.of(s10, s11, s12, s13));*/

                                printSea1(arr1);
                                is = true;
                                System.out.println("Enter the coordinates of the Submarine (3 cells):");
                                createSubmarine1(sea1);


                            }

                            if ((drugi - czwarty) != 3) {
                                System.out.println("Error! Wrong length of the Battleship! Try again:");
                                break;

                            }
                        }

                        if (!second.equalsIgnoreCase(fourth)) {
                            System.out.println("Error! Wrong ship location! Try again:");

                            break;
                        }
                    }
                }
                //Przypadek typu a10 a6
                if (first.matches(reg1) && third.matches(reg1) &&
                        fourth.matches(reg2)) {
                    if (s2 != null) {


                        if (first.equalsIgnoreCase(third) && !second.equalsIgnoreCase(fourth)) {
                            if ((drugi - czwarty) == 3 && s.length() == 18 && s.charAt(7) == '0') {
                                s10 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) - 1] = "O";
                                s11 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(fourth)] = "O";
                                s12 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 1] = "O";
                                s13 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 2] = "O";
                                /*arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 3] = "O";*/

                                /*Battleship2.addAll(List.of(s10, s11, s12, s13));*/
                                printSea1(arr1);
                                is = true;
                                System.out.println("Enter the coordinates of the Submarine (3 cells):");
                                createSubmarine1(sea1);


                            }

                            if ((drugi - czwarty) != 3) {
                                System.out.println("Error! Wrong length of the Battleship! Try again:");
                                break;

                            }
                        }

                        if (!second.equalsIgnoreCase(s2)) {
                            System.out.println("Error! Wrong ship location! Try again:");

                            break;
                        }

                    }
                }


                if (second.equalsIgnoreCase(fourth)) {


                    //Przypadek typu a1 e1

                    if ((trzeci - pierwszy) == 3 && s.length() == 15) {
                        s10 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) - 1] = "O";
                        s11 = arr1[Character.getNumericValue(c) - 9][Integer.parseInt(fourth) - 1] = "O";
                        s12 = arr1[Character.getNumericValue(c) - 8][Integer.parseInt(fourth) - 1] = "O";
                        s13 = arr1[Character.getNumericValue(c) - 7][Integer.parseInt(fourth) - 1] = "O";
                        /* arr[Character.getNumericValue(c) - 6][Integer.parseInt(fourth) - 1] = "O";*/
                       /* Battleship2.addAll(List.of(s10, s11, s12, s13));*/
                        printSea1(arr1);
                        is = true;

                        System.out.println("Enter the coordinates of the Submarine (3 cells):");
                        createSubmarine1(sea1);

                    }


                    //Przypadek typu a10 e10, to działało i nie było elementu z s.length()
                    if ((trzeci - pierwszy) == 3 && s.length() == 21) {
                        s10 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(s4) - 1] = "O";
                        s11 = arr1[Character.getNumericValue(c) - 9][Integer.parseInt(s4) - 1] = "O";
                        s12 = arr1[Character.getNumericValue(c) - 8][Integer.parseInt(s4) - 1] = "O";
                        s13 = arr1[Character.getNumericValue(c) - 7][Integer.parseInt(s4) - 1] = "O";
                        /*   arr[Character.getNumericValue(c) - 6][Integer.parseInt(s4) - 1] = "O";*/
             /*           Battleship2.addAll(List.of(s10, s11, s12, s13));*/
                        printSea1(arr1);
                        is = true;

                        System.out.println("Enter the coordinates of the Submarine (3 cells):");
                        createSubmarine1(sea1);

                    }

                    if ((trzeci - pierwszy) != 3) {
                        System.out.println("Error! Wrong length of the Battleship! Try again:");
                        break;

                    }
                }
                if (!first.equalsIgnoreCase(third) && !is) {
                    System.out.println("Error! Wrong ship location! Try again:");

                    break;
                }
            }


        }


        createBattleship1(arr1);

    }

    private static void createSubmarine1(String[][] arr1) throws ArrayIndexOutOfBoundsException {
        Scanner sca = new Scanner(System.in);
        String air = sca.nextLine();
        char[] chars = air.toCharArray();
        String s = Arrays.toString(chars);

        char c = 0;
        char d = 0;
        char a = 0;
        char b = 0;

        String first = null;
        String second = null;
        String third = null;
        String fourth = null;
        int czwarty = 0;
        int drugi = 0;

        String s2 = null;
        String s1 = null;

        String s3 = null;
        String s4 = null;


        String reg1 = "[a-jA-J]";
        String reg2 = "([1-9]|10)";


/*        System.out.println(first.matches(reg1));
        System.out.println(third.matches(reg1));*/

        int trzeci = 0;
        int pierwszy = 0;
/*        System.out.println(pierwszy);
        System.out.println(drugi);
        System.out.println(trzeci);
        System.out.println(czwarty);
        System.out.println("================");
        System.out.println(czwarty - drugi);*/

        if (s.length() == 15 && s.charAt(5) == ',' && s.charAt(11) == ',') {
            c = s.charAt(1);
            d = s.charAt(4);
            a = s.charAt(10);
            b = s.charAt(13);
            first = s.substring(1, 2);
            third = s.substring(10, 11);
            fourth = s.substring(13, 14);
            second = s.substring(4, 5);
            czwarty = Integer.parseInt(fourth);
            drugi = Integer.parseInt(second);
            trzeci = Character.getNumericValue(a) - 9;
            pierwszy = Character.getNumericValue(c) - 9;
        }
        //Przypadek typu a6 a10
        if (s.length() == 18 && s.charAt(5) == ',' && s.charAt(14) == ',' && s.charAt(7) != '0') {
            c = s.charAt(1);
            d = s.charAt(4);
            a = s.charAt(10);
            //Problem
            b = s.charAt(13);
            first = s.substring(1, 2);
            fourth = s.substring(13, 17);
            third = s.substring(10, 11);
            second = s.substring(4, 5);
            s1 = fourth.replace(",", "");
            s2 = s1.replace(" ", "");
            czwarty = Integer.parseInt(s2);
            drugi = Integer.parseInt(second);
            trzeci = Character.getNumericValue(a) - 9;
            pierwszy = Character.getNumericValue(c) - 9;
        }
        //Pezypadek typu a10 e10
        if (s.length() == 21 && s.charAt(5) == ',' && s.charAt(8) == ',' && s.charAt(11) == ',' && s.charAt(17) == ',') {
            c = s.charAt(1);
            //Problem
            d = s.charAt(4);
            a = s.charAt(13);
            //Problem
            b = s.charAt(16);
            first = s.substring(1, 2);
            second = s.substring(4, 8);
            third = s.substring(13, 14);
            s1 = second.replace(",", "");
            s2 = s1.replace(" ", "");
            fourth = s.substring(16, 20);
            s3 = fourth.replace(",", "");
            s4 = s3.replace(" ", "");
            czwarty = Integer.parseInt(s4);
            drugi = Integer.parseInt(s2);
            trzeci = Character.getNumericValue(a) - 9;
            pierwszy = Character.getNumericValue(c) - 9;

        }

        //Przypadek typu a10 a6
        if (s.length() == 18 && s.charAt(2) == ',' && s.charAt(5) == ',' && s.charAt(8) == ',' && s.charAt(11) == ',' && s.charAt(14) == ',' && s.charAt(7) == '0') {
            c = s.charAt(1);
            d = s.charAt(4);
            a = s.charAt(13);
            b = s.charAt(16);
            first = s.substring(1, 2);
            second = s.substring(4, 8);
            third = s.substring(13, 14);
            fourth = s.substring(16, 17);
            s1 = second.replace(",", "");
            s2 = s1.replace(" ", "");
            czwarty = Integer.parseInt(fourth);
            drugi = Integer.parseInt(s2);
            trzeci = Character.getNumericValue(a) - 9;
            pierwszy = Character.getNumericValue(c) - 9;

        }


        boolean is = false;
        if (czwarty > drugi) {
            while (!is) {
                if (first.matches(reg1) && third.matches(reg1) &&
                        second.matches(reg2)) {
                    if (fourth.matches(reg2)) {
                        if (first.equalsIgnoreCase(third) && !second.equalsIgnoreCase(fourth)) {
                            if ((czwarty - drugi) == 2 && s.length() == 15) {
                                s14 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1] = "O";
                                s15 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(second)] = "O";
                                s16 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 1] = "O";
                                /*    arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 2] = "O";*/
                                /*      arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 3] = "O";*/

                                /*Submarine2.addAll(List.of(s17, s18, s19));*/
                                printSea1(arr1);
                                is = true;
                                System.out.println("Enter the coordinates of the Cruiser (3 cells):");
                                createCruiser1(sea1);


                            }
                            if ((czwarty - drugi) != 2) {
                                System.out.println("Error! Wrong length of the Submarine! Try again:");
                                break;

                            }
                        }
                        if (!second.equalsIgnoreCase(fourth)) {
                            System.out.println("Error! Wrong ship location! Try again:");

                            break;
                        }
                    }

                    if (s2 != null) {
                        if (first.equalsIgnoreCase(third)) {
                            if ((czwarty - drugi) == 2 && s.length() == 18) {
                                s14 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1] = "O";
                                s15 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(second)] = "O";
                                s16 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 1] = "O";
                                /*    arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 2] = "O";*/
                                /*      arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 3] = "O";*/
                                /*Submarine2.addAll(List.of(s17, s18, s19));*/

                                printSea1(arr1);
                                is = true;
                                System.out.println("Enter the coordinates of the Cruiser (3 cells):");
                                createCruiser1(sea1);


                            }
                            if ((czwarty - drugi) != 2) {
                                System.out.println("Error! Wrong length of the Submarine! Try again:");
                                break;

                            }
                        }
                        if (!second.equalsIgnoreCase(s2)) {
                            System.out.println("Error! Wrong ship location! Try again:");

                            break;
                        }
                    }

                }

                if (second.equalsIgnoreCase(fourth)) {
                    if ((trzeci - pierwszy) == 2 && s.length() == 15) {
                        s14 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1] = "O";
                        s15 = arr1[Character.getNumericValue(c) - 9][Integer.parseInt(second) - 1] = "O";
                        s16 = arr1[Character.getNumericValue(c) - 8][Integer.parseInt(second) - 1] = "O";
                        /*        arr[Character.getNumericValue(c) - 7][Integer.parseInt(second) - 1] = "O";*/
                        /*             arr[Character.getNumericValue(c) - 6][Integer.parseInt(second) - 1] = "O";*/
                        /*Submarine2.addAll(List.of(s17, s18, s19));*/
                        printSea1(arr1);
                        is = true;
                        System.out.println("Enter the coordinates of the Cruiser (3 cells):");
                        createCruiser1(sea1);

                    }

                    if ((trzeci - pierwszy) == 2 && s.length() == 21) {
                        s14 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1] = "O";
                        s15 = arr1[Character.getNumericValue(c) - 9][Integer.parseInt(second) - 1] = "O";
                        s16 = arr1[Character.getNumericValue(c) - 8][Integer.parseInt(second) - 1] = "O";
                        /*        arr[Character.getNumericValue(c) - 7][Integer.parseInt(second) - 1] = "O";*/
                        /*             arr[Character.getNumericValue(c) - 6][Integer.parseInt(second) - 1] = "O";*/
                       /* Submarine2.addAll(List.of(s17, s18, s19));*/
                        printSea1(arr1);
                        is = true;
                        System.out.println("Enter the coordinates of the Cruiser (3 cells):");
                        createCruiser1(sea1);

                    }
                    if ((trzeci - pierwszy) != 2) {
                        System.out.println("Error! Wrong length of the Submarine! Try again:");
                        break;

                    }
                }
                if (!first.equalsIgnoreCase(third) && !is) {
                    System.out.println("Error! Wrong ship location! Try again:");

                    break;
                }
            }
        } else {
            while (!is) {
                //Przypadek dla a5 a1
                if (first.matches(reg1) && third.matches(reg1) &&
                        second.matches(reg2)) {
                    if (fourth.matches(reg2)) {
                        if (first.equalsIgnoreCase(third) && !second.equalsIgnoreCase(fourth)) {

                            if ((drugi - czwarty) == 2 && s.length() == 15) {
                                s14 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) - 1] = "O";
                                s15 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(fourth)] = "O";
                                s16 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 1] = "O";
                                   /* arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 2] = "O";
                                    arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 3] = "O";*/
                               /* Submarine2.addAll(List.of(s17, s18, s19));*/

                                printSea1(arr1);
                                is = true;
                                System.out.println("Enter the coordinates of the Cruiser (3 cells):");
                                createCruiser1(sea1);


                            }

                            if ((drugi - czwarty) != 2) {
                                System.out.println("Error! Wrong length of the Submarine! Try again:");
                                break;

                            }
                        }

                        if (!second.equalsIgnoreCase(fourth)) {
                            System.out.println("Error! Wrong ship location! Try again:");

                            break;
                        }
                    }
                }
                //Przypadek typu a10 a6
                if (first.matches(reg1) && third.matches(reg1) &&
                        fourth.matches(reg2)) {
                    if (s2 != null) {


                        if (first.equalsIgnoreCase(third) && !second.equalsIgnoreCase(fourth)) {
                            if ((drugi - czwarty) == 2 && s.length() == 18 && s.charAt(7) == '0') {
                                s14 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) - 1] = "O";
                                s15 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(fourth)] = "O";
                                s16 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 1] = "O";
                                   /* arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 2] = "O";
                                    arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 3] = "O";*/

                            /*    Submarine2.addAll(List.of(s17, s18, s19));*/
                                printSea1(arr1);
                                is = true;
                                System.out.println("Enter the coordinates of the Cruiser (3 cells):");
                                createCruiser1(sea1);


                            }

                            if ((drugi - czwarty) != 2) {
                                System.out.println("Error! Wrong length of the Submarine! Try again:");
                                break;

                            }
                        }

                        if (!second.equalsIgnoreCase(s2)) {
                            System.out.println("Error! Wrong ship location! Try again:");

                            break;
                        }

                    }
                }


                if (second.equalsIgnoreCase(fourth)) {


                    //Przypadek typu a1 e1

                    if ((trzeci - pierwszy) == 2 && s.length() == 15) {
                        s14 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) - 1] = "O";
                        s15 = arr1[Character.getNumericValue(c) - 9][Integer.parseInt(fourth) - 1] = "O";
                        s16 = arr1[Character.getNumericValue(c) - 8][Integer.parseInt(fourth) - 1] = "O";
                         /*   arr[Character.getNumericValue(c) - 7][Integer.parseInt(fourth) - 1] = "O";
                            arr[Character.getNumericValue(c) - 6][Integer.parseInt(fourth) - 1] = "O";
*/
                      /*  Submarine2.addAll(List.of(s17, s18, s19));*/
                        printSea1(arr1);
                        is = true;

                        System.out.println("Enter the coordinates of the Cruiser (3 cells):");
                        createCruiser1(sea1);

                    }


                    //Przypadek typu a10 e10, to działało i nie było elementu z s.length()
                    if ((trzeci - pierwszy) == 2 && s.length() == 21) {
                        s14 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(s4) - 1] = "O";
                        s15 = arr1[Character.getNumericValue(c) - 9][Integer.parseInt(s4) - 1] = "O";
                        s16 = arr1[Character.getNumericValue(c) - 8][Integer.parseInt(s4) - 1] = "O";
                      /*      arr[Character.getNumericValue(c) - 7][Integer.parseInt(s4) - 1] = "O";
                            arr[Character.getNumericValue(c) - 6][Integer.parseInt(s4) - 1] = "O";*/
                       /* Submarine2.addAll(List.of(s17, s18, s19));*/
                        printSea1(arr1);
                        is = true;

                        System.out.println("Enter the coordinates of the Cruiser (3 cells):");
                        createCruiser1(sea1);

                    }
//problem
                    if ((trzeci - pierwszy) != 2 && (pierwszy - trzeci) != 2) {
                        System.out.println("Error! Wrong length of the Submarine! Try again:");
                        break;

                    }
                    //problem
                }
//dodatek
                if ((pierwszy - trzeci) == 2 && s.length() == 15) {
                    s17 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) - 1] = "O";
                    s18 = arr1[Character.getNumericValue(c) - 11][Integer.parseInt(fourth) - 1] = "O";
                    s19 = arr1[Character.getNumericValue(c) - 12][Integer.parseInt(fourth) - 1] = "O";
                       /* arr[Character.getNumericValue(c) - 7][Integer.parseInt(fourth) - 1] = "O";
                        arr[Character.getNumericValue(c) - 6][Integer.parseInt(fourth) - 1] = "O";*/
                    /*Submarine2.addAll(List.of(s17, s18, s19));*/
                    printSea1(arr1);
                    is = true;

                    System.out.println("Enter the coordinates of the Cruiser (3 cells):");
                    createCruiser1(sea1);

                }
                //dodatek
                if (!first.equalsIgnoreCase(third) && !is) {
                    System.out.println("Error! Wrong ship location! Try again:");

                    break;
                }
            }
        }


        createSubmarine1(arr1);

    }

    private static void createDestroyer1(String[][] arr1) {
        Scanner sca = new Scanner(System.in);
        String air = sca.nextLine();
        char[] chars = air.toCharArray();
        String s = Arrays.toString(chars);


        char c = 0;
        char d = 0;
        char a = 0;
        char b = 0;

        String first = null;
        String second = null;
        String third = null;
        String fourth = null;
        int czwarty = 0;
        int drugi = 0;

        String s1 = null;
        String s2 = null;

        String s3 = null;
        String s4 = null;


        String reg1 = "[a-jA-J]";
        String reg2 = "([1-9]|10)";


    /*    System.out.println(first.matches(reg1));
        System.out.println(third.matches(reg1));*/

      /* czwarty = Integer.parseInt(fourth);
        drugi = Integer.parseInt(second);*/
        int trzeci = 0;
        int pierwszy = 0;
     /*   System.out.println(pierwszy);
        System.out.println(drugi);
        System.out.println(trzeci);
        System.out.println(czwarty);
        System.out.println("================");
        System.out.println(czwarty - drugi);*/

        //Przypadek typu a1 a5 oraz a1 e1
        if (s.length() == 15 && s.charAt(5) == ',' && s.charAt(11) == ',') {
            c = s.charAt(1);
            d = s.charAt(4);
            a = s.charAt(10);
            b = s.charAt(13);
            first = s.substring(1, 2);
            third = s.substring(10, 11);
            fourth = s.substring(13, 14);
            second = s.substring(4, 5);
            czwarty = Integer.parseInt(fourth);
            drugi = Integer.parseInt(second);
            trzeci = Character.getNumericValue(a) - 9;
            pierwszy = Character.getNumericValue(c) - 9;

        }
        //Przypadek typu a6 a10
        if (s.length() == 18 && s.charAt(5) == ',' && s.charAt(14) == ',' && s.charAt(7) != '0') {
            c = s.charAt(1);
            d = s.charAt(4);
            a = s.charAt(10);
            //Problem
            b = s.charAt(13);
            /* char f = s.charAt(16);*/
            first = s.substring(1, 2);
            fourth = s.substring(13, 17);
            third = s.substring(10, 11);
            second = s.substring(4, 5);
            s1 = fourth.replace(",", "");
            s2 = s1.replace(" ", "");
            czwarty = Integer.parseInt(s2);
            drugi = Integer.parseInt(second);
            trzeci = Character.getNumericValue(a) - 9;
            pierwszy = Character.getNumericValue(c) - 9;
        }


        //Pezypadek typu a10 e10
        if (s.length() == 21 && s.charAt(5) == ',' && s.charAt(8) == ',' && s.charAt(11) == ',' && s.charAt(17) == ',') {
            c = s.charAt(1);
            //Problem
            d = s.charAt(4);
            a = s.charAt(13);
            //Problem
            b = s.charAt(16);
            first = s.substring(1, 2);
            second = s.substring(4, 8);
            third = s.substring(13, 14);
            s1 = second.replace(",", "");
            s2 = s1.replace(" ", "");
            fourth = s.substring(16, 20);
            s3 = fourth.replace(",", "");
            s4 = s3.replace(" ", "");
            czwarty = Integer.parseInt(s4);
            drugi = Integer.parseInt(s2);
            trzeci = Character.getNumericValue(a) - 9;
            pierwszy = Character.getNumericValue(c) - 9;

        }

        //Przypadek typu a10 a6
        if (s.length() == 18 && s.charAt(2) == ',' && s.charAt(5) == ',' && s.charAt(8) == ',' && s.charAt(11) == ',' && s.charAt(14) == ',' && s.charAt(7) == '0') {
            c = s.charAt(1);
            d = s.charAt(4);
            a = s.charAt(13);
            b = s.charAt(16);
            first = s.substring(1, 2);
            second = s.substring(4, 8);
            third = s.substring(13, 14);
            fourth = s.substring(16, 17);
            s1 = second.replace(",", "");
            s2 = s1.replace(" ", "");
            czwarty = Integer.parseInt(fourth);
            drugi = Integer.parseInt(s2);
            trzeci = Character.getNumericValue(a) - 9;
            pierwszy = Character.getNumericValue(c) - 9;

        }


        boolean is = false;
        if (czwarty > drugi) {
            while (!is) {
                if (first.matches(reg1) && third.matches(reg1) &&
                        second.matches(reg2)) {
                    if (fourth.matches(reg2)) {
                        if (first.equalsIgnoreCase(third) && !second.equalsIgnoreCase(fourth)) {
                            if ((czwarty - drugi) == 1 && s.length() == 15) {
                                s20 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1] = "O";
                                s21 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(second)] = "O";
                                /*          arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 1] = "O";*/
                                /*    arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 2] = "O";*/
                                /*      arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 3] = "O";*/
                               /* Destroyer2.addAll(List.of(s20, s21));*/

                                printSea1(arr1);
                                is = true;
                     /*   System.out.println("Enter the coordinates of the Destroyer (3 cells):");
                        createDestroyer(sea);*/

                          /*      System.out.println("Press Enter and pass the move to another player");
                                reader.nextLine();
                                System.out.println("Player 2, place your ships to the game field");
                                sea1 = createSea();
                                printSea(sea1);
                                System.out.println("Enter the coordinates of the Aircraft Carrier (5 cells):");
                                createAircraft(sea1);*/


                                /*System.out.println("The game starts!");
                                sea = createSea();
                                printSea(sea);
                                System.out.println("Take a shoot!");
                                createShoot(arr);*/

                                System.out.println("Press Enter and pass the move to another player");
                                reader.nextLine();
                                createShoot1(arr1);


                            }
                            if ((czwarty - drugi) != 1) {
                                System.out.println("Error! Wrong length of the Destroyer! Try again:");
                                /*   System.out.println("jan");*/
                                break;

                            }
                        }
                        if (!second.equalsIgnoreCase(fourth)) {
                            System.out.println("Error! Wrong ship location! Try again:");

                            break;
                        }
                    }

                    if (s2 != null) {
                        if (first.equalsIgnoreCase(third)) {
                            if ((czwarty - drugi) == 1 && s.length() == 18) {
                                s20 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1] = "O";
                                s21 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(second)] = "O";
                                /*          arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 1] = "O";*/
                                /*    arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 2] = "O";*/
                                /*      arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 3] = "O";*/

                               /* Destroyer2.addAll(List.of(s20, s21));*/
                                printSea1(arr1);
                                is = true;
                     /*   System.out.println("Enter the coordinates of the Destroyer (3 cells):");
                        createDestroyer(sea);*/
                               /* System.out.println("Press Enter and pass the move to another player");
                                reader.nextLine();
                                System.out.println("Player 2, place your ships to the game field");
                                sea1 = createSea();
                                printSea(sea1);
                                System.out.println("Enter the coordinates of the Aircraft Carrier (5 cells):");
                                createAircraft(sea1);*/

                             /*   System.out.println("The game starts!");
                                sea = createSea();
                                printSea(sea);
                                System.out.println("Take a shoot!");
                                createShoot(arr);*/

                                System.out.println("Press Enter and pass the move to another player");
                                reader.nextLine();
                                createShoot1(arr1);


                            }
                            if ((czwarty - drugi) != 1) {
                                System.out.println("Error! Wrong length of the Destroyer! Try again:");
                                /*            System.out.println("tam");*/
                                break;

                            }
                        }
                        if (!second.equalsIgnoreCase(s2)) {
                            System.out.println("Error! Wrong ship location! Try again:");

                            break;
                        }
                    }
                }
                if (second.equalsIgnoreCase(fourth)) {
                    if ((trzeci - pierwszy) == 1 && s.length() == 15) {
                        s20 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1] = "O";
                        s21 = arr1[Character.getNumericValue(c) - 9][Integer.parseInt(second) - 1] = "O";
                        /*        arr[Character.getNumericValue(c) - 8][Integer.parseInt(second) - 1] = "O";*/
                        /*                 arr[Character.getNumericValue(c) - 7][Integer.parseInt(second) - 1] = "O";*/
                        /*             arr[Character.getNumericValue(c) - 6][Integer.parseInt(second) - 1] = "O";*/
                      /*  Destroyer2.addAll(List.of(s20, s21));*/

                        printSea1(arr1);
                        is = true;

                        System.out.println("Press Enter and pass the move to another player");
                        reader.nextLine();
                        createShoot1(arr1);

//                        System.out.println("Press Enter and pass the move to another player");
//                        reader.nextLine();
//                        System.out.println("Player 2, place your ships to the game field");
//                        sea1 = createSea();
//                        printSea(sea1);
//                        System.out.println("Enter the coordinates of the Aircraft Carrier (5 cells):");
//                        createAircraft(sea1);

                   /*     System.out.println("The game starts!");
                        sea = createSea();
                        printSea(sea);
                        System.out.println("Take a shoot!");
                        createShoot(arr);*/

                    }

                    if ((trzeci - pierwszy) == 1 && s.length() == 21) {
                        s20 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(s2) - 1] = "O";
                        s21 = arr1[Character.getNumericValue(c) - 9][Integer.parseInt(s2) - 1] = "O";
                        /*        arr[Character.getNumericValue(c) - 8][Integer.parseInt(second) - 1] = "O";*/
                        /*                 arr[Character.getNumericValue(c) - 7][Integer.parseInt(second) - 1] = "O";*/
                        /*             arr[Character.getNumericValue(c) - 6][Integer.parseInt(second) - 1] = "O";*/

                    /*    Destroyer2.addAll(List.of(s20, s21));*/
                        printSea1(arr1);
                        is = true;

                        System.out.println("Press Enter and pass the move to another player");
                        reader.nextLine();
                        createShoot1(arr1);

                     /*   System.out.println("Press Enter and pass the move to another player");
                        reader.nextLine();
                        System.out.println("Player 2, place your ships to the game field");
                        sea1 = createSea();
                        printSea(sea1);
                        System.out.println("Enter the coordinates of the Aircraft Carrier (5 cells):");
                        createAircraft(sea1);*/

              /*          System.out.println("The game starts!");
                        sea = createSea();
                        printSea(sea);
                        System.out.println("Take a shoot!");
                        createShoot(arr);*/

                    }
                    if ((trzeci - pierwszy) != 1) {
                        System.out.println("Error! Wrong length of the Destroyer! Try again:");
                        /*   System.out.println("jak");*/
                        break;

                    }
                }
                if (!first.equalsIgnoreCase(third) && !is) {
                    System.out.println("Error! Wrong ship location! Try again:");

                    break;
                }
            }
        } else {
            while (!is) {
                //Przypadek dla a5 a1
                if (first.matches(reg1) && third.matches(reg1) &&
                        second.matches(reg2)) {
                    if (fourth.matches(reg2)) {
                        if (first.equalsIgnoreCase(third) && !second.equalsIgnoreCase(fourth)) {

                            if ((drugi - czwarty) == 1 && s.length() == 15) {
                                s20 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) - 1] = "O";
                                s21 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(fourth)] = "O";
                                       /* arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 1] = "O";
                                        arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 2] = "O";
                                        arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 3] = "O";*/
                                /*Destroyer2.addAll(List.of(s20, s21));*/

                                printSea1(arr1);
                                is = true;

                                System.out.println("Press Enter and pass the move to another player");
                                reader.nextLine();
                                createShoot1(arr1);

                          /*      System.out.println("Press Enter and pass the move to another player");
                                reader.nextLine();
                                System.out.println("Player 2, place your ships to the game field");
                                sea1 = createSea();
                                printSea(sea1);
                                System.out.println("Enter the coordinates of the Aircraft Carrier (5 cells):");
                                createAircraft(sea1);*/

                             /*   System.out.println("The game starts!");
                                sea = createSea();
                                printSea(sea);
                                System.out.println("Take a shoot!");
                                createShoot(arr);*/


                            }

                            if ((drugi - czwarty) != 1) {
                                System.out.println("Error! Wrong length of the Destroyer! Try again:");
                                /* System.out.println("czy");*/
                                break;

                            }
                        }

                        if (!second.equalsIgnoreCase(fourth)) {
                            System.out.println("Error! Wrong ship location! Try again:");

                            break;
                        }
                    }
                }
                //Przypadek typu a10 a6
                if (first.matches(reg1) && third.matches(reg1) &&
                        fourth.matches(reg2)) {
                    if (s2 != null) {
                        /*   System.out.println("Case a10 a6");*/

                        if (first.equalsIgnoreCase(third) && !second.equalsIgnoreCase(fourth)) {
                            if ((drugi - czwarty) == 1 && s.length() == 18 && s.charAt(7) == '0') {
                                s20 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) - 1] = "O";
                                s21 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(fourth)] = "O";
                                      /*  arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 1] = "O";
                                        arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 2] = "O";
                                        arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 3] = "O";*/
                               /* Destroyer2.addAll(List.of(s20, s21));*/

                                printSea1(arr1);
                                is = true;

                                System.out.println("Press Enter and pass the move to another player");
                                reader.nextLine();
                                createShoot1(arr1);


                          /*      System.out.println("Press Enter and pass the move to another player");
                                reader.nextLine();
                                System.out.println("Player 2, place your ships to the game field");
                                sea1 = createSea();
                                printSea(sea1);
                                System.out.println("Enter the coordinates of the Aircraft Carrier (5 cells):");
                                createAircraft(sea1);*/

                           /*     System.out.println("The game starts!");
                                sea = createSea();
                                printSea(sea);
                                System.out.println("Take a shoot!");
                                createShoot(arr);*/


                            }

                            if ((drugi - czwarty) != 1) {
                                System.out.println("Error! Wrong length of the Destroyer! Try again:");
                                /*  System.out.println("gdzies");*/
                                break;

                            }
                        }

                        if (!second.equalsIgnoreCase(s2)) {
                            System.out.println("Error! Wrong ship location! Try again:");

                            break;
                        }

                    }
                }


                if (second.equalsIgnoreCase(fourth)) {


                    //Przypadek typu a1 e1

                    if ((trzeci - pierwszy) == 1 && s.length() == 15) {
                        s20 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) - 1] = "O";
                        s21 = arr1[Character.getNumericValue(c) - 9][Integer.parseInt(fourth) - 1] = "O";
                           /*     arr[Character.getNumericValue(c) - 8][Integer.parseInt(fourth) - 1] = "O";
                                arr[Character.getNumericValue(c) - 7][Integer.parseInt(fourth) - 1] = "O";
                                arr[Character.getNumericValue(c) - 6][Integer.parseInt(fourth) - 1] = "O";*/
                     /*   Destroyer2.addAll(List.of(s20, s21));*/
                        printSea1(arr1);
                        is = true;

                        System.out.println("Press Enter and pass the move to another player");
                        reader.nextLine();
                        createShoot1(arr1);

                   /*     System.out.println("Press Enter and pass the move to another player");
                        reader.nextLine();
                        System.out.println("Player 2, place your ships to the game field");
                        sea1 = createSea();
                        printSea(sea1);
                        System.out.println("Enter the coordinates of the Aircraft Carrier (5 cells):");
                        createAircraft(sea1);*/

                       /* System.out.println("The game starts!");
                        sea = createSea();
                        printSea(sea);
                        System.out.println("Take a shoot!");
                        createShoot(arr);*/

                    }


                    //Przypadek typu a10 e10, to działało i nie było elementu z s.length()
                    if ((trzeci - pierwszy) == 1 && s.length() == 21) {
                        s20 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(s4) - 1] = "O";
                        s21 = arr1[Character.getNumericValue(c) - 9][Integer.parseInt(s4) - 1] = "O";
                             /*   arr[Character.getNumericValue(c) - 8][Integer.parseInt(s4) - 1] = "O";
                                arr[Character.getNumericValue(c) - 7][Integer.parseInt(s4) - 1] = "O";
                                arr[Character.getNumericValue(c) - 6][Integer.parseInt(s4) - 1] = "O";
*/
                     /*   Destroyer2.addAll(List.of(s20, s21));*/
                        printSea1(arr1);
                        is = true;

                        System.out.println("Press Enter and pass the move to another player");
                        reader.nextLine();
                        createShoot1(arr1);



                 /*       System.out.println("Press Enter and pass the move to another player");
                        reader.nextLine();
                        System.out.println("Player 2, place your ships to the game field");
                        sea1 = createSea();
                        printSea(sea1);
                        System.out.println("Enter the coordinates of the Aircraft Carrier (5 cells):");
                        createAircraft(sea1);*/

                     /*   System.out.println("The game starts!");
                        sea = createSea();
                        printSea(sea);
                        System.out.println("Take a shoot!");
                        createShoot(arr);*/
                    }

                    if ((trzeci - pierwszy) != 1 && (pierwszy - trzeci) != 1) {
                        System.out.println("Error! Wrong length of the Destroyer! Try again:");
                        /*System.out.println("cps");*/
                        break;

                    }
                }
//dodatek
                if ((pierwszy - trzeci) == 1 && s.length() == 15) {
                    s20 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) - 1] = "O";
                    s21 = arr1[Character.getNumericValue(c) - 11][Integer.parseInt(fourth) - 1] = "O";
                    /*s19 = arr1[Character.getNumericValue(c) - 12][Integer.parseInt(fourth) - 1] = "O";*/
                       /* arr[Character.getNumericValue(c) - 7][Integer.parseInt(fourth) - 1] = "O";
                        arr[Character.getNumericValue(c) - 6][Integer.parseInt(fourth) - 1] = "O";*/
                   /* Destroyer2.addAll(List.of(s20, s21));*/
                    printSea1(arr1);
                    is = true;

                    System.out.println("Press Enter and pass the move to another player");
                    reader.nextLine();
                    createShoot1(arr1);

                }

                //dodatek


                if (!first.equalsIgnoreCase(third) && !is) {
                    System.out.println("Error! Wrong ship location! Try again:");

                    break;
                }
            }
        }

        createDestroyer1(arr1);
    }




/*
        createDestroyer(arr);
        System.exit(0);*/


    private static void createCruiser1(String[][] arr1) throws ArrayIndexOutOfBoundsException {
        Scanner sca = new Scanner(System.in);
        String air = sca.nextLine();
        char[] chars = air.toCharArray();
        String s = Arrays.toString(chars);

        char c = 0;
        char d = 0;
        char a = 0;
        char b = 0;

        String first = null;
        String second = null;
        String third = null;
        String fourth = null;
        int czwarty = 0;
        int drugi = 0;
        int trzeci = 0;
        int pierwszy = 0;

        String s2 = null;

        String s1 = null;

        String s3 = null;
        String s4 = null;


        /*  System.out.println("==================");
         */
        String reg1 = "[a-jA-J]";
        String reg2 = "([1-9]|10)";


/*        System.out.println(first.matches(reg1));
        System.out.println(third.matches(reg1));*/

        //Przypadek typu a1 a5 oraz a1 e1
        if (s.length() == 15 && s.charAt(5) == ',' && s.charAt(11) == ',') {
            c = s.charAt(1);
            d = s.charAt(4);
            a = s.charAt(10);
            b = s.charAt(13);
            first = s.substring(1, 2);
            third = s.substring(10, 11);
            fourth = s.substring(13, 14);
            second = s.substring(4, 5);
            czwarty = Integer.parseInt(fourth);
            drugi = Integer.parseInt(second);
            trzeci = Character.getNumericValue(a) - 9;
            pierwszy = Character.getNumericValue(c) - 9;

        }
        //Przypadek typu a6 a10
        if (s.length() == 18 && s.charAt(5) == ',' && s.charAt(14) == ',' && s.charAt(7) != '0') {
            c = s.charAt(1);
            d = s.charAt(4);
            a = s.charAt(10);
            //Problem
            b = s.charAt(13);
            /* char f = s.charAt(16);*/
            first = s.substring(1, 2);
            fourth = s.substring(13, 17);
            third = s.substring(10, 11);
            second = s.substring(4, 5);
            s1 = fourth.replace(",", "");
            s2 = s1.replace(" ", "");
            czwarty = Integer.parseInt(s2);
            drugi = Integer.parseInt(second);
            trzeci = Character.getNumericValue(a) - 9;
            pierwszy = Character.getNumericValue(c) - 9;
        }


        //Pezypadek typu a10 e10
        if (s.length() == 21 && s.charAt(5) == ',' && s.charAt(8) == ',' && s.charAt(11) == ',' && s.charAt(17) == ',') {
            c = s.charAt(1);
            //Problem
            d = s.charAt(4);
            a = s.charAt(13);
            //Problem
            b = s.charAt(16);
            first = s.substring(1, 2);
            second = s.substring(4, 8);
            third = s.substring(13, 14);
            s1 = second.replace(",", "");
            s2 = s1.replace(" ", "");
            fourth = s.substring(16, 20);
            s3 = fourth.replace(",", "");
            s4 = s3.replace(" ", "");
            czwarty = Integer.parseInt(s4);
            drugi = Integer.parseInt(s2);
            trzeci = Character.getNumericValue(a) - 9;
            pierwszy = Character.getNumericValue(c) - 9;

        }

        //Przypadek typu a10 a6
        if (s.length() == 18 && s.charAt(2) == ',' && s.charAt(5) == ',' && s.charAt(8) == ',' && s.charAt(11) == ',' && s.charAt(14) == ',' && s.charAt(7) == '0') {
            c = s.charAt(1);
            d = s.charAt(4);
            a = s.charAt(13);
            b = s.charAt(16);
            first = s.substring(1, 2);
            second = s.substring(4, 8);
            third = s.substring(13, 14);
            fourth = s.substring(16, 17);
            s1 = second.replace(",", "");
            s2 = s1.replace(" ", "");
            czwarty = Integer.parseInt(fourth);
            drugi = Integer.parseInt(s2);
            trzeci = Character.getNumericValue(a) - 9;
            pierwszy = Character.getNumericValue(c) - 9;

        }


   /*     System.out.println(pierwszy);
        System.out.println(drugi);
        System.out.println(trzeci);
        System.out.println(czwarty);
        System.out.println("================");
        System.out.println(czwarty - drugi);*/


        boolean is = false;
        if (czwarty > drugi) {
            while (!is) {
                if (first.matches(reg1) && third.matches(reg1) &&
                        second.matches(reg2)) {
                    if (fourth.matches(reg2)) {
                        if (first.equalsIgnoreCase(third) && !second.equalsIgnoreCase(fourth)) {
                            if ((czwarty - drugi) == 2 && s.length() == 15) {
                                s17 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1] = "O";
                                s18 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(second)] = "O";
                                s19 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 1] = "O";
                                /*    arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 2] = "O";*/
                                /*      arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 3] = "O";*/
                               /* Cruiser2.addAll(List.of(s17, s18, s19));*/

                                printSea1(arr1);
                                is = true;
                                System.out.println("Enter the coordinates of the Destroyer (2 cells):");
                                createDestroyer1(sea1);


                            }
                            if ((czwarty - drugi) != 2) {
                                System.out.println("Error! Wrong length of the Cruiser! Try again:");
                                /* System.out.println("zzzzzz");*/
                                break;

                            }
                        }
                        if (!second.equalsIgnoreCase(fourth)) {
                            System.out.println("Error! Wrong ship location! Try again:");
                            /*         System.out.println("wwwww");*/

                            break;
                        }
                    }

                    if (s2 != null) {
                        if (first.equalsIgnoreCase(third)) {
                            if ((czwarty - drugi) == 2 && s.length() == 18) {
                                s17 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1] = "O";
                                s18 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(second)] = "O";
                                s19 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 1] = "O";
                                /*    arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 2] = "O";*/
                                /*      arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 3] = "O";*/
                              /*  Cruiser2.addAll(List.of(s17, s18, s19));*/

                                printSea1(arr1);
                                is = true;
                                System.out.println("Enter the coordinates of the Destroyer (2 cells):");
                                createDestroyer1(sea1);


                            }
                            if ((czwarty - drugi) != 2) {
                                System.out.println("Error! Wrong length of the Cruiser! Try again:");
                                /* System.out.println("rrrrrrr");*/
                                break;

                            }
                        }
                        if (!second.equalsIgnoreCase(s2)) {
                            System.out.println("Error! Wrong ship location! Try again:");
                            /*   System.out.println("gggggg");*/

                            break;
                        }
                    }
                }
                if (second.equalsIgnoreCase(fourth)) {
                    if ((trzeci - pierwszy) == 2 && s.length() == 15) {
                        s17 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1] = "O";
                        s18 = arr1[Character.getNumericValue(c) - 9][Integer.parseInt(second) - 1] = "O";
                        s19 = arr1[Character.getNumericValue(c) - 8][Integer.parseInt(second) - 1] = "O";
                        /*                 arr[Character.getNumericValue(c) - 7][Integer.parseInt(second) - 1] = "O";*/
                        /*             arr[Character.getNumericValue(c) - 6][Integer.parseInt(second) - 1] = "O";*/
                       /* Cruiser2.addAll(List.of(s17, s18, s19));*/
                        printSea1(arr1);
                        is = true;
                        System.out.println("Enter the coordinates of the Destroyer (2 cells):");
                        createDestroyer1(sea1);

                    }

                    if ((trzeci - pierwszy) == 2 && s.length() == 21) {
                        s17 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(s2) - 1] = "O";
                        s18 = arr1[Character.getNumericValue(c) - 9][Integer.parseInt(s2) - 1] = "O";
                        s19 = arr1[Character.getNumericValue(c) - 8][Integer.parseInt(s2) - 1] = "O";
                        /*                 arr[Character.getNumericValue(c) - 7][Integer.parseInt(second) - 1] = "O";*/
                        /*             arr[Character.getNumericValue(c) - 6][Integer.parseInt(second) - 1] = "O";*/
                        /*Cruiser2.addAll(List.of(s17, s18, s19));*/
                        printSea1(arr1);
                        is = true;
                        System.out.println("Enter the coordinates of the Destroyer (2 cells):");
                        createDestroyer1(sea1);

                    }

                    if ((pierwszy - trzeci) == 2 && s.length() == 15) {
                        s17 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) - 1] = "O";
                        s18 = arr1[Character.getNumericValue(c) - 11][Integer.parseInt(fourth) - 1] = "O";
                        s19 = arr1[Character.getNumericValue(c) - 12][Integer.parseInt(fourth) - 1] = "O";
                       /* arr[Character.getNumericValue(c) - 7][Integer.parseInt(fourth) - 1] = "O";
                        arr[Character.getNumericValue(c) - 6][Integer.parseInt(fourth) - 1] = "O";*/
                        /*Cruiser2.addAll(List.of(s17, s18, s19));*/
                        printSea1(arr1);
                        is = true;

                        System.out.println("Enter the coordinates of the Destroyer (2 cells):");
                        createDestroyer1(sea1);

                    }
                    if ((trzeci - pierwszy) != 2) {
                        System.out.println("Error! Wrong length of the Cruiser! Try again:");
                        /*   System.out.println("xxxxx");*/
                        break;

                    }
                }
                if (!first.equalsIgnoreCase(third) && !is) {
                    System.out.println("Error! Wrong ship location! Try again:");
                    /*   System.out.println("yyyyyy");*/

                    break;
                }
            }

        } else {
            while (!is) {
                //Przypadek dla a5 a1
                if (first.matches(reg1) && third.matches(reg1) &&
                        second.matches(reg2)) {
                    if (fourth.matches(reg2)) {
                        if (first.equalsIgnoreCase(third) && !second.equalsIgnoreCase(fourth)) {

                            if ((drugi - czwarty) == 2 && s.length() == 15) {
                                s17 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) - 1] = "O";
                                s18 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(fourth)] = "O";
                                s19 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 1] = "O";
                             /*   arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 2] = "O";
                                arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 3] = "O";*/
                             /*   Cruiser2.addAll(List.of(s17, s18, s19));*/

                                printSea1(arr1);
                                is = true;
                                System.out.println("Enter the coordinates of the Destroyer (2 cells):");
                                createDestroyer1(sea1);


                            }

                            if ((pierwszy - trzeci) == 2 && s.length() == 15) {
                                s17 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) - 1] = "O";
                                s18 = arr1[Character.getNumericValue(c) - 11][Integer.parseInt(fourth) - 1] = "O";
                                s19 = arr1[Character.getNumericValue(c) - 12][Integer.parseInt(fourth) - 1] = "O";
                       /* arr[Character.getNumericValue(c) - 7][Integer.parseInt(fourth) - 1] = "O";
                        arr[Character.getNumericValue(c) - 6][Integer.parseInt(fourth) - 1] = "O";*/
                            /*    Cruiser2.addAll(List.of(s17, s18, s19));*/
                                printSea1(arr1);
                                is = true;

                                System.out.println("Enter the coordinates of the Destroyer (2 cells):");
                                createDestroyer1(sea1);

                            }

                            if ((drugi - czwarty) != 2) {
                                System.out.println("Error! Wrong length of the Cruiser! Try again:");
                                break;

                            }
                        }
                        //test
                    /*    if (!first.equalsIgnoreCase(third) && second.equalsIgnoreCase(fourth)) {

                            if ((drugi - czwarty) == 2 && s.length() == 15) {
                                s17 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) - 1] = "O";
                                s18 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(fourth)] = "O";
                                s19 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 1] = "O";
                             *//*   arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 2] = "O";
                                arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 3] = "O";*//*


                                printSea1(arr1);
                                is = true;
                                System.out.println("Enter the coordinates of the Destroyer (2 cells):");
                                createDestroyer1(sea1);


                            }

                            if ((drugi - czwarty) != 2) {
                                System.out.println("Error! Wrong length of the Cruiser! Try again:");
                                break;

                            }
                        }*/
                        //test

                        if (!second.equalsIgnoreCase(fourth)) {
                            System.out.println("Error! Wrong ship location! Try again:");
                            /* System.out.println("hhhhh");*/

                            break;
                        }
                    }
                }
                //Przypadek typu a10 a6
                if (first.matches(reg1) && third.matches(reg1) &&
                        fourth.matches(reg2)) {
                    if (s2 != null) {


                        if (first.equalsIgnoreCase(third) && !second.equalsIgnoreCase(fourth)) {
                            if ((drugi - czwarty) == 2 && s.length() == 18 && s.charAt(7) == '0') {
                                s17 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) - 1] = "O";
                                s18 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(fourth)] = "O";
                                s19 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 1] = "O";
                              /*  arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 2] = "O";
                                arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 3] = "O";*/
                             /*   Cruiser2.addAll(List.of(s17, s18, s19));*/

                                printSea1(arr1);
                                is = true;
                                System.out.println("Enter the coordinates of the Destroyer (2 cells):");
                                createDestroyer1(sea1);


                            }

                            if ((pierwszy - trzeci) == 2 && s.length() == 15) {
                                s17 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) - 1] = "O";
                                s18 = arr1[Character.getNumericValue(c) - 11][Integer.parseInt(fourth) - 1] = "O";
                                s19 = arr1[Character.getNumericValue(c) - 12][Integer.parseInt(fourth) - 1] = "O";
                       /* arr[Character.getNumericValue(c) - 7][Integer.parseInt(fourth) - 1] = "O";
                        arr[Character.getNumericValue(c) - 6][Integer.parseInt(fourth) - 1] = "O";*/
                             /*   Cruiser2.addAll(List.of(s17, s18, s19));*/
                                printSea1(arr1);
                                is = true;

                                System.out.println("Enter the coordinates of the Destroyer (2 cells):");
                                createDestroyer1(sea1);

                            }

                            if ((drugi - czwarty) != 2) {
                                System.out.println("Error! Wrong length of the Cruiser! Try again:");
                                /*    System.out.println("aaaa");*/
                                break;

                            }
                        }

                        if (!second.equalsIgnoreCase(s2)) {
                            System.out.println("Error! Wrong ship location! Try again:");
                            /*    System.out.println("bbbbb");*/

                            break;
                        }

                    }
                }


                if (second.equalsIgnoreCase(fourth)) {


                    //Przypadek typu a1 e1

                    if ((trzeci - pierwszy) == 2 && s.length() == 15) {
                        s17 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) - 1] = "O";
                        s18 = arr1[Character.getNumericValue(c) - 9][Integer.parseInt(fourth) - 1] = "O";
                        s19 = arr1[Character.getNumericValue(c) - 8][Integer.parseInt(fourth) - 1] = "O";
                       /* arr[Character.getNumericValue(c) - 7][Integer.parseInt(fourth) - 1] = "O";
                        arr[Character.getNumericValue(c) - 6][Integer.parseInt(fourth) - 1] = "O";*/
                       /* Cruiser2.addAll(List.of(s17, s18, s19));*/
                        printSea1(arr1);
                        is = true;

                        System.out.println("Enter the coordinates of the Destroyer (2 cells):");
                        createDestroyer1(sea1);

                    }

                    //test
                    if ((pierwszy - trzeci) == 2 && s.length() == 15) {
                        s17 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) - 1] = "O";
                        s18 = arr1[Character.getNumericValue(c) - 11][Integer.parseInt(fourth) - 1] = "O";
                        s19 = arr1[Character.getNumericValue(c) - 12][Integer.parseInt(fourth) - 1] = "O";
                       /* arr[Character.getNumericValue(c) - 7][Integer.parseInt(fourth) - 1] = "O";
                        arr[Character.getNumericValue(c) - 6][Integer.parseInt(fourth) - 1] = "O";*/
                    /*    Cruiser2.addAll(List.of(s17, s18, s19));*/
                        printSea1(arr1);
                        is = true;

                        System.out.println("Enter the coordinates of the Destroyer (2 cells):");
                        createDestroyer1(sea1);

                    }
                    //test


                    //Przypadek typu a10 e10, to działało i nie było elementu z s.length()
                    if ((trzeci - pierwszy) == 2 && s.length() == 21) {
                        s17 = arr1[Character.getNumericValue(c) - 10][Integer.parseInt(s4) - 1] = "O";
                        s18 = arr1[Character.getNumericValue(c) - 9][Integer.parseInt(s4) - 1] = "O";
                        s19 = arr1[Character.getNumericValue(c) - 8][Integer.parseInt(s4) - 1] = "O";
                       /* arr[Character.getNumericValue(c) - 7][Integer.parseInt(s4) - 1] = "O";
                        arr[Character.getNumericValue(c) - 6][Integer.parseInt(s4) - 1] = "O";*/
                       /* Cruiser2.addAll(List.of(s17, s18, s19));*/
                        printSea1(arr1);
                        is = true;

                        System.out.println("Enter the coordinates of the Destroyer (2 cells):");
                        createDestroyer1(sea1);

                    }

                    if ((trzeci - pierwszy) != 2) {
                        System.out.println("Error! Wrong length of the Cruiser! Try again:");
                        /* System.out.println("cccccc");*/
                        break;

                    }
                }
                if (!first.equalsIgnoreCase(third) && !is) {
                    System.out.println("Error! Wrong ship location! Try again:");
                    /*         System.out.println("dddddd");*/

                    break;
                }
            }
        }


        createCruiser1(arr1);
    }

    public static void createShoot1(String[][] arr1) throws NullPointerException {

        /*sol = createSea();*/
/*        System.out.println(Arrays.deepToString(Player1.arr));
        System.out.println(Arrays.deepToString(Main.sea));
        System.out.println(Arrays.deepToString(arr1));
        System.out.println(Arrays.deepToString(Main.sea1));*/
        printSea(Main.sol);
        System.out.println("---------------------");
        printSea(Main.sea);
        System.out.println("Player 1, it's your turn:");
        Scanner sca = new Scanner(System.in);
     /*   System.out.println(Arrays.deepToString(arr1));
        System.out.println(Arrays.deepToString(Project55.sea1));*/
        String air = sca.nextLine();
       /* while(sca.hasNextLine()){air = sca.nextLine();
        }*/
        char[] chars = air.toCharArray();
        String s = Arrays.toString(chars);
        boolean is = false;
        String reg1 = "[a-jA-J]";
        String reg2 = "([1-9]|10)";
        String reg3 = "(j|J)";
        String reg4 = "(10)";


        /*String[][] sea1 = new String[Project55.sea1.length][];
         */

        char c = 0;
        char d = 0;

        String first = null;
        String second = null;


        int pierwszy = 0;
/*
        boolean a2 = s5.equalsIgnoreCase("X");
        boolean b2 = s6.equalsIgnoreCase("X");
        boolean c2 = s7.equalsIgnoreCase("X");
        boolean d2 = s8.equalsIgnoreCase("X");
        boolean e2 = s9.equalsIgnoreCase("X");
        boolean f2 = s10.equalsIgnoreCase("X");
        boolean g2 = s11.equalsIgnoreCase("X");
        boolean h2 = s12.equalsIgnoreCase("X");
        boolean i2 = s13.equalsIgnoreCase("X");
        boolean j2 = s14.equalsIgnoreCase("X");
        boolean k2 = s15.equalsIgnoreCase("X");
        boolean l2 = s16.equalsIgnoreCase("X");
        boolean m2 = s17.equalsIgnoreCase("X");
        boolean n2 = s18.equalsIgnoreCase("X");
        boolean o2 = s19.equalsIgnoreCase("X");
        boolean p2 = s20.equalsIgnoreCase("X");
        boolean r2 = s21.equalsIgnoreCase("X");*/

/*        boolean a2 = s5.equalsIgnoreCase("X") && s6.equalsIgnoreCase("X") && s7.equalsIgnoreCase("X") && s8.equalsIgnoreCase("X") && s9.equalsIgnoreCase("X");
        boolean f2 = s10.equalsIgnoreCase("X") && s11.equalsIgnoreCase("X") && s12.equalsIgnoreCase("X") && s13.equalsIgnoreCase("X");
        boolean j2 = s14.equalsIgnoreCase("X") && s15.equalsIgnoreCase("X") && s16.equalsIgnoreCase("X");
        boolean m2 = s17.equalsIgnoreCase("X") && s18.equalsIgnoreCase("X") && s19.equalsIgnoreCase("X");
        boolean p2 = s20.equalsIgnoreCase("X") && s21.equalsIgnoreCase("X");*/


        String type = null;

        //Przypadek typu a1
        if (s.length() == 6 && s.charAt(2) == ',' && s.charAt(3) == ' ' && s.charAt(5) != ',') {
            type = "two";
            c = s.charAt(1);
            d = s.charAt(4);
            first = s.substring(1, 2);
            second = s.substring(4, 5);
            pierwszy = Character.getNumericValue(c) - 9;

        }

        //Przypadek typu a10

        if (s.length() == 9 && s.charAt(2) == ',' && s.charAt(3) == ' ' && s.charAt(5) == ',' && s.charAt(6) == ' ') {
            type = "three";
            c = s.charAt(1);
            d = s.charAt(4);
            first = s.substring(1, 2);
            second = s.substring(4, 8);
            String s4 = second.replace(",", "");
            s22 = s4.replace(" ", "");
            pierwszy = Character.getNumericValue(c) - 9;

        }


    /*    boolean c1 = sea1[3][3].equals("X");
        boolean c2 = sea1[3][4].equals("X");
        boolean c3 = sea1[3][5].equals("X");
        boolean c4 = sea1[2][7].equals("X");
        boolean c5 = sea1[3][7].equals("X");
        boolean c6 = sea1[5][2].equals("X");
        boolean c7 = sea1[5][3].equals("X");
        boolean c8 = sea1[5][4].equals("X");
        boolean c9 = sea1[5][5].equals("X");
        boolean c10 = sea1[5][7].equals("X");
        boolean c11 = sea1[6][7].equals("X");
        boolean c12 = sea1[7][7].equals("X");
        boolean c13 = sea1[7][1].equals("X");
        boolean c14 = sea1[7][2].equals("X");
        boolean c15 = sea1[7][3].equals("X");
        boolean c16 = sea1[7][4].equals("X");
        boolean c17 = sea1[7][5].equals("X");*/

        boolean ship1;
        boolean ship2;
        boolean ship3;
        boolean ship4;
        boolean ship5;


        if (licznik1 < 18) {
/*            boolean c1 = sea1[3][3].equals("X");
            boolean c2 = sea1[3][4].equals("X");
            boolean c3 = sea1[3][5].equals("X");
            boolean c4 = sea1[2][7].equals("X");
            boolean c5 = sea1[3][7].equals("X");
            boolean c6 = sea1[5][2].equals("X");
            boolean c7 = sea1[5][3].equals("X");
            boolean c8 = sea1[5][4].equals("X");
            boolean c9 = sea1[5][5].equals("X");
            boolean c10 = sea1[5][7].equals("X");
            boolean c11 = sea1[6][7].equals("X");
            boolean c12 = sea1[7][7].equals("X");
            boolean c13 = sea1[7][1].equals("X");
            boolean c14 = sea1[7][2].equals("X");
            boolean c15 = sea1[7][3].equals("X");
            boolean c16 = sea1[7][4].equals("X");
            boolean c17 = sea1[7][5].equals("X");*/

      /*        boolean ship1 = c1 && c2 &&c3;
        boolean ship2 = c4 && c5;
        boolean ship3 = c6 && c7 && c8 && c9;
        boolean ship4 = c10 && c11 && c12;
        boolean ship5 = c13 && c14 && c15 && c16 && c17;

            boolean ship1 = c1 && c2 &&c3;
            boolean ship2 = c4 && c5;
            boolean ship3 = c6 && c7 && c8 && c9;
            boolean ship4 = c10 && c11 && c12;
            boolean ship5 = c13 && c14 && c15 && c16 && c17;
            boolean res1 = !ship2 && !ship1 && !ship3 && !ship4 && !ship5;
            boolean res2 = ship2 || ship1 || ship3 || ship4 || ship5;*/


                if (first.matches(reg1) && second.matches(reg2) && sea1[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1].equals("O")) {
                    licznik1++;
                    Main.sea1[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1] = "X";

                    boolean c1 = sea1[3][3].equals("X");
                    boolean c2 = sea1[3][4].equals("X");
                    boolean c3 = sea1[3][5].equals("X");
                    boolean c4 = sea1[2][7].equals("X");
                    boolean c5 = sea1[3][7].equals("X");
                    boolean c6 = sea1[5][2].equals("X");
                    boolean c7 = sea1[5][3].equals("X");
                    boolean c8 = sea1[5][4].equals("X");
                    boolean c9 = sea1[5][5].equals("X");
                    boolean c10 = sea1[5][7].equals("X");
                    boolean c11 = sea1[6][7].equals("X");
                    boolean c12 = sea1[7][7].equals("X");
                    boolean c13 = sea1[7][1].equals("X");
                    boolean c14 = sea1[7][2].equals("X");
                    boolean c15 = sea1[7][3].equals("X");
                    boolean c16 = sea1[7][4].equals("X");
                    boolean c17 = sea1[7][5].equals("X");

                    ship1 = c1 && c2 && c3;
                    ship2 = c4 && c5;
                    ship3 = c6 && c7 && c8 && c9;
                    ship4 = c10 && c11 && c12;
                    ship5 = c13 && c14 && c15 && c16 && c17;


            /*    System.out.println(sea1[3][3]);
                System.out.println(sea1[3][4]);
                System.out.println(sea1[3][5]);*/


                    if (licznik1 == 18) {
                        System.out.println("You sank the last ship. You won. Congratulations!");
                        System.exit(0);
                    }
                    if (licznik1 < 17) {
                        if (!ship2 && !ship1 && !ship3 && !ship4 && !ship5) {
                            System.out.println("You hit a ship!");
                        } else if (licznik1 < 17 && ship1) {
                            System.out.println("You sank a ship!");
                        } else if (licznik1 < 17 && ship2) {
                            System.out.println("You sank a ship!");
                        } else if (licznik1 < 17 && ship3) {
                            System.out.println("You sank a ship!");
                        } else if (licznik1 < 17 && ship4) {
                            System.out.println("You sank a ship!");
                        } else if (licznik1 < 17 && ship5) {
                            System.out.println("You sank a ship!");
                        }
                        System.out.println("Press Enter and pass the move to another player");
                        reader.nextLine();
                        createShoot(arr);

                    }
                }else if (first.matches(reg1) && second.matches(reg2) && sea1[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1].equals("X")) {
                    System.out.println("Wrong coordinates!");
                    System.out.println("Press Enter and pass the move to another player");
                    reader.nextLine();
                    createShoot(arr);
            }

                if (first.equals("g") && second.equals("8") && sea1[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1].equals("~")) {

                    sea[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1] = "M";
                    System.out.println("You missed!");
                    System.out.println("Press Enter and pass the move to another player");
                    reader.nextLine();
                    createShoot(arr);

                }


                if (first.matches(reg1) && second.matches(reg2) && sea1[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1].equals("~")) {

                    sea1[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1] = "M";
                    if (licznik1 < 17) {
                        System.out.println("You missed!");
                        /*createShoot1(arr1);*/
                        System.out.println("Press Enter and pass the move to another player");
                        reader.nextLine();
                        createShoot(arr);
                    }
                }


                if (first.matches(reg1) && s22.matches(reg2) && sea1[Character.getNumericValue(c) - 10][Integer.parseInt(s22) - 1].equals("~") && !second.equals("10")) {

                    Main.sea1[Character.getNumericValue(c) - 10][Integer.parseInt(s22) - 1] = "M";
                    /*printSea(Project55.sea1);*/
                    System.out.println("You missed!");
                    System.out.println("Press Enter and pass the move to another player");
                    reader.nextLine();
                    createShoot(Player1.arr);
                    /*createShoot1(arr1);*/
                }


                if (first.matches(reg3) && s22.matches(reg4) && sea1[Character.getNumericValue(c) - 10][Integer.parseInt(s22) - 1].equals("O")) {
                    licznik1++;
                    Main.sea1[Character.getNumericValue(c) - 10][Integer.parseInt(s22) - 1] = "X";

                    boolean c1 = sea1[3][3].equals("X");
                    boolean c2 = sea1[3][4].equals("X");
                    boolean c3 = sea1[3][5].equals("X");
                    boolean c4 = sea1[2][7].equals("X");
                    boolean c5 = sea1[3][7].equals("X");
                    boolean c6 = sea1[5][2].equals("X");
                    boolean c7 = sea1[5][3].equals("X");
                    boolean c8 = sea1[5][4].equals("X");
                    boolean c9 = sea1[5][5].equals("X");
                    boolean c10 = sea1[5][7].equals("X");
                    boolean c11 = sea1[6][7].equals("X");
                    boolean c12 = sea1[7][7].equals("X");
                    boolean c13 = sea1[7][1].equals("X");
                    boolean c14 = sea1[7][2].equals("X");
                    boolean c15 = sea1[7][3].equals("X");
                    boolean c16 = sea1[7][4].equals("X");
                    boolean c17 = sea1[7][5].equals("X");

                    ship1 = c1 && c2 && c3;
                    ship2 = c4 && c5;
                    ship3 = c6 && c7 && c8 && c9;
                    ship4 = c10 && c11 && c12;
                    ship5 = c13 && c14 && c15 && c16 && c17;


         /*       System.out.println(sea1[3][3]);
                System.out.println(sea1[3][4]);
                System.out.println(sea1[3][5]);*/


                    if (licznik1 < 17) {
                        if (!ship2 && !ship1 && !ship3 && !ship4 && !ship5) {
                            System.out.println("You hit a ship!");
                        } else if (licznik1 < 17 && ship1) {
                            System.out.println("You sank a ship!");
                        } else if (licznik1 < 17 && ship2) {
                            System.out.println("You sank a ship!");
                        } else if (licznik1 < 17 && ship3) {
                            System.out.println("You sank a ship!");
                        } else if (licznik1 < 17 && ship4) {
                            System.out.println("You sank a ship!");
                        } else if (licznik1 < 17 && ship5) {
                            System.out.println("You sank a ship!");
                        }
                        /*createShoot1(arr1);*/
                        System.out.println("Press Enter and pass the move to another player");
                        reader.nextLine();
                        createShoot(arr);

                    }
                }else if (first.matches(reg3) && s22.matches(reg4) && sea1[Character.getNumericValue(c) - 10][Integer.parseInt(s22) - 1].equals("X")) {
                    System.out.println("Wrong coordinates!");
                    System.out.println("Press Enter and pass the move to another player");
                    reader.nextLine();
                    createShoot(arr);
                }

                if (first.matches(reg3) && second.matches(reg2) && sea1[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1].equals("O")) {
                    licznik1++;
                    Main.sea1[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1] = "X";

                    boolean c1 = sea1[3][3].equals("X");
                    boolean c2 = sea1[3][4].equals("X");
                    boolean c3 = sea1[3][5].equals("X");
                    boolean c4 = sea1[2][7].equals("X");
                    boolean c5 = sea1[3][7].equals("X");
                    boolean c6 = sea1[5][2].equals("X");
                    boolean c7 = sea1[5][3].equals("X");
                    boolean c8 = sea1[5][4].equals("X");
                    boolean c9 = sea1[5][5].equals("X");
                    boolean c10 = sea1[5][7].equals("X");
                    boolean c11 = sea1[6][7].equals("X");
                    boolean c12 = sea1[7][7].equals("X");
                    boolean c13 = sea1[7][1].equals("X");
                    boolean c14 = sea1[7][2].equals("X");
                    boolean c15 = sea1[7][3].equals("X");
                    boolean c16 = sea1[7][4].equals("X");
                    boolean c17 = sea1[7][5].equals("X");

                    ship1 = c1 && c2 && c3;
                    ship2 = c4 && c5;
                    ship3 = c6 && c7 && c8 && c9;
                    ship4 = c10 && c11 && c12;
                    ship5 = c13 && c14 && c15 && c16 && c17;


/*
                System.out.println(sea1[3][3]);
                System.out.println(sea1[3][4]);
                System.out.println(sea1[3][5]);*/

                    if (licznik1 < 17) {
                        if (!ship2 && !ship1 && !ship3 && !ship4 && !ship5) {
                            System.out.println("You hit a ship!");
                        } else if (licznik1 < 17 && ship1) {
                            System.out.println("You sank a ship!");
                        } else if (licznik1 < 17 && ship2) {
                            System.out.println("You sank a ship!");
                        } else if (licznik1 < 17 && ship3) {
                            System.out.println("You sank a ship!");
                        } else if (licznik1 < 17 && ship4) {
                            System.out.println("You sank a ship!");
                        } else if (licznik1 < 17 && ship5) {
                            System.out.println("You sank a ship!");
                        }

                        System.out.println("You hit a ship!");
                        /* System.out.println("You sank the last ship. You won. Congratulations!");*/
                        /*createShoot1(arr1);*/
                        System.out.println("Press Enter and pass the move to another player");
                        reader.nextLine();
                        createShoot(arr);
                    }


                }else if (first.matches(reg3) && second.matches(reg2) && sea1[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1].equals("X")) {
                    System.out.println("Wrong coordinates!");
                    System.out.println("Press Enter and pass the move to another player");
                    reader.nextLine();
                    createShoot(arr);
                }





       /*    else if (!first.matches(reg1) || !second.matches(reg2)){


                System.out.println("Error! You entered the wrong coordinates! Try again:");
                createShoot(sea);
            }*/


                /*      System.out.println("You sank the last ship. You won. Congratulations!");*/


            }


        /*printSea(sea);*/
        System.out.println("You sank the last ship. You won. Congratulations!");
        System.exit(0);

    }
}









