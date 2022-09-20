package com.example.applele

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
fun main () {
    println ("Вы запустили программу для расчета объема параллелепипеда")
    print("Введите ширину: ")
    val shyrina:Int = readLine()!!.toInt()
    print("Введите длину: ")
    val dlina:Int = readLine()!!.toInt()
    print("Введите высоту: ")
    val vysota:Int = readLine()!!.toInt()
    val V:Int = shyrina*dlina*vysota
    print("Объем вашего параллелепипеда равен $shyrina*$dlina*$vysota = $V")
}