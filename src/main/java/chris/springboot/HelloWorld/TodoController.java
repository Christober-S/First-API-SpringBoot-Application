package chris.springboot.HelloWorld;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/todo")
public class TodoController {
    @GetMapping("/home")
    String getTodo(){
        return "Todo";
    }
    @GetMapping("/id")
    String getTodoId(){
        return "Id";
    }

    //Path Variable
    @GetMapping("/{id}")
    String getTodoById(@PathVariable long id){
        return "Todo with ID "+ id;
    }

    //Request Param
    @GetMapping("/by-id")
    //http://localhost:8081/api/v1/todo/by-id?id=10
    String getTodoByIdParam(@RequestParam long id){
        return "Todo with ID " + id;
    }

    @GetMapping("/by-todoId")
    //http://localhost:8081/api/v1/todo/by-todoId?todoId=25
    String getTodoByIdParameter(@RequestParam("todoId") long id){
        return "Todo with ID " + id;
    }

    @PostMapping("/create")
    String createUser(@RequestBody String body){
        return body;    
    }

    @PutMapping("/{id}")
    String updateTodoById(@PathVariable long id){
        return "Update Todo with ID "+ id;
    }

    @DeleteMapping("/{id}")
    String deleteTodoById(@PathVariable long id){
        return "Delete Todo with ID "+ id;
    }
}
