package com.example.temperatureconverter.controller;

import com.example.temperatureconverter.model.Temperature;
import com.example.temperatureconverter.service.TemperatureService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TemperatureController {
    private static final Logger logger = LoggerFactory.getLogger(TemperatureController.class);

    @Autowired
    private TemperatureService temperatureService;

    @GetMapping("/")
    public String showForm(Model model) {
        try {
            model.addAttribute("temperature", new Temperature());
            logger.info("Loading temperature converter form");
            return "converter";
        } catch (Exception e) {
            logger.error("Error loading form: ", e);
            return "error";
        }
    }

    @PostMapping("/convert")
    public String convert(@ModelAttribute Temperature temperature, Model model) {
        try {
            logger.info("Converting temperature: {} from {} to {}", 
                temperature.getValue(), temperature.getFromUnit(), temperature.getToUnit());
            
            double result = temperatureService.convert(
                temperature.getValue(),
                temperature.getFromUnit(),
                temperature.getToUnit()
            );
            temperature.setResult(result);
            model.addAttribute("temperature", temperature);
            return "converter";
        } catch (Exception e) {
            logger.error("Error converting temperature: ", e);
            model.addAttribute("error", "Error converting temperature");
            return "converter";
        }
    }
}
