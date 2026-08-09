import fibonacci.Fibonacci;
import primos.Primos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // caso não seja passado todos os argumentos
        if (args.length != 3) {
            System.out.println("Uso:");
            // deve ser usado como (ex : "./rodar_valores.sh primos linear 7" para exibir primos até 7 p(7) usando função linear)
            System.out.println("./rodar_valores.sh <primos|fibonacci> <linear|recursiva> <valor>");
            return;
        }

        // declarando as variaveis (algoritmo, tipo e o número n)
        String algoritmo = args[0];
        String tipo = args[1];
        int n = Integer.parseInt(args[2]);

        // declarando classe fibonnaci
        Fibonacci fibonacci = new Fibonacci();

        // declarando classe primos
        Primos primos = new Primos();

        if (algoritmo.equals("primos")) {
            if (tipo.equals("linear")) System.out.println("p(" + n + ") = " + primos.primosLinear(n));
            else if (tipo.equals("recursiva")) System.out.println("p(" + n + ") = " + primos.primosRecursiva(n));
        }

        if (algoritmo.equals("fibonacci")) {
            if (tipo.equals("linear")) System.out.println("fib(" + n + ") = " + fibonacci.fibonacciLinear(n));
            else if (tipo.equals("recursiva")) System.out.println("fib(" + n + ") = " + fibonacci.fibonacciRecursiva(n));
        }
    }
}
