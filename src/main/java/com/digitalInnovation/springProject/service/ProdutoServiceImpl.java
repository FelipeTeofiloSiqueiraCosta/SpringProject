/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitalInnovation.springProject.service;

import com.digitalInnovation.springProject.model.Categoria;
import com.digitalInnovation.springProject.model.CategoriaRepository;
import com.digitalInnovation.springProject.model.Produto;
import com.digitalInnovation.springProject.model.ProdutoRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author felipeteofilosiqueiracosta
 */
@Service
public class ProdutoServiceImpl implements ProdutoService{
    
    @Autowired
    private ProdutoRepository prodRep;
    @Autowired
    private CategoriaRepository catRep;
    
    @Override
    public Iterable<Produto> buscarTodos() {
        return prodRep.findAll();
    }

    @Override
    public Produto buscarPorId(Long id) {
        Optional<Produto> p = prodRep.findById(id);
        return p.get();
    }
    
    

    @Override
    public void inserir(Produto p) {
        Categoria c = catRep.findById(p.getCategoria().getId()).orElseGet(()->{ //caso nao consiga encontrar categoria com esse id
            Categoria nc = new Categoria(p.getCategoria().getDescricao());
            
            catRep.save(nc);
           return nc;
        });
        p.setCategoria(c);
        
        prodRep.save(p);
    }

    @Override
    public void atualizar(Long id, Produto p) {
        Optional<Produto> pr = prodRep.findById(id);
        if(pr.isPresent()){ //se existir esse produto
           prodRep.save(p); 
        }
        
    }

    @Override
    public void deletar(Long id) {
        prodRep.deleteById(id);
    }
}
