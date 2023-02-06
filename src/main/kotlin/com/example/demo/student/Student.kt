package com.example.demo.student


class Student {
    var id: Long? = null
    var name: String? = null
    var email: String? = null
    var gender: Gender? = null

    constructor()
    constructor(id: Long?, name: String?, email: String?, gender: Gender?) {
        this.id = id
        this.name = name
        this.email = email
        this.gender = gender
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Student

        if (id != other.id) return false
        if (name != other.name) return false
        if (email != other.email) return false
        if (gender != other.gender) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id?.hashCode() ?: 0
        result = 31 * result + (name?.hashCode() ?: 0)
        result = 31 * result + (email?.hashCode() ?: 0)
        result = 31 * result + (gender?.hashCode() ?: 0)
        return result
    }

    override fun toString(): String {
        return "Student(id=$id, name=$name, email=$email, gender=$gender)"
    }

}