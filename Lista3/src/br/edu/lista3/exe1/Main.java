package br.edu.lista3.exe1;

import br.edu.lista3.exe1.classes.Person;
import br.edu.lista3.exe1.classes.Forum;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(1, "Lucas Antunes", "LucasAntunes123");
        Person p2 = new Person(2, "Emily", "Mily21");

        Forum forum = new Forum(100, "Bate Papo", "www.batepapo.com.br");

        forum.addMessages(1000, "Boa tarde, Emily, tudo bem?", p1);
        forum.addMessages(1001, "Tudo bem. E você?", p2);

        System.out.println(forum);
    }
}