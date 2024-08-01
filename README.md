# Projeto: Conta Bancária em Java

This project aims to practice the knowledge obtained on the basic java syntax unit of the bootcamp **Coding The Future Claro - Java com Spring Boot**, on the [Digital Innovation One](dio.me) platform.

## Challenge

1. Create the project `ContaBanco`, which will receive data via terminal containing the characteristics of a bank account, in accordance with the attributes below:
2. On the project, create the class `ContaTerminal.java` to make the code of the program.

<h3 style="text-align: center;">Variable Rules</h3>

| Attribute  | Type     | Example   
| --------- | ---------| ------- 
| Numero    | Inteiro  | 1021 
| Agencia   | Texto    | 067-8
| Nome Cliente | Texto    | MARIO ANDRADE
| Saldo | Decimal |237.48

## Implementation

Following the proposed criteria, I have included a feature to filter the user input on the `numero` and `agencia` attributes, where:

 - `numero` needs to be a 4-digit integer;
 - `agencia` needs to be a 3-digit integer followed by `-` and one more digit.

 The rest of the code was made with basic algorithm.

## Modifications

While `numero` only accepts 4-digits integer input, I have changed its variable format to String for better filtering of the user input.

