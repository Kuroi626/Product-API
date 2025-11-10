package io.github.kuroi626.produtosapi.controller;
import io.github.kuroi626.produtosapi.model.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produtos")
public class ProdutoController {


    @PostMapping
    public String salvar(@RequestBody Produto produto){

        System.out.println("produto recebido: "+produto);
        return "Success";

    }


}
