package dev.test.Fridge.controller;

import dev.test.Fridge.model.Food;
import dev.test.Fridge.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {

    //injecao de dependencia
    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    //GET
    @GetMapping
    public List<Food> getAll(){return foodService.getAll();}
    //POST
    @PostMapping
    public Food create(@RequestBody Food food){return foodService.save(food);}
    //DELETE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){foodService.delete(id);}
}
