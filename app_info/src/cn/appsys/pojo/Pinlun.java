package cn.appsys.pojo;

import java.sql.Timestamp;

public class Pinlun {

	public Integer pinlun_id;//评论表
	public String content;//内容
	public Timestamp pinlun_date;//评论时间
	public Integer getPinlun_id() {
		return pinlun_id;
	}
	public void setPinlun_id(Integer pinlun_id) {
		this.pinlun_id = pinlun_id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getPinlun_date() {
		return pinlun_date;
	}
	public void setPinlun_date(Timestamp pinlun_date) {
		this.pinlun_date = pinlun_date;
	}
}
