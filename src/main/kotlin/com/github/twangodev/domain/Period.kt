package com.github.twangodev.domain

import io.quarkus.hibernate.orm.panache.kotlin.PanacheCompanion
import io.quarkus.hibernate.orm.panache.kotlin.PanacheEntity
import javax.persistence.Entity

@Entity
class Period() : PanacheEntity() {

    companion object : PanacheCompanion<Period>

    lateinit var periodID: String

    constructor(periodID: String) : this() {
        this.periodID = periodID
    }

}