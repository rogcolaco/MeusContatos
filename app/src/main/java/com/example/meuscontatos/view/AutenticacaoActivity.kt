package com.example.meuscontatos.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.meuscontatos.databinding.ActivityAutenticacaoBinding

class AutenticacaoActivity : AppCompatActivity() {

    private lateinit var activityAutenticacaoBinding: ActivityAutenticacaoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityAutenticacaoBinding = ActivityAutenticacaoBinding.inflate(layoutInflater)
        setContentView(activityAutenticacaoBinding.root)
    }

    fun onClick(view: View) {}
}