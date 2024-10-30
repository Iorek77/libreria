package library;

import java.util.Scanner;

public class Library {

    private static book LOTR = new book("Lord of the Rings", "Tolkien", "Fantasy", 1);
    private static book DQ = new book("Don Quixote", "Miguel de Cervantes", "Novel", 2);
    private static book Shogun = new book("Shogun", "James Clavell", "Historical Fiction", 3);

    public static void registro() {
        Scanner input = new Scanner(System.in);
        String username, nickname, password;
        System.out.println("Registro de cuenta.");
        System.out.println("Ingrese un nombre de usuario.");
        username = input.next();
        System.out.println("Ingrese un password.");
        password = input.next();
        System.out.println("Ingrese un nombre de perfil.");
        nickname = input.next();
        user user01 = new user(nickname, username, password);
        System.out.println("Datos de su cuenta: ");
        System.out.println("Nombre de usuario");
        System.out.println(user01.getUsername());
        System.out.println("Password");
        System.out.println(user01.getPassword());
        System.out.println("Nombre de perfil");
        System.out.println(user01.getNickname());
    }

    public static void catalogo() {
        System.out.println("Bienvenido al catalogo. Los libros disponibles en este momento son:");
        System.out.println("1. " + LOTR.getNombre());
        System.out.println("2. " + DQ.getNombre());
        System.out.println("3. " + Shogun.getNombre());
        System.out.println("Elija un libro para ver mas informacion.");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        registro();
        catalogo();
        int selection = input.nextInt();
        switch (selection) {
            case 1:
                

        }
    }

}
