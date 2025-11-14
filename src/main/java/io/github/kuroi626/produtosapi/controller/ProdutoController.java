package io.github.kuroi626.produtosapi.controller;
import io.github.kuroi626.produtosapi.model.Produto;
import io.github.kuroi626.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto){
        String id = UUID.randomUUID().toString();
        produto.setId(id);
        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping("{id}")
    public Produto obterId(@PathVariable("id") String id){
        Optional<Produto> produto = produtoRepository.findById(id);
        return produto.orElse(null);


    }


}
