package EqualsHashCode;

import java.util.Date;

public class Equals {
    static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "Pedro Silva";
        u1.email = "pedro.silva@ezemail.com.br";

        Usuario u2 = new Usuario();
        u2.nome = "Pedro Sa";
        u2.email = "pedro.silva@ezemail.com.br";

        // Comparação (False).
        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));

        System.out.println(u2.equals(new Date()));

        System.out.println(u2.hashCode());

        /*
        Comparação true:
        System.out.println(u1 == u1);
        System.out.println(u1.equals(u1));
         */
    }
}
