package com.todoList.dao;

import java.util.List;

import com.todoList.web.vo.Todo;

public interface TodoDAO {
	public Integer add(Todo item);

	public List<Todo> query();

	public boolean update(Todo item);

	public boolean delete(Integer id);
}
