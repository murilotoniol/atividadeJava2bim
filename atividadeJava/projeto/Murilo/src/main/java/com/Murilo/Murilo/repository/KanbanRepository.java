package com.Murilo.Murilo.repository;

import com.Murilo.Murilo.model.Prioridade;
import org.springframework.data.jpa.repository.JpaRepository;
import com.Murilo.Murilo.model.KanbanModel;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.Date;
import java.util.List;

public interface KanbanRepository extends JpaRepository<KanbanModel, Long> {}
