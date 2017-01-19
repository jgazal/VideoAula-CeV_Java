package testetipos;

public class TesteTipos {

    public static void main(String[] args) {

        int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println(valor);
        
        String valor2 = "35";
        int idade2 = Integer.parseInt(valor2);
        System.out.println(idade2);
        
        String valor3 = "30.5";
        float idade3 = Float.parseFloat(valor3);
        System.out.println(idade3);
        
    }
    
}
