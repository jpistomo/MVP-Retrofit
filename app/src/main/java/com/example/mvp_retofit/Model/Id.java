package com.example.mvp_retofit.Model;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class Id{

	@SerializedName("name")
	private String name;

	@SerializedName("value")
	private Object value;

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setValue(Object value){
		this.value = value;
	}

	public Object getValue(){
		return value;
	}
}