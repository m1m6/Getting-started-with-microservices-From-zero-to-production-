package com.mjbour.udemy;

import com.mjbour.udemy.api.resources.LocationsResource;
import com.mjbour.udemy.business.services.LocationsService;
import com.mjbour.udemy.db.LocationsDao;
import io.dropwizard.Application;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.setup.Environment;
import org.skife.jdbi.v2.DBI;

import javax.sql.DataSource;

public class LocationsApplication extends Application<LocationsConfigurations> {

    @Override
    public void run(LocationsConfigurations configuration, Environment environment) throws Exception {


        final DataSource dataSource = configuration.getDataSourceFactory().build(environment.metrics(), "mysql");
        final DBI dbi = new DBI(dataSource);

        final LocationsDao locationsDao = dbi.onDemand(LocationsDao.class);

        final LocationsService locationsService = new LocationsService(locationsDao);

        final LocationsResource locationsResource = new LocationsResource(locationsService);
        environment.jersey().register(locationsResource);
    }

    public static void main(String ...args) throws Exception{
        new LocationsApplication().run(args);
    }


}
