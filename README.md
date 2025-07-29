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

