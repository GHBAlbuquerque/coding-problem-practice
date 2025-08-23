## Entendimento de Problema

**1. Enunciado e Constraints:**  
Drawing Book
[link]

**2. Descrição em 2 frases:**  
Dado um livro de n páginas, preciso descobrir quantas [viradas de página] para chegar até a página p desejada.
Posso começar do ínicio (página 1) ou do final (página n).

**3. Ideia geral de solução:**  

Se o livro tiver um número par de páginas, a primeira e a última página não tem par.
Se o livro tiver um número ímpar de páginas, a primeira não tem par.
Todas as demais páginas possuem pares e posso dividir por 2.

~~Para número de páginas impar -> 
do inicio: 1 + p/2
do final: p/2

Para número de páginas par -> 
do inicio: 1 + p/2
do final: 1 + p/2~~



**4. Input/Output/Constraints:**  
Input: 
- n - páginas do livro
- p - página desejada

Output:
- int - menor quantidade possível de páginas a serem viradas

Constraints:
1 <= n <= 10ˆ5
1 <= p <= n

* todas as páginas exceto a primeira e talvez a última, estão impressas dos dois lados.
* Posso começar do início ou do final e devo retornar o menor número entre os dois


**5. Padrão identificado:**  
Sem padrão, exercício aritmético.

**6. Métodos possíveis:**  
N/A

**7. Por que esse padrão se encaixa:**  
N/A

---

## Autoavaliação

**1. Dificuldade percebida:**  
(1–5) - Por quê?
4 - apesar de conseguir ter uma ideía vaga de solução, não consegui chegar na lógica aritmética por trás.

**2. Leitura de soluções:**  
- Dividir a página que quero chegar por 2
- Dividir o numero total de páginas por 2
- Escolher o maior valor entre:
  - o número de páginas para virar
  - o número total de páginas - o número de páginas a virar

**3. Comparação de padrões:**  
N/A

**4. Reflexão:**  

Fiquei focada no fato da primeira página ou da última estarem sozinhas, 
quando na verdade deveria estar contando as viradas de página necessárias.
Náo consigo identificar exatamente o que está sendo pedido no enunciado, me distraindo com detalhes.


