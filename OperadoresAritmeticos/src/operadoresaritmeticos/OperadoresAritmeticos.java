package operadoresaritmeticos;

public class OperadoresAritmeticos {

    public static void main(String[] args) {

        int n1 = 3;
        int n2 = 5;
        float m = (n1+n2)/2;
        System.out.println("A média é igual a " + m);
        
        //incremento
        int numero = 5;
        numero++;
        System.out.println(numero);
        
        //decremento
        int numero2 = 5;
        numero2--;
        System.out.println(numero2);
        
        //
        int numero3 = 5;
        int valor = 5 + numero3++;
        System.out.println(valor);
        
        int numero4 = 5;
        int valor2 = 5 + ++numero4;
        System.out.println(valor2);
        
        int numero5 = 10;
        int valor3 = 4 + numero5--;
        System.out.println(valor3); //14
        System.out.println(numero5); //9
        
        //Operadores de Atribuição
        int x = 4;
        x+=2; //x = x + 2
        System.out.println(x);
        
         int y = 4;
        y*=2; //y = y * 2
        System.out.println(y);
        
        //Arredondamentos
        float v1 = 8.4f;
        float v2 = 8.6f;
        float v3 = 6.7f;
        
        int ar1 = (int)Math.floor(v1);//Para baixo
        int ar2 = (int)Math.ceil(v2);//para cima
        int ar3 = (int)Math.round(v3);//arredondamento aritmetico
        
        System.out.println(ar1);
        System.out.println(ar2);
        System.out.println(ar3); 
        
        //Gerador de Números
        double ale = Math.random();//Gera um número aleatório entre 0 e 1
        System.out.println(ale);
        
        double ale2 = 5 + Math.random()*(10-5);//Gera um número aleatório entre 5 e 10
        System.out.println(ale2);
        
        double ale3 = Math.random();
        int n = (int) (5 + ale3 * (10-5));
        System.out.println(n);
    }
    
}
