package code.common.db.impl;

import code.common.db.AbstractDataSource;

/**
 * @version 1.0
 * @create 2018-03-12 10:48
 **/
public class MysqlDataSourceImpl extends AbstractDataSource {

    public MysqlDataSourceImpl(String url, String user, String password) {
        super(url, user, password);
    }

    @Override
    protected String getDriver() {
        return "com.mysql.jdbc.Driver";
    }
}
