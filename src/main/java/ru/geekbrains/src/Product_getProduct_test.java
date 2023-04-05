

package ru.geekbrains.src;

import java.util.ArrayList;
import java.util.List;


//реализация дз:
public class Product_getProduct_test {

    List<Product> list = new ArrayList<>();

    public Product_getProduct_test() {
        Product p1 = new Product(1,"Продукт_1",10);
        Product p2 = new Product(2,"product_2",200);
        Product p3 = new Product(3,"product_3",3000);
        Product p4 = new Product(4,"product_4",40000);
        Product p5 = new Product(5,"product_5",500000);
        Product p6 = new Product(6,"product_6",600000);
        Product p7 = new Product(7,"product_7",70000);
        Product p8 = new Product(8,"product_8",8000);
        Product p9 = new Product(9,"product_9",900);
        Product p10 = new Product(10,"product_10",10);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);
        list.add(p7);
        list.add(p8);
        list.add(p9);
        list.add(p10);
    }
    public String getProductListHTML(){
        StringBuilder sb = new StringBuilder("<h1>Product list:</h1><h1>");
        for (int i = 0; i < list.size(); i++) {
            sb.append("id: "+list.get(i).getId()+". ");
            sb.append("name: "+list.get(i).getName()+". ");
            sb.append("cost: "+list.get(i).getCost()+". ");
            if(i == list.size()-1){
                sb.append("</h1>");
            }else sb.append("</h1>"+"<h1>");
        }

        return sb.toString();
    }

}






