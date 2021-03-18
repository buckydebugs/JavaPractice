public class QuadraticRoots {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 1;
        System.out.println("Quadratic eqn is:");
        if(b == 0 && c == 0)
            System.out.println(a + "x^2");
        else if(b == 0)
            System.out.println(a + "x^2 + " + c);
        else if(c == 0)
            System.out.println(a + "x^2 + " + b + "x");
        else
            System.out.println(a + "x^2 + " + b + "x + " + c);
        int temp = (b*b)-(4*a*c);
        if(temp < 0)
            System.out.println("Roots are not real.");
        else
        {
            System.out.println("Roots are:");
            System.out.println((-b + Math.sqrt(temp))/(2*a));
            System.out.println((-b - Math.sqrt(temp))/(2*a));
        }
    }
}
