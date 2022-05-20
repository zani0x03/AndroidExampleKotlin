package br.com.zani0x03.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import br.com.zani0x03.orgs.R
import br.com.zani0x03.orgs.model.Produto
import br.com.zani0x03.orgs.ui.recyclerview.adapter.ListaProdutosAdapter
import java.math.BigDecimal

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Toast.makeText(this, "Bem vindo(a) ao Orgs", Toast.LENGTH_SHORT).show()
//        val view = TextView(this)
//        view.text = "Teste de frutas"
//        setContentView(view)
        setContentView(R.layout.activity_main)
//        val nome = findViewById<TextView>(R.id.nome)
//        nome.text = "Teste Tiago"
//
//        val descricao = findViewById<TextView>(R.id.descricao)
//        descricao.text = "Teste Tiago descrição"
//
//        val valor = findViewById<TextView>(R.id.valor)
//        valor.text = "9.99"

//        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
//        recyclerView.adapter = ListaProdutosAdapter()

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter(context = this, produtos = listOf(
            Produto(nome = "teste",
                descricao = "teste desc",
                valor = BigDecimal("19.99")
            ),
            Produto(nome = "teste 1",
                descricao = "teste desc 1",
                valor = BigDecimal("29.99")
            ),
            Produto(nome = "teste 2",
                descricao = "teste desc 2",
                valor = BigDecimal("39.99")
            ),
        ))
    }
}