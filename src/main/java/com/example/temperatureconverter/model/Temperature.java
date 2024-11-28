package com.example.temperatureconverter.model;

public class Temperature {
    private double value;
    private String fromUnit;
    private String toUnit;
    private double result;

    public double getValue() { return value; }
    public void setValue(double value) { this.value = value; }
    public String getFromUnit() { return fromUnit; }
    public void setFromUnit(String fromUnit) { this.fromUnit = fromUnit; }
    public String getToUnit() { return toUnit; }
    public void setToUnit(String toUnit) { this.toUnit = toUnit; }
    public double getResult() { return result; }
    public void setResult(double result) { this.result = result; }
}
