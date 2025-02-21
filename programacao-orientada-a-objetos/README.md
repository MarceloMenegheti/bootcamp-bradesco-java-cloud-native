# 📚 Conceitos de Programação Orientada a Objetos (POO)

Este repositório contém exemplos e explicações sobre os principais conceitos da Programação Orientada a Objetos (POO), abordados durante as aulas. A seguir, estão descritos os principais tópicos estudados.

 ## 📌 Conceitos Aprendidos

 

## 1. Abstração


A **abstração** é um princípio que permite representar um objeto do mundo real de forma simplificada, destacando apenas os atributos e comportamentos essenciais.

**Exemplo:** Criar uma classe `Carro` que contém atributos essenciais como `marca`, `modelo` e métodos como `acelerar()` e `frear()`.

## 2. Encapsulamento

O **encapsulamento** protege os dados de um objeto, permitindo o acesso apenas por meio de métodos específicos.

**Exemplo:** Uso de modificadores de acesso (`private`, `protected`, `public`) e implementação de métodos **getter** e **setter** para manipular atributos de forma controlada.


## 3. Herança

A **herança** permite que uma classe (subclasse) reutilize atributos e métodos de outra classe (superclasse), promovendo o reuso de código.

**Exemplo:** Uma classe `Veiculo` com atributos como `cor` e `velocidade`, sendo herdada por `Carro` e `Moto`.

## 4. Polimorfismo

O **polimorfismo** permite que métodos tenham diferentes comportamentos, dependendo do objeto que os implementa.

**Exemplo:** Um método `emitirSom()` que pode ser sobrescrito de diferentes formas em classes `Cachorro` e `Gato`.

## 5. Interfaces

Uma **interface** define um conjunto de métodos que devem ser implementados por uma classe, promovendo um contrato de implementação.

**Exemplo:** Uma interface `Pagamento` que obriga as classes `CartaoCredito` e `Boleto` a implementarem o método `processarPagamento()`.

## 6. Enums

Os **Enums** (Enumerações) representam um conjunto fixo de valores constantes.

**Exemplo:** Definir um `enum` chamado `DiasSemana` com valores `SEGUNDA`, `TERÇA`, `QUARTA`, etc.

## 7. Construtores

Os **construtores** são métodos especiais que inicializam objetos quando uma instância de uma classe é criada.

**Exemplo:** Criar um construtor na classe `Pessoa` que recebe `nome` e `idade` como parâmetros.

```java
public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(){}

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
```

## 8. Exemplos de Pacotes

Os **pacotes** ajudam a organizar classes e evitar conflitos de nomes dentro de um projeto.

**Exemplo:** Criar pacotes `com.empresa.modelo` para classes de modelo e `com.empresa.servico` para classes de serviço.

## 9. Getters e Setters

Os **getters** e **setters** são métodos usados para acessar e modificar atributos privados de uma classe.

**Exemplo:**

```java
public class Produto {
    private double preco;
    
    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
```

# 🗂️ Estrutura do Repositório

📂 Abstração/ - Exemplos de classes abstratas e sua implementação.

📂 Encapsulamento/ - Uso de modificadores de acesso e manipulação de atributos.

📂 Heranca/ - Demonstração de herança entre classes.

📂 Polimorfismo/ - Exemplo de métodos sobrepostos e sobrecarregados.

📂 Interfaces/ - Implementação de interfaces.

📂 Enums/ - Exemplos de enumerações.

📂 Construtores/ - Uso de construtores para inicialização de objetos.


📌 *Este repositório serve como referência para reforçar o aprendizado e consulta sobre conceitos de POO.*

