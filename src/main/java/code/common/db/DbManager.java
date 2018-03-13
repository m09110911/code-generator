package code.common.db;

import code.common.db.impl.MysqlDataSourceImpl;
import code.common.log.logger.Logger;
import code.common.log.manager.LoggerManager;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @version 1.0
 * @create 2018-03-12 10:27
 **/
public final class DbManager {

    private static Logger logger = LoggerManager.getLogger(DbManager.class);

    private static DataSource dataSource = new MysqlDataSourceImpl("", "", "");

    public static Connection getConnection() {
        try {
            return dataSource.getConnection();
        } catch (ClassNotFoundException | SQLException e) {
            logger.error("获取数据库连接异常", e);
        }
        return null;
    }

    public static void closeConnection(Connection connection) {
        try {
            connection.close();
        } catch (SQLException e) {
            logger.error("获取数据库连接关闭异常", e);
        }
    }

}
