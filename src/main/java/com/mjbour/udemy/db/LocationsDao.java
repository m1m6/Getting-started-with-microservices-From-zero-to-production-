package com.mjbour.udemy.db;

import com.mjbour.udemy.db.utils.LocationsMapper;
import com.mjbour.udemy.model.Location;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;

@RegisterMapper(LocationsMapper.class)
public interface LocationsDao {


    /**
     * Get all locations from the DB
     * @return
     */
    @SqlQuery("select * from `data`")
    List<Location> getLocations();

    @SqlQuery("select * from `data` where id= :id")
    Location getLocation(@Bind("id") final int id);

    @SqlUpdate("INSERT INTO `data` (`id`, `code`, `Country`, `State`, `Type`, `name`, `createdOn`, `modifiedOn`) " +
            "VALUES (:id, :code, :country, :state, :type, :name, :createdOn, :modifiedOn);")
    void insertLocation(@BindBean Location location);

    @SqlUpdate("update data set name = coalesce(:name, name), code = coalesce(:code,code) where id= :id")
    void editLocation(@BindBean Location location);

    @SqlUpdate("delete from data where id= :id")
    int deleteLocation(@Bind("id") final int id);
}
