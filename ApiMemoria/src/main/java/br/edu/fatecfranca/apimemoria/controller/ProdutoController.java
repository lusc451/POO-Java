package br.edu.fatecfranca.apimemoria.controller;

import br.edu.fatecfranca.apimemoria.model.Produto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.HashMap;


@RestController
@RequestMapping("/produto")
public class ProdutoController {
    //Simulando um banco de dados
    private static final Map<Long, Produto> produtos = new HashMap<Long, Produto>();

    static {
        produtos.put(1L, new Produto(1L, "Mouse Óptico", "Sem fio", 100.0));
        produtos.put(2L, new Produto(2L, "Teclado Mecânico", "Com fio", 200.0));
        produtos.put(3L, new Produto(3L, "Monitor 24", "Full HD", 800.0));
    }

    @GetMapping
    public Map<Long, Produto> getProdutos() {
        return produtos;
    }

    @PostMapping
    public Produto addProduto(@RequestBody Produto produto){
        produtos.put(produto.getId(), produto);
        return produto;
    }

    @DeleteMapping("/{id}")
    public Produto deleteProduto(@PathVariable Long id){
        return produtos.remove(id);
    }

}
