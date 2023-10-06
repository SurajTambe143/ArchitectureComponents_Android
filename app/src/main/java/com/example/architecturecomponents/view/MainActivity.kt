package com.example.architecturecomponents.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.example.architecturecomponents.R
import com.example.architecturecomponents.databinding.ActivityMainBinding
import com.example.architecturecomponents.modal.Detail
import com.example.architecturecomponents.view_model.MainViewModel
import com.example.architecturecomponents.view_model.MainViewModelFactory

class MainActivity : AppCompatActivity() {

//    lateinit var binding: ActivityMainBinding
    lateinit var display:TextView
    lateinit var vm:MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        vm=ViewModelProvider(this,MainViewModelFactory(100)).get(MainViewModel::class.java)
        //1) View binding
//        binding= ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//        binding.textView.text="Hello"

        //2) Data binding
//        binding= DataBindingUtil.setContentView(this, R.layout.activity_main)
//        val input=Detail("Name") (Data class name Detail)
//        binding.detail=input
        display=findViewById(R.id.text_view)
        setText()
    }

    fun increment(view: View) {
        vm.increment()
        setText()
    }

    fun setText(){
        display.text=vm.count.toString()
    }

}