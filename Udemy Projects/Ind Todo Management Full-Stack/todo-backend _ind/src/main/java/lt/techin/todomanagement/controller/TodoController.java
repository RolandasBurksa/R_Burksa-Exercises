package lt.techin.todomanagement.controller;

import lombok.AllArgsConstructor;
import lt.techin.todomanagement.dto.TodoDto;
import lt.techin.todomanagement.service.TodoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("api/todos")
@AllArgsConstructor
public class TodoController {

    private TodoService todoService;

    // Build Add Todo Rest API
//    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping
    public ResponseEntity<TodoDto> addTodo(@RequestBody TodoDto todoDto){

        TodoDto savedTodo = todoService.addTodo(todoDto);

        return new ResponseEntity<>(savedTodo, HttpStatus.CREATED);
    }

    // Build Get Todo Rest API
//    @PreAuthorize("hasAnyRole('ADMIN, 'USER')")
    @GetMapping("{id}")
    public ResponseEntity<TodoDto> getTodo(@PathVariable("id") Long todoId){
      TodoDto todoDto = todoService.getTodo(todoId);
      return  new ResponseEntity<>(todoDto, HttpStatus.OK);
    }

    // Build Get All Todos Rest API
//    @PreAuthorize("hasAnyRole('ADMIN, 'USER')")
    @GetMapping
    public ResponseEntity<List<TodoDto>> getAllTodos(){
        List<TodoDto> todos = todoService.getAllTodos();
//        return new ResponseEntity<>(todos, HttpStatus.OK);
        return ResponseEntity.ok(todos);
    }

    // Build Update Todo Rest API
//    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("{id}")
    public ResponseEntity<TodoDto> updateTodo(@RequestBody TodoDto todoDto, @PathVariable("id") Long todoId){
        TodoDto updatedTodo = todoService.updateTodo(todoDto, todoId);
        return  ResponseEntity.ok(updatedTodo);
    }

    // Build Delete Todo Rest API
//    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteTodo(@PathVariable("id") Long todoId){
        todoService.deleteTodo(todoId);
        return ResponseEntity.ok("Todo deleted successfully!");
    }

    // Build Complete Todo Rest API
//    @PreAuthorize("hasAnyRole('ADMIN, 'USER')")
    @PatchMapping("{id}/complete")
    public  ResponseEntity<TodoDto> completeTodo(@PathVariable("id") Long todoId){
       TodoDto updatedTodo = todoService.completeTodo(todoId);
       return ResponseEntity.ok(updatedTodo);
    }

    // Build In Complete Todo Rest API
//    @PreAuthorize("hasAnyRole('ADMIN, 'USER')")
    @PatchMapping("{id}/in-complete")
    public ResponseEntity<TodoDto> incompleteTodo(@PathVariable("id") Long todoId){
        TodoDto updatedTodo = todoService.inCompleteTodo(todoId);
        return ResponseEntity.ok(updatedTodo);
    }

}