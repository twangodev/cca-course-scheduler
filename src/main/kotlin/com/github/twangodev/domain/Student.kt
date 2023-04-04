package com.github.twangodev.domain

import io.quarkus.hibernate.orm.panache.kotlin.PanacheCompanion
import io.quarkus.hibernate.orm.panache.kotlin.PanacheEntityBase
import java.time.Year
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Student() : PanacheEntityBase {

    companion object : PanacheCompanion<Student>

    @Id
    var studentID: Long? = null

    lateinit var name: String
    lateinit var graduationYear: Year

    constructor(studentID: Long, name: String, graduationYear: Year) : this() {
        this.studentID = studentID
        this.name = name
        this.graduationYear = graduationYear
    }

}