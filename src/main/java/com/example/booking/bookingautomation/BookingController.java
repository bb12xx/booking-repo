package com.example.booking.bookingautomation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/booking")
public class BookingController {
    @GetMapping("/getdetailsmain")
    public String getDetailsmain()
    {
        return "Hi main";
    }
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
    @GetMapping("/getdetailsmain1")
    public String getDetailsmain1()
    {
        return "Hi main1";
    }

    @GetMapping("/getdetailsmain2")
    public String getDetailsmain2()
    {
        return "Hi main2";
    }


    @GetMapping("/getdetailsChild111")
    public String getDetailsChild111()
    {
        return "Hi childChild111";
    }

    @GetMapping("/getnewmergemain")
    public String getnewmergemain()
    {
        return "Hi getnewmergemain";
    }

    @GetMapping("/getdetailsChildmerge")
    public String getdetailsChildmerge()
    {
        return "Hi getdetailsChildmerge";
    }

    @GetMapping("/getdetailsChildmerge2")
    public String getdetailsChildmerge2()
    {
        return "Hi getdetailsChildmerge2";
    }
}
