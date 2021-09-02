import daos.TestTableDAO;
import models.TestTable;
import utils.ConnectionFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class EntryPoint {
    public static void main(String[] args) {

        Connection conn = ConnectionFactory.getConnection();
        TestTableDAO testTable = new TestTableDAO(conn);
        List<TestTable> resultsList = null;
        try {
            resultsList = testTable.getAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("================ test_table =================");
        if(resultsList != null) {
            for (TestTable row : resultsList) {
                System.out.println("string_id: ["
                        + row.getStringId()
                        + "]   string: ["
                        + row.getString()
                        + "]");
            }
        }
        System.out.println("=============== /test_table =================");

//        String sql = "SELECT * FROM test_table";
//        try {
//            Statement stmt = conn.createStatement();
//            ResultSet rs = stmt.executeQuery(sql);
//
//            System.out.println("================ test_table =================");
//            while(rs.next()) {
//                System.out.println("string_id: ["
//                        + rs.getInt("string_id")
//                        + "]   string: ["
//                        + rs.getString("string")
//                        + "]");
//            }
//            System.out.println("=============== /test_table =================");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }


    }
}
