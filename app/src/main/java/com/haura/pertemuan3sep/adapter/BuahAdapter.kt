package com.haura.pertemuan3sep.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.haura.pertemuan3sep.DetailPage
import com.haura.pertemuan3sep.R
import com.haura.pertemuan3sep.model.ModelBuah


class BuahAdapter (val itemList:ArrayList<ModelBuah>) :
RecyclerView.Adapter<BuahAdapter.ModelViewHolder>() {
    class ModelViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        //deklarasi widget dari item layout
        var itemImage :ImageView
        var ItemText : TextView

        init {
            itemImage = itemView.findViewById(R.id.gambar) as ImageView
            ItemText =itemView.findViewById(R.id.nama) as TextView
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModelViewHolder {
        val nView =LayoutInflater.from(parent.context)
            .inflate(R.layout.item_custome_image,parent,false)
        return ModelViewHolder(nView)

    }

    override fun onBindViewHolder(holder: ModelViewHolder, position: Int) {
     holder.itemImage.setImageResource(itemList[position].image)
        holder.ItemText.setText(itemList[position].deskripsi)

        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context, DetailPage::class.java)
            intent.putExtra("imageResId", itemList[position].image)  // Mengirim gambar
            intent.putExtra("deskripsi", itemList[position].deskripsi)  // Mengirim deskripsi
            context.startActivity(intent)  // Memulai activity detail
        }
    }

    override fun getItemCount(): Int {
        return itemList.size

    }

}