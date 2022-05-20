package br.com.zani0x03.orgs.dao

import br.com.zani0x03.orgs.model.Produto

class ProdutosDao {
    fun adiciona(produto: Produto){
        produtos.add(produto)
    }

    fun buscaTodos() : List<Produto> {
        return produtos.toList()
    }

    companion object {
        private val produtos = mutableListOf<Produto>()
    }
}