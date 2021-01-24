package com.example.meuscontatos.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.meuscontatos.R
import com.example.meuscontatos.databinding.ActivityAutenticacaoBinding

class AutenticacaoActivity : AppCompatActivity() {

    private lateinit var activityAutenticacaoBinding: ActivityAutenticacaoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityAutenticacaoBinding = ActivityAutenticacaoBinding.inflate(layoutInflater)
        setContentView(activityAutenticacaoBinding.root)
    }

    fun onClick(view: View) {

        when(view.id){
            R.id.cadastrarBt -> {
                startActivity(Intent(this,CadastrarActivity::class.java))
            }
            R.id.entrarBt -> {

            }
            R.id.recuperarSenhaBt -> {
                startActivity(Intent(this,RecuperarSenhaActivity::class.java))
            }
        }

    }
}