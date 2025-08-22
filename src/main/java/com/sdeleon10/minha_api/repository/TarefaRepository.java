package com.sdeleon10.minhaapi.repository;

import com.sdeleon10.minhaapi.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
