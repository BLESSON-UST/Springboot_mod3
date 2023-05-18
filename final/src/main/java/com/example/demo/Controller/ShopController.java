package com.example.demo.Controller;

import com.example.demo.Entity.Fruit;
import com.example.demo.Entity.Vegetables;
import com.example.demo.Repository.FruitRepo;
import com.example.demo.Repository.VegetableRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    private FruitRepo fruitRepo;
    @Autowired
    private VegetableRepo vegetableRepo;
    @PostMapping("/fruit")
    public ResponseEntity<Optional<Fruit>> submit(@RequestBody Fruit fruit)
    {
        fruitRepo.save(fruit);
        return ResponseEntity.ok().body(Optional.of(fruit));
    }
    @PostMapping("/veg")
    public ResponseEntity<Vegetables> post(@RequestBody Vegetables vegetables)
    {
        vegetableRepo.save(vegetables);
        return ResponseEntity.ok().body(vegetables);
    }

    @GetMapping("/frt/{id}")
    public ResponseEntity<Optional<Fruit>> getbyid(@PathVariable int id)
    {
        Optional<Fruit> fruit=fruitRepo.findById(id);
        if(fruit==null)
        {
            return ResponseEntity.notFound().build();
        }
        else
        {
           return ResponseEntity.ok().body(fruit);
        }
    }

    @GetMapping("/vgt/{vid}")
    public ResponseEntity<Vegetables> getbyvid(@PathVariable int vid)
    {
        Vegetables vegetables=vegetableRepo.findByvid(vid);
        if(vegetables==null)
        {
            return ResponseEntity.notFound().build();
        }
        else
        {
            return ResponseEntity.ok().body(vegetables);
        }
    }

    @PutMapping("/uf/{id}")
    public ResponseEntity<Optional<Fruit>> updatefruit(@PathVariable int id,@RequestBody Fruit fruit)
    {
        Optional<Fruit> existingfruit=fruitRepo.findById(id);
        if(existingfruit==null)
        {
            return ResponseEntity.notFound().build();
        }
        else
        {
            Fruit ufruit=existingfruit.get();
            ufruit.setFname(fruit.getFname());
            ufruit.setFprize(fruit.getFprize());
            fruitRepo.save(ufruit);
            return ResponseEntity.ok().body(Optional.of(ufruit));
        }
    }

    @PutMapping("/uv/{vid}")
    public ResponseEntity<Vegetables> updatevege(@PathVariable int vid,@RequestBody Vegetables vegetables)
    {
        Vegetables existingvege=vegetableRepo.findByvid(vid);
        if(existingvege==null)
        {
            return ResponseEntity.notFound().build();
        }
        else
        {
            existingvege.setVname(vegetables.getVname());
            existingvege.setVprize(vegetables.getVprize());
            vegetableRepo.save(existingvege);
            return ResponseEntity.ok().body(existingvege);
        }
    }

    @DeleteMapping("/df/{id}")
    public ResponseEntity<Optional<Fruit>> deletefbyid(@PathVariable int id)
    {
        Optional<Fruit> fruit=fruitRepo.findById(id);
        if(fruit==null)
        {
            return ResponseEntity.notFound().build();
        }
        else
        {
            fruitRepo.deleteById(id);
            return ResponseEntity.ok().body(null);
        }
    }

    @DeleteMapping("/dv/{vid}")
    public ResponseEntity<Vegetables> deletebyvid(@PathVariable int vid)
    {
        Vegetables vegetables=vegetableRepo.findByvid(vid);
        if(vegetables==null)
        {
            return ResponseEntity.notFound().build();
        }
        else
        {
            vegetableRepo.deleteById(vid);
            return ResponseEntity.ok().body(null);
        }
    }
}
