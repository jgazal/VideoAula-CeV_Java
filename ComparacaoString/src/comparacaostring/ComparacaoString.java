package comparacaostring;

public class ComparacaoString {

    public static void main(String[] args) {

        String nome1 = "Junior";
        String nome2 = "Junior";
        String nome3 = new String("Junior");
        String res;
        //res = (nome1==nome2)?"igual":"diferente";
        //res = (nome1==nome3)?"igual":"diferente";
        res = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(res);
    }
}

