package com.neuedu.utl;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface ResultHandle {
    Object getObjectByResultSet(ResultSet resultSet) throws SQLException;
}
