package com.github.twangodev.domain

import io.quarkus.hibernate.orm.panache.kotlin.PanacheEntity
import javax.persistence.Entity
import javax.persistence.ManyToOne

@Entity
class CourseRequest() : PanacheEntity() {

    @ManyToOne lateinit var student: Student
    @ManyToOne lateinit var course: Course


}