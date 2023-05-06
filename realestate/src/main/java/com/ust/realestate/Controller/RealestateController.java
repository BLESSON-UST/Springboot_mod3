package com.ust.realestate.Controller;

import com.ust.realestate.Entity.Realestate;
import com.ust.realestate.Service.RealestateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/real")
public class RealestateController {
    @Autowired
    private RealestateService realestateService;

    @GetMapping("/{zipcode}")
    public List<Realestate> getbyzipcode(double zipcode)
    {
        return realestateService.getbyzipcode(zipcode);
    }

    @GetMapping("/getbystate/{state}")
    public List<Realestate> getbystate(String state)
    {
        return realestateService.getbystate(state);
    }

    @GetMapping("/getbycity/{city}")
    public List<Realestate> getbycity(String city)
    {
        return realestateService.setbycity(city);
    }
    @GetMapping("/bathcount/{bath}")
    public List<Realestate> getbybath()
    {
        return realestateService.getbybath();
    }

    @GetMapping("/bedcount/{bed}")
    public List<Realestate> getbybed()
    {
        return realestateService.getbybed();
    }

    @GetMapping("/lessthanprize/{price}")
    public List<Realestate> getbyprize(Double price)
    {
        return realestateService.getbyprize(price);
    }
    @GetMapping("/presale/{status}")
    public int getbydstatus(String city)
    {
        return realestateService.getbystatus(city);
    }

    @GetMapping("/info")
    public List<Realestate> getall()
    {
        return realestateService.getall();
    }
}
