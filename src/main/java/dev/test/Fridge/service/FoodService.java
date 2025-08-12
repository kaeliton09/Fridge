package dev.test.Fridge.service;

import dev.test.Fridge.model.Food;
import dev.test.Fridge.respository.FoodRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

    private final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    //Listar
    public List<Food> getAll(){
        return foodRepository.findAll();
    }
    //Criar
    public Food save(Food food){
        return foodRepository.save(food);
    }
    //Deletar
    public void delete(long id){
        foodRepository.deleteById(id);
    }
}
