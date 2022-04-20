package com.zidanyazidhimawan_19102275.lifecycleapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.zidanyazidhimawan_19102275.lifecycleapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPage.setOnClickListener{
            val intent = Intent(this, HalamanDuaActivity::class.java)
            startActivity(intent)
        }
    }

    fun printState(msg: String){
        Log.d("ActivityState",msg)
        Toast.makeText(applicationContext,msg, Toast.LENGTH_SHORT).show()
    }

    override fun onStart(){
        super.onStart()
        printState("Halaman satu On Start")
    }
    override fun onResume(){
        super.onResume()
        printState("Halaman satu On Resume")
    }
    override fun onPause(){
        super.onPause()
        printState("Halaman satu On Pause")
    }
    override fun onStop(){
        super.onStop()
        printState("Halaman satu On Stop")
    }
    override fun onRestart(){
        super.onRestart()
        printState("Halaman satu On Restart")
    }
    override fun onDestroy(){
        super.onDestroy()
        printState("Halaman satu On Destroy")
    }
}