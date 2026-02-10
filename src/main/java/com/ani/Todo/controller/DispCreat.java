package com.ani.Todo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ani.Todo.dto.TasksRequestDTO;
import com.ani.Todo.entity.Tasks;
import com.ani.Todo.service.SendingGettingService;

@RestController
@RequestMapping("/api")
public class DispCreat {

	public final SendingGettingService sendingGettingService;

	public DispCreat(SendingGettingService sendingGettingService) {
		this.sendingGettingService = sendingGettingService;

	}

	@GetMapping("/tasks")
	public ResponseEntity<List<Tasks>> getAllTasks() {
		List<Tasks> tasks = sendingGettingService.getAllTasks();
		return ResponseEntity.ok(tasks);
	}

	@PostMapping("/tasks")
	public ResponseEntity<Tasks> store(@RequestBody TasksRequestDTO tasksRequestDTO) {
		Tasks tasks = sendingGettingService.store(tasksRequestDTO);
		return new ResponseEntity<>(tasks, HttpStatus.CREATED);
	}
	
	@PutMapping("/tasks")
	public ResponseEntity<Tasks> Update(@RequestBody TasksRequestDTO tasksRequestDTO) {
		Tasks tasks = sendingGettingService.Update(tasksRequestDTO);
		return new ResponseEntity<>(tasks, HttpStatus.CREATED);
	}
}
