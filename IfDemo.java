public class IfDemo {
    public static void main(String[] args) {
        int a, b, c;

        a = 2;
        b = 3;
        if (a == b) System.out.println("Это мы не увидим");
        System.out.println();

        c = a - b;
        System.out.println("Переменная с содержит " + c);

        if (c >= 0) System.out.println("Значение с не отрицательное");
        if (c <= 0) System.out.println("Значение отрицательное");

        System.out.println();

        c = b -a;

        System.out.println("Переменная содержит " + c);
        if (c >= 0) System.out.println("Значение отрицательное");
        if (c <= 0) System.out.println("Значение не отрицательное");

    }
}
