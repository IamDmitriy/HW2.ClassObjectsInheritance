package ru.netology.profile

import ru.netology.profile.model.Profile

fun main() {
    val myProfile = Profile(
        1,
        "IamDmitriy",
        "Дмитрий",
        "Охапкин",
        "Не в сети",
        "avatar.jpeg"
    )

    println(myProfile.fullName)
}