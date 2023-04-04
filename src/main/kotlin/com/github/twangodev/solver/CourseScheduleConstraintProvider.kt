package com.github.twangodev.solver

import org.optaplanner.core.api.score.stream.Constraint
import org.optaplanner.core.api.score.stream.ConstraintFactory
import org.optaplanner.core.api.score.stream.ConstraintProvider

class CourseScheduleConstraintProvider : ConstraintProvider {

    override fun defineConstraints(constraintFactory: ConstraintFactory?): Array<Constraint> {
        return emptyArray()
    }

}