package cn.appsys.pojo;

public class Developer {

	public Integer developer_id;  //开发者
	public String  name;//开发者名称
	public Integer dengji;//开发者等级
	public String  real_name;//真实姓名
	public String ID_Number;//身份证号码
	public String  email;//邮箱
	public String  QQ;//QQ
	public Integer getDeveloper_id() {
		return developer_id;
	}
	public void setDeveloper_id(Integer developer_id) {
		this.developer_id = developer_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getDengji() {
		return dengji;
	}
	public void setDengji(Integer dengji) {
		this.dengji = dengji;
	}
	public String getReal_name() {
		return real_name;
	}
	public void setReal_name(String real_name) {
		this.real_name = real_name;
	}
	public String getID_Number() {
		return ID_Number;
	}
	public void setID_Number(String iD_Number) {
		ID_Number = iD_Number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getQQ() {
		return QQ;
	}
	public void setQQ(String qQ) {
		QQ = qQ;
	}
}
