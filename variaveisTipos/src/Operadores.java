

public class Operadores {
    public static void main(String[] args) {
        
        int numero = 4;
        int segundoNumero = 6;
       

        System.out.println("A variavel numero contem o valor : "+numero);

        if (numero%2==0){
            System.out.println("O numero "+numero+ " é par meu patrão");
        }else{
            System.out.println(numero+" é impar");
        }

        numero ++;

        System.out.println("Variavel numero incrementada, agora seu valor é: "+numero);

        // operador ternario

        String resultado = numero%2 == 0 ?"Par" : "Impar";

        if(numero%2 ==0 && segundoNumero%2 ==0){
            System.out.println("Ambos os numeros são par");
        }else{
            System.out.println("Pelo menos um dos numeros é impar");
        }

        System.out.println(resultado);


    }

}
