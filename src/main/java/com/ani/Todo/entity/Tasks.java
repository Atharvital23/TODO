package com.ani.Todo.entity;

import com.ani.Todo.enums.Priority;
import com.ani.Todo.enums.Status;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tasks")
public class Tasks {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false)
	private String task_name;

	@Enumerated(EnumType.STRING)
	@Column(columnDefinition = "ENUM('Pending', 'In_Progress', 'Completed')")
	private Status status;

	@Column(nullable = false)
	private String description;

	@Enumerated(EnumType.STRING)
	@Column(columnDefinition = "ENUM('_1', '_2','_3','_4','_5')")
	private Priority priority;

	public Tasks() {

	}

	public Tasks(String task_name, Status status, String description, Priority priority) {
		super();
		this.task_name = task_name;
		this.status = status;
		this.description = description;
		this.priority = priority;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTask_name() {
		return task_name;
	}

	public void setTask_name(String task_name) {
		this.task_name = task_name;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}

}
