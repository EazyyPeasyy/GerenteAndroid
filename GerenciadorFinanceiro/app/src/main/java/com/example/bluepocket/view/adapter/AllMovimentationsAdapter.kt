package com.example.bluepocket.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.bluepocket.R
import com.example.bluepocket.model.Movimentation
import java.util.ArrayList

class AllMovimentationsAdapter(val context: Context, val listMovimentation: ArrayList<Movimentation>):
    RecyclerView.Adapter<AllMovimentationsViewHolder>() {

    private val layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AllMovimentationsViewHolder {
        val view = layoutInflater.inflate(R.layout.item_recycleview,parent,false)

        var holder = AllMovimentationsViewHolder(view)

        return holder
    }

    override fun getItemCount(): Int = listMovimentation.size

    override fun onBindViewHolder(holder: AllMovimentationsViewHolder, position: Int) {
        holder.movimentationName.text = listMovimentation[position].name
        holder.movimentationType.text = listMovimentation[position].type

        if (listMovimentation[position].expense) {
            holder.movimentationMov.text = "Despesa"
        }else{
            holder.movimentationMov.text = "Receita"
        }

        holder.movimentationDate.text = listMovimentation[position].date
        holder.movimentationValue.text = "R$ "+listMovimentation[position].value.toString()

    }


}

class AllMovimentationsViewHolder(view: View): RecyclerView.ViewHolder(view){

    val movimentationName: TextView = view.findViewById(R.id.item_recycleview_name)
    val movimentationType: TextView = view.findViewById(R.id.item_recycleview_type)
    val movimentationMov: TextView = view.findViewById(R.id.item_recycleview_movimentacao)
    val movimentationDate: TextView =  view.findViewById(R.id.item_recycleview_date)
    val movimentationValue: TextView =  view.findViewById(R.id.item_recycleview_value)
}


