![senai_logo](https://transparencia.sp.senai.br/Content/img/logo-senai.png)

# Lista de Exercícios 01: Fluxogramas

Profº.: Cainã Antunes Silva  
Faculdade de Tecnologia **SENAI Sorocaba**  
Tecnólogo em Análise e Desenvolvimento de Sistemas (ADS)
___


> O objetivo desta aula é exercitar o raciocínio lógico para a criação de algoritmos através de fluxogramas.  

O fluxo de um algorítmo poder ser representado graficamente através de fluxogramas. Um conjunto de símbolos, representam cada ação realizada pelo programa, além disso, setas conectam estes símbolos uns com os outros indicando a sequencia em que as ações são executadas.

Para mais informações acesse [Aula 01: Fluxogramas.](https://www.notion.so/cainaantunes/Aula-01-Fluxogramas-188bde521b3b80de90f7dbd9407af71e)

***

1. Crie o fluxograma de um programa que solicita que o usuário digite sua nota e em seguida o programa exibe se o aluno foi “Aprovado” ou “Reprovado”. Leve em consideração que a nota deve estar entre 0 e 100 e que a condição para aprovação é ter uma nota igual ou superior à 50.
   
    ```mermaid
   
    flowchart TD
        start(( Início )) --> input[\ Digite sua Nota \]
        input --> verification{ Nota >= 50? }
        verification --> |Sim| A[/ Aprovado /]
        verification --> |Não| B[/ Reprovado /]
        A --> finish([ Fim ])
        B --> finish
    ```
   
2. Altere o exemplo anterior, acrescentando as seguintes condições: para ser o aprovado, o aluno precisar ter nota igual ou superior à 50 e frequência igual ou superior a 75%.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> entrada1[\Digite sua nota\]
      entrada1 --> entrada2[\Digite sua frequência em %\]
      entrada2 --> teste{ Nota >= 50 \n  E \n frequência >= 75% ? }
      teste --> |Não| resposta1[/ Reprovado /]
      teste --> |Sim| resposta2[/ Aprovado /]
      resposta1 --> final([Fim])
      resposta2 --> final
   ```
3. Crie um fluxograma para calcular a soma de dois números fornecidos pelo usuário.
   
   ```mermaid
   flowchart TD
      start(( Start )) --> n1[\Digite sua nota 1\]
      n1 --> n2[\Digite nota 2\]
      n2 --> sum{ Resultado = n1 + n2}
      sum --> out[/Resultado/]
      out --> final([Fim])
      
   ```
   
4. Elabore um fluxograma que leia um número e exiba se ele é positivo ou negativo.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> num[\ Digite seu número: \]
        num --> verification{ num > 0? }
        verification --> |Sim| A[/ Positivo /]
        verification --> |Não| B[/ Negativo /]
        A --> finish([ Fim ])
        B --> finish
   ```
   
5. Desenvolva um fluxograma que leia a idade de uma pessoa e indique se ela pode votar.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> age[\ Digite sua idade: \]
        age --> verification{ idade >= 16 && tem título de eleitor? }
        verification --> |Sim| A[/ Pode votar /]
        verification --> |Não| B[/ Não pode votar /]
        A --> finish([ Fim ])
        B --> finish
   ```
   
6. Crie um fluxograma que leia dois números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> num1[\ Digite um número: \]
        num1 --> num2[\ Digite outro número diferente\]
        num2 --> verification{ num1 > num2 ? }
        verification --> |Yes| A[/ num1 é maior /]
        verification --> |No| B[/ num2 é maior /]
        A --> finish([ Fim ])
        B --> finish
   ```
   
7. Crie um fluxograma que leia três números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
      start(( Início )) --> num1[\ Digite um número: \]
        num1 --> num2[\ Digite outro número: \]
        num2 --> num3[\ Digite outro número: \]
        num3 --> verification1{ num1 > num2 ? }
        
        verification1 --> |Yes| verification2{ num1 > num3 ? }
        verification2 --> |Yes| A1[/ Num1 é o maior /]
        verification2 --> |No| B1[/ num3 é maior /]
   
        verification1 --> |No| verification3{ num2 > num 3 ? }
        verification3 --> |Yes| A2[/ Num2 é o maior /]
        verification3 --> |No| B2[/ num3 é maior /]
        A1 --> finish([ Fim ])
        B1 --> finish
        A2 --> finish
        B2 --> finish
   ```
   
8. Construa um fluxograma para calcular o fatorial de um número fornecido pelo usuário.
   
   ```mermaid
   flowchart TD
      
        start((Início)) --> num1[\Ler número N\]
        num1 --> verify1{Se N < 0?}
   
        verify1 --> |Yes| A1[/Exibir Número inválido/]
        verify1 --> |No| A2[Inicializar F = 1 e i = 1]
   
        A2 --> verify2{Se i > N?}
        
        verify2 --> |Yes| B1[/Exibir F/]
        verify2 --> |No| B2[/F = F * i/]
   
        B2 --> C[/i = i + 1/]
        C --> verify2
   
        A1 --> finish([Fim])
        B1 --> finish

   ```
   

   
9. Elabore um fluxograma para verificar se um número digitado pelo usuário é par.
   
   > Em várias linguagens de programação, o operador % retorna o resto da divisão entre dois números.    
   > 
   >**Exemplos**:  
   > - 9 % 2 = 1  
   > - 11 % 3 = 2
   
   ```mermaid
   flowchart TD
      start((Início)) --> num1[\Ler número N\]
        num1 --> verify1{Se N % 0?}
   
        verify1 --> |Yes| A1[/Número par/]
        verify1 --> |No| A2[/Número ímpar/]
        
        
   
        
   
        A1 --> finish([Fim])
        A2 --> finish
   ```
   
10. Elabore um fluxograma para verificar se um número digitado pelo usuário é primo.
   ```mermaid
   flowchart TD
      
    Start(Início) --> num[\ Ler número N \]
    num --> verify01{Se N < 2?}

    verify01 --> |Yes| A1[/Exibir: Não é primo/]
    verify01 --> |No| A2[Inicializar i = 2]
    A2 --> verify02{Se i * i > N?}

    verify02 --> |Yes| B1[/Exibir: É primo/]
    verify02 --> |No| verify03{Se N % i == 0?}

    verify03 --> |Yes| C1[\Exibir: Não é primo\]
    verify03 --> |No| C2[i = i + 1]
    C2 --> verify02

    A1 --> Finish([Fim])
    B1 --> Finish
    C1 --> Finish
    

   ```