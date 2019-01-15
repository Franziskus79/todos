package hsrm.test.todolist;

import org.springframework.data.repository.CrudRepository;

interface TodoRepository extends CrudRepository<TodoItem, Long> {

}
