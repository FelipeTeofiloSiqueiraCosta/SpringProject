/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitalInnovation.springProject.controller;

import com.digitalInnovation.springProject.model.Produto;
import com.digitalInnovation.springProject.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author felipeteofilosiqueiracosta
 */
@RestController
@RequestMapping("produto")
public class ProdutoRestController {
    
    @Autowired
    private ProdutoService produtoService;
    
    @GetMapping
    public ResponseEntity<Iterable<Produto>> buscarTodos(){
        return ResponseEntity.ok(produtoService.buscarTodos());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscarporId(@PathVariable Long id){
        return ResponseEntity.ok(produtoService.buscarPorId(id));
    }
    @PostMapping
    public ResponseEntity<Produto> inserir(@RequestBody Produto p){
        produtoService.inserir(p);
        return ResponseEntity.ok(p);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Produto> atualizar(@PathVariable Long id,@RequestBody Produto p){
        produtoService.atualizar(id, p);
        return ResponseEntity.ok(p);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Produto> deletar(@PathVariable Long id){
        produtoService.deletar(id);
        return ResponseEntity.ok().build();
    }
    
}
