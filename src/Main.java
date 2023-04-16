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
        int ageChild = 25;
        if (ageChild <= 6) {
            System.out.println("Если возраст человека равен " + ageChild + ", то ему нужно идти в детский сад");
        }
        else if (ageChild <=18){
            System.out.println("Если возраст человека равен " + ageChild + ", то ему нужно идти в школу");
        }
        if (ageChild >= 18 && ageChild < 24) {
            System.out.println("Если возраст человека равен " + ageChild + ", то ему надо идти в университет");
        }
        else {
            System.out.println("Если возраст человека равен " + ageChild + ", то ему надо идти на работу");
        }

        //task 5
        System.out.println("Задача 5");
        int ageSkate = 15;
        if (ageSkate <= 5) {
            System.out.println("Если возраст ребенка равен " + ageSkate + ", то ему нельзя кататься на аттракционе");
        } else if ( ageSkate <= 14){
            System.out.println("Если возраст ребенка равен " + ageSkate + ", то ему можно кататься на аттракционе в сопровождении");
        }
        else  {
            System.out.println("Если возраст ребенка равен " + ageSkate + ", то ему можно кататься на аттракционе без сопровождения");
        }

        //task 6
        System.out.println("Задача 6");
        int count = 65;
        if (count <= 60) {
            System.out.println("Есть сидячие");
        } else if (count < 102) {
            System.out.println("Есть стоячие");
        } else System.out.println("Нет мест");

        //task 7
        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if ((one > two) && (one > three)) {
            System.out.println("Больше чисто " + one);
        } else if ((two > one) && (two > three)) {
            System.out.println("Больше чисто " + two);
        } else if ((three > one) && (three > two)){
            System.out.println("Больше чисто " + three);
        }
    }
}