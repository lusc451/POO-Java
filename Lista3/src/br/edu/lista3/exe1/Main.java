package br.edu.lista3.exe1;

import br.edu.lista3.exe1.classes.Person;
import br.edu.lista3.exe1.classes.Forum;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(1, "Lucas Antunes", "LucasAntunes123");
        Person p2 = new Person(2, "Emily", "Mily21");

        Forum forum = new Forum(100, "Conversas", "www.conversas.com");

        forum.addMessages(1000, "Oi, Larissa. Tudo bem?", p1);
        forum.addMessages(1001, "Tudo ótimo. E você?", p2);

        System.out.println(forum);
    }
}