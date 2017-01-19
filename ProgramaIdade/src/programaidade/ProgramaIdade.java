package programaidade;

import java.util.Scanner;

public class ProgramaIdade {

    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);
        
        System.out.println("Digite o ano de nascimento");
        int nasc = t.nextInt();
        int i = 2016-nasc;
        System.out.println("Sua idade é: " + i);
        if(i>=18){
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }    
}
}
