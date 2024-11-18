# Projeto Contador

Este projeto em Java implementa um programa simples de contagem que recebe dois números como entrada e exibe uma sequência de números, de acordo com a diferença entre os valores informados. Ele também valida as entradas e lança uma exceção personalizada caso o segundo parâmetro não seja maior que o primeiro.

## Estrutura do Projeto

O projeto contém as seguintes classes:

1. **Contador**: A classe principal que gerencia a entrada do usuário e a lógica de contagem.
2. **ParametrosInvalidosException**: Uma exceção personalizada para tratar casos onde os parâmetros são inválidos.

## Funcionalidades

- Recebe dois números inteiros como entrada do usuário.
- Valida se o segundo número é maior que o primeiro.
- Realiza a contagem com base na diferença entre os dois números.
- Lança uma exceção com uma mensagem clara se a validação falhar.

## Requisitos

- Java 8 ou superior.
- Uma IDE ou editor de texto que suporte desenvolvimento em Java.

## Como Executar

1. Certifique-se de ter o Java configurado em sua máquina.
2. Clone o repositório ou copie os arquivos para seu ambiente local.
3. Compile e execute a classe `Contador`:

   ```bash
   javac Contador.java
   java Contador
