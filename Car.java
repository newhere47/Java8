public class Car{
    private String brand;
    private int year;
    private Engine engine;
    private Dashboard dashboard;

    public Car(String brand, int year){
        this.brand = brand;
        this.year = year;
    }

    public String getBrand(){
        return this.brand;
    }

    public int year(){
        return this.year;
    }

    public String toString(){
        return "brand: " + this.brand + "year: " + this.year;
    }
    

}