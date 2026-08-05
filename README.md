# Desafio_SC_Cloud
Desafio para processo seletivo da empresa SC Cloud

## Requisitos

- Java Development Kit (JDK) 21 ou superior
- Linux/macOS ou Windows com ambiente compatível com Bash (Git Bash, WSL ou similar)

Verifique a instalação do Java:

```bash
java --version
javac --version
```

A saída deve indicar a versão 21 ou superior.

---

## Como executar

Primeiro, dê permissão de execução ao script:

```bash
chmod +x rodar_valores.sh
```

Depois execute:

```bash
./rodar_valores.sh <algoritmo> <implementacao> <valor>
```

### Parâmetros

| Parâmetro | Valores aceitos |
|-----------|-----------------|
| algoritmo | `primos` ou `fibonacci` |
| implementacao | `linear` ou `recursiva` |
| valor | inteiro positivo |

---

## Exemplos

### Primos

Para listar todos os valores primos até 100 usando o algoritmo linear você deve:

```bash
./rodar_valores.sh primos linear 100
```

Saída:

```text
p(100) = [2, 3, 5, 7, 11, ... , 97]
```

---

Para listar todos os valores primos até 100 usando o algoritmo recursivo você deve:

```bash
./rodar_valores.sh primos recursiva 100
```

---

### Fibonacci

Para calcular o 20º termo utilizando a implementação linear:

```bash
./rodar_valores.sh fibonacci linear 20
```

Saída:

```text
fib(20) = 6765
```

---

Para calcular o 20º termo utilizando a implementação recursiva:

```bash
./rodar_valores.sh fibonacci recursiva 20
```

---