package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
//wwrsja marka z mapa i hstoria ponizej zakomentowany oryginal z tutoriala spring.io
@Controller
    public class GreetingController {

        private final AtomicLong counter = new AtomicLong();
        private final Map<Long , String> history = new HashMap<>();
        @GetMapping("/greeting")
        public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
            history.put(counter.getAndIncrement(),name);
            model.addAttribute("name", name);
            model.addAttribute("history", history);
            return "greeting";
        }
//    @GetMapping("/greeting")
//    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
//        model.addAttribute("name", name);
//        return "greeting";
//    }

    }

