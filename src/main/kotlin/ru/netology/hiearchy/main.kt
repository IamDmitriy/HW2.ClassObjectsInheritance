package ru.netology.hiearchy

import ru.netology.hiearchy.view.TextView
import ru.netology.hiearchy.view.View
import ru.netology.hiearchy.view.ViewGroup
import ru.netology.hiearchy.widget.Button

fun main() {
    //Тестирование работоспособности
    val view = View()
    view.click()

    val textView = TextView("Some text")
    textView.click()
    textView.text = "Changed text"
    println(textView.text)

    val button = Button("Click me!")
    button.click()
    button.text = "Don't click me"
    println(button.text)

    //TODO добавить тесты
    // Основной код
    val main = ViewGroup()
    val title = TextView("Main screen")
    main.addView(title) //Кастовать не надо

    val content = ViewGroup()
    val readMore = Button("Read more")
    content.addView(readMore)


}