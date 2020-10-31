package com.example.entity.controller;

import com.example.entity.model.Entity;
import com.example.entity.model.EntityEvents;
import com.example.entity.service.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entity")
public class EntityController {

  @Autowired
  private EntityService entityService;

  @RequestMapping(value = "/")
  public List<Entity> getEntities() {
    return entityService.getEntities();
  }

  @RequestMapping(value = "/{id}")
  public Entity getEntity(@PathVariable("id") Long id) {
    return entityService.getEntity(id);
  }

  @RequestMapping(value = "/create", method = RequestMethod.POST)
  public Entity createEntity(@RequestBody Entity entity) {
    return entityService.createEntity(entity);
  }

  @RequestMapping(value = "/{id}/update/{event}")
  public Boolean sendEvent(@PathVariable("id") Long id, @PathVariable("event") EntityEvents event) {
    return entityService.updateState(id, event);
  }
}
