package com.todoList.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.todoList.service.TodoService;
import com.todoList.web.vo.Response;
import com.todoList.web.vo.Todo;

@Controller
public class TodoList {

	@Autowired
	private TodoService todoService;

	@RequestMapping(value = "/todo")
	public @ResponseBody
	String query() {
		return JSON.toJSONString(todoService.query());
	}

	@RequestMapping(value = "/todo", method = RequestMethod.POST)
	public @ResponseBody
	String add(@RequestBody String item) {
		return JSON.toJSONString(todoService.add(JSON.parseObject(item, Todo.class)));
	}

	@RequestMapping(value = "/todo/{id}", method = RequestMethod.PUT)
	public @ResponseBody
	String update(@RequestBody String item) {
		todoService.update(JSON.parseObject(item, Todo.class));

		Response response = new Response();
		return JSON.toJSONString(response);
	}

	@RequestMapping(value = "/todo/{id}", method = RequestMethod.DELETE)
	public @ResponseBody
	String delete(@PathVariable(value = "id") Integer id) {
		todoService.delete(id);

		Response response = new Response();
		return JSON.toJSONString(response);
	}
}
