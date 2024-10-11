public class Main {
    public static void main(String[] args) {

        System.out.println("_______Задание 1________");

        int age = Integer.parseInt(System.console().readLine("Enter your age: "));
        if (age >= 18) {
            System.out.println("Вы совершеннодетний");
        }
        else {
            System.out.println("Вы не достигли совершеннолетния, нужно подождать");
        }

        System.out.println("_______Задание 2________");

        int temperature = Integer.parseInt(System.console().readLine("Enter the outdoor temperature: "));
        if (temperature > 5) {
            System.out.println("Сегодня тепло можно идти без шапки");
        }
        else {
            System.out.println("На улице холодно нужно надеть шапку");
        }

        System.out.println("_______Задание 3________");

        int speed = Integer.parseInt(System.console().readLine("Enter the speed with which you are eating: "));
        if (speed <= 60) {
            System.out.println("Можно ехать спокойно");
        }
        else {
            System.out.println("Придётся заплатить штраф");
        }

        System.out.println("_______Задание 4________");

        age = Integer.parseInt(System.console().readLine("Enter your age: "));
        if (age > 24) {
            System.out.println("Если возраст человека равен "+ age +", то ему пора ходить на работу");
        }
        else {
            if (18 <= age) {
                System.out.println("Если возраст человека равен "+ age +", то его место в университете");
            }
            else {
                if (7 <= age) {
                    System.out.println("Если возраст человека равен "+ age +", то ему нужно ходить в школу");
                }
                else{
                    if (2 <= age) {
                        System.out.println("Если возраст человека равен "+ age +", то ему нужно ходить в детский сад");
                    }
                }
            }
        }

        System.out.println("_______Задание 5________");

        if (age >= 14) {
            System.out.println("Если возраст ребенка равен "+ age +", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        else{
            if (5 < age) {
                System.out.println("Если возраст ребенка равен "+ age +", то ему можно кататься на аттракционе в сопровождении взрослого");
            }
            else {
                System.out.println("Если возраст ребенка равен "+ age +", то ему нельзя кататься на аттракционе");
            }
        }

        System.out.println("_______Задание 6________");

        int capacity = 102;
        int seating = 60;
        int seatingPlace = Integer.parseInt(System.console().readLine("How many seats are occupiede: "));
        int place = Integer.parseInt(System.console().readLine("How many seats are occupied in total: "));
        if (capacity != place || seating != seatingPlace) {
            System.out.println("Свободных сидячих мест " + (seating - seatingPlace) + " а стоячих " + (capacity - place));
        }
        else {
            System.out.println("Свободных мест нет");
        }

        System.out.println("_______Задание 7________");

        int one = Integer.parseInt(System.console().readLine("Enter the first number: "));
        int two = Integer.parseInt(System.console().readLine("Enter the second number: "));
        int three = Integer.parseInt(System.console().readLine("Enter the third number: "));
        if (one > two ){
            System.out.println("Число 1 больше других");
        }
        else {
            if (two > three){
                System.out.println("Число 2 больше других");
            }
            else{
                System.out.println("Число 3 больше других");
            }
        }
    }
}