package io.github.francelinom.agendaapi.model.repository;

import io.github.francelinom.agendaapi.model.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {
}
