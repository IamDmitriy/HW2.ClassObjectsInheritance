package ru.netology.profile.model

class Profile constructor(
    id: Int,
    login: String,
    name: String,
    surname: String,
    status: String,
    avatar: String
) {
    private val id: Int
    private val login: String
    private val name: String
    private val surname: String
    private val status: String
    private val avatar: String
    val fullName: String
        get() = "$name $surname"

    init {
        this.id = id
        this.login = login
        this.name = name
        this.surname = surname
        this.status = status
        this.avatar = avatar
    }


}