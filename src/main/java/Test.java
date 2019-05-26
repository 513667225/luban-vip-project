
import java.sql.*;

/**
 * 需要咨询java高级VIP课程的同学可以加鲁班学院-白浅的QQ：2207192173
 * 需要视频资料的可以添加安其拉老师的QQ：3164703201
 * author：鲁班学院-商鞅老师
 */
public class Test {
    public static void main(String[] args) throws Exception{
        Connection root = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useUnicode=true&useSSL=false&characterEncoding=utf8", "root", "1234");
        Class.forName(Driver.class.getName());
        PreparedStatement preparedStatement = root.prepareStatement("select table_name from information_schema.tables where table_schema='vip_project'");
        ResultSet resultSet = preparedStatement.executeQuery();
        String str = "";
        while (resultSet.next()){
            str+=resultSet.getString(1)+",";
        }
        System.out.println(str);
        //catalog,product,attribute,product,spec ---order
    }
}
