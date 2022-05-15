/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.digitalInnovation.springProject.service;

import com.digitalInnovation.springProject.model.Produto;

/**
 *
 * @author felipeteofilosiqueiracosta
 */
public interface ProdutoService {
    public Iterable<Produto> buscarTodos();
    public Produto buscarPorId(Long id);
    public void inserir(Produto p);
    public void atualizar(Long id, Produto p);
    public void deletar(Long id);
}
