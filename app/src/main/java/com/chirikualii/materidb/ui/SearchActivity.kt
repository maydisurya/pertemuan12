package com.chirikualii.materidb.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListAdapter
import android.widget.Toast
import androidx.core.widget.doOnTextChanged
import com.chirikualii.materidb.data.model.Movie
import com.chirikualii.materidb.databinding.ActivitySearchBinding
import com.chirikualii.materidb.ui.adapter.MovieListAdapter

class SearchActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySearchBinding
    private lateinit var listAdapter : MovieListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySearchBinding.inflate(layoutInflater)
        setContentView(binding.root)


        listAdapter = MovieListAdapter()
        binding.rvMovie.adapter = listAdapter

        binding.etSearch.doOnTextChanged { text, _, _, _ ->

            listAdapter.addItem(
                listOf(
                    Movie(
                        movieId = "lfnancvpa",
                        title = "avampva",
                        releaseDate = "cvmapmpav",
                        imagePoster = "mpcamcpacm",
                        backdrop = "mcvapvma",
                        overview = "vjapmvamvpavm",
                        bookmark = 1
                    ),
                    Movie(
                        movieId = "lfnancvpa",
                        title = "avampva",
                        releaseDate = "cvmapmpav",
                        imagePoster = "mpcamcpacm",
                        backdrop = "mcvapvma",
                        overview = "vjapmvamvpavm",
                        bookmark = 1
                    ),
                    Movie(
                        movieId = "lfnancvpa",
                        title = "avampva",
                        releaseDate = "cvmapmpav",
                        imagePoster = "mpcamcpacm",
                        backdrop = "mcvapvma",
                        overview = "vjapmvamvpavm",
                        bookmark = 1
                    ),
                    Movie(
                        movieId = "lfnancvpa",
                        title = "avampva",
                        releaseDate = "cvmapmpav",
                        imagePoster = "mpcamcpacm",
                        backdrop = "mcvapvma",
                        overview = "vjapmvamvpavm",
                        bookmark = 1
                    ),
                    Movie(
                        movieId = "lfnancvpa",
                        title = "avampva",
                        releaseDate = "cvmapmpav",
                        imagePoster = "mpcamcpacm",
                        backdrop = "mcvapvma",
                        overview = "vjapmvamvpavm",
                        bookmark = 1
                    ),
                    Movie(
                        movieId = "lfnancvpa",
                        title = "avampva",
                        releaseDate = "cvmapmpav",
                        imagePoster = "mpcamcpacm",
                        backdrop = "mcvapvma",
                        overview = "vjapmvamvpavm",
                        bookmark = 1
                    ),
                    Movie(
                        movieId = "lfnancvpa",
                        title = "avampva",
                        releaseDate = "cvmapmpav",
                        imagePoster = "mpcamcpacm",
                        backdrop = "mcvapvma",
                        overview = "vjapmvamvpavm",
                        bookmark = 1
                    ),
                    Movie(
                        movieId = "lfnancvpa",
                        title = "avampva",
                        releaseDate = "cvmapmpav",
                        imagePoster = "mpcamcpacm",
                        backdrop = "mcvapvma",
                        overview = "vjapmvamvpavm",
                        bookmark = 1
                    ),
                    Movie(
                        movieId = "lfnancvpa",
                        title = "avampva",
                        releaseDate = "cvmapmpav",
                        imagePoster = "mpcamcpacm",
                        backdrop = "mcvapvma",
                        overview = "vjapmvamvpavm",
                        bookmark = 1
                    ),
                    Movie(
                        movieId = "lfnancvpa",
                        title = "avampva",
                        releaseDate = "cvmapmpav",
                        imagePoster = "mpcamcpacm",
                        backdrop = "mcvapvma",
                        overview = "vjapmvamvpavm",
                        bookmark = 1
                    ),
                    Movie(
                        movieId = "lfnancvpa",
                        title = "avampva",
                        releaseDate = "cvmapmpav",
                        imagePoster = "mpcamcpacm",
                        backdrop = "mcvapvma",
                        overview = "vjapmvamvpavm",
                        bookmark = 1
                    ),
                )
            )
        }
    }
}