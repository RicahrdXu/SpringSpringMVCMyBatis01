package cn.appsys.pojo;

public class User_info {

	public Integer user_id;//用户表
	public String name;//名称
	public String tel;//手机
	public String pwd;//密码（MD5加密）
	public String  images_url;//图像
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getImages_url() {
		return images_url;
	}
	public void setImages_url(String images_url) {
		this.images_url = images_url;
	}
}
