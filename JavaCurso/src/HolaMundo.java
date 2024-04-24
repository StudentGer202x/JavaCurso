//Java es fuertemente tipado//
//define variable con su tipo de dato//


public class HolaMundo {
    public static void main(String[] args) {
        String saludar = "Hola mundo desde Java";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase()); // .toUpperCase es un metodo

        int numero = 10;

        boolean valor = true;
        int numero2 = 5;
        if(valor){
            System.out.println("numero = " + numero);
            numero2 = 20;
            System.out.println("numero2 = " + numero2);
        }
        
        

    }
}
