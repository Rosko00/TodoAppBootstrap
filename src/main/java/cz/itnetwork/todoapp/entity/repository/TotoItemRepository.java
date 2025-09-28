package cz.itnetwork.todoapp.entity.repository;

import cz.itnetwork.todoapp.entity.TodoItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TotoItemRepository extends JpaRepository<TodoItemEntity, Long> {
}
