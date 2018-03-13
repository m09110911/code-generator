package code.common.db;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @version 1.0
 * @create 2018-03-12 10:42
 **/
public interface DataSource  {

    Connection getConnection() throws ClassNotFoundException, SQLException;

}
