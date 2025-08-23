## Entendimento de Problema

**1. Enunciado e Constraints:**  
Day of the programmer
[link](https://www.hackerrank.com/challenges/day-of-the-programmer/problem?isFullScreen=true)

**2. Descrição em 2 frases:**  
Descobrir qual dia do ano será o 256ésimo dia, dependendo se:
- ano < 1918
- ano == 198
- ano > 1918 ---> 28.09.1918
Dados os diferentes calendários possíveis (Julian, Gregorian ou ambos em 1918) e ser ano bissexto.

**3. Input/Output/Constraints:**  
Input: int y (ano)

Output: String dd.mm.yyyy

Constraints:
1700 <= y <= 2700

**4. Ideia geral de solução:**  
Ao receber o ano, verificar se está no calendario juliano (<1917), gregoriano (1919>) ou na transição (1918).
Descorbir se é um ano bissexto de acordo com as regras:
- Juliano: divisivel por 4
- Gregoriano: divisivel por 400 / divisivel por 4, mas nao por 100
Fazer a conta dos dias, considerando que:
- Janeiro 31
- Fevereiro 28 ou 29
- Março 31
- Abril 30
- Maio 31
- Junho 30
- Julho 31
- Agosto 31 ---> 243 ou 244

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
2 - Não possui uma lógica complexa por trás, é apesar trabalhoso de implementar por conta das particularidades dos anos e o enunciado é longo

**2. Leitura de soluções:**
[link](https://www.hackerrank.com/challenges/day-of-the-programmer/forum)

**3. Comparação de padrões:**  
N/A

**4. Reflexão:**  
Ok.
