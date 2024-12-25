package com.example.booking.bookingautomation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/booking")
public class BookingController {
    @GetMapping("/getdetailschild")
    public String getdetailschild()
    {
        return "Hi child";
    }


    @GetMapping("/getdetailsChild1")
    public String getDetailsChild1()
    {
        return "Hi childChild1";
    }
}
