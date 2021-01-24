package com.example.meuscontatos.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.meuscontatos.databinding.ActivityCadastrarBinding

class CadastrarActivity : AppCompatActivity() {

    private lateinit var activityCadastrarBinding: ActivityCadastrarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityCadastrarBinding = ActivityCadastrarBinding.inflate(layoutInflater)
        setContentView(activityCadastrarBinding.root)
    }
}