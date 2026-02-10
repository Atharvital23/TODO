package com.ani.Todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ani.Todo.entity.Tasks;

public interface TasksRepository extends JpaRepository<Tasks, Integer> {

}
