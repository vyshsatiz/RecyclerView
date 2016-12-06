package com.example.vyshalis.recyclerview;

/**
 * Created by Vyshali.S on 05-12-2016.
 */

public class Dataprovider {

    public  Dataprovider(int img_res,String name)
    {
        this.setImg_res(img_res);
        this.setName(name);
    }


    private int img_res;
    private String name;

    public int getImg_res() {
        return img_res;
    }
    public void setImg_res(int img_res) {
        this.img_res = img_res;
    }
    public String getname() {
    return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
