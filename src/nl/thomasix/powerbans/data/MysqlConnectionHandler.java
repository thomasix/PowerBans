package nl.thomasix.powerbans.data;

import com.zaxxer.hikari.HikariDataSource;

public class MysqlConnectionHandler {

    private HikariDataSource hikariDataSource;

    public MysqlConnectionHandler(String host, int port, String databaseName, String username, String password, int maxPoolSize) {
        hikariDataSource = new HikariDataSource();
        hikariDataSource.setDataSourceClassName("com.mysql.jdbc.jdbc2.optional.MysqlDataSource");
        hikariDataSource.setMaximumPoolSize(maxPoolSize);
        hikariDataSource.addDataSourceProperty("serverName", host);
        hikariDataSource.addDataSourceProperty("port", port);
        hikariDataSource.addDataSourceProperty("databaseName", databaseName);
        hikariDataSource.addDataSourceProperty("user", username);
        hikariDataSource.addDataSourceProperty("password", password);
    }
}
