package com.zidanyazidhimawan_19102275.practice5

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_practice5_read_data.*

class Practice5ReadDataActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_PRODI = "extra_prodi"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice5_read_data)

        val prodi = intent.getStringExtra(EXTRA_PRODI)
        lblProdiSaya.text = "Prodi Saya Adalah $prodi"
    }
}