package br.com.maxcarvalho.playlist

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class TelaInicial : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        //METODO CHAMADO NO MOMENTO QUE A APLICACAO E CRIADA
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_inicial)
        Log.i("INFO", "Aplicacao criada")
    }

    //METODO CHAMADO QUANDO O APP E ESCALONADO PARA EXECUTAR
    override fun onStart(){
        super.onStart()
        Log.i("INFO", "Aplicacao iniciada")
    }

    //METODO CHAMADO QUANDO A APP VOLTOU A ESTAR ATIVA NA TELA
    override fun onResume() {
        super.onResume()
        Log.i("INFO", "Aplicacao Resumida")
    }

    //METODO CHAMADO QUANDO O APP ESTA EM BACKGROUND
    override fun onStop() {
        super.onStop()
        Log.i("INFO", "Aplicacao Stopada")
    }

    //METODO CHAMANDO QUANDO O APP VAI SAIR DA TELA
    override fun onPause() {
        super.onPause()
        Log.i("INFO", "Aplicacao Pausada")
    }

    //APLICACAO FOI DESTRUIDA
    override fun onDestroy() {
        super.onDestroy()
        Log.i("INFO", "Aplicacao Destruida")
    }
}
