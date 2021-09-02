package daos;

import models.TestTable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class TestTableDAO implements Dao<TestTable>{
    private List<TestTable> testTables;
    Connection connection;

    public TestTableDAO(Connection conn) {
        testTables = new ArrayList<>();
        connection = conn;
    }

    @Override
    public TestTable get(int id) {
        return null;
    }

    @Override
    public List<TestTable> getAll() {
        String sql = "SELECT * FROM test_table";
        PreparedStatement pstmt;
        return null;
    }

    @Override
    public void save(TestTable testTable) {

    }

    @Override
    public void update(TestTable testTable, String[] params) {

    }

    @Override
    public void delete(TestTable testTable) {

    }
}
