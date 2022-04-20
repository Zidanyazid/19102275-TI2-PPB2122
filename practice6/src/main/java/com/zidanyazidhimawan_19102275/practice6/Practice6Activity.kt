package com.zidanyazidhimawan_19102275.practice6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.zidanyazidhimawan_19102275.practice6.adapter.ListMyDataAdapter
import kotlinx.android.synthetic.main.activity_practice6.*

class Practice6Activity : AppCompatActivity() {

    private fun getListMyDatas(): ArrayList<MyData> {
        val dataName = resources.getStringArray(R.array.data_name)
        val dataDescription = resources.getStringArray(R.array.data_description)
        val dataPhoto = resources.getStringArray(R.array.data_photo)
        val listMyData = ArrayList<MyData>()
        for (position in dataName.indices) {
            val myData = MyData(
                dataName[position],
                dataDescription[position],
                dataPhoto[position]
            )
            listMyData.add(myData)
        }
        return listMyData
    }

    private val list = ArrayList<MyData>()

    private fun showRecyclerList() {
        rv_mydata.layoutManager = LinearLayoutManager(this)
        val listMyDataAdapter = ListMyDataAdapter(list)
        rv_mydata.adapter = listMyDataAdapter
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice6)

        rv_mydata.setHasFixedSize(true)
        list.addAll(getListMyDatas())
        showRecyclerList()
    }
}