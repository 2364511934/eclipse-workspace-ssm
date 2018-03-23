package entity;

public class User {
	private int uid;
	private String uname;
	private int rid;
	private Role role;
	
	public User() {
	}
	
	
	public User(int uid, String uname, int rid, Role role) {
		this.uid = uid;
		this.uname = uname;
		this.rid = rid;
		this.role = role;
	}

	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}


	public Role getRole() {
		return role;
	}


	public void setRole(Role role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", rid=" + rid + ", role=" + role + "]";
	}
	
}
