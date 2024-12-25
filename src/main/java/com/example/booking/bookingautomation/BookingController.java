package com.example.booking.bookingautomation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/booking")
public class BookingController {
    @GetMapping("/getdetails")
    public String getDetails()
    {
        return "Hi main";
    }
    @GetMapping("/getdetails1")
    public String getDetails1()
    {
        return "Hi child2";
    }
    @GetMapping("/getdetails2")
    public String getDetails2()
    {
        return "Hi child1";
    }

    @GetMapping("/getdetails3")
    public String getDetails3()
    {
        return "Hi child3";
    }

    @GetMapping("/getdetails4")
    public String getDetails4()
    {
        return "Hi child4";
    }

    @GetMapping("/getdetails7")
    public String getDetails7()
    {
        return "Hi child7";
    }

    @GetMapping("/getdetails8")
    public String getDetails8()
    {
        return "Hi child8";
    }

    @GetMapping("/getdetails20")
    public String getDetails20()
    {
        return "Hi child20";
    }

    @GetMapping("/getdetails21")
    public String getDetails21()
    {
        return "Hi child21";
    }

    @GetMapping("/getdetails31")
    public String getDetails31()
    {
        return "Hi child31";
    }

    @GetMapping("/getdetails91")
    public String getDetails91()
    {
        return "Hi child91";
    }
}
