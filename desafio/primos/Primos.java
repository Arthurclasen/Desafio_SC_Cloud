package primos;

import java.util.ArrayList;

public class Primos {

    // OBS:
    // há um teorema que diz que para definir se um número é primo ou não
    // basta dividir por todos os números primos abaixo da raíz quadrada desse número

    // função primos recursiva
    public void primosRecursiva(int n, int contador, ArrayList<Integer> listaPrimos){
        if (!(n > 1)) { // tratando caso em que n não é maior que 1
            System.out.println("Valor n deve ser maior que 1 (n > 1)");
            return;
        }
        if (contador > n) return;
        if (primo(contador, 0)) listaPrimos.addLast(contador);
        primosRecursiva(n, contador+1, listaPrimos);
    }

    // função para verificar se determinado número é primo
    public boolean primo(int n, int contador){
        if (n % 2 == 0 && n != 2) return false; // se é par diferente de 2 não é primo
        if (contador == 0) contador = n-1;  // indicativo que esta função recursiva é a primeira a ser executada (no caso definindo valor inicial de contador)
        if (contador * contador < n) return true; // já passei por todos os contadores e cheguei até a raíz quadrada de n, sendo assim não tendo nenhum divisor
        if (n % contador == 0) return false; // achei um divisor
        return primo(n, contador-1);
    }

    // função primos linear
    public void primosLinear(int n, ArrayList<Integer> listaPrimos){
        if (!(n > 1)) { // tratando caso em que n não é maior que 1
            System.out.println("Valor n deve ser maior que 1 (n > 1)");
            return;
        }
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
    }
}
