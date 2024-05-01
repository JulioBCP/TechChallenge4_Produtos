package br.com.fiap.controller;

import br.com.fiap.model.Produto;
import br.com.fiap.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> listarProdutos() {
        return produtoService.listarProduto();
    }

    @PostMapping
    public Produto cadastrarProduto(@RequestBody Produto produto) {
        return produtoService.cadastrarProduto(produto);
    }

    @GetMapping("/{produtoId}")
    public ResponseEntity<?> listarUmProduto(@PathVariable Integer produtoId) {
        return produtoService.listarUmProduto(produtoId);
    }

    @PutMapping("/{produtoId}")
    public Produto atualizarProduto(@PathVariable Integer produtoId, @RequestBody Produto novoProduto) {
        return produtoService.atualizarProduto(produtoId, novoProduto);
    }

    @DeleteMapping("/{produtoId}")
    public void excluirProduto(@PathVariable Integer produtoId) {
        produtoService.excluirProduto(produtoId);
    }

    @PutMapping("/atualizar/estoque/{produtoId}/{quantidade}/{entradaSaida}")
    public Produto atualizarEstoque(@PathVariable Integer produtoId, @PathVariable int quantidade, @PathVariable String entradaSaida) {
        return produtoService.atualizarEstoque(produtoId, quantidade, entradaSaida);
    }

}
