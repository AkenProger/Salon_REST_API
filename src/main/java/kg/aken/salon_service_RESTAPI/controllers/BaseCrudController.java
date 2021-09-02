package kg.aken.salon_service_RESTAPI.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface BaseCrudController<S, T> {
    @PostMapping("/save")
    S save(@RequestBody S s);

    @PutMapping("/update")
    S update(@RequestBody S s);

    @GetMapping("/{id}")
    S findById(@PathVariable T t);

    @GetMapping("/all")
    List<S> findAll();

    @PutMapping("/delete/{id}")
    S deactivate(@PathVariable T t);

}
