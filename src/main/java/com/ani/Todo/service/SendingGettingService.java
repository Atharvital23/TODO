package com.ani.Todo.service;

import java.util.List;

import com.ani.Todo.dto.TasksRequestDTO;
import com.ani.Todo.entity.Tasks;

public interface SendingGettingService {

	/**
	 * It is storing the data
	 * 
	 * @param tasksRequestDTO
	 * 
	 *                        it will returns the object of Tasks
	 * @return
	 */
	Tasks store(TasksRequestDTO tasksRequestDTO);

	/**
	 * It will return all the tasks
	 * 
	 * @return
	 */
	List<Tasks> getAllTasks();

	/**
	 * It is updating the data
	 * 
	 * @param tasksRequestDTO
	 * 
	 *                        it will return the same Tasks object
	 * @return
	 */
	Tasks Update(TasksRequestDTO tasksRequestDTO);
}
