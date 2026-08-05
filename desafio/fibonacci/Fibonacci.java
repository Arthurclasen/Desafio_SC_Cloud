package fibonacci;

import java.util.ArrayList;

public class Fibonacci {

    // função fibonacci recursiva
    public int fibonacciRecursiva(int n){
        if (n == 0 || n == 1) return n; // tratando casos exclusivos
        return fibonacciRecursiva(n-1) + fibonacciRecursiva(n-2); // chama recursivamente os dois termos anteriores da sequência
    }

    // função fibonacci linear
    public int fibonacciLinear(int n){
        ArrayList<Integer> valoresFibonnaci = new ArrayList<>(); // lista com valores fibonnaci
        // adicionando os 1° e 2°  elementos
        valoresFibonnaci.addLast(0);
        valoresFibonnaci.addLast(1);
        int contador = 2; // contando a partir do 2° elemento (que não está no caso exclusivo)
        while (contador <= n) {
            // adicionando no vetor os valores do penúltimo e último elemento
            valoresFibonnaci.addLast(valoresFibonnaci.get(contador-1) + valoresFibonnaci.get(contador-2));
            contador++;
        }
        // retorna o n-ésimo termo da sequência
        return valoresFibonnaci.get(n);
    }
}
