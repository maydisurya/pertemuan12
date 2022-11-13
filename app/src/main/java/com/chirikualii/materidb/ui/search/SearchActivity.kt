package com.chirikualii.materidb.ui.search

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ListAdapter
import android.widget.Toast
import androidx.activity.viewModels
import androidx.core.widget.doOnTextChanged
import androidx.lifecycle.ViewModel
import com.chirikualii.materidb.data.model.Movie
import com.chirikualii.materidb.databinding.ActivitySearchBinding
import com.chirikualii.materidb.ui.adapter.MovieListAdapter

class SearchActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySearchBinding
    private lateinit var listAdapter : MovieListAdapter

    val viewModel: SearchViewModel by viewModels(
        factoryProducer = {SearchViewModelFactory(this)}
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySearchBinding.inflate(layoutInflater)
        setContentView(binding.root)
        observeView()

        listAdapter = MovieListAdapter()
        binding.rvMovie.adapter = listAdapter
        val searchModel:ViewModel by viewModels<SearchViewModel>(
            factoryProducer = {SearchViewModelFactory(context = this)}
        )

        binding.etSearch.doOnTextChanged { text, _, _, _ ->
            viewModel.doSearchMovie(text.toString())
        }
    }

    private fun observeView() {
        viewModel.listMovie.observe(this){
            listAdapter.addItem(it)
        }
        viewModel.isLoading.observe(this){
            if (it){
                binding.progressBar.visibility=View.VISIBLE
            }else{
                binding.progressBar.visibility=View.INVISIBLE
            }
        }
    }
}