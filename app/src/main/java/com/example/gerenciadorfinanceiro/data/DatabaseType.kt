package com.example.gerenciadorfinanceiro.data

import com.example.gerenciadorfinanceiro.model.Type

class DatabaseType {

    var typeList = mutableListOf<Type>(

        Type(name = "Crédito", userID = "0"),
        Type(name = "Débito", userID = "0"),
        Type(name = "Cédula", userID = "0")

    )

    fun getAll(): List<String> {

        return typeList.map {
            it.name
        }

    }

    fun setTypeList(item: Type){

        typeList.add(item)

    }

}