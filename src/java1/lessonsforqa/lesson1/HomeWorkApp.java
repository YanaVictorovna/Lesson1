package java1.lessonsforqa.lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
}
    public static void checkSumSign() {
        int a = 25;
        int b = 30;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        }
        else {
        System.out.println("Сумма отрицательная");
    }
}
    public static void printColor() {
        int value = 150;

        if (value <=0) /* Если value меньше 0 (0 включительно) */
        {
            System.out.println("Красный");
        }

        else if (value > 0 & value <= 100) /* в пределах от 0 (0 исключительно) до 100 (100 включительно) */
        {
            System.out.println("Желтый");
        }

        else /* если больше 100 (100 исключительно) */
        {
            System.out.println("Зеленый");
        }

    }
    public static void compareNumbers() {
        int a = 25;
        int b = 30;
        /* Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b” */
        /* в противном случае “a < b” */
        if (a >= b) {
            System.out.println("a >= b");
}
        else {
            System.out.println("a < b");
}

    }
}
