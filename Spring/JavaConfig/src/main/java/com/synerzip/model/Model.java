package com.synerzip.model;

public class Model {
	private int mId;
	private String mName;
	public void setmId(int mId) {
		this.mId = mId;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	@Override
	public String toString() {
		return "Model [mId=" + mId + ", mName=" + mName + "]";
	}
	
	
}
