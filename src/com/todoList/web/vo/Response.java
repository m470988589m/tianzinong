package com.todoList.web.vo;

import java.io.Serializable;

public class Response implements Serializable {
	private static final long serialVersionUID = 2671309128222512679L;

	public int code = 200;

	public String msg = "Success";

	public Object result;

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

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

}
