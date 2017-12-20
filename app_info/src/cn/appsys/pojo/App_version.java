package cn.appsys.pojo;

import java.sql.Timestamp;

public class App_version {

	public Integer app_version_id;//app版本
	public String   version_name;//版本名称
	public Timestamp date;//上传日期
	public String  server_url;//在服务器的存放的路径
	public String 	daxiao;//大小
	public Integer getApp_version_id() {
		return app_version_id;
	}
	public void setApp_version_id(Integer app_version_id) {
		this.app_version_id = app_version_id;
	}
	public String getVersion_name() {
		return version_name;
	}
	public void setVersion_name(String version_name) {
		this.version_name = version_name;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	public String getServer_url() {
		return server_url;
	}
	public void setServer_url(String server_url) {
		this.server_url = server_url;
	}
	public String getDaxiao() {
		return daxiao;
	}
	public void setDaxiao(String daxiao) {
		this.daxiao = daxiao;
	}
}
