package library;

import java.util.Scanner;
import java.util.ArrayList;

public class Library {

    static Scanner input = new Scanner(System.in);
    private static book LOTR = new book("Lord of the Rings", "Tolkien", "Fantasy", 3);
    private static book DQ = new book("Don Quixote", "Miguel de Cervantes", "Novel", 4);
    private static book Shogun = new book("Shogun", "James Clavell", "Historical Fiction", 6);
    private static user admin = new user("Admin", "admin@gmail.com", "01010101", "10101010");
    static ArrayList<book> catalogo = new ArrayList<>();
    static ArrayList<user> userlist = new ArrayList<>();

    public static book bookinfo() {
        String name, author, genre;
        int quantity;
        System.out.println("Nombre del libro: ");
        name = input.next();
        System.out.println("Genero: ");
        genre = input.next();
        System.out.println("Autor del libro: ");
        author = input.next();
        System.out.println("Cantidad disponible: ");
        quantity = input.nextInt();
        return new book(name, author, genre, quantity);
    }

    public static user registro() {
        String username, email, phone, id;
        System.out.println("Registro de usuario.");
        System.out.println("Ingrese nombre y apellido.");
        username = input.nextLine();
        System.out.println("Ingrese E-Mail.");
        email = input.nextLine();
        System.out.println("Ingrese numero de telefono.");
        phone = input.nextLine();
        System.out.println("Ingrese cedula.");
        id = input.nextLine();
        return new user(username, email, phone, id);
    }

    public static user showuser(user s) {
        System.out.println("Datos de usuario: ");
        System.out.println("Nombre");
        System.out.println(s.getUsername());
        System.out.println("E-Mail");
        System.out.println(s.getEmail());
        System.out.println("Telefono");
        System.out.println(s.getPhone());
        System.out.println("Cedula");
        System.out.println(s.getId());
        return s;
    }

    public static void edituser() {
        int useredit, parametrouser;
        System.out.println("Elija usuario a modificar.");
        for (user b : userlist) {
            System.out.println(b.getUsername() + " " + b.getId());
        }
        useredit = input.nextInt();
        input.nextLine();
        do {
            System.out.println("Que parametro modificar?\n1. Nombre\n2. E-Mail\n3. Telefono\n4. Cedula\n5. Salir");
            parametrouser = input.nextInt();
            input.nextLine();
            switch (parametrouser) {
                case 1:
                    String newname;
                    System.out.println("Nombre actual: " + userlist.get(useredit).getUsername());
                    System.out.println("Ingrese nombre nuevo: ");
                    newname = input.nextLine();
                    userlist.get(useredit).setUsername(newname);
                    break;
                case 2:
                    String newemail;
                    System.out.println("E-Mail actual: " + userlist.get(useredit).getEmail());
                    System.out.println("Ingrese E-Mail nuevo: ");
                    newemail = input.nextLine();
                    userlist.get(useredit).setEmail(newemail);
                    break;
                case 3:
                    String newphone;
                    System.out.println("Telefono actual: " + userlist.get(useredit).getPhone());
                    System.out.println("Ingrese telefono nuevo: ");
                    newphone = input.nextLine();
                    userlist.get(useredit).setPhone(newphone);
                    break;
                case 4:
                    String newid;
                    System.out.println("Cedula actual: " + userlist.get(useredit).getId());
                    System.out.println("Ingrese cedula nueva: ");
                    newid = input.nextLine();
                    userlist.get(useredit).setId(newid);
                    break;
            }
        } while (parametrouser != 5);
    }

    public static void catalogo() {
        System.out.println("Bienvenido al catalogo. Los libros disponibles en este momento son:");
        for (book b : catalogo) {
            System.out.println(b.getNombre());
        }
        int loop = 1;
        do {
            System.out.println("Elija un libro para ver mas informacion.");
            int selection;
            selection = input.nextInt();
            input.nextLine();
            System.out.println("Libro: " + catalogo.get(selection).getNombre() + "\nGenero: " + catalogo.get(selection).getGenero() + "\nAutor: " + catalogo.get(selection).getAutor() + "\nCopias disponibles: " + catalogo.get(selection).getQuantity());
            System.out.println("Ver otro libro?\n1. Si\n2. No");
            loop = input.nextInt();
        } while (loop == 1);
    }

    public static void editbook() {
        int libroedit, parametrolibro;
        System.out.println("Elija libro a modificar.");
        for (book b : catalogo) {
            System.out.println(b.getNombre());
        }
        libroedit = input.nextInt();
        input.nextLine();
        do {
            System.out.println("Que parametro modificar?\n1. Nombre\n2. Genero\n3. Autor\n4. Copias disponibles\n5. Salir");
            parametrolibro = input.nextInt();
            input.nextLine();
            switch (parametrolibro) {
                case 1:
                    String newname;
                    System.out.println("Nombre actual: " + catalogo.get(libroedit).getNombre());
                    System.out.println("Ingrese nombre nuevo: ");
                    newname = input.nextLine();
                    catalogo.get(libroedit).setNombre(newname);
                    break;
                case 2:
                    String newgenre;
                    System.out.println("Genero actual: " + catalogo.get(libroedit).getGenero());
                    System.out.println("Ingrese genero nuevo: ");
                    newgenre = input.nextLine();
                    catalogo.get(libroedit).setGenero(newgenre);
                    break;
                case 3:
                    String newauthor;
                    System.out.println("Autor actual: " + catalogo.get(libroedit).getAutor());
                    System.out.println("Ingrese autor nuevo: ");
                    newauthor = input.nextLine();
                    catalogo.get(libroedit).setAutor(newauthor);
                    break;
                case 4:
                    int newquantity;
                    System.out.println("Cantidad de copias disponibles: " + catalogo.get(libroedit).getQuantity());
                    System.out.println("Ingrese nueva cantidad de copias disponibles: ");
                    newquantity = input.nextInt();
                    catalogo.get(libroedit).setQuantity(newquantity);
                    break;
            }
        } while (parametrolibro != 5);
    }

    public static void main(String[] args) {
        catalogo.add(LOTR);
        catalogo.add(DQ);
        catalogo.add(Shogun);
        userlist.add(admin);     
        System.out.println("Ingrese la clave de acceso.");
        String key = input.next();
        if(key.equals("covfefe")){
        Boolean loopmenu = true;
        do {
            System.out.println("Menu principal.");
            System.out.println("1. Crear libro.\n2. Modificar libro.\n3. Rentar libro.\n4. Registrar usuario.\n5. Modificar usuario.\n6. Catalogo. \n7. Salir.");
            int selection = input.nextInt();
            input.nextLine();
            switch (selection) {
                case 1:
                    int loopbook = 1;
                    do {
                        book test = bookinfo();
                        System.out.println("Crear otro libro?");
                        System.out.println("1. Si \\ 2. No");
                        loopbook = input.nextInt();
                        catalogo.add(test);
                    } while (loopbook == 1);
                    break;
                case 2:
                    editbook();
                    break;
                case 3:
                    break;
                case 4:
                    int loopuser = 1;
                    do {
                        user user01 = registro();
                        userlist.add(user01);
                        showuser(user01);
                        System.out.println("Crear otro usuario?");
                        System.out.println("1. Si \\ 2. No");
                        loopuser = input.nextInt();
                    } while (loopuser == 1);
                    break;
                case 5:
                    edituser();
                    break;
                case 6:
                    catalogo();
                    break;
                case 7:
                    loopmenu = false;
                    break;
            }
        } while (loopmenu == true);
    } else
            System.out.println("Clave incorrecta");
}
}