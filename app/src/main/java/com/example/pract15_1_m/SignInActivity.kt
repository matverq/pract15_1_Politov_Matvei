package com.example.pract15_1_m

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import java.net.PasswordAuthentication

class SignInActivity : AppCompatActivity() {
    lateinit var email: EditText
    lateinit var password: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        email=findViewById(R.id.editText)
        password=findViewById(R.id.editText2)
    }
fun signin(view: View) {
    if(email.text.toString().isNotEmpty() && password.text.toString().isNotEmpty())
    {

    }
    else
    {
      val alert = AlertDialog.Builder(this)
          .setTitle("Ошибка")
          .setMessage("У вас есть незаполненные поля")
          .setPositiveButton("OK", null)
          .create()
          .show()
    }
}
    fun email(view: View) {}
    fun password(view: View) {}
}