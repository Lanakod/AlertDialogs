package com.example.alertdialogs

import android.app.Application
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    lateinit var builder: AlertDialog.Builder
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        builder =  AlertDialog.Builder(this)
        builder.setMessage("Вы точно хотите выйти из приложения?")
                .setTitle("Выход из приложения")
                .setPositiveButton("Да", DialogInterface.OnClickListener{dialog, id -> okayClick()})
                .setNegativeButton("Нет", DialogInterface.OnClickListener{dialog, id -> notokayClick()})
                .create()
    }

    fun exitClick(view: View) {
        builder.show()
    }

    fun okayClick(){
        finish()
    }

    fun notokayClick(){ }
}