import java.util.Scanner;



public class Calculator {
    static class Factorial{

        static Double factorial(Double n){
            if (n == 0) return 1.0;
            else
                return (n*factorial(n-1));
        }

    }
    public static void main(String[] args){

        double a, b, r;
        char o;

        Scanner input =  new Scanner(System.in);


        System.out.println("Introduceti primul numar: ");
        a = input.nextDouble();

        System.out.println("Alegeti operatia aritmetica: +, -, *, /, r (radical), m (modul), f(factorial) s(sin), c(cos), t(tan), l (logaritm natural) ");
        o = input.next().charAt(0);


        switch (o) {
            case '+' : {
                System.out.println("Introduceti al doilea numar: ");
                b = input.nextDouble();
                r = a + b;
                System.out.println(a + " + " + b + " = " + r);
            }
            case '-' : {
                System.out.println("Introduceti al doilea numar: ");
                b = input.nextDouble();
                r = a - b;
                System.out.println(a + " - " + b + " = " + r);
            }
            case '*' : {
                System.out.println("Introduceti al doilea numar: ");
                b = input.nextDouble();
                r = a * b;
                System.out.println(a + " * " + b + " = " + r);
            }
            case '/' : {
                System.out.println("Introduceti al doilea numar: ");
                b = input.nextDouble();
                r = a / b;
                System.out.println(a + " : " + b + " = " + r);
            }
            case 'r' : {
                r = Math.sqrt(a);
                System.out.println(" radical din " + a + " = " + r);
            }
            case 'm' : {
                r = Math.abs(a);
                System.out.println(" Modulul numarului " + a + " = " + r);
            }
            case 's' : {
                r = Math.sin(a);
                System.out.println(" sinusul numarului " + a + " = " + r);
            }
            case 'c' : {
                r = Math.cos(a);
                System.out.println(" cosinusului numarului " + a + " = " + r);
            }
            case 't' : {
                r = Math.tan(a);
                System.out.println(" tangenta numarului " + a + " = " + r);
            }
            case 'l' : {
                r = Math.log(a);
                System.out.println(" logaritm natural numarului " + a + " = " + r);
            }
            case 'f' : {
                r = Factorial.factorial(a);
                System.out.println(" factorialul numarului " + a + " = " + r);
            }
            default : System.out.println("Operator nevalid");
        }
    input.close();

    }


}
