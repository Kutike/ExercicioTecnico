# Resolução dos Exercícios

Neste repositório, você encontrará a solução para os seguintes problemas:

- *Questão 1 a 4*: Resolvidas com códigos em Java. Os arquivos de código correspondem aos problemas especificados.
- *Questão 5*: A resposta está detalhada diretamente neste arquivo README.md.

## Detalhes das Questões

1. *Sequência de Fibonacci*: O código verifica se um número informado pertence à sequência de Fibonacci.  
   *Descrição*: Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não à sequência.  
   *IMPORTANTE*: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código.

2. *Contagem de Letras 'a'*: O código conta a quantidade de letras 'a' (maiúsculas e minúsculas) em uma string fornecida.  
   *Descrição*: Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.  
   *IMPORTANTE*: Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código.

3. *Cálculo da Soma*: O código calcula a soma dos números de 1 até INDICE - 1, onde INDICE é 12.  
   *Descrição*: Observe o trecho de código abaixo: int INDICE = 12, SOMA = 0, K = 1; enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA); Ao final do processamento, qual será o valor da variável SOMA?

4. *Complete o Próximo Elemento*: O código resolve a continuação de várias sequências numéricas.  
   *Descrição*: Descubra a lógica e complete o próximo elemento:
   - a) 1, 3, 5, 7, _
   - b) 2, 4, 8, 16, 32, 64, __
   - c) 0, 1, 4, 9, 16, 25, 36, __
   - d) 4, 16, 36, 64, __
   - e) 1, 1, 2, 3, 5, 8, __
   - f) 2, 10, 12, 16, 17, 18, 19, __

   *Respostas*:
   - a) 9
   - b) 128
   - c) 49
   - d) 100
   - e) 13
   - f) 20

## Resolução da Questão 5

*Questão 5*: Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em salas diferentes. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada. Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas?

### Resolução:

Eu iria ligar um interruptor e deixá-lo ligado por um tempo até achar que, quando o tocar, estará quente. Depois, desligaria esse interruptor e ligaria o segundo. Em seguida, entraria na primeira sala para conferir se a lâmpada está acesa, quente ou fria.Depois, entraria na segunda sala e poderia identificar qual interruptor controla aquela lâmpada depois de ter eliminado um na primeira sala. Com isso, restaria apenas um interruptor, que seria o controlador da terceira lâmpada. A partir disso, seria possível organizar e identificar qual interruptor controla cada lâmpada.
