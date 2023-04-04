package com.github.twangodev.domain

import org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty
import org.optaplanner.core.api.domain.solution.PlanningScore
import org.optaplanner.core.api.domain.solution.PlanningSolution
import org.optaplanner.core.api.domain.solution.ProblemFactCollectionProperty
import org.optaplanner.core.api.domain.valuerange.ValueRangeProvider
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore
import org.optaplanner.core.api.solver.SolverStatus

@PlanningSolution
class CourseSchedule() {

    @ProblemFactCollectionProperty
    @ValueRangeProvider(id = "courseRange")
    lateinit var courseList: List<Course>

    @ProblemFactCollectionProperty
    @ValueRangeProvider(id = "periodRange")
    lateinit var periods: List<Period>

    @ProblemFactCollectionProperty
    @ValueRangeProvider(id = "courseRequestRange")
    lateinit var courseRequestList: List<CourseRequest>

    @PlanningEntityCollectionProperty
    lateinit var courseAssignmentList: List<CourseAssignment>

    @PlanningScore
    var hardSoftScore : HardSoftScore?  = null

    var solverStatus : SolverStatus? = null

}