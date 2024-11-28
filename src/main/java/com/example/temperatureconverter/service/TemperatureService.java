package com.example.temperatureconverter.service;

import org.springframework.stereotype.Service;

@Service
public class TemperatureService {
    public double convert(double value, String fromUnit, String toUnit) {
        double celsius;
        switch (fromUnit.toUpperCase()) {
            case "CELSIUS": celsius = value; break;
            case "FAHRENHEIT": celsius = (value - 32) * 5/9; break;
            case "KELVIN": celsius = value - 273.15; break;
            default: throw new IllegalArgumentException("Invalid unit: " + fromUnit);
        }
        switch (toUnit.toUpperCase()) {
            case "CELSIUS": return celsius;
            case "FAHRENHEIT": return (celsius * 9/5) + 32;
            case "KELVIN": return celsius + 273.15;
            default: throw new IllegalArgumentException("Invalid unit: " + toUnit);
        }
    }
}
