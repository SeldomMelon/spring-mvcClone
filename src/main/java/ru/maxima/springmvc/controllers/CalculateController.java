package ru.maxima.springmvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.maxima.springmvc.models.CalculateInterface;


@Controller
@RequestMapping("/calculate")
public class CalculateController {

   private final CalculateInterface calculateInterface;

    @Autowired
    public CalculateController(CalculateInterface calculateInterface) {
       this.calculateInterface = calculateInterface;
   }

    @GetMapping
    public String numbers(@RequestParam(value = "num1" , required = false) double num1,
                          @RequestParam(value = "num2" , required = false) double num2,
                          @RequestParam(value = "operation" , required = false) String operation,
                          Model model) {

        model.addAttribute("result", calculateInterface.calculateInter(num1,num2,operation));
        return "calculate";
    }
}
