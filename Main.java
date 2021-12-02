package battleship;


import java.util.Arrays;
import java.util.Scanner;

import static battleship.Player1.createAircraft;

public class Main {

    public static String[][] sea;
    public static String[][] sea1;

    public static String[][] sol1;
    public static String[][] sol;

    /*    public static String[][] arr1;*/
    /* public static String[][] arr;*/


    public static Scanner reader = new Scanner(System.in);


    static int licznik = 0;
    static int licznik1 = 0;

    static String s22;


    public static void main(String[] args) {
        sea1 = createSea();
        sea = createSea();
        sol = createSea();
        sol1 = createSea();

        System.out.println("Player 1, place your ships on the game field");
        printSea(sea);
        System.out.println("Enter the coordinates of the Aircraft Carrier (5 cells):");
        createAircraft(sea);
        /* System.out.println("Enter the coordinates of the Battleship (4 cells):");*/
        /*createBattleship(sea);*/
    /*    System.out.println("Press Enter and pass the move to another player");
        System.out.println("...");
        System.out.println("Player 2, place your ships to the game field");
        sea1 = createSea();
        printSea(sea1);
        System.out.println("Enter the coordinates of the Aircraft Carrier (5 cells):");
        createAircraft(sea1);*/


    }


    private static void printHeaderSea(int rows) {
        System.out.println();
        for (int i = 0; i < rows + 1; i++) {
            if (i == 0) {
                System.out.print("  ");
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }


    public static void printSea(String[][] arr) {
        printHeaderSea(arr[1].length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(String.valueOf((char) (i + 65)) + " ");
            for (int j = 0; j < arr[1].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printSea1(String[][] arr1) {
        printHeaderSea(arr1[1].length);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(String.valueOf((char) (i + 65)) + " ");
            for (int j = 0; j < arr1[1].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static String[][] createSea() {
        String[][] sea = new String[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                sea[i][j] = "~";
            }
        }

        return sea;
    }
}

   /* private static void createAircraft(String[][] arr) throws ArrayIndexOutOfBoundsException {

        Scanner sca = new Scanner(System.in);
        String air = sca.nextLine();
        char[] chars = air.toCharArray();
        String s = Arrays.toString(chars);
*//*        System.out.println(chars.length);
        System.out.println(s);*//*
 *//*        char c = s.charAt(1);
        char d = s.charAt(4);
        char a = s.charAt(10);
        char b = s.charAt(13);

        String first = s.substring(1, 2);
        String second = s.substring(4, 5);
        String third = s.substring(10, 11);
        String fourth = s.substring(13, 14);*//*
 *//*String five = s.substring(13,15);*//*

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



   *//*     System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);


        System.out.println("==================");*//*


        String reg1 = "[a-jA-J]";
        String reg2 = "([1-9]|10)";

*//*        System.out.println(first.matches(reg1));
        System.out.println(third.matches(reg1));*//*

 *//*  int czwarty = Integer.parseInt(fourth);
        int drugi = Integer.parseInt(second);*//*
        int trzeci = 0;
        int pierwszy = 0;

        String s1 = null;
        String s2 = null;

        String s3 = null;
        String s4 = null;

*//*        System.out.println(pierwszy);
        System.out.println(drugi);
        System.out.println(trzeci);
        System.out.println(czwarty);
        System.out.println("================");
        System.out.println(czwarty - drugi);*//*

 *//*     System.out.println("Takie tam");
        System.out.println(second.equalsIgnoreCase(fourth));
        System.out.println((trzeci - pierwszy) == 4);
        System.out.println(pierwszy);
        System.out.println(trzeci);
        System.out.println(trzeci - pierwszy);*//*
 *//*        System.out.println(second);
        System.out.println(fourth);*//*

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
            *//* char f = s.charAt(16);*//*
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

   *//*     System.out.println(c);
        System.out.println(d);
        System.out.println(a);
        System.out.println(b);
        System.out.println("===========");
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
        System.out.println("==========");
        System.out.println(pierwszy);
        System.out.println(drugi);
        System.out.println(trzeci);
        System.out.println(czwarty);*//*


        boolean is = false;
        if (czwarty > drugi) {
            while (!is) {
                //Przypadek dla a1 a5
                if (first.matches(reg1) && third.matches(reg1) &&
                        second.matches(reg2)) {
                    if (fourth.matches(reg2)) {
                        if (first.equalsIgnoreCase(third) && !second.equalsIgnoreCase(fourth)) {

                            if ((czwarty - drugi) == 4 && s.length() == 15) {
                                s5 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1] = "O";
                                s6 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(second)] = "O";
                                s7 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 1] = "O";
                                s8 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 2] = "O";
                                s9 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 3] = "O";


                                printSea(arr);
                                is = true;
                                System.out.println("Enter the coordinates of the Battleship (4 cells):");
                                createBattleship(sea);


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
                                s5 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1] = "O";
                                s6 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(second)] = "O";
                                s7 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 1] = "O";
                                s8 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 2] = "O";
                                s9 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 3] = "O";


                                printSea(arr);
                                is = true;
                                System.out.println("Enter the coordinates of the Battleship (4 cells):");
                                createBattleship(sea);


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
                        s5 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1] = "O";
                        s6 = arr[Character.getNumericValue(c) - 9][Integer.parseInt(second) - 1] = "O";
                        s7 = arr[Character.getNumericValue(c) - 8][Integer.parseInt(second) - 1] = "O";
                        s8 = arr[Character.getNumericValue(c) - 7][Integer.parseInt(second) - 1] = "O";
                        s9 = arr[Character.getNumericValue(c) - 6][Integer.parseInt(second) - 1] = "O";

                        printSea(arr);
                        is = true;

                        System.out.println("Enter the coordinates of the Battleship (4 cells):");
                        createBattleship(sea);

                    }


                    //Przypadek typu a10 e10, to działało i nie było elementu z s.length()
                    if ((trzeci - pierwszy) == 4 && s.length() == 21) {
                        s5 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(s2) - 1] = "O";
                        s6 = arr[Character.getNumericValue(c) - 9][Integer.parseInt(s2) - 1] = "O";
                        s7 = arr[Character.getNumericValue(c) - 8][Integer.parseInt(s2) - 1] = "O";
                        s8 = arr[Character.getNumericValue(c) - 7][Integer.parseInt(s2) - 1] = "O";
                        s9 = arr[Character.getNumericValue(c) - 6][Integer.parseInt(s2) - 1] = "O";

                        printSea(arr);
                        is = true;

                        System.out.println("Enter the coordinates of the Battleship (4 cells):");
                        createBattleship(sea);

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
                                s5 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) - 1] = "O";
                                s6 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth)] = "O";
                                s7 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 1] = "O";
                                s8 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 2] = "O";
                                s9 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 3] = "O";


                                printSea(arr);
                                is = true;
                                System.out.println("Enter the coordinates of the Battleship (4 cells):");
                                createBattleship(sea);


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
                                s5 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) - 1] = "O";
                                s6 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth)] = "O";
                                s7 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 1] = "O";
                                s8 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 2] = "O";
                                s9 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 3] = "O";


                                printSea(arr);
                                is = true;
                                System.out.println("Enter the coordinates of the Battleship (4 cells):");
                                createBattleship(sea);


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
                        s5 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) - 1] = "O";
                        s6 = arr[Character.getNumericValue(c) - 9][Integer.parseInt(fourth) - 1] = "O";
                        s7 = arr[Character.getNumericValue(c) - 8][Integer.parseInt(fourth) - 1] = "O";
                        s8 = arr[Character.getNumericValue(c) - 7][Integer.parseInt(fourth) - 1] = "O";
                        s9 = arr[Character.getNumericValue(c) - 6][Integer.parseInt(fourth) - 1] = "O";

                        printSea(arr);
                        is = true;

                        System.out.println("Enter the coordinates of the Battleship (4 cells):");
                        createBattleship(sea);

                    }


                    //Przypadek typu a10 e10, to działało i nie było elementu z s.length()
                    if ((trzeci - pierwszy) == 4 && s.length() == 21) {
                        s5 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(s4) - 1] = "O";
                        s6 = arr[Character.getNumericValue(c) - 9][Integer.parseInt(s4) - 1] = "O";
                        s7 = arr[Character.getNumericValue(c) - 8][Integer.parseInt(s4) - 1] = "O";
                        s8 = arr[Character.getNumericValue(c) - 7][Integer.parseInt(s4) - 1] = "O";
                        s9 = arr[Character.getNumericValue(c) - 6][Integer.parseInt(s4) - 1] = "O";

                        printSea(arr);
                        is = true;

                        System.out.println("Enter the coordinates of the Battleship (4 cells):");
                        createBattleship(sea);

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

        createAircraft(arr);


    }


    private static void createBattleship(String[][] arr) throws ArrayIndexOutOfBoundsException {
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


*//*        System.out.println(pierwszy);
        System.out.println(drugi);
        System.out.println(trzeci);
        System.out.println(czwarty);*//*


        boolean is = false;
        if (czwarty > drugi) {
            while (!is) {
                *//*  assert first != null;*//*
                //Case a1 a5
                if (first.matches(reg1) && third.matches(reg1) &&
                        second.matches(reg2)) {
                    if (fourth.matches(reg2)) {
                        if (first.equalsIgnoreCase(third) && second.equalsIgnoreCase(fourth)) {
                            if ((czwarty - drugi) == 3 && s.length() == 15) {
                                s10 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1] = "O";
                                s11 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(second)] = "O";
                                s12 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 1] = "O";
                                s13 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 2] = "O";
                                *//*      arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 3] = "O";*//*


                                printSea(arr);
                                is = true;
                                System.out.println("Enter the coordinates of the Submarine (3 cells):");
                                createSubmarine(sea);


                            }
                            if ((czwarty - drugi) != 3) {


                                System.out.println("Error! Wrong length of the Battleship! Try again:");
                                break;

                            }
                        }
                        if (!second.equalsIgnoreCase(fourth)) {
                            System.out.println("Error! Wrong ship location! Try again:");

                            break;
                        }
                    }
                    //Case a6 a10

                    if (s2 != null) {
                        if (first.equalsIgnoreCase(third)) {
                            if ((czwarty - drugi) == 3 && s.length() == 18) {
                                s10 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1] = "O";
                                s11 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(second)] = "O";
                                s12 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 1] = "O";
                                s13 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 2] = "O";
                                *//*      arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 3] = "O";*//*


                                printSea(arr);
                                is = true;
                                System.out.println("Enter the coordinates of the Submarine (3 cells):");
                                createSubmarine(sea);


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
                }
//Przypadek typu a1 e1
                if (second.equalsIgnoreCase(fourth)) {
                    if ((trzeci - pierwszy) == 3 && s.length() == 15) {
                        s10 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1] = "O";
                        s11 = arr[Character.getNumericValue(c) - 9][Integer.parseInt(second) - 1] = "O";
                        s12 = arr[Character.getNumericValue(c) - 8][Integer.parseInt(second) - 1] = "O";
                        s13 = arr[Character.getNumericValue(c) - 7][Integer.parseInt(second) - 1] = "O";
                        *//*             arr[Character.getNumericValue(c) - 6][Integer.parseInt(second) - 1] = "O";*//*

                        printSea(arr);
                        is = true;
                        System.out.println("Enter the coordinates of the Submarine (3 cells):");
                        createSubmarine(sea);

                    }
                    //Przypadek a10 e10

                    if ((trzeci - pierwszy) == 3 && s.length() == 21) {
                        s10 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(s2) - 1] = "O";
                        s11 = arr[Character.getNumericValue(c) - 9][Integer.parseInt(s2) - 1] = "O";
                        s12 = arr[Character.getNumericValue(c) - 8][Integer.parseInt(s2) - 1] = "O";
                        s13 = arr[Character.getNumericValue(c) - 7][Integer.parseInt(s2) - 1] = "O";
                        *//*             arr[Character.getNumericValue(c) - 6][Integer.parseInt(second) - 1] = "O";*//*

                        printSea(arr);
                        is = true;
                        System.out.println("Enter the coordinates of the Submarine (3 cells):");
                        createSubmarine(sea);

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
                                s10 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) - 1] = "O";
                                s11 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth)] = "O";
                                s12 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 1] = "O";
                                s13 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 2] = "O";
                                *//*arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 3] = "O";*//*


                                printSea(arr);
                                is = true;
                                System.out.println("Enter the coordinates of the Submarine (3 cells):");
                                createSubmarine(sea);


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
                                s10 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) - 1] = "O";
                                s11 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth)] = "O";
                                s12 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 1] = "O";
                                s13 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 2] = "O";
                                *//*arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 3] = "O";*//*


                                printSea(arr);
                                is = true;
                                System.out.println("Enter the coordinates of the Submarine (3 cells):");
                                createSubmarine(sea);


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
                        s10 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) - 1] = "O";
                        s11 = arr[Character.getNumericValue(c) - 9][Integer.parseInt(fourth) - 1] = "O";
                        s12 = arr[Character.getNumericValue(c) - 8][Integer.parseInt(fourth) - 1] = "O";
                        s13 = arr[Character.getNumericValue(c) - 7][Integer.parseInt(fourth) - 1] = "O";
                        *//* arr[Character.getNumericValue(c) - 6][Integer.parseInt(fourth) - 1] = "O";*//*

                        printSea(arr);
                        is = true;

                        System.out.println("Enter the coordinates of the Submarine (3 cells):");
                        createSubmarine(sea);

                    }


                    //Przypadek typu a10 e10, to działało i nie było elementu z s.length()
                    if ((trzeci - pierwszy) == 3 && s.length() == 21) {
                        s10 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(s4) - 1] = "O";
                        s11 = arr[Character.getNumericValue(c) - 9][Integer.parseInt(s4) - 1] = "O";
                        s12 = arr[Character.getNumericValue(c) - 8][Integer.parseInt(s4) - 1] = "O";
                        s13 = arr[Character.getNumericValue(c) - 7][Integer.parseInt(s4) - 1] = "O";
                        *//*   arr[Character.getNumericValue(c) - 6][Integer.parseInt(s4) - 1] = "O";*//*

                        printSea(arr);
                        is = true;

                        System.out.println("Enter the coordinates of the Submarine (3 cells):");
                        createSubmarine(sea);

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


        createBattleship(arr);

    }

    private static void createSubmarine(String[][] arr) throws ArrayIndexOutOfBoundsException {
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


*//*        System.out.println(first.matches(reg1));
        System.out.println(third.matches(reg1));*//*

        int trzeci = 0;
        int pierwszy = 0;
*//*        System.out.println(pierwszy);
        System.out.println(drugi);
        System.out.println(trzeci);
        System.out.println(czwarty);
        System.out.println("================");
        System.out.println(czwarty - drugi);*//*

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
                                s14 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1] = "O";
                                s15 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(second)] = "O";
                                s16 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 1] = "O";
                                *//*    arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 2] = "O";*//*
 *//*      arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 3] = "O";*//*


                                printSea(arr);
                                is = true;
                                System.out.println("Enter the coordinates of the Cruiser (3 cells):");
                                createCruiser(sea);


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
                                s14 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1] = "O";
                                s15 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(second)] = "O";
                                s16 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 1] = "O";
                                *//*    arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 2] = "O";*//*
 *//*      arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 3] = "O";*//*


                                printSea(arr);
                                is = true;
                                System.out.println("Enter the coordinates of the Cruiser (3 cells):");
                                createCruiser(sea);


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
                        s14 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1] = "O";
                        s15 = arr[Character.getNumericValue(c) - 9][Integer.parseInt(second) - 1] = "O";
                        s16 = arr[Character.getNumericValue(c) - 8][Integer.parseInt(second) - 1] = "O";
                        *//*        arr[Character.getNumericValue(c) - 7][Integer.parseInt(second) - 1] = "O";*//*
 *//*             arr[Character.getNumericValue(c) - 6][Integer.parseInt(second) - 1] = "O";*//*

                        printSea(arr);
                        is = true;
                        System.out.println("Enter the coordinates of the Cruiser (3 cells):");
                        createCruiser(sea);

                    }

                    if ((trzeci - pierwszy) == 2 && s.length() == 21) {
                        arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1] = "O";
                        arr[Character.getNumericValue(c) - 9][Integer.parseInt(second) - 1] = "O";
                        arr[Character.getNumericValue(c) - 8][Integer.parseInt(second) - 1] = "O";
                        *//*        arr[Character.getNumericValue(c) - 7][Integer.parseInt(second) - 1] = "O";*//*
 *//*             arr[Character.getNumericValue(c) - 6][Integer.parseInt(second) - 1] = "O";*//*

                        printSea(arr);
                        is = true;
                        System.out.println("Enter the coordinates of the Cruiser (3 cells):");
                        createCruiser(sea);

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
                                s14 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) - 1] = "O";
                                s15 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth)] = "O";
                                s16 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 1] = "O";
                                   *//* arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 2] = "O";
                                    arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 3] = "O";*//*


                                printSea(arr);
                                is = true;
                                System.out.println("Enter the coordinates of the Cruiser (3 cells):");
                                createCruiser(sea);


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
                                s14 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) - 1] = "O";
                                s15 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth)] = "O";
                                s16 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 1] = "O";
                                   *//* arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 2] = "O";
                                    arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 3] = "O";*//*


                                printSea(arr);
                                is = true;
                                System.out.println("Enter the coordinates of the Cruiser (3 cells):");
                                createCruiser(sea);


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
                        s14 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) - 1] = "O";
                        s15 = arr[Character.getNumericValue(c) - 9][Integer.parseInt(fourth) - 1] = "O";
                        s16 = arr[Character.getNumericValue(c) - 8][Integer.parseInt(fourth) - 1] = "O";
                         *//*   arr[Character.getNumericValue(c) - 7][Integer.parseInt(fourth) - 1] = "O";
                            arr[Character.getNumericValue(c) - 6][Integer.parseInt(fourth) - 1] = "O";
*//*
                        printSea(arr);
                        is = true;

                        System.out.println("Enter the coordinates of the Cruiser (3 cells):");
                        createCruiser(sea);

                    }


                    //Przypadek typu a10 e10, to działało i nie było elementu z s.length()
                    if ((trzeci - pierwszy) == 2 && s.length() == 21) {
                        s14 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(s4) - 1] = "O";
                        s15 = arr[Character.getNumericValue(c) - 9][Integer.parseInt(s4) - 1] = "O";
                        s16 = arr[Character.getNumericValue(c) - 8][Integer.parseInt(s4) - 1] = "O";
                      *//*      arr[Character.getNumericValue(c) - 7][Integer.parseInt(s4) - 1] = "O";
                            arr[Character.getNumericValue(c) - 6][Integer.parseInt(s4) - 1] = "O";*//*

                        printSea(arr);
                        is = true;

                        System.out.println("Enter the coordinates of the Cruiser (3 cells):");
                        createCruiser(sea);

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
        }


        createSubmarine(arr);

    }

    private static void createDestroyer(String[][] arr) {
        Scanner sca = new Scanner(System.in);
        String air = sca.nextLine();
        char[] chars = air.toCharArray();
        String s = Arrays.toString(chars);

        String[][] sea1 = new String[0][];

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


    *//*    System.out.println(first.matches(reg1));
        System.out.println(third.matches(reg1));*//*

 *//* czwarty = Integer.parseInt(fourth);
        drugi = Integer.parseInt(second);*//*
        int trzeci = 0;
        int pierwszy = 0;
     *//*   System.out.println(pierwszy);
        System.out.println(drugi);
        System.out.println(trzeci);
        System.out.println(czwarty);
        System.out.println("================");
        System.out.println(czwarty - drugi);*//*

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
            *//* char f = s.charAt(16);*//*
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
                                s20 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1] = "O";
                                s21 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(second)] = "O";
                                *//*          arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 1] = "O";*//*
 *//*    arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 2] = "O";*//*
 *//*      arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 3] = "O";*//*


                                printSea(arr);
                                is = true;
                     *//*   System.out.println("Enter the coordinates of the Destroyer (3 cells):");
                        createDestroyer(sea);*//*

                                System.out.println("Press Enter and pass the move to another player");
                                reader.nextLine();
                                System.out.println("Player 2, place your ships to the game field");
                                sea1 = createSea();
                                printSea(sea1);
                                System.out.println("Enter the coordinates of the Aircraft Carrier (5 cells):");
                                createAircraft(sea1);


                                *//*System.out.println("The game starts!");
                                sea = createSea();
                                printSea(sea);
                                System.out.println("Take a shoot!");
                                createShoot(arr);*//*


                            }
                            if ((czwarty - drugi) != 1) {
                                System.out.println("Error! Wrong length of the Destroyer! Try again:");
                                *//*   System.out.println("jan");*//*
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
                                s20 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1] = "O";
                                s21 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(second)] = "O";
                                *//*          arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 1] = "O";*//*
 *//*    arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 2] = "O";*//*
 *//*      arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 3] = "O";*//*


                                printSea(arr);
                                is = true;
                     *//*   System.out.println("Enter the coordinates of the Destroyer (3 cells):");
                        createDestroyer(sea);*//*
                                System.out.println("Press Enter and pass the move to another player");
                                reader.nextLine();
                                System.out.println("Player 2, place your ships to the game field");
                                sea1 = createSea();
                                printSea(sea1);
                                System.out.println("Enter the coordinates of the Aircraft Carrier (5 cells):");
                                createAircraft(sea1);

                             *//*   System.out.println("The game starts!");
                                sea = createSea();
                                printSea(sea);
                                System.out.println("Take a shoot!");
                                createShoot(arr);*//*


                            }
                            if ((czwarty - drugi) != 1) {
                                System.out.println("Error! Wrong length of the Destroyer! Try again:");
                                *//*            System.out.println("tam");*//*
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
                        s20 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1] = "O";
                        s21 = arr[Character.getNumericValue(c) - 9][Integer.parseInt(second) - 1] = "O";
                        *//*        arr[Character.getNumericValue(c) - 8][Integer.parseInt(second) - 1] = "O";*//*
 *//*                 arr[Character.getNumericValue(c) - 7][Integer.parseInt(second) - 1] = "O";*//*
 *//*             arr[Character.getNumericValue(c) - 6][Integer.parseInt(second) - 1] = "O";*//*


                        printSea(arr);
                        is = true;

                        System.out.println("Press Enter and pass the move to another player");
                        reader.nextLine();
                        System.out.println("Player 2, place your ships to the game field");
                        sea1 = createSea();
                        printSea(sea1);
                        System.out.println("Enter the coordinates of the Aircraft Carrier (5 cells):");
                        createAircraft(sea1);

                   *//*     System.out.println("The game starts!");
                        sea = createSea();
                        printSea(sea);
                        System.out.println("Take a shoot!");
                        createShoot(arr);*//*

                    }

                    if ((trzeci - pierwszy) == 1 && s.length() == 21) {
                        s20 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(s2) - 1] = "O";
                        s21 = arr[Character.getNumericValue(c) - 9][Integer.parseInt(s2) - 1] = "O";
                        *//*        arr[Character.getNumericValue(c) - 8][Integer.parseInt(second) - 1] = "O";*//*
 *//*                 arr[Character.getNumericValue(c) - 7][Integer.parseInt(second) - 1] = "O";*//*
 *//*             arr[Character.getNumericValue(c) - 6][Integer.parseInt(second) - 1] = "O";*//*


                        printSea(arr);
                        is = true;

                        System.out.println("Press Enter and pass the move to another player");
                        reader.nextLine();
                        System.out.println("Player 2, place your ships to the game field");
                        sea1 = createSea();
                        printSea(sea1);
                        System.out.println("Enter the coordinates of the Aircraft Carrier (5 cells):");
                        createAircraft(sea1);

              *//*          System.out.println("The game starts!");
                        sea = createSea();
                        printSea(sea);
                        System.out.println("Take a shoot!");
                        createShoot(arr);*//*

                    }
                    if ((trzeci - pierwszy) != 1) {
                        System.out.println("Error! Wrong length of the Destroyer! Try again:");
                        *//*   System.out.println("jak");*//*
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
                                s20 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) - 1] = "O";
                                s21 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth)] = "O";
                                       *//* arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 1] = "O";
                                        arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 2] = "O";
                                        arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 3] = "O";*//*


                                printSea(arr);
                                is = true;

                                System.out.println("Press Enter and pass the move to another player");
                                reader.nextLine();
                                System.out.println("Player 2, place your ships to the game field");
                                sea1 = createSea();
                                printSea(sea1);
                                System.out.println("Enter the coordinates of the Aircraft Carrier (5 cells):");
                                createAircraft(sea1);

                             *//*   System.out.println("The game starts!");
                                sea = createSea();
                                printSea(sea);
                                System.out.println("Take a shoot!");
                                createShoot(arr);*//*


                            }

                            if ((drugi - czwarty) != 1) {
                                System.out.println("Error! Wrong length of the Destroyer! Try again:");
                                *//* System.out.println("czy");*//*
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
                        *//*   System.out.println("Case a10 a6");*//*

                        if (first.equalsIgnoreCase(third) && !second.equalsIgnoreCase(fourth)) {
                            if ((drugi - czwarty) == 1 && s.length() == 18 && s.charAt(7) == '0') {
                                s20 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) - 1] = "O";
                                s21 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth)] = "O";
                                      *//*  arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 1] = "O";
                                        arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 2] = "O";
                                        arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 3] = "O";*//*


                                printSea(arr);
                                is = true;

                                System.out.println("Press Enter and pass the move to another player");
                                reader.nextLine();
                                System.out.println("Player 2, place your ships to the game field");
                                sea1 = createSea();
                                printSea(sea1);
                                System.out.println("Enter the coordinates of the Aircraft Carrier (5 cells):");
                                createAircraft(sea1);

                           *//*     System.out.println("The game starts!");
                                sea = createSea();
                                printSea(sea);
                                System.out.println("Take a shoot!");
                                createShoot(arr);*//*


                            }

                            if ((drugi - czwarty) != 1) {
                                System.out.println("Error! Wrong length of the Destroyer! Try again:");
                                *//*  System.out.println("gdzies");*//*
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
                        s20 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) - 1] = "O";
                        s21 = arr[Character.getNumericValue(c) - 9][Integer.parseInt(fourth) - 1] = "O";
                           *//*     arr[Character.getNumericValue(c) - 8][Integer.parseInt(fourth) - 1] = "O";
                                arr[Character.getNumericValue(c) - 7][Integer.parseInt(fourth) - 1] = "O";
                                arr[Character.getNumericValue(c) - 6][Integer.parseInt(fourth) - 1] = "O";*//*

                        printSea(arr);
                        is = true;

                        System.out.println("Press Enter and pass the move to another player");
                        reader.nextLine();
                        System.out.println("Player 2, place your ships to the game field");
                        sea1 = createSea();
                        printSea(sea1);
                        System.out.println("Enter the coordinates of the Aircraft Carrier (5 cells):");
                        createAircraft(sea1);

                       *//* System.out.println("The game starts!");
                        sea = createSea();
                        printSea(sea);
                        System.out.println("Take a shoot!");
                        createShoot(arr);*//*

                    }


                    //Przypadek typu a10 e10, to działało i nie było elementu z s.length()
                    if ((trzeci - pierwszy) == 1 && s.length() == 21) {
                        s20 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(s4) - 1] = "O";
                        s21 = arr[Character.getNumericValue(c) - 9][Integer.parseInt(s4) - 1] = "O";
                             *//*   arr[Character.getNumericValue(c) - 8][Integer.parseInt(s4) - 1] = "O";
                                arr[Character.getNumericValue(c) - 7][Integer.parseInt(s4) - 1] = "O";
                                arr[Character.getNumericValue(c) - 6][Integer.parseInt(s4) - 1] = "O";
*//*
                        printSea(arr);
                        is = true;

                        System.out.println("Press Enter and pass the move to another player");
                        reader.nextLine();
                        System.out.println("Player 2, place your ships to the game field");
                        sea1 = createSea();
                        printSea(sea1);
                        System.out.println("Enter the coordinates of the Aircraft Carrier (5 cells):");
                        createAircraft(sea1);

                     *//*   System.out.println("The game starts!");
                        sea = createSea();
                        printSea(sea);
                        System.out.println("Take a shoot!");
                        createShoot(arr);*//*
                    }

                    if ((trzeci - pierwszy) != 1) {
                        System.out.println("Error! Wrong length of the Destroyer! Try again:");
                        *//*System.out.println("cps");*//*
                        break;

                    }
                }
                if (!first.equalsIgnoreCase(third) && !is) {
                    System.out.println("Error! Wrong ship location! Try again:");

                    break;
                }
            }
        }
        createDestroyer(arr);
    }




*//*
        createDestroyer(arr);
        System.exit(0);*//*


    private static void createCruiser(String[][] arr) throws ArrayIndexOutOfBoundsException {
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


        *//*  System.out.println("==================");
 *//*
        String reg1 = "[a-jA-J]";
        String reg2 = "([1-9]|10)";


*//*        System.out.println(first.matches(reg1));
        System.out.println(third.matches(reg1));*//*

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
            *//* char f = s.charAt(16);*//*
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


   *//*     System.out.println(pierwszy);
        System.out.println(drugi);
        System.out.println(trzeci);
        System.out.println(czwarty);
        System.out.println("================");
        System.out.println(czwarty - drugi);*//*


        boolean is = false;
        if (czwarty > drugi) {
            while (!is) {
                if (first.matches(reg1) && third.matches(reg1) &&
                        second.matches(reg2)) {
                    if (fourth.matches(reg2)) {
                        if (first.equalsIgnoreCase(third) && !second.equalsIgnoreCase(fourth)) {
                            if ((czwarty - drugi) == 2 && s.length() == 15) {
                                s17 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1] = "O";
                                s18 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(second)] = "O";
                                s19 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 1] = "O";
                                *//*    arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 2] = "O";*//*
 *//*      arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 3] = "O";*//*


                                printSea(arr);
                                is = true;
                                System.out.println("Enter the coordinates of the Destroyer (2 cells):");
                                createDestroyer(sea);


                            }
                            if ((czwarty - drugi) != 2) {
                                System.out.println("Error! Wrong length of the Cruiser! Try again:");
                                *//* System.out.println("zzzzzz");*//*
                                break;

                            }
                        }
                        if (!second.equalsIgnoreCase(fourth)) {
                            System.out.println("Error! Wrong ship location! Try again:");
                            *//*         System.out.println("wwwww");*//*

                            break;
                        }
                    }

                    if (s2 != null) {
                        if (first.equalsIgnoreCase(third)) {
                            if ((czwarty - drugi) == 2 && s.length() == 18) {
                                s17 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1] = "O";
                                s18 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(second)] = "O";
                                s19 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 1] = "O";
                                *//*    arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 2] = "O";*//*
 *//*      arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 3] = "O";*//*


                                printSea(arr);
                                is = true;
                                System.out.println("Enter the coordinates of the Destroyer (2 cells):");
                                createDestroyer(sea);


                            }
                            if ((czwarty - drugi) != 2) {
                                System.out.println("Error! Wrong length of the Cruiser! Try again:");
                                *//* System.out.println("rrrrrrr");*//*
                                break;

                            }
                        }
                        if (!second.equalsIgnoreCase(s2)) {
                            System.out.println("Error! Wrong ship location! Try again:");
                            *//*   System.out.println("gggggg");*//*

                            break;
                        }
                    }
                }
                if (second.equalsIgnoreCase(fourth)) {
                    if ((trzeci - pierwszy) == 2 && s.length() == 15) {
                        s17 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1] = "O";
                        s18 = arr[Character.getNumericValue(c) - 9][Integer.parseInt(second) - 1] = "O";
                        s19 = arr[Character.getNumericValue(c) - 8][Integer.parseInt(second) - 1] = "O";
                        *//*                 arr[Character.getNumericValue(c) - 7][Integer.parseInt(second) - 1] = "O";*//*
 *//*             arr[Character.getNumericValue(c) - 6][Integer.parseInt(second) - 1] = "O";*//*

                        printSea(arr);
                        is = true;
                        System.out.println("Enter the coordinates of the Destroyer (2 cells):");
                        createDestroyer(sea);

                    }

                    if ((trzeci - pierwszy) == 2 && s.length() == 21) {
                        s17 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(s2) - 1] = "O";
                        s18 = arr[Character.getNumericValue(c) - 9][Integer.parseInt(s2) - 1] = "O";
                        s19 = arr[Character.getNumericValue(c) - 8][Integer.parseInt(s2) - 1] = "O";
                        *//*                 arr[Character.getNumericValue(c) - 7][Integer.parseInt(second) - 1] = "O";*//*
 *//*             arr[Character.getNumericValue(c) - 6][Integer.parseInt(second) - 1] = "O";*//*

                        printSea(arr);
                        is = true;
                        System.out.println("Enter the coordinates of the Destroyer (2 cells):");
                        createDestroyer(sea);

                    }
                    if ((trzeci - pierwszy) != 2) {
                        System.out.println("Error! Wrong length of the Cruiser! Try again:");
                        *//*   System.out.println("xxxxx");*//*
                        break;

                    }
                }
                if (!first.equalsIgnoreCase(third) && !is) {
                    System.out.println("Error! Wrong ship location! Try again:");
                    *//*   System.out.println("yyyyyy");*//*

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
                                s17 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) - 1] = "O";
                                s18 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth)] = "O";
                                s19 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 1] = "O";
                             *//*   arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 2] = "O";
                                arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 3] = "O";*//*


                                printSea(arr);
                                is = true;
                                System.out.println("Enter the coordinates of the Destroyer (2 cells):");
                                createDestroyer(sea);


                            }

                            if ((drugi - czwarty) != 2) {
                                System.out.println("Error! Wrong length of the Cruiser! Try again:");
                                break;

                            }
                        }

                        if (!second.equalsIgnoreCase(fourth)) {
                            System.out.println("Error! Wrong ship location! Try again:");
                            *//* System.out.println("hhhhh");*//*

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
                                s17 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) - 1] = "O";
                                s18 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth)] = "O";
                                s19 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 1] = "O";
                              *//*  arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 2] = "O";
                                arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) + 3] = "O";*//*


                                printSea(arr);
                                is = true;
                                System.out.println("Enter the coordinates of the Destroyer (2 cells):");
                                createDestroyer(sea);


                            }

                            if ((drugi - czwarty) != 2) {
                                System.out.println("Error! Wrong length of the Cruiser! Try again:");
                                *//*    System.out.println("aaaa");*//*
                                break;

                            }
                        }

                        if (!second.equalsIgnoreCase(s2)) {
                            System.out.println("Error! Wrong ship location! Try again:");
                            *//*    System.out.println("bbbbb");*//*

                            break;
                        }

                    }
                }


                if (second.equalsIgnoreCase(fourth)) {


                    //Przypadek typu a1 e1

                    if ((trzeci - pierwszy) == 2 && s.length() == 15) {
                        s17 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(fourth) - 1] = "O";
                        s18 = arr[Character.getNumericValue(c) - 9][Integer.parseInt(fourth) - 1] = "O";
                        s19 = arr[Character.getNumericValue(c) - 8][Integer.parseInt(fourth) - 1] = "O";
                       *//* arr[Character.getNumericValue(c) - 7][Integer.parseInt(fourth) - 1] = "O";
                        arr[Character.getNumericValue(c) - 6][Integer.parseInt(fourth) - 1] = "O";*//*

                        printSea(arr);
                        is = true;

                        System.out.println("Enter the coordinates of the Destroyer (2 cells):");
                        createDestroyer(sea);

                    }


                    //Przypadek typu a10 e10, to działało i nie było elementu z s.length()
                    if ((trzeci - pierwszy) == 2 && s.length() == 21) {
                        s17 = arr[Character.getNumericValue(c) - 10][Integer.parseInt(s4) - 1] = "O";
                        s18 = arr[Character.getNumericValue(c) - 9][Integer.parseInt(s4) - 1] = "O";
                        s19 = arr[Character.getNumericValue(c) - 8][Integer.parseInt(s4) - 1] = "O";
                       *//* arr[Character.getNumericValue(c) - 7][Integer.parseInt(s4) - 1] = "O";
                        arr[Character.getNumericValue(c) - 6][Integer.parseInt(s4) - 1] = "O";*//*

                        printSea(arr);
                        is = true;

                        System.out.println("Enter the coordinates of the Destroyer (2 cells):");
                        createDestroyer(sea);

                    }

                    if ((trzeci - pierwszy) != 2) {
                        System.out.println("Error! Wrong length of the Cruiser! Try again:");
                        *//* System.out.println("cccccc");*//*
                        break;

                    }
                }
                if (!first.equalsIgnoreCase(third) && !is) {
                    System.out.println("Error! Wrong ship location! Try again:");
                    *//*         System.out.println("dddddd");*//*

                    break;
                }
            }
        }


        createCruiser(arr);
    }

    private static void createShoot(String[][] arr) throws NullPointerException {
        Scanner sca = new Scanner(System.in);
        String air = sca.nextLine();
        char[] chars = air.toCharArray();
        String s = Arrays.toString(chars);
        boolean is = false;
        String reg1 = "[a-jA-J]";
        String reg2 = "([1-9]|10)";
        String reg3 = "(j|J)";
        String reg4 = "(10)";


        String[][] sea1 = new String[sea.length][];


        char c = 0;
        char d = 0;

        String first = null;
        String second = null;


        int pierwszy = 0;


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

        //Przypadek typu j10
   *//*     if (s.length() == 9 && s.charAt(2) == ',' && s.charAt(3) == ' ' && s.charAt(5) == ',' && s.charAt(6) == ' ') {
            c = s.charAt(1);
            d = s.charAt(4);
            first = s.substring(1, 2);
            second = s.substring(4, 8);
            String s4 = second.replace(",", "");
            s22 = s4.replace(" ", "");
            pierwszy = Character.getNumericValue(c) - 9;

        }*//*


 *//*      jeden = sea[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1].equals("X");
        dwa = sea[Character.getNumericValue(c) - 10][Integer.parseInt(second)].equals("X");
        trzy = sea[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 1].equals("X");
        cztery = sea[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 2].equals("X");
        piec = sea[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 3].equals("X");
        szesc = arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1].equals("O");
        siedem = arr[Character.getNumericValue(c) - 10][Integer.parseInt(second)].equals("O");
        osiem = arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 1].equals("O");
        dziewiec = arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 2].equals("O");
        dziesiec = arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) + 3].equals("O");*//*

 *//* while (licznik < 17) {*//*
        if (licznik < 18) {
            if (first.matches(reg1) && second.matches(reg2) && arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1].equals("O")) {
                licznik++;
                sea[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1] = "X";
                printSea(sea);


                *//* if (licznik < 17) {*//*
 *//*  System.out.println("You hit a ship! Try again:");
                  createShoot(arr);*//*
 *//*   }*//*

                if(licznik == 18){
                    System.out.println("You sank the last ship. You won. Congratulations!");
                    System.exit(0);
                }else
                    System.out.println("You hit a ship! Try again:");
                createShoot(arr);



            }

            if (first.equals("g") && second.equals("8") && arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1].equals("~")) {

                sea[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1] = "M";
                printSea(sea);
                System.out.println("You missed. Try again:");
                createShoot(arr);
            }

       *//*     if (first.equals("j") && second.equals("3") && arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1].equals("O")) {
                licznik++;
                sea[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1] = "X";
                printSea(sea);
             *//**//*   System.out.println("You missed. Try again:");
                createShoot(arr);*//**//*
            }*//*


            if (first.matches(reg1) && second.matches(reg2) && arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1].equals("~")) {

                sea[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1] = "M";
                printSea(sea);
                *//*System.out.println("You missed. Try again:");*//*
 *//*createShoot(arr);*//*
                if (licznik < 17) {
                    System.out.println("You missed. Try again:");
                    createShoot(arr);
                }
            }


            if (first.matches(reg1) && s22.matches(reg2) && arr[Character.getNumericValue(c) - 10][Integer.parseInt(s22) - 1].equals("~") && !second.equals("10")) {

                sea[Character.getNumericValue(c) - 10][Integer.parseInt(s22) - 1] = "M";
                printSea(sea);
                System.out.println("You missed. Try again:");
                createShoot(arr);
                 *//*   if (licznik < 17) {
                        System.out.println("You missed. Try again:");
                        createShoot(arr);
                    }*//*
            }


            if (first.matches(reg3) && s22.matches(reg4) && arr[Character.getNumericValue(c) - 10][Integer.parseInt(s22) - 1].equals("O")) {
                licznik++;
                sea[Character.getNumericValue(c) - 10][Integer.parseInt(s22) - 1] = "X";
                printSea(sea);

                if (licznik < 17) {
                    System.out.println("You hit a ship! Try again:");

                    createShoot(arr);

                }

            }

            if (first.matches(reg3) && second.matches(reg2) && arr[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1].equals("O")) {
                licznik++;
                sea[Character.getNumericValue(c) - 10][Integer.parseInt(second) - 1] = "X";
                printSea(sea);

                if (licznik < 17) {
                    System.out.println("You hit a ship! Try again:");
                    *//* System.out.println("You sank the last ship. You won. Congratulations!");*//*
                    createShoot(arr);


                }


            }





       *//*    else if (!first.matches(reg1) || !second.matches(reg2)){


                System.out.println("Error! You entered the wrong coordinates! Try again:");
                createShoot(sea);
            }*//*


 *//*      System.out.println("You sank the last ship. You won. Congratulations!");*//*


        }


        *//*printSea(sea);*//*
        System.out.println("You sank the last ship. You won. Congratulations!");
        System.exit(0);

    }
}
*/