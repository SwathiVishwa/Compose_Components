package com.app.compose_components

fun loadArrayList(): ArrayList<String> {
    val list: ArrayList<String> = arrayListOf()
    for (i in 0..2) {
        list.add("Basic UI View")
        list.add("CheckBox & Radio")
        list.add("Lazy Row")
        list.add("Lazy Column")
        list.add("Pagination")
    }
    return list
}