package com.zidanyazidhimawan_19102275.practice6.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.zidanyazidhimawan_19102275.practice6.MyData
import com.zidanyazidhimawan_19102275.practice6.R
import com.zidanyazidhimawan_19102275.practice6.databinding.ItemListBinding

class ListMyDataAdapter(private val listMyData: ArrayList<MyData>) :
    RecyclerView.Adapter<ListMyDataAdapter.ListViewHolder>() {

    private val layoutInflater: LayoutInflater
        get() {
            TODO()
        }
    val binding = ItemListBinding.inflate(layoutInflater)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent, false)
        return ListViewHolder(view)

    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(listMyData[position])
    }

    override fun getItemCount(): Int = listMyData.size

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(myData: MyData) {
            with(itemView){
                Glide.with(itemView.context)
                    .load(myData.photo)
                    .apply(RequestOptions().override(55, 55))
                    .into(binding.imgItemPhoto)
                binding.tvItemName.text = myData.name
                binding.tvItemDescription.text = myData.description
            }
        }
    }

}
