package com.github.twangodev.domain

import io.quarkus.hibernate.orm.panache.kotlin.PanacheCompanion
import io.quarkus.hibernate.orm.panache.kotlin.PanacheEntity
import javax.persistence.Entity

@Entity
class Course() : PanacheEntity() {

    companion object : PanacheCompanion<Course>

    lateinit var courseID: String
    lateinit var courseName: String

    constructor(courseID: String, courseName: String) : this() {
        this.courseID = courseID
        this.courseName = courseName
    }


}