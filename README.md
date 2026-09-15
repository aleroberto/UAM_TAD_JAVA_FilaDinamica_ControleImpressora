# Java Dynamic Queue Print Manager

Implementação de uma fila dinâmica em Java utilizando uma lista encadeada simples, com demonstração de conceitos de estruturas de dados, encapsulamento e processamento **FIFO (First In, First Out)** em um contexto de gerenciamento de impressão.

## Visão geral

Este projeto implementa uma fila dinâmica do zero utilizando Java e uma lista encadeada.

A fila mantém referências para o primeiro e o último elemento, permitindo adicionar novos elementos ao final da estrutura e preservar a ordem de processamento **FIFO (First In, First Out)**.

A implementação utiliza um contexto simplificado de gerenciamento de impressão para demonstrar o funcionamento da estrutura.

## Estrutura de dados

A fila é implementada utilizando nós encadeados:

```text id="4n6v8c"
FilaDinamica
├── inicio
│    ↓
│   No → No → No → null
│
└── fim
          ↑
```

Cada `No` contém:

* Um valor inteiro;
* Uma referência para o próximo nó.

A classe `FilaDinamica` mantém:

* `inicio`: referência para o primeiro nó da fila;
* `fim`: referência para o último nó da fila.

## Operações

### Enqueue

Adiciona um novo elemento ao final da fila.

```java id="j4q2mz"
filaDinamica.enqueue(1);
filaDinamica.enqueue(2);
filaDinamica.enqueue(3);
```

A ordem resultante é:

```text id="r5t7wp"
1 → 2 → 3
```

### Is Empty

Verifica se a fila está vazia.

```java id="8c3n1v"
filaDinamica.isEmpty();
```

### Print

Percorre a fila a partir do primeiro elemento até o último e exibe seus valores.

```java id="q1s6ka"
filaDinamica.print();
```

## Estrutura do projeto

```text id="w7m3px"
java-dynamic-queue-print-manager/
│
├── .gitignore
├── README.md
│
└── src/
    ├── ControlaImpressao.java
    ├── FilaDinamica.java
    └── No.java
```

### Classes

**`No.java`**

Representa um nó da estrutura encadeada. Cada nó armazena um valor e uma referência para o próximo nó.

**`FilaDinamica.java`**

Implementa a fila dinâmica e suas principais operações.

**`ControlaImpressao.java`**

Contém o exemplo executável utilizado para demonstrar o funcionamento da fila.

## Tecnologias e conceitos

* Java
* Programação orientada a objetos
* Lista encadeada simples
* Estrutura de dados do tipo fila
* Processamento FIFO
* Encapsulamento
* Referências entre objetos
* Compilação e execução via linha de comando

## Execução

Compile os arquivos Java:

```bash id="n8w4qc"
javac src/*.java
```

Execute o exemplo:

```bash id="b2m5kr"
java -cp src ControlaImpressao
```

Saída esperada:

```text id="c9v4za"
Fila de impressao:
1
2
3
```

## Conceitos demonstrados

O projeto demonstra conceitos fundamentais de estruturas de dados e desenvolvimento de software, incluindo:

* Estruturas de dados dinâmicas;
* Listas encadeadas;
* Implementação de filas;
* Processamento FIFO;
* Encapsulamento;
* Referências entre objetos;
* Organização básica de classes Java;
* Compilação e execução via linha de comando.

## Escopo

Este projeto é uma implementação focada de uma fila dinâmica para fins de estudo e demonstração técnica.

O contexto de impressão é utilizado apenas como exemplo de aplicação da estrutura de dados. O projeto não representa um sistema completo de gerenciamento de impressão.

A implementação mantém o modelo de dados simples, utilizando valores inteiros para demonstrar o funcionamento da fila sem adicionar complexidade desnecessária.
