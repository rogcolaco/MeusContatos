package com.example.meuscontatos.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.meuscontatos.R
import com.example.meuscontatos.controller.AutenticadorFirebase
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
                val email = activityAutenticacaoBinding.emailEt.text.toString()
                val senha = activityAutenticacaoBinding.senhaEt.text.toString()
                AutenticadorFirebase.firebaseAuth.signInWithEmailAndPassword(email, senha).addOnSuccessListener {
                    Toast.makeText(this, "Usuario $email autenticado com sucesso", Toast.LENGTH_SHORT).show()
                    posLoginSucesso()
                } .addOnFailureListener{
                    Toast.makeText(this, "Usuario não autenticado", Toast.LENGTH_SHORT).show()
                    finish()
                }
            }
            R.id.recuperarSenhaBt -> {
                startActivity(Intent(this,RecuperarSenhaActivity::class.java))
            }
        }

    }

    private fun posLoginSucesso(){
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}