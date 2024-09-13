package com.haura.pertemuan3sep

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.haura.pertemuan3sep.adapter.MovieAdapter
import com.haura.pertemuan3sep.model.ModelMovie

class Recycle_View_Card_Movie : AppCompatActivity() {

    private var RecycleView: RecyclerView? = null
    private var movieAdapter : MovieAdapter? =null
    private var movieList = mutableListOf<ModelMovie>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycle_view_card_movie)

        movieList = ArrayList()
        RecycleView = findViewById(R.id.rv_list) as RecyclerView
        movieAdapter = MovieAdapter(this, movieList)
        val layoutManager : RecyclerView.LayoutManager = GridLayoutManager(this, 2)
        RecycleView!!.layoutManager =layoutManager
        RecycleView!!.adapter = movieAdapter

        prepareMovieList()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    private fun prepareMovieList(){
        var movie = ModelMovie( "avatar", R.drawable.avatar)
        movieList.add(movie)

        movie = ModelMovie( "batma", R.drawable.batman)
        movieList.add(movie)
        movie = ModelMovie( "End Game", R.drawable.end_game)
        movieList.add(movie)
        movie = ModelMovie( "Hulk", R.drawable.hulk)
        movieList.add(movie)
        movie = ModelMovie( "Inception", R.drawable.inception)
        movieList.add(movie)
        movie = ModelMovie( "Jumanji", R.drawable.lucy)
        movieList.add(movie)
        movie = ModelMovie( "Jurassic World", R.drawable.jurassic_world)
        movieList.add(movie)
        movie = ModelMovie( "Spider Man", R.drawable.spider_man)
        movieList.add(movie)
        movie = ModelMovie( "Venom", R.drawable.venom)
        movieList.add(movie)

        movieAdapter!!.notifyDataSetChanged()






    }
}