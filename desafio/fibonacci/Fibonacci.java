package fibonacci;

public class Fibonacci {

    // função fibonacci recursiva
    public long fibonacciRecursiva(int n){
        if (n == 0 || n == 1) return n; // tratando casos exclusivos
        return fibonacciRecursiva(n-1) + fibonacciRecursiva(n-2); // chama recursivamente os dois termos anteriores da sequência
    }

    // função fibonacci linear
    public long fibonacciLinear(int n){
        if (n == 0) return 0L;
        // adicionando os 1° e 2°  elementos
        long penultimo = 0L;
        long ultimo = 1L;
        long temp;
        int contador = 2; // contando a partir do 2° elemento (que não está no caso exclusivo)
        // realizando a soma entre o último e penúltimo elemento do fibonacci n vezes
        while (contador <= n) {
            temp = ultimo + penultimo;
            penultimo = ultimo;
            ultimo = temp;
            contador++;
        }
        // retorna o n-ésimo termo da sequência
        //return valoresFibonnaci.get(1);
        return ultimo;
    }
}
