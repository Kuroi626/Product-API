package io.github.kuroi626.produtosapi.repository;

import io.github.kuroi626.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto,String>{
}
