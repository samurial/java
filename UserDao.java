package java第十周;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
public void add(User user)throws Exception
{
	Connection conn=(Connection) JdbcUtil.getConnection();
	String sql="insert into student(id,name,sex) values(?,?,?)";
	PreparedStatement pstmt=(PreparedStatement) conn.prepareStatement(sql);
	pstmt.setInt(1,user.getUserid());
	pstmt.setString(2,user.getUsername());
	pstmt.setString(3,user.getSex());
	pstmt.executeUpdate();
	JdbcUtil.free(null,pstmt,conn);
}
public void update(User user)throws Exception
{
	Connection conn=(Connection) JdbcUtil.getConnection();
	String sql="update student set id=?,name=?,sex=?";
	PreparedStatement pstmt=(PreparedStatement) conn.prepareStatement(sql);
	pstmt.setInt(1,user.getUserid());
	pstmt.setString(2,user.getUsername());
	pstmt.setString(3,user.getSex());
	pstmt.executeUpdate();
	JdbcUtil.free(null,pstmt,conn);
}
public void delete(int userId)throws Exception
{
	Connection conn=(Connection) JdbcUtil.getConnection();
	String sql="delete from student where id=?";
	PreparedStatement pstmt=(PreparedStatement) conn.prepareStatement(sql);
	pstmt.setInt(1,userId);
	pstmt.executeUpdate();
	JdbcUtil.free(null,pstmt,conn);
}
public User findUserById(int userId)throws Exception
{
	Connection conn=(Connection) JdbcUtil.getConnection();
	User user=null;
	String sql="select * from student where id=?";
	PreparedStatement pstmt=(PreparedStatement) conn.prepareStatement(sql);
	pstmt.setInt(1,userId);
	ResultSet rs=pstmt.executeQuery();
	if(rs.next())
	{
		user=new User();
		user.setUserid(rs.getInt("id"));
		user.setUsername(rs.getString("name"));
		user.setSex(rs.getString("sex"));
	}
	JdbcUtil.free(rs, pstmt, conn);
	return user;
}
public List<User> QueryAll() throws Exception
{
	Connection conn=(Connection) JdbcUtil.getConnection();
	List<User> userList=new ArrayList<User>();
	String sql="select * from student";
	PreparedStatement pstmt=(PreparedStatement) conn.prepareStatement(sql);
	ResultSet rs=pstmt.executeQuery();
	while(rs.next())
	{
		User user=new User();
		user.setUserid(rs.getInt("id"));
		user.setUsername(rs.getString("name"));
		user.setSex(rs.getString("sex"));
		userList.add(user);
	}
	JdbcUtil.free(rs, pstmt, conn);
	return userList;
}
}
