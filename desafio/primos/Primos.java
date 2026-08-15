package primos;

import java.util.ArrayList;

public class Primos {

    // OBS:
    // há um teorema que diz que para definir se um número é primo ou não
    // basta dividir por todos os números primos abaixo da raíz quadrada desse número

    // função que é chamada pela main (ela faz apenas uma checagem inicial e após isso o método recursivo é aplicado)
    public ArrayList<Integer> primosRecursiva(int n){
        ArrayList<Integer> listaPrimos = new ArrayList<>();
        // adicionando o 2 pois o método "boolean primo" abaixo não considera a tentativa do valor 2
        listaPrimos.add(2);
        buscaRecursivaPrimos(n, 3, listaPrimos); // aplicando a função recursiva
        return listaPrimos;
    }

    // função primos recursiva
    public void buscaRecursivaPrimos(int n, int contador, ArrayList<Integer> listaPrimos){
        if (contador > n) return;
        if (primo(contador, 3)) listaPrimos.addLast(contador);
        buscaRecursivaPrimos(n, contador+2, listaPrimos); // pulando de 2 em 2 (já que pares não são primos)
    }

    // função para verificar se determinado número é primo
    public boolean primo(int n, int contador){
        if (contador * contador > n) return true; // já passei por todos os contadores e passei da raíz quadrada de n, sendo assim não tendo nenhum divisor
        if (n % contador == 0) return false; // achei um divisor
        return primo(n, contador+2); // passando contador+2 para ignorar valores pares
    }

    // função primos linear
    public ArrayList<Integer> primosLinear(int n){
        ArrayList<Integer> listaPrimos = new ArrayList<>();
        listaPrimos.addLast(2); // adicionando o primeiro valor primo
        int contador = 3;
        boolean primo; // variável que indica se o número atual continua sendo considerado primo

        while (contador <= n) { // contando a partir do 3, caso o input seja 2, retorna somente o 2
            primo = true;
            for (int p : listaPrimos) {
                if (p * p > contador) break;  // caso p seja maior que a raíz de contador e não achou primo significa que esse número será primo (logo o break já pula o loop)
                if (contador % p == 0) {    // verificando se cada primo da lista (menor que o elemento) é divisível
                    primo = false;
                    break;
                }
            }
            if (primo) listaPrimos.add(contador); // adiciona a lista somente se não encontrou nenhum número divisível
            contador += 2; // somando de dois em dois para não perder tempo verificando números pares
        }
        return listaPrimos;
    }
}
