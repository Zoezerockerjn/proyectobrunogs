package com.example.entity;

import javax.persistence.Entity;


public class GenericResponse {
	
	public int code;
	@Override
	public String toString() {
		return "GenericResponse [code=" + code + ", msg=" + msg + ", data=" + data + ", sucess=" + sucess + "]";
	}
	public String msg;
	public Object data;
	public String sucess;
	
		
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public String getSucess() {
		return sucess;
	}
	public void setSucess(String sucess) {
		this.sucess = sucess;
	}
	
	
}
	
	