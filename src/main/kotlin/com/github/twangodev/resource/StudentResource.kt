package com.github.twangodev.resource

import com.github.twangodev.domain.Student
import javax.transaction.Transactional
import javax.ws.rs.GET
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.PathParam

@Path("/student")
class StudentResource {

    @GET
    fun get() = Student.listAll()

    @GET
    @Path("/studentID/{id}")
    fun get(@PathParam("id") id: Long) = Student

    @POST
    @Transactional
    fun post(student: Student) = student.persist()

}