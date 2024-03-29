package OOP.ClassesObjects.Phone;

public class Phone
{
    String name;
    String model;
    int price;

    Phone (String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public String getData() {
        return name + " - " + model + " for " + price + " KZT.";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price > 0){
            this.price = price;
        } else System.out.println("Age cannot be less than 0");
    }

    public String getCategory() {
        if (price >= 1000) {
            return "TOP";
        } else if (price >= 500) {
            return "MEDIUM";
        } else return "SIMPLE";
    }
}
