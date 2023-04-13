// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       //task 1
        System.out.println("Задача 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возвраст человека равен " + age + ", то он совершеннолетний" );
        }
        if (age < 18) {
            System.out.println("Если возвраст человека равен " + age + ", то он несовершеннолетний");
        }

        //task 2
        System.out.println("Задача 2");
        int t =6;
        if (t < 5) {
            System.out.println("На улице " + t + " градусов, нужно надеть шапку");
        }
        if (t > 5) {
            System.out.println("На улице " + t + " градусов, можно идти без шапки");
        }

        //task 3
        System.out.println("Задача 3");
        int speed = 55;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ехать спокойно");
        }

        //task 4
        System.out.println("Задача 4");

    }
}