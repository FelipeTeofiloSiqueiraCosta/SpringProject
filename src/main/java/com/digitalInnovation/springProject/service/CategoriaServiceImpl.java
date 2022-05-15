/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitalInnovation.springProject.service;

import com.digitalInnovation.springProject.model.Produto;
import org.springframework.stereotype.Service;

/**
 *
 * @author felipeteofilosiqueiracosta
 */
@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Override
    public Iterable<Produto> buscarTodos() {
        return null;
    }

    @Override
    public Produto buscarPorId() {
        return null;
    }

    @Override
    public Produto buscarPorDescricao() {
     return null;
    }

    @Override
    public void inserir(Produto p) {
    
    }

    @Override
    public void atualizar(Long id, Produto p) {
    
    }

    @Override
    public void deletar(Long id) {
    
    }
    
}
