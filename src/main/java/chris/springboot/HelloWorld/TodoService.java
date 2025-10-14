package chris.springboot.HelloWorld;

import chris.springboot.HelloWorld.models.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public Todo getTodoById(Long id) {
        return todoRepository.findById(id).orElseThrow(() -> new RuntimeException("Table not found"));
    }

    public List<Todo> getTodos(){
        return todoRepository.findAll();
    }

    public Todo updateTodo(Todo todo){
        return todoRepository.save(todo);
    }

    public void deleteTodoById(Long id){
        todoRepository.delete(getTodoById(id));
    }

    public void deleteTodo(Todo todo){
        todoRepository.delete(todo);
    }
}
