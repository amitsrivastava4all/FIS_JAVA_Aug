package com.fis.dto;

public class RightDTO {
	private int rightId;
	private String rightName;
	private String screenName;
	public int getRightId() {
		return rightId;
	}
	public void setRightId(int rightId) {
		this.rightId = rightId;
	}
	public String getRightName() {
		return rightName;
	}
	public void setRightName(String rightName) {
		this.rightName = rightName;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	@Override
	public String toString() {
		return "RightDTO [rightId=" + rightId + ", rightName=" + rightName + ", screenName=" + screenName + "]";
	}
	

}
