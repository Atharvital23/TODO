package com.ani.Todo.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ani.Todo.dto.TasksRequestDTO;
import com.ani.Todo.entity.Tasks;
import com.ani.Todo.repository.TasksRepository;
import com.ani.Todo.service.SendingGettingService;

@Service
public class SendingGettingServiceImpl implements SendingGettingService {

	public final TasksRepository tasksRepository;

	public SendingGettingServiceImpl(TasksRepository tasksRepository) {
		this.tasksRepository = tasksRepository;

	}

	@Override
	public Tasks store(TasksRequestDTO tasksRequestDTO) {

		Tasks tasks = new Tasks();

		
		tasks.setTask_name(tasksRequestDTO.getTask_name());
		tasks.setDescription(tasksRequestDTO.getDescription());
		tasks.setStatus(tasksRequestDTO.getStatus());
		tasks.setPriority(tasksRequestDTO.getPriority());
		
		tasksRepository.save(tasks);
		
		return tasks;
	}

	@Override
	public List<Tasks> getAllTasks() {

		return tasksRepository.findAll();
	}

	@Override
	public Tasks Update(TasksRequestDTO tasksRequestDTO) {
	    int id = tasksRequestDTO.getId();

	    java.util.Optional<Tasks> optionalTask = tasksRepository.findById(id);

	    if (optionalTask.isPresent()) {
	        Tasks existingTask = optionalTask.get();
	        existingTask.setTask_name(tasksRequestDTO.getTask_name());
	        existingTask.setDescription(tasksRequestDTO.getDescription());
	        existingTask.setStatus(tasksRequestDTO.getStatus());
	        existingTask.setPriority(tasksRequestDTO.getPriority());
	        return tasksRepository.save(existingTask);
	    } else {

	        throw new RuntimeException("Task not found with id: " + id);
	    }
	}


}
