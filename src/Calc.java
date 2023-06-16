package ru.neoflex.practice.controller;
import org.springframework.beans.factory.annotation.Autowired;
import ru.neoflex.practice.controller.DataBaseController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.neoflex.practice.controller.RepositoryTransHistory;
import ru.neoflex.practice.controller.TableTransHistory;

public class Calc {
    @Autowired
    private DataBaseController DBC;

    @GetMapping("/plus/{a}/{b}")
    public int plus (@PathVariable int a, @PathVariable int b)
    {

        DBC.createTTH(new TableTH(String.valueOf(a+b)));//вносит данные о результате в БД
        return a+b;
    }
    @GetMapping("/minus/{a}/{b}")
    public int minus (@PathVariable int a, @PathVariable int b)
    {
        DBC.createTTH(new TableTH(String.valueOf(a-b)));
        return a-b;
    }

}
