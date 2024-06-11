

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
        System.out.println(resultado);

        //  ----------------  operadores lógicos - "E" &&, "OU" || . -------------

        // Testando se os numeros são par ou impar usando o operador lógico && "E"

        if(numero%2 ==0 && segundoNumero%2 ==0){
            System.out.println("Ambos os numeros são par");
        }else{
            System.out.println("Pelo menos um dos numeros é impar");
        }

        // Testando se um dos numeros é par utilizando o operador logigo || "OU"

        if(numero%2==0 || segundoNumero%2==0){
            System.out.println("Sim um dos numeros é par");
        }      

    }

}
