import java.util.Scanner;
import java.lang.String;
import java.lang.Math;

public class block3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Введите номер задания: ");
            int n1 = scan.nextInt();
            if (n1 == 0) {
                break;
            }
            switch (n1) {
            case (1):
                System.out.print("Введите кол-во городов: ");
                int n2 = scan.nextInt();
                Scanner str = new Scanner(System.in);
                String[][] s = new String[100][2];
                for (int i = 0; i < n2; i++) {
                    System.out.print("Введите название города: ");
                    s[i][0] = str.nextLine();
                    System.out.print("Введите население города: ");
                    s[i][1] = str.nextLine();
                }
                task1(s, n2);
                break;
            case (2):
                System.out.print("Введите малую сторону: ");
                double cc = scan.nextDouble();
                task2(cc);
                break;
            case (3):
                System.out.print("Введите данные 1 игрока: ");
                Scanner s1 = new Scanner(System.in);
                String str1 = s1.nextLine();
                System.out.print("Введите данные 2 игрока: ");
                String str2 = s1.nextLine();
                task3(str1, str2);
                break;
            case (4):
                System.out.print("Введите кол-во чисел в массиве: ");
                int x = scan.nextInt();
                int[] a = new int[x];
                System.out.print("Введите массив: ");
                for (int i = 0; i < x; i++) {
                    a[i] = scan.nextInt();
                }
                task4(a, x);
                break;
            case (5):
                System.out.print("Введите строку: ");
                Scanner s2 = new Scanner(System.in);
                String s3 = s2.nextLine();
                task5(s3);
                break;
            case (6):
                System.out.print("Введите строку: ");
                Scanner str3 = new Scanner(System.in);
                String s4 = str3.nextLine();
                task6(s4);
                break;
            case (7):
                System.out.print("Введите высоту, ширину, глубину кирпича и ширину, высоту отверстия: ");
                int q = scan.nextInt();
                int b = scan.nextInt();
                int c = scan.nextInt();
                int w = scan.nextInt();
                int h = scan.nextInt();
                task7(q, b, c, w, h);
                break;
            /*
             * case(8): break;
             */
            case (9):
                System.out.print("Введите кол-во чисел в массиве: ");
                int zzz = scan.nextInt();
                int[] p = new int[zzz];
                System.out.print("Введите массив: ");
                for (int i = 0; i < zzz; i++) {
                    p[i] = scan.nextInt();
                }
                task9(p, zzz);
                break;
            case (10):
                System.out.print("Введите число: ");
                x = scan.nextInt();
                int y = 0;
                int z = x;
                while (z != 0) {
                    // Суммирование цифр числа
                    y += (z % 10);
                    z /= 10;
                }
                task10(x, y);
                break;
            }
        }
    }

    public static void task1(String[][] s, int n) {
        double a = 0;
        for (int i = 0; i < n; i++) {
            a = Integer.parseInt(s[i][1].trim());
            a = a / 1000000;
            s[i][1] = Math.round(a) * 1000000 + "";
            System.out.println(s[i][0] + ", " + s[i][1]);
        }
    }

    public static void task2(double n) {
        double a = 1;
        double b = 1;
        a = 2 * n;
        b = Math.sqrt(3) * n;
        System.out.println(a);
        System.out.println(b);

    }

    public static void task3(String str1, String str2) {
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        if (str1.equals(str2)) {
            System.out.println("Ничья");
        } else {
            if (str1.equals("КАМЕНЬ")) {
                if (str2.equals("НОЖНИЦЫ")) {
                    System.out.println("Выиграл 1");
                } else {
                    System.out.println("Выиграл 2");
                }
            }

            if (str1.equals("НОЖНИЦЫ")) {
                if (str2.equals("БУМАГА")) {
                    System.out.println("Выиграл 1");
                } else {
                    System.out.println("Выиграл 2");
                }
            }
            if (str1.equals("БУМАГА")) {
                if (str2.equals("КАМЕНЬ")) {
                    System.out.println("Выиграл 1");
                } else {
                    System.out.println("Выиграл 2");
                }
            }
        }
    }

    public static void task4(int[] arr, int n) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                a += arr[i];
            } else {
                b += arr[i];
            }
        }
        System.out.println(Math.abs(a - b));
    }

    public static void task5(String s) {
        char[] c = s.toCharArray();
        s = "";
        for (char i : c) {
            if (Character.isLowerCase(i))
                i = Character.toUpperCase(i);
            else
                i = Character.toLowerCase(i);
            s += i;
        }
        System.out.println(s);
    }

    public static void task6(String s) {
        String s1 = s.toUpperCase();
        boolean x = false;
        char[] a = { 'A', 'E', 'I', 'O', 'U', 'Y' };
        for (char i : a) {
            if (s1.charAt(s.length() - 1) == i) {
                x = true;
            }
        }
        if (x) {
            System.out.println(s + "-inator " + s.length() + "000");
        } else {
            System.out.println(s + "inator " + s.length() + "000");
        }

    }

    public static void task7(int a, int b, int c, int w, int h) {
        System.out.println(Math.min(a * b, Math.min(a * c, b * c)) <= h * w);

    }

    public static void task8(double top, double ras, int pas, boolean kon) {

    }

    public static void task9(int[] p, int zzz) {
        double f = 0;
        for (int i = 0; i < zzz; i++) {
            f += p[i];
        }
        System.out.println(f / zzz);
    }

    public static void task10(int x, int y) {
        boolean ans = false;
        if ((x % 2 == 0 && y % 2 == 0) || (x % 2 == 1 && y % 2 == 1)) {
            ans = true;
        }
        System.out.println(ans);
    }
}
