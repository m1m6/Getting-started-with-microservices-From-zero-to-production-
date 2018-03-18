package com.mjbour.udemy.api.resources;

import com.mjbour.udemy.business.services.LocationsService;
import com.mjbour.udemy.model.Location;

import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/api/v1/locations")
@Consumes(MediaType.APPLICATION_JSON+"; charset=utf-8")
@Produces(MediaType.APPLICATION_JSON)
public class LocationsResource {

    private LocationsService locationsService;

    public LocationsResource(final LocationsService locationsService){
        this.locationsService = locationsService;
    }

    // Get all locations from the DB
    @GET
    public Response getLocations(){
        return Response.ok().entity(this.locationsService.getLocations()).build();
    }

    @GET
    @Path("{id}")
    public Response getLocation(@PathParam("id") final int id){
        return Response.ok().entity(this.locationsService.getLocation(id)).build();
    }

    @POST
    public Response insertLocation(final @NotNull Location location){
        this.locationsService.insertLocation(location);
        return Response.ok().build();
    }


    @PUT
    @Path("{id}")
    public Response editLocation(final @NotNull Location location, @PathParam("id") final int id){
        return Response.ok().entity(this.locationsService.editLocation(location)).build();
    }

    @DELETE
    @Path("{id}")
    public Response deleteLocation(@PathParam("id") final int id){
        return Response.ok().entity(this.locationsService.deleteLocation(id)).build();
    }
}
