package com.ltp.paint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaintController {
    @GetMapping("/bk")
    public String getBk() {
        return "hey bk where are you heading to"
    }

}
