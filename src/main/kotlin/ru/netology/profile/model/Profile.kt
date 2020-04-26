package ru.netology.profile.model

data class Profile(
    private val id: Int,
    private val login: String,
    private val name: String,
    private val surname: String,
    private val status: String,
    private val avatar: String
) {
    val fullName: String
        get() = "$name $surname"
}