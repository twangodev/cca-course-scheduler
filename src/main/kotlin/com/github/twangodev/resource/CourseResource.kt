package com.github.twangodev.resource

import com.github.twangodev.domain.Course
import javax.transaction.Transactional
import javax.ws.rs.GET
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.PathParam

@Path("/courses")
class CourseResource {

    @GET
    fun get() = Course.listAll()

    @GET
    @Path("/{id}")
    fun get(@PathParam("id") id: Long) = Course.findById(id)

    @POST
    @Transactional
    fun post(course: Course) = course.persist()

}