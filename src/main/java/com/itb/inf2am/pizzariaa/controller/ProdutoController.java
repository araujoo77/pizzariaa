package com.itb.inf2am.pizzariaa.controller;


// No spring e comum adicionar anotacoes (annotation) em classes, atributos e metodos
// uma annnotation e uma forma de adicionar informacoes (metadados) ou seu codigo
//que podem ser interpretadas pelo seu compilador ou em tempo de execucao pro ferramentas e fremeworks
//como Sping
// Um annotation e uma palavra iniciada com '@' que vc coloca acima de uma classe, metodo
// atributo o parametro para dar instrucoes extras ao Java ou algum framework sobre como
//aquele elemento pode ser tratado.



import com.itb.inf2am.pizzariaa.model.entity.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping ("/api/v1/produto")
public class ProdutoController {

    List<Produto> produtos = new ArrayList<>();

    @GetMapping
    public List<Produto> findAll() {

        Produto p1 = new Produto();
        p1.setNome("Pizza de calabreza");
        p1.setDescricao("pizza com muita calabreza e cebola");
        p1.setValorVenda(49.50);

        Produto p2 = new Produto();
        p2.setNome("Pizza de mussarela");
        p2.getDescricao("Pizza com muito queijo");
        p2.setValorVenda(63.57);

        //Adicionando o produto
        produtos.add(p1);
        produtos.add(p2);


        return produtos;
    }



}
