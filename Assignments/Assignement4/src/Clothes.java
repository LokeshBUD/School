import java.text.DecimalFormat;

public class Clothes {
    //Fields
    private Integer itemID;
    private String size,color;
    private Double price;

    //Decimal format for display purposes
    DecimalFormat fmt = new DecimalFormat("$0.00");

    //Full Constructor
    public Clothes(Integer itemID, String size, String color, Double price) {
        this.itemID = itemID;
        this.size = size;
        this.color = color;
        this.price = price;
    }
    /*
        Getters and Setters section.
     */
    public Integer getItemID() {
        return itemID;
    }

    public void setItemID(Integer itemID) {
        this.itemID = itemID;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColors() {
        return color;
    }

    public void setColors(String color) {
        this.color = color;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    //Changes the ID to what ever new ID the user wants.
    public void changeId(Integer newID){
        itemID = newID;
    }

    //Raises the price by whatever percentage the user wants.
    public void raisePrice(Double raiseP){
        price += raiseP*price;
    }
    //Reduces the price by whatever percentage the user wants.
    public void reducePrice(Double reduceP){
        price = (1-reduceP)*price;
    }

    public void changeSize(String newSize){
        size = newSize;
    }
    public void changeColor(String newColor){
        color = newColor;
    }


    //toString method.
    @Override
    public String toString() {
        String s = "\nID:\t\t"+ getItemID() +"\n" +
                "Size:\t"+ getSize() +"\n" +
                "Color:\t"+ getColors() +"\n" +
                "Price:\t" + fmt.format(getPrice()) +"\n";
        return s;
    }
}
