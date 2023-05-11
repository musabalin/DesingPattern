package org.example.behavorial.command;

/**
 * @author musa.balin
 */
public class Coin {

    private String name;
    public void buy(){
        System.out.println("Buy: "+name);

    }
    public void sell(){
        System.out.println("Sell: "+name);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
