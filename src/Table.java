package ru.neoflex.practice.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flush")
public class DataBaseController {
    @Autowired
    private RepositoryTransHistory TRepository;

    @GetMapping("/all")
    public List <TableTH> getAllT() {

        return TRepository.findAll();
    }
    public TableTH createTTH(@Valid @RequestBody TableTH TTH) {
        return TRepository.save(TTH);
    }