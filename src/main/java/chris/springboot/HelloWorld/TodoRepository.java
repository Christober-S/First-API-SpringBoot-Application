package chris.springboot.HelloWorld;

import chris.springboot.HelloWorld.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
