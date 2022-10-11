package com.example.masterclass3.masterclass3.repositorio.crudRepository;

import com.example.masterclass3.masterclass3.entidades.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository<Message, Integer> {
}
