package com.haura.pertemuan3sep.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.haura.pertemuan3sep.R
import com.haura.pertemuan3sep.RecycleView
import com.haura.pertemuan3sep.Recycle_View_Card_Movie
import com.haura.pertemuan3sep.model.ModelMovie


class  MovieAdapter constructor(
    private val getActivity: Recycle_View_Card_Movie,
    private val movieList: List<ModelMovie>,
    private val itemClickListener: (Int) -> Unit) :
    RecyclerView.Adapter<MovieAdapter.MyViewHolder>()
{
    class MyViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {
        val txtMovie : TextView = itemView.findViewById(R.id.txtMovie)
        val imgMovie : ImageView = itemView.findViewById(R.id.imgMovie)
        val cardView : CardView = itemView.findViewById(R.id.cardView)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_movie_card, parent, false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.txtMovie.text = movieList[position].title
        holder.imgMovie.setImageResource(movieList[position].image)

//        holder.cardView.setOnClickListener(){
//            Toast.makeText(
//                getActivity, movieList[position].title,
//                Toast.LENGTH_SHORT
//            ).show()

            holder.itemView.setOnClickListener {
                itemClickListener(position)
            }
        }
    }
