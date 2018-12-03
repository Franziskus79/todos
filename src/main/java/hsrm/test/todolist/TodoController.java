package hsrm.test.todolist;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoController {
    private final TodoRepository repository;

    public TodoController (TodoRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/todos")
    List<TodoItem> all(){
        return repository.findAll();
    }
}
