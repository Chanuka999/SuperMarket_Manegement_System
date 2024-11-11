package Model;

import java.util.ArrayList;
public class section {
    private  int id;
    private String name;
    private ArrayList<product> products;
    private String description;

    public section(){

    }

    public section(int id,String name,ArrayList<product>products,String description){
        this.id=id;
        this.name=name;
        this.products=products;
        this.description=description;
    }

    public int getId(){
        return  id;
    }
    public void setId(int id){
        this.id=id;
    }

    public String getName(){
        return  name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getDescription(){
        return  description;
    }

    public void setDescription(String description){
        this.description=description;
    }

    public ArrayList<product> getProducts(){
        return products;
    }

    public void setProducts(ArrayList<product> products){
        this.products=products;
    }

}
