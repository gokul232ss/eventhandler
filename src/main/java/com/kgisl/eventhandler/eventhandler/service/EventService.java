package com.kgisl.eventhandler.eventhandler.service;

import com.kgisl.eventhandler.eventhandler.Event;
import java.util.List;



public interface EventService {

    public List<com.kgisl.eventhandler.eventhandler.Event> getAll();

    public Event save(Event event);

    public Event find(long id);

    public void delete(Long id);

}