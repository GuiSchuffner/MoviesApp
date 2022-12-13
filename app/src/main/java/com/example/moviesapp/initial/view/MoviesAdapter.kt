package com.example.moviesapp.initial.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesapp.R
import com.example.moviesapp.initial.data.model.Movies
import com.google.android.material.textview.MaterialTextView

class MoviesAdapter(
    private var moviesList: List<Movies>
) : RecyclerView.Adapter<MoviesAdapter.MoviesAdapterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesAdapterViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.movies_item, parent, false)
        return MoviesAdapterViewHolder(view)
    }

    override fun onBindViewHolder(holder: MoviesAdapterViewHolder, position: Int) {
        holder.bindListItem(moviesList[position])
    }

    override fun getItemCount(): Int {
        return moviesList.size
    }

    class MoviesAdapterViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {
        private val itemTitle = itemView.findViewById<MaterialTextView>(R.id.MovieTitle)
        private val itemStartYearDescription =
            itemView.findViewById<MaterialTextView>(R.id.startYearDescription)
        private val itemStartYear = itemView.findViewById<MaterialTextView>(R.id.startYear)
        private val itemEndYearDescription =
            itemView.findViewById<MaterialTextView>(R.id.endYearDescription)
        private val itemEndYear = itemView.findViewById<MaterialTextView>(R.id.endYear)
        private val itemYearDescription =
            itemView.findViewById<MaterialTextView>(R.id.yearDescription)
        private val itemYear = itemView.findViewById<MaterialTextView>(R.id.year)
        private val numberOfEpisodesDescription =
            itemView.findViewById<MaterialTextView>(R.id.numberOfEpisodesDescription)
        private val numberOfEpisodes = itemView.findViewById<MaterialTextView>(R.id.numberOfEpisodes)

        fun bindListItem(movies: Movies) {
            itemTitle.text = movies.title

            if(movies.seriesStartYear>0){
                itemStartYear.text=movies.seriesStartYear.toString()
                itemStartYear.visibility=View.VISIBLE
                itemStartYearDescription.visibility=View.VISIBLE
            }
            else{
                itemStartYear.visibility=View.GONE
                itemStartYearDescription.visibility=View.GONE
            }

            if(movies.seriesEndYear>0) {
                itemEndYear.text=movies.seriesStartYear.toString()
                itemEndYear.visibility = View.VISIBLE
                itemStartYearDescription.visibility = View.VISIBLE
            }
            else {
                itemEndYear.visibility = View.GONE
                itemStartYearDescription.visibility = View.GONE
            }

            if(movies.seriesEndYear <= 0 && movies.seriesStartYear <= 0 && movies.year >0) {
                itemYear.text = movies.year.toString()
                itemYear.visibility = View.VISIBLE
                itemYearDescription.visibility = View.VISIBLE
            }
            else {
                itemYear.visibility = View.GONE
                itemYearDescription.visibility = View.GONE
            }

            if(movies.numberOfEpisodes > 0) {
                numberOfEpisodes.text = movies.numberOfEpisodes.toString()
                numberOfEpisodes.visibility=View.VISIBLE
                numberOfEpisodesDescription.visibility=View.VISIBLE
            }
            else {
                numberOfEpisodes.visibility=View.VISIBLE
                numberOfEpisodesDescription.visibility=View.VISIBLE
            }
        }

    }
}