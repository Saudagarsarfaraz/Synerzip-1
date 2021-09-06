package com.synerzip.addImpl;

import com.synerzip.add.Address;

public class PhysicalAddress implements Address{
    private int hno;
    private String loc;
	@Override
	public String toString() {
		return "PhysicalAddress [hno=" + hno + ", loc=" + loc + "]";
	}
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
    
    
	
}
