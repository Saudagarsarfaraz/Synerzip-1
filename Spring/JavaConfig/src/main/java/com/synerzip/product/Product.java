package com.synerzip.product;

import com.synerzip.model.Model;

public class Product {
	private int pId;
	private String pName;
	private Model model;
	public void setModel(Model model) {
		this.model = model;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", model=" + model + "]";
	}
}
