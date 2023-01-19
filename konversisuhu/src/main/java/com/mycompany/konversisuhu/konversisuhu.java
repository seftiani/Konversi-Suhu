package com.mycompany.konversisuhu;
/**
 *
 * @author Admin Seftiani Ayu Lestari
 */
public class konversisuhu {
    private double Celsius;
    
    public void suhuReamur (double Celsius)
    {
        this.Celsius = Celsius;
        double reamur = Celsius*4/5;
        System.out.println("Suhu Reamurnya = " + reamur);
    }
    
    public void suhuFahrenheit (double Celsius)
    {
        this.Celsius = Celsius;
        double fahrenheit = Celsius*9/5 + 32;
        System.out.println("Suhu Fahrenheitnya = " + fahrenheit);
    }
    
    public void suhuKelvin (double Celsius)
    {
        this.Celsius = Celsius;
        double kelvin = Celsius + 273;
        System.out.println("Suhu Kelvinnya = " + kelvin);
    }
}
