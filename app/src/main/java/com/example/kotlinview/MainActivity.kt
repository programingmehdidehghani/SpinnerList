package com.example.kotlinview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() , SpinnerTextViewBaseAdapter.OnItemSelectedListener{

    private lateinit var spinnerTextView: SpinnerTextView<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinnerTextView = findViewById(R.id.spinner)

        var adapter = SpinnerAdapter()
        adapter.setListener(this)
        adapter.setItems(listOf(
                "0 - Google Play"
                , "1 - Lenovo"
                , "2 - Apple"
                , "3 - SONY"
                , "4 - Nokia"
                , "5 - HUAWI"
                , "6 - Asus"))
        spinnerTextView.setAdapter(adapter)
    }

    override fun onItemSelected(any: Any, title: String, position: Int) {
        Toast.makeText(applicationContext, title, Toast.LENGTH_SHORT).show()
        spinnerTextView.notifySelectedItem(title, position)
    }
}