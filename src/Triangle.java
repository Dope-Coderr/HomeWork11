public class Triangle {
    int a;
    int b;
    int c;

    public void area() {
        int p = (a + b + c) / 2;
        System.out.println(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }
}