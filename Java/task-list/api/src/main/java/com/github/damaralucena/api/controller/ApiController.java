package com.github.damaralucena.api.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/tasks")
public class ApiController {

  private List<String> tasks = new ArrayList<>();

  @GetMapping
  public ResponseEntity<List<String>> getTasks() {
    return ResponseEntity.ok(tasks);
  }

  @PostMapping
  public ResponseEntity<String> addTasks(@RequestBody String task) {
    tasks.add(task);
    return ResponseEntity.ok("Tarefa cadastrada com sucesso!");
  }

  @DeleteMapping
  public ResponseEntity<String> deleteTasks(@PathVariable int id) {
    if (id >= 0 && id < tasks.size()) {
      tasks.remove(id);
      return ResponseEntity.ok("Tarefa deletada com sucesso!");
    } else {
      return ResponseEntity.badRequest().body("Id inválido!");
    }
  }
}
