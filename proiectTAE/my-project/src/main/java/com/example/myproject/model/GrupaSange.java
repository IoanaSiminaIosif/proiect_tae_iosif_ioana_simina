package com.example.myproject.model;

/**
 * 
 * @author Simina Iosif
 *
 */

public enum GrupaSange {
	A("A"), B("B"), AB("AB"), ZERO("0");
	
	public String name;

    private GrupaSange(String name) {
        this.name = name;
    }

    public String getStatusEnum() {
        return this.name;
    }
}
