package com.mjbour.udemy.db.utils;

import com.mjbour.udemy.data.Country;
import com.mjbour.udemy.data.State;
import com.mjbour.udemy.data.Type;
import com.mjbour.udemy.model.Location;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LocationsMapper implements ResultSetMapper<Location> {
    @Override
    public Location map(int index, ResultSet r, StatementContext ctx) throws SQLException {

        Location location = new Location(
                r.getLong("id"),
                r.getString("createdOn"),
                r.getString("modifiedOn"),
                Country.valueOf(r.getString("Country")),
                State.valueOf(r.getString("State")),
                Type.valueOf(r.getString("Type")),
                r.getString("code"),
                r.getString("name")
        );
        return location;
    }
}
