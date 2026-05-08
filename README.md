# Entrada de Dados com Scanner em Java

Este repositório demonstra como utilizar a classe `Scanner` para receber dados digitados pelo usuário através do terminal.

O projeto apresenta um exemplo simples de interação no console utilizando:

* entrada de texto
* leitura com `nextLine()`
* impressão de dados
* fechamento do Scanner

---

# 📂 Estrutura do Projeto

## `Main.java`

Classe principal responsável por:

* criar um objeto `Scanner`
* solicitar informações ao usuário
* capturar dados digitados no terminal
* exibir o resultado no console

---

# 🧠 Conceitos Demonstrados

## 🔹 Classe `Scanner`

A classe `Scanner` permite ler dados de entrada fornecidos pelo usuário.

```java id="k7m2vp"
Scanner valor = new Scanner(System.in);
```

### Explicação:

* `System.in` → fluxo de entrada do teclado
* `Scanner` → interpreta os dados digitados

---

## 🔹 Entrada de Texto com `nextLine()`

O método `nextLine()` captura uma linha inteira digitada pelo usuário.

```java id="u4n8qw"
String nome = valor.nextLine();
```

---

## 🔹 Saída de Dados no Console

Uso do `System.out.println()` para exibir mensagens ao usuário.

```java id="p6r1mx"
System.out.println("Digite seu nome: ");
```

---

## 🔹 Fechamento do Scanner

Boa prática para liberar recursos utilizados pelo programa.

```java id="z3v9kt"
valor.close();
```

---

# 🚀 Exemplo de Execução

```java id="m8q2ys"
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner valor = new Scanner(System.in);

        System.out.println("Qual seu nome ?");

        System.out.println("Digite seu nome: ");

        String nome = valor.nextLine();

        System.out.println("Voce digitou: " + nome);

        valor.close();
    }
}
```

---

# 💻 Saída Esperada

```txt id="f1x7pv"
Qual seu nome ?

Digite seu nome:
Gabriel

Voce digitou: Gabriel
```

---

# ⚙️ Como Executar

## 1️⃣ Clone o repositório

```bash id="c9n4wr"
git clone https://github.com/seu-usuario/java-scanner-input.git
```

---

## 2️⃣ Compile o arquivo

```bash id="r5m8tz"
javac Main.java
```

---

## 3️⃣ Execute o programa

```bash id="w2p6yk"
java Main
```

---

# 📚 Objetivo do Projeto

Este projeto foi desenvolvido para praticar entrada de dados em Java utilizando a classe `Scanner`.

Ideal para:

* iniciantes em Java
* aprendizado de entrada de dados
* prática com terminal
* exercícios básicos de interação
* portfólio e GitHub

---

# 🛠️ Tecnologias Utilizadas

* Java
* Scanner
* Console Input/Output

---

# 🤝 Contribuição

Contribuições são bem-vindas!

Sugestões de melhorias, novos exemplos ou otimizações podem ser enviadas via Pull Request 🚀
