# Plano de Estudo Giovanna - Interpretação de Problemas de Algoritmos

## Etapas do Estudo (10-15 minutos por problema, evitar fazer mais que 3 em sequência, mais que isso não absorve tanto e só desperdiça tempo. Melhor 2 focados que 20 distraidos.)

### 1. Leitura Ativa

- **Ação:**  
Leia com atenção o enunciado completo. Observe os exemplos com entrada e saída. Lembre de ver os **constraints**, eles dão dicas valiosas do problema.
  
  **Objetivo:** Entender o que o problema quer, sem pensar ainda em resolver código.

---

### 2. Resumo do Problema (2–3 frases)

- **Ação:**  
Escreva com suas palavras o que o problema quer. Foco em clareza, não detalhes técnicos.

  **Exemplo:**  
  > "Dado um array de inteiros, preciso encontrar dois números cuja soma dê um valor alvo. Preciso retornar os índices desses dois números."

---

### 3. Ideia Geral de Solução (overview conceitual)

- **Ação:**  
Esboce como você tentaria resolver isso em alto nível, mesmo que seja vaga ou errada. Evite pensar em código.

  **Exemplo:**  
  > "Se eu passar por todo array, eu consigo comparar os elementos com meu alvo X, quando dois números derem o alvo eu vou salvar os indices em uma lista. No fim passo por todas combinações e retorno toda a lista com os indices que dão o valor X."
---

### 4. Análise de Entradas, Saídas e Constraints

- **Ação:**  
Escreva sobre:
  - Como o **input** pode ser manipulado?
  - Como os **constraints limitam ou abrem possibilidades**?
  - Tem algo que você pode **descartar por ser pequeno, ou otimizar por ser grande?**
  - Preciso cuidar inputs vazios? Posso ter um ponteiro null em algum momento?

---

### 5. Identificação de Padrão

- **Ação:**  
Diga qual tipo de problema parece ser:
  - Ex: "Isso me parece um problema de sliding window porque preciso achar uma subparte contínua do array."
  - Ex: “Parece DP, pois tem decisão passo a passo com sobreposição.”

---

### 6. Métodos Possíveis

- **Ação:**  
Liste as abordagens que você imagina que poderiam funcionar:
  - Ex: Força bruta, hashmap, sliding-window, prefix sum, backtracking, recursão com callback.

---

### 7. Por que esse método/padrão encaixa?

- **Ação:**  
Diga por que você acha que cada abordagem/método que pensou no passo 6 encaixa bem com a estrutura do problema.
  - Ex: “Força bruta sempre resolve quando preciso passar por arrays várias vezes, mas pode ser lento.”
  - Ex: “Two-pointers funciona porque o array está ordenado e quero pares que somem um valor então posso mover os ponteiros eficiente se a soma for maior ou menor sem precisar comparar todos com todos.”

---

## Autoavaliação e Análise Final

### 1. Dificuldade Percebida

- **Ação:**  
De 1 a 5, quão difícil foi entender o problema? O que te travou ou confundiu?

---

### 2. Leitura de Soluções

- **Ação:**  
Leia a solução oficial (Editorial) ou posts no LeetCode Discuss. Pegue 1 ou 2 explicações escritas e claras, de preferência passo a passo.

---

### 3. Comparação de Padrão

- **Ação:**  
O padrão/método usado na solução foi o mesmo que você pensou?
  - Se não: por que o seu não funcionaria?
  - Se sim: ótimo, você reconheceu o padrão certo.

---

### 4. Reflexão Final

- **Ação:**  
Agora diga:
  - O que poderia ter pensado diferente?
  - O que vai tentar reconhecer mais rápido da próxima vez?
  - Existe um insight novo que você pode guardar como lição?

---