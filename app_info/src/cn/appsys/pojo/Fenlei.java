package cn.appsys.pojo;

public class Fenlei {

      public Integer fenlei_id;//分类
      public String   name;//分类名称
      public String remark;//备注
	public Integer getFenlei_id() {
		return fenlei_id;
	}
	public void setFenlei_id(Integer fenlei_id) {
		this.fenlei_id = fenlei_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
