package com.todoList.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todoList.dao.TodoDAO;
import com.todoList.service.TodoService;
import com.todoList.web.vo.Todo;

@Service
public class TodoServiceImpl implements TodoService {
	@Autowired
	private TodoDAO todoDAO;

	@Override
	public Todo add(Todo item) {
		Integer id = todoDAO.add(item);
		if (null != id) {
			item.setId(id.intValue());
		}

		return item;
	}

	@Override
	public List<Todo> query() {
		return todoDAO.query();
	}

	@Override
	public boolean update(Todo item) {
		return todoDAO.update(item);
	}

	@Override
	public boolean delete(Integer id) {
		return todoDAO.delete(id);
	}

}
