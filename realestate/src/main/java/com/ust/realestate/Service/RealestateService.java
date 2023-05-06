package com.ust.realestate.Service;

import com.ust.realestate.Entity.Realestate;
import com.ust.realestate.Repository.RealestateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RealestateService {
    @Autowired
    private RealestateRepo repo;

    public List<Realestate> getall() {
        return repo.findAll();
    }

    public List<Realestate> getbyzipcode(double zipcode) {
//        return repo.findByZipcode(zipcode);
        return repo.findAll().stream()
                .filter(r -> r.getZipcode() == zipcode)
                .collect(Collectors.toList());
    }

    public List<Realestate> getbystate(String state) {
        return repo.findAll().stream().filter(s -> s.getState().equals(state))
                .collect(Collectors.toList());
    }

    public List<Realestate> setbycity(String city) {
        return repo.findAll().stream().filter(t->t.getCity().equals(city))
                .collect(Collectors.toList());
    }

    public List<Realestate> getbybath() {
        return repo.findAll().stream().filter(u->u.getBath()==2)
                .collect(Collectors.toList());
    }

    public List<Realestate> getbybed() {
        return repo.findAll().stream().filter(v->v.getBed()==2)
                .collect(Collectors.toList());
    }


    public List<Realestate> getbyprize(Double price) {
        return repo.findAll().stream().filter(w->w.getPrice()<price)
                .collect(Collectors.toList());
    }

    public int getbystatus(String city) {
        return (int) repo.findAll().stream().filter(x->x.getCity().equals(city)).filter(y->y.getStatus().equals("for_sale"))
                .count();
    }
}
