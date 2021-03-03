package com.raksow;

public class Bookshop extends Shop
{
    String[] products;

    public Bookshop(String address, String size, String[] products)
    {
        super(address, size);
        this.products = products;
    }

    public String wyswietlTab()
    {
        String prod = "";

        for(int i = 0; i < products.length; i++)
        {
            prod += products[i] + ", ";
        }
        return prod;
    }

    @Override
    public String getInformation()
    {
        return "adres: " +getAddress()+ ", rozmiar: " +getSize()+ ", produkty: " + wyswietlTab();
    }
}
