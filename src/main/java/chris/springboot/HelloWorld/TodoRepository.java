package chris.springboot.HelloWorld;

import org.springframework.stereotype.Repository;

@Repository
public class TodoRepository{
    String getAllTodos(){
        return "All Todos";
    }
}
