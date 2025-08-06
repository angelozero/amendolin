# Amendolin
## Estudos de programação da Verena

---

### Fluxograma da Programação

![fluxo-programaca](./imagens/fluxo-programacao.png)

---

### Video como funciona logica de programção

[Logica de programação com pasta de amendoim e geléia](https://www.youtube.com/watch?v=mhGZRTbUUo8)


--- 

### Logica do Lobo, Ovelha e Repolho
- **Site Jogo**
    - [Lobo, Ovelha e Repolho](https://clubes.obmep.org.br/blog/112532-2/)

- **Problema**?
    - Tenho que atravessar o lobo, a ovelha e o repolho para o outro lado do rio.

- **Regras**
    - O lobo não pode ficar sozinho com a ovelha
    - A ovelha não pode ficar sozinha com o repolho

- **Solução**
    - ⁠pegue a ovelha
    - ⁠coloque a ovelha no barco
    - ⁠reme o barco até o outro lado do rio
    - ⁠tire a ovelha do barco
    - ⁠reme até o outro lado do rio
    - ⁠pegue o lobo
    - ⁠coloque o lobo no barco
    - ⁠reme o barco até o outro lado do rio
    - ⁠tire o lobo do barco
    - ⁠pegue a ovelha
    - ⁠coloque a ovelha no barco
    - ⁠reme o barco até o outro lado do rio
    - ⁠tire a ovelha do barco
    - ⁠pegue o repolho
    - ⁠coloque o repolho no barco
    - ⁠reme o barco até o outro lado do rio
    - ⁠pegue o repolho
    - ⁠tire o repolho do barco
    - ⁠reme o barco ate o outro lado do rio
    - ⁠pegue a ovelha
    - ⁠coloque a ovelha no barco
    - ⁠reme o barco até o outro lado do rio
    - ⁠pegue a ovelha
    - ⁠tire a ovelha do barco

- **Comparação entre Logica e Código**
- Lógica
    - ⁠pegue a ovelha
    - ⁠coloque a ovelha no barco
    - ⁠reme o barco até o outro lado do rio
    - ⁠tire a ovelha do barco
    - ⁠reme até o outro lado do rio
    - ⁠pegue o lobo
    - ⁠coloque o lobo no barco
    - ⁠reme o barco até o outro lado do rio
    - ⁠tire o lobo do barco
    - ⁠pegue a ovelha
    - ⁠coloque a ovelha no barco
    - ⁠reme o barco até o outro lado do rio
    - ⁠tire a ovelha do barco
    - ⁠pegue o repolho
    - ⁠coloque o repolho no barco
    - ⁠reme o barco até o outro lado do rio
    - ⁠pegue o repolho
    - ⁠tire o repolho do barco
    - ⁠reme o barco ate o outro lado do rio
    - ⁠pegue a ovelha
    - ⁠coloque a ovelha no barco
    - ⁠reme o barco até o outro lado do rio
    - ⁠pegue a ovelha
    - ⁠tire a ovelha do barco

- Código (angelotlin)
    - Linguagem Aleatoria
        - ovelha
        - barco(ovelha)
        - barco.remar()
        - barco.tirarAnimal(ovelha)
    - Java
        - Ovelha ovelha = new Ovelha();
        - Barco barco = new Barco(ovelha);
        - barco.remar();
        - barco.removerAnimal("ovelha");
        - barco.remar();

- **Algoritmos e Variaveis**
    - Algoritimo - Uma sequencia logica de passos a serem executados
    - Variavel - Espaço na memória para armazenarmos alguma informação

    - Exemplo
        - Padoca do Ronildo
            - Aceita apenas um tipo de pagamento
                - Dinheiro

            - Ajude o ronildo a cobrar os seus clientes corretamente!

            - Quando o cliente esta no caixa, o que deve acontecer ?
                - valor_recebido_do_cliente = 3
                - valor_total_do_produto = 10
                - valor_do_troco = ?
                - nome_do_cliente = "Werens"

            - verificar o valor do produto
            - cobrar o valor total do cliente
            - o cliente deve pagar o produto 
            - consultar o valor que o cliente esta pagando:
                
            - se o valor pago do cliente não for o valor total do produto, o que deve acontecer ?
                - não leva o produto

                - se o valor pago do cliente for igual ao valor total do produto, o que deve acontecer ?
                - leva o produto

                - se o valor pago do cliente for a mais que o valor total do produto, o que deve acontecer ?
                - dar o troco "dar_troco()"
            
            - fim
            - Obrigado por comprar comigo "nome_do_cliente"

            - dar_troco()
                - receber o valor
                - conferir o valor recebido com o valor do produto
                - valores estão preenchidos ? sim
                - se estão preenchido (recebidos) ?
                    - calcular o valor do troco
                    - valor_do_troco (vai receber) valor_recebido_do_cliente (menos) valor_total_do_produto
                    - valor_do_troco = 50 - 15
                    - valor_do_troco = 35
                - devolve valor_do_troco para cliente


- Exercicio: Black Cat School

    - Como calulcar a média do aluno para saber se ele pasou de ano ou não

        - quantidade_de_alunos = 5

        - quantidade_de_provas = 2

        - nota_prova_1 = ?
        - nota_prova_2 = ?

        - nota_final = nota_prova_1 + nota_prova_2

        - media = nota_final / quantidade_de_provas

```shell
- calcula_media_aluno(nota_prova_1, nota_prova_2)
    - caluclar a nota final
        - nota_final = nota_prova_1 + nota_prova_2
    - calcular a media
        - media = nota_final / quantidade_de_provas
    - se a media for menor que 5
        - aluno reprovado
    - se a media for maior ou igual a 5
        - aluno aprovado
    - fim
```
```shell
Jake ----------- 8, 2 ----- APROVADO -- 5
Xeroquinho ----- 3, 7 ----- APROVADO -- 5
Pinguelinho ---- 5, 10 ---- APROVADO -- 7,5
Pingo ---------- 7, 1 ----- REPROVADO - 4
Thammy --------- 10, 1 ---- APROVADO -- 5,5
```
- Aplicando o Algoritimo
    - nota_prova_1 = ?
    - nota_prova_2 = ?
    - quantidade_de_provas = quantidade_de_notas
    - quantidade_de_provas = 2


    - Como calcular as notas de todos os alunos em um unico comando ?
    - ter uma lista de alunos
        - lista_de_alunos = [
                                1 - Jake: (8,2),
                                2 - Xeroquinho: (3,7),
                                3 - Pinguelinho: (5,10),
                                4 - Pingo: (7,1),
                                5 - Thammy: (10,1),
                            ]
    - para cada aluno dentro da lista execute a tarefa chamada calcula_media_aluno ate o ultimo aluno
        - quantos alunos ha na lista ?
            - 5
        - a lista deve ser executada 5 vezes
            - calcula_media_aluno(1 n_1, n_2)
            - calcula_media_aluno(2 n_1, n_2)
            - calcula_media_aluno(3 n_1, n_2)
            - calcula_media_aluno(4 n_1, n_2)
            - calcula_media_aluno(5 n_1, n_2)
        - a lista chegou no limite maximo ?
            - sim
        - fim
    
```shell
calcula_media_aluno(nota_prova_1, nota_prova_2)
    - calcular a quantidade de provas
        - quantidade_de_provas = (qtd notas == qtd provas)
        - quantidade_de_provas = nota_prova_1 + nota_prova_2 (2 provas)
        - quantidade_de_provas = ?
    - calcular a nota final
        - nota_final = nota_prova_1 + nota_prova_2
        - nota_final = ? + ?
        - nota_final = ?
    - calcular a media
        - media = nota_final / quantidade_de_provas
        - media = ? / ?
        - media = ?

    - se a media for menor que 5
        - aluno reprovado
    - se a media for maior ou igual a 5
        - aluno aprovado
    - fim
```

- Solução Verena
```shell
nota_prova_1 = ?

nota_prova_2 = ?

quantidade_de_provas = quantidade_de_notas

quantidade_de_alunos_reprovados = Jake, Xeroquinho.

1 - Jake: (3,2), 
2 - Xeroquinho: (3,3), 
3 - Pinguelinho: (5,10)


calcula_media_aluno(nota_prova_1, nota_prova_2)
    - calcular a quantidade de provas
        - quantidade_de_provas = (qtd notas == qtd provas)
        - quantidade_de_provas = nota_prova_1 + nota_prova_2 (2 provas)
        - quantidade_de_provas = ?
    - calcular a nota final
        - nota_final = nota_prova_1 + nota_prova_2
        - nota_final = ? + ?
        - nota_final = ?
    - calcular a media
        - media = nota_final / quantidade_de_provas
        - media = ? / ?
        - media = ?

    - se a media for menor que 5
        - aluno reprovado
        - quantidade_de_aluno_reprovado = aluno
    - se a media for maior ou igual a 5
        - aluno aprovado
    - informar a quantidade de alunos reprovados 
	- verificar quantidade de alunos reprovados dentro de quantidade_de_aluno_reprovado
	- informar a quantidade de alunos reprovados
    - fim
```