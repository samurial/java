package java第十周;

public class User {
private int userid;
private String username,sex;

public User(int userid, String username, String sex) {
	super();
	this.userid = userid;
	this.username = username;
	this.sex = sex;
}

public User() {
	super();
	// TODO Auto-generated constructor stub
}

public int getUserid() {
	return userid;
}

public void setUserid(int userid) {
	this.userid = userid;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getSex() {
	return sex;
}

public void setSex(String sex) {
	this.sex = sex;
}

}
