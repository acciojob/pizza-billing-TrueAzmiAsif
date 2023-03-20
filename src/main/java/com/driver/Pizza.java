package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    public boolean etop,ech,taw,totbill;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        bill="";
        if(isVeg){
            bill+="Base Price Of The Pizza: 300\n";
            price+=300;
        }
        else{
            bill+="Base Price Of The Pizza: 400\n";
            price+=400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!ech){
            bill+="Extra Cheese Added: 80\n";
            price+=80;
            ech=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!etop){
            if(isVeg){
                bill+="Extra Toppings Added: 70\n";
                price+=70;
            }
            else{
                bill+="Extra Toppings Added: 120\n";
                price+=120;
            }
            etop=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!taw){
            bill+="Paperbag Added: 20\n";
            price+=20;
            taw=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!totbill){
            bill+="Total Price: "+price;
            totbill=true;
            return this.bill;
        }
        else return "";
    }
    public void setBill(String s){
        bill+=s;
    }
}
