package cn.appsys.pojo;

public class App_details {

	public Integer app_details_id;//详情表
	public String   name;//app名称
	public String 	icons;//图标
	public String  describe;//描述
	public String  images_url;//截图路径
	public Integer shenhe;//审核状态，0：待审核，1审核通过，2：审核未过
	public Integer  scores;//总评分
	public Integer getApp_details_id() {
		return app_details_id;
	}
	public void setApp_details_id(Integer app_details_id) {
		this.app_details_id = app_details_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIcons() {
		return icons;
	}
	public void setIcons(String icons) {
		this.icons = icons;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public String getImages_url() {
		return images_url;
	}
	public void setImages_url(String images_url) {
		this.images_url = images_url;
	}
	public Integer getShenhe() {
		return shenhe;
	}
	public void setShenhe(Integer shenhe) {
		this.shenhe = shenhe;
	}
	public Integer getScores() {
		return scores;
	}
	public void setScores(Integer scores) {
		this.scores = scores;
	}
}
