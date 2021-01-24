package com.example.meuscontatos.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.meuscontatos.databinding.ActivityRecuperarSenhaBinding

class RecuperarSenhaActivity : AppCompatActivity() {

    private lateinit var activityRecuperarSenhaBinding: ActivityRecuperarSenhaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityRecuperarSenhaBinding = ActivityRecuperarSenhaBinding.inflate(layoutInflater)
        setContentView(activityRecuperarSenhaBinding.root)
    }
}