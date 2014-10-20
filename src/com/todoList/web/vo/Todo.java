package com.todoList.web.vo;

import java.io.Serializable;

public class Todo implements Serializable {
	private static final long serialVersionUID = 1943655969457412041L;

	public int id;

	public String content;

	public int order;

	public boolean done;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public boolean getDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

}
