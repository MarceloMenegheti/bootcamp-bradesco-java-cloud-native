# Sintaxe Básica com Java 🍵☕

- Introdução à linguagem Java.
- Variáveis, tipos de dados e operadores.
- Estruturas de controle (if, else, switch, loops).
- Arrays e coleções.
- Métodos.
- Classes e Objetos
      
## Aviso Importante ⚠️:
Neste diretório não haverá códigos, pois eu já realizei as aulas em outro diretório. Para acesso aos arquivos e código fonte, estou disponibilizando um link para o repositório correspondente.
Por favor, acesse o repositório no seguinte link: [aulasJava](https://github.com/MarceloMenegheti/JavaClass.java).

Agradeço pela compreensão e fico à disposição para quaisquer dúvidas.



## Estrutura Básica de um Programa Java
Um programa Java começa com uma classe principal e um método `main` Exemplo:
```
public class Main {
    public static void main(String[] args) {
        System.out.println("Olá, mundo!");
    }
}
```
`public class Main`: Define uma classe chamada Main.

`public static void main(String[] args)`: Método principal, onde a execução do programa começa.

`System.out.println`: Exibe uma mensagem no console.



## Variáveis e Tipos de Dados
Java é uma linguagem fortemente tipada, ou seja, todas as variáveis devem ter um tipo definido. Exemplo:

```
int idade = 25; // Inteiro
double altura = 1.75; // Ponto flutuante
String nome = "João"; // Texto
boolean isJavaFun = true; // Booleano
```


## Estruturas de Controle
Condicionais (`if`, `else`)
```
int nota = 8;

if (nota >= 7) {
    System.out.println("Aprovado!");
} else {
    System.out.println("Reprovado!");
}
```
Loops (`for`, `while`)
for:

```
for (int i = 0; i < 5; i++) {
    System.out.println("Número: " + i);
}
```
while:
```
int contador = 0;
while (contador < 5) {
    System.out.println("Contador: " + contador);
    contador++;
}
```

## Tratamento de Exceções (try e catch)
Em Java, exceções são erros que ocorrem durante a execução do programa. O bloco try e catch é usado para capturar e tratar essas exceções.

### Sintaxe Básica:
```
try {
    // Código que pode gerar uma exceção
} catch (Exception e) {
    // Código para tratar a exceção
}
```

### Exemplo Prático:
```
public class ExemploTryCatch {
    public static void main(String[] args) {
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]); // Acesso a um índice inválido
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Índice fora dos limites do array!");
        } finally {
            System.out.println("Bloco finally: sempre executado.");
        }
    }
}
```
### Explicação:

`try`: Bloco onde o código que pode gerar uma exceção é colocado.

`catch`: Captura a exceção e define como tratá-la.

`finally`: Bloco opcional que é sempre executado, independentemente de uma exceção ter ocorrido ou não.

## Métodos
Métodos são blocos de código que realizam uma tarefa específica. Exemplo:

```
public class Calculadora {
    public static int somar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int resultado = somar(5, 3);
        System.out.println("Resultado: " + resultado);
    }
}
```

## Classes e Objetos
Java é uma linguagem orientada a objetos. Classes são "modelos" para criar objetos. Exemplo:

```
public class Carro {
    String marca;
    String modelo;

    public void acelerar() {
        System.out.println("Acelerando o " + modelo);
    }

    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.marca = "Ford";
        meuCarro.modelo = "Mustang";
        meuCarro.acelerar();
    }
}
```