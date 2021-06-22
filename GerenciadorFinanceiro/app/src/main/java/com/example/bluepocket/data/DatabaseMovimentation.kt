package com.example.bluepocket.data

import com.example.bluepocket.model.Movimentation

class DatabaseMovimentation {

    var movimentationList = arrayListOf<Movimentation>()

    fun addMovimentation(movimentation: Movimentation){
        movimentationList.add(movimentation)
    }

    fun getAll(): ArrayList<Movimentation> {

        return movimentationList

    }

    fun getDespesas(): List<Movimentation> {

       return  movimentationList.filter {
            it.expense
        }
    }


}