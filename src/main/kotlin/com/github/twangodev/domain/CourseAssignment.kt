package com.github.twangodev.domain

import io.quarkus.hibernate.orm.panache.kotlin.PanacheCompanion
import io.quarkus.hibernate.orm.panache.kotlin.PanacheEntity
import org.optaplanner.core.api.domain.entity.PlanningEntity
import org.optaplanner.core.api.domain.variable.PlanningVariable
import javax.persistence.Entity
import javax.persistence.ManyToOne

@PlanningEntity
@Entity
class CourseAssignment : PanacheEntity() {

    companion object : PanacheCompanion<CourseAssignment>

    @PlanningVariable(valueRangeProviderRefs = ["periodRange"])
    @ManyToOne var period: Period? = null

    @PlanningVariable(valueRangeProviderRefs = ["courseRange"])
    @ManyToOne var course: Course? = null

}