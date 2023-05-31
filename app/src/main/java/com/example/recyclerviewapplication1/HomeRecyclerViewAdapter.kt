package com.example.recyclerviewapplication1

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class HomeRecyclerViewAdapter(val dataList : MutableList<Email>) : RecyclerView.Adapter<HomeRecyclerViewAdapter.HomeRecyclerViewViewHolder>() {

    inner class HomeRecyclerViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeRecyclerViewViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: HomeRecyclerViewViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount() = dataList.size
}