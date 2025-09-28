package cz.itnetwork.todoapp.mapper;

import cz.itnetwork.todoapp.dto.TodoItemDTO;
import cz.itnetwork.todoapp.entity.TodoItemEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class TodoItemMapper {

    public abstract TodoItemDTO toDTO (TodoItemEntity source);
}
