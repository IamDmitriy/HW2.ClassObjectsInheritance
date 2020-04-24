package ru.netology.hiearchy.view

class ViewGroup(var view: View = View()): View() {

    fun addView(view: View) {
        this.view = view
    }
}