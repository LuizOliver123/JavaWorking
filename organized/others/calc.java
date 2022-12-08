package organized.others;

public class calc {
    public static void main(String[] args){
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
        int c = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);

        if(args[0].equals("somar")) {
            sum(x, y);
        } else if(args[0].equals("subtrair")){
            subt(x, y);
        } else if(args[0].equals("multiplicar")){
            mult(c, z);
        } else if(args[0].equals("dividir")){
            divid(c, z);
        } else {
            System.out.println("Nenhuma instrução foi definida");
        }
    }

    static void sum(int x, int y){
        System.out.println(x + y);
    }

    static void subt(int x, int y){
        System.out.println(x - y);
    }

    static void mult(int c, int z){
        System.out.println(c * z);
    }

    static void divid(int c, int z){
        System.out.println(c / z);
    }



}

