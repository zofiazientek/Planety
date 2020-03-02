package main;

public class Planety {
    public double print(String sekundyString, String planeta) {

        double sekundy = Double.parseDouble(sekundyString);
        double wiek = sekundy/31557600;
        switch(planeta)
        {
            case "Ziemia":
                break;
            case "Merkury":
                wiek = wiek/0.2408467;
                break;
            case "Wenus":
                wiek = wiek/0.61519726;
                break;
            case "Mars":
                wiek = wiek/1.8808158;
                break;
            case "Jowisz":
                wiek = wiek/11.862615;
                break;
            case "Saturn":
                wiek = wiek/29.447498;
                break;
            case "Uran":
                wiek = wiek/84.016846;
                break;
            case "Neptun":
                wiek = wiek/164.79132;
                break;
        }
        return wiek;
    }
}
