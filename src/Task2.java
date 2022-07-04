public class Task2 {
    public static void main(String[] args) {

        int n = 122;
        int a = n / 100;
        int b = n / 10 % 10;
        int c = n % 10;
        int h, t, u;
        if (a > b && a > c) h = a;
        else if (b > a && b > c) h = b;
        else h = c;
        if (a < b && a < c) u = a;
        else if (b < a && b < c) u = b;
        else u = c;
        if ((a > b && a < c) || (a < b && a > c)) t = a;
        else if ((b > a && b < c) || (b < a && b > c)) t = b;
        else t = c;

        int sortN = h * 100 + t * 10 + u;

        System.out.println(sortN);

    }

}
