/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author hoadoan
 */
public class Utils {

    public static final int MIN = 1;
    public static final int MAX = 100;

    public static String getString(String welcome) {
        String result = "";
        boolean checkLoop = true;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print(welcome);
            result = sc.nextLine();
            if (result.isEmpty()) {
                System.out.println("Must input!");
            } else {
                checkLoop = false;
            }
        } while (checkLoop);
        return result;
    }

    public static String getDateYear() {
        LocalDate currentDate = LocalDate.now();
        int currentMonth = currentDate.getMonthValue();
        int currenYear = currentDate.getYear();
        String result = String.format("%d_%d", currentMonth, currenYear);
        return result;
    }

    public static int getInt(String welcome, int min, int max) {
        int result = 0;
        boolean checkLoop = true;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print(welcome);
                result = Integer.parseInt(sc.nextLine());
                if (result < min || result > max) {
                    System.out.println(" Number must in range[" + min + ", " + max + "]");
                } else {
                    checkLoop = false;
                }
            } catch (Exception e) {
                System.out.println("Must input number");
            }

        } while (checkLoop);
        return result;
    }

    public static double getDouble(String welcome, int min, int max) {
        double result = 0;
        boolean checkLoop = true;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print(welcome);
                result = Double.parseDouble(sc.nextLine());
                if (result < min || result > max) {
                    System.out.println(" Number must in range[" + min + ", " + max + "]");
                } else {
                    checkLoop = false;
                }
            } catch (Exception e) {
                System.out.println("Must input number");
            }

        } while (checkLoop);
        return result;
    }

    public static String updateString(String welcome, String oldValue) {
        String result = "";
        Scanner sc = new Scanner(System.in);
        System.out.print(welcome);
        result = sc.nextLine();
        if (result.isEmpty()) {
            result = oldValue;
        }
        return result;
    }

    public static int updateInt(String welcome, int min, int max, int oldValue) {
        int result = 0;
        boolean checkLoop = true;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print(welcome);
                String tmp = sc.nextLine();
                if (tmp.isEmpty()) {
                    result = oldValue;
                    checkLoop = false;
                } else {
                    result = Integer.parseInt(tmp);
                    if (result < min || result > max) {
                        System.out.println(" Number must in range[" + min + ", " + max + "]");
                    } else {
                        checkLoop = false;
                    }
                }
            } catch (Exception e) {
                System.out.println("Must input number");
            }
        } while (checkLoop);
        return result;
    }

    public static double updateDouble(String welcome, int min, int max, double oldValue) {
        double result = 0;
        boolean checkLoop = true;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print(welcome);
                String tmp = sc.nextLine();
                if (tmp.isEmpty()) {
                    result = oldValue;
                    checkLoop = false;
                } else {
                    result = Double.parseDouble(tmp);
                    if (result < min || result > max) {
                        System.out.println(" Number must in range[" + min + ", " + max + "]");
                    } else {
                        checkLoop = false;
                    }
                }
            } catch (Exception e) {
                System.out.println("Must input number");
            }
        } while (checkLoop);
        return result;
    }

    public static void display(String text) {
        System.out.println(text);
    }

    public static boolean confirmYesNo(String welcome) {
        boolean result = false;
        String confirm = Utils.getString(welcome);
        if ("Y".equalsIgnoreCase(confirm)) {
            result = true;
        }
        return result;
    }

    public static double getDouble(String welcome, double min) {
        double result = 0;
        boolean checkLoop = true;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print(welcome);
                result = Double.parseDouble(sc.nextLine());
                checkLoop = false;
                if (result < min) {
                    System.out.println("Please enter the correct price!!!");
                }
            } catch (Exception e) {
                System.out.println("Must input number");
            }
        } while (checkLoop || result < min);
        return result;
    }

    public static double updateDouble(String welcome, double oldValue) {
        double result = 0;
        boolean checkLoop = true;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print(welcome);
                String tmp = sc.nextLine();
                if (tmp.isEmpty()) {
                    result = oldValue;
                    checkLoop = false;
                } else {
                    result = Double.parseDouble(tmp);
                    checkLoop = false;
                }
            } catch (Exception e) {
                System.out.println("Must input number");
            }
        } while (checkLoop);
        return (double) result;
    }

    public static int getInt(String welcome) {
        boolean check = true;
        int number = 0;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.printf(welcome);
                number = Integer.parseInt(sc.nextLine());
                check = false;
            } catch (Exception e) {
                System.out.println("Input number");
            }
        } while (check);
        return number;
    }

    public static int updateInt(String welcome, int oldValue) {
        int result = 0;
        boolean checkLoop = true;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print(welcome);
                String tmp = sc.nextLine();
                if (tmp.isEmpty()) {
                    result = oldValue;
                    checkLoop = false;
                } else {
                    result = Integer.parseInt(tmp);
                    if (result < 0) {
                        System.out.println("please re-enter");
                    } else {
                        checkLoop = false;
                    }
                }
            } catch (Exception e) {
                System.out.println("Must input number");
            }
        } while (checkLoop);
        return result;
    }
    
    public static class DateUtils { 
        private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        public static LocalDate readDate(String prompt) {
            Scanner scanner = new Scanner(System.in);
            LocalDate date = null;

            while (date == null) {
                System.out.print(prompt + " (" + formatter.toString() + "): ");
                String input = scanner.nextLine();

                try {
                    date = LocalDate.parse(input, formatter);
                } catch (DateTimeParseException e) {
                    System.out.println("Định dạng ngày không hợp lệ. Vui lòng nhập theo định dạng: " + formatter.toString());
                }
            }
            return date;
        }
    }
}

