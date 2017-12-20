package cn.appsys.pojo;

public class Admin_info {

	public Integer admin_id;//管理员
	public String admin_mame;//管理员名称
	public String pwd;//md5加密
	public Integer getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(Integer admin_id) {
		this.admin_id = admin_id;
	}
	public String getAdmin_mame() {
		return admin_mame;
	}
	public void setAdmin_mame(String admin_mame) {
		this.admin_mame = admin_mame;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
