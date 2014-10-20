package com.todoList.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.todoList.dao.TodoDAO;
import com.todoList.web.vo.Todo;

@Repository
public class TodoDAOImpl implements TodoDAO {
	private static final Logger logger = Logger.getLogger(TodoDAOImpl.class);

	@Autowired
	private SqlMapClient sqlMapClient;

	@Override
	public Integer add(Todo item) {
		try {
			return (Integer) sqlMapClient.insert("todo.add", item);
		} catch (SQLException e) {
			logger.error(e.getMessage(), e);

			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Todo> query() {
		try {
			return sqlMapClient.queryForList("todo.query");
		} catch (SQLException e) {
			logger.error(e.getMessage(), e);

			return new ArrayList<Todo>();
		}
	}

	@Override
	public boolean update(Todo item) {
		try {
			sqlMapClient.update("todo.update", item);

			return true;
		} catch (SQLException e) {
			logger.error(e.getMessage(), e);

			return false;
		}
	}

	@Override
	public boolean delete(Integer id) {
		try {
			sqlMapClient.delete("todo.delete", id);

			return true;
		} catch (SQLException e) {
			logger.error(e.getMessage(), e);

			return false;
		}
	}
}
