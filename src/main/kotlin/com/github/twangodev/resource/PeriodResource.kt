package com.github.twangodev.resource

import com.github.twangodev.domain.Period
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.PathParam

@Path("/period")
class PeriodResource {

    @GET
    fun get() = Period.listAll()

    @GET
    @Path("/{id}")
    fun get(@PathParam("id") id: Long) = Period.findById(id)

}