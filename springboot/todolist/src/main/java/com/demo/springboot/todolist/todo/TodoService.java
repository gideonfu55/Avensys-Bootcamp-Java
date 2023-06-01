package com.demo.springboot.todolist.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

  private static List<Todo> todos = new ArrayList<>();

  private static int todoCount = 0;

  static {
    todos.add(new Todo(++todoCount, "Gideon", "Make a todolist webapp", LocalDate.now().plusDays(1), true));
    todos.add(new Todo(++todoCount, "Gideon", "Get a tech job", LocalDate.now().plusMonths(1), false));

    // For additional users:
    // todos.add(new Todo(2, "brucewayne", "Save Gotham", LocalDate.now().plusYears(20), false));
    // todos.add(new Todo(3, "tonystark", "Build new Arc Reactor", LocalDate.now().plusYears(1), false));
  }

  public List<Todo> findByUsername(String username) {
    return todos.stream()
      .filter(todo -> todo.getUsername().equals(username))
      .collect(Collectors.toList());
  }

  public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
    Todo todo = new Todo(++todoCount, username, description, targetDate, done);
    todos.add(todo);
  }

}