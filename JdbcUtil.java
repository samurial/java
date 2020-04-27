package java第十周;

import java.util.Properties;
import java.sql.*;

public class JdbcUtil {
private static String driver;
private static String url;
private static String user;
private static String password;
private static Properties pr=new Properties();
private JdbcUtil(){}
static{
	try{
		pr.load(JdbcUtil.class.getClassLoader().getResourceAsStream("db.properties"));
		driver=pr.getProperty("driver");
		url=pr.getProperty("url");
		user=pr.getProperty("user");
		password=pr.getProperty("password");
		Class.forName(driver);
	}catch(Exception e)
	{
		throw new ExceptionInInitializerError(e);
	}
}
public static Connection getConnection()throws Exception
{
	return DriverManager.getConnection(url,user,password);
}
public static void free(ResultSet rs,Statement st,Connection conn) throws Exception{
	if(rs!=null){rs.close();}
	if(st!=null){st.close();}
	if(conn!=null){conn.close();}
	
}
}
