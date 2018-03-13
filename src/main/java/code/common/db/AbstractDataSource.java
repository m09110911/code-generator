package code.common.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @version 1.0
 * @create 2018-03-12 17:06
 **/
public abstract class AbstractDataSource implements DataSource {

    private String url;

    private String user;

    private String password;

    protected AbstractDataSource(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    protected abstract String getDriver();

    @Override
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(getDriver());

        Connection connection = DriverManager.getConnection(this.url, this.user, this.password);

        return connection;

    }
}
