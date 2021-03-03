package com.raksow;

public class Zadanie2
{
    public static void main(String[] args)
    {
        String[] productsBookshop = {"książka", "komiks", "gazeta"};
        String[] productsBakery = {"chleb", "bułki", "ciasto"};

        Bookshop empik = new Bookshop("empikowa 2", "Mały", productsBookshop);
        Bakery kropka = new Bakery("kropkowa 18", "Mały", productsBakery);

        System.out.println(empik.getInformation());
        System.out.println(kropka.getInformation());
    }
}
