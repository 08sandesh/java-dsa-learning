package _05_Methods;

public class _03_More_On_Methods {
    public static void main(String[] args) {
        Sandesh();
    }

    public static void Sandesh(){
       System.out.println("Kalpesh");
       Pratham();
    }

    public static void Pratham(){
       System.out.println("Praneeth");
       Jayesh();
    }

    public static void Jayesh(){
       System.out.println("Krushna");
       Sandesh();
    }
}

