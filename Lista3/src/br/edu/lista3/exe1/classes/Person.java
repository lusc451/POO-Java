package br.edu.lista3.exe1.classes;

public class Person {
    private int id;
    private String name;
    private String user;

    public Person(int id, String name, String user) {
        this.id = id;
        this.name = name;
        this.user = user;
    }

    public Person() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", user='" + user + '\'' +
                '}';
    }
}