package com.kgisl.eventhandler.eventhandler.repository;

import com.kgisl.eventhandler.eventhandler.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {

}