package ru.netology.hiearchy

import ru.netology.hiearchy.view.TextView
import ru.netology.hiearchy.view.ViewGroup
import ru.netology.hiearchy.widget.Button

fun main() {

    val main = ViewGroup()
    val title = TextView("Main screen")
    main.addView(title) //Кастовать не надо

    val content = ViewGroup()
    val readMore = Button("Read more")
    content.addView(readMore)


}