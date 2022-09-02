package java1.lessonsforqa.lesson2;

public class Lesson2 {

    public static void main (String[] args) {
        whereSumTenOrTwenty(10, 15);
        sumPositiveOrNegativ (5);
        numberTrueOrFalse (5);
        /*printLine (2, 3); */
    }

        public static boolean whereSumTenOrTwenty(int a, int b) {

return a + b >= 10 && a + b <= 20 ? true : false;
/* сумма лежит в пределах от 10 до 20
   да – вернуть true, в противном случае – false */
            }
    public static void sumPositiveOrNegativ(int c) {
        if (c >= 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }

public static boolean numberTrueOrFalse(int d) {
        return d >= 0 ? true : false;
        /* true, если число отрицательное, и вернуть false если положительное*/
}

/*public static void printLine(String word, int j) {
        for (int i = 1; i<= j; i++) {
            System.out.println("i=" + i + " " + word);

        } */
    /* java: incompatible types: int cannot be converted to java.lang.String */
}





