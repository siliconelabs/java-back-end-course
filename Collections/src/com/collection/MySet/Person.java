package com.collection.MySet;

public class Person {

    int yas;
    String name;

    public Person(int yas,String isim)
    {
        this.yas=yas;
        this.name=isim;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;


        return name != null ? this.name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {

        return 1;
    }

    @Override
    public String toString() {
        return "Person{" +
                "yas=" + yas +"isim :"+this.name+
                '}';
    }
}
