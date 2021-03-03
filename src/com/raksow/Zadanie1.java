package com.raksow;

public class Zadanie1
{
    public static void main(String[] args)
    {
        Dog pies = new Dog();
        Cat kot = new Cat();

        pies.setColor("szary");
        pies.setName("burek");
        kot.setColor("czarny");
        kot.setName("puszek");

        System.out.println(pies.makeSound());
        System.out.println(kot.makeSound());
    }
}
