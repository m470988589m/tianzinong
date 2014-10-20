package com.todoList.service;

import java.util.List;

import com.todoList.web.vo.Todo;

public interface TodoService {
	public Todo add(Todo item);

	public List<Todo> query();

	public boolean update(Todo item);

	public boolean delete(Integer id);
}
