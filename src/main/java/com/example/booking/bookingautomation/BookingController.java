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

    @GetMapping("/getdetails10")
    public String getDetails10()
    {
        return "Hi child10";
    }

    @GetMapping("/getdetails11")
    public String getDetails11()
    {
        return "Hi child11";
    }

    @GetMapping("/getdetails41")
    public String getDetails41()
    {
        return "Hi child41";
    }

    @GetMapping("/getdetailsChild1")
    public String getDetailsChild1()
    {
        return "Hi childChild1";
    }
}
