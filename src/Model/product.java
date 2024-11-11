package Model;

public class product {
    private int id;
    private String name;
    private String description;
    private double price;
    private int qty;

    public  product(){

    }

    public product(int id,String name,String description,double price,int qty){
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.qty= qty;
    }
    public int getId(){
        return  id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getname(){
        return  name;
    }
    public void setname(String name){
        this.name=name;
    }
    public String getdescription(){
        return  description;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public double getprice(){
        return  price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public int getQty(){
        return qty;
    }
    public void setQty(int qty){
        this.qty=qty;
    }
}
