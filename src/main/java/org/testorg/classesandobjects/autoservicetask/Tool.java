package org.testorg.classesandobjects.autoservicetask;

public class Tool {
    public Tool(){
        System.out.println("New tool was created, no data provided.");
    }
    public Tool(String toolName){
        this.toolName = toolName;
        System.out.println("Tool with name " + this.toolName + " was created.");
    }
    public Tool(String toolName, double price, int inventoryId, boolean nowInStock){
        this.toolName = toolName;
        this.price = price;
        this.inventoryId = inventoryId;
        this.nowInStock = nowInStock;
        System.out.println("The next tool was added:"
                +"\n Tool name: " + this.toolName
                +"\n Tool price: " + this.price
                +"\n Tool id: " + this.inventoryId
                +"\n Is in stock: " + this.nowInStock);
    }
    String toolName;
    double price;
    int inventoryId;
    boolean nowInStock;

}
