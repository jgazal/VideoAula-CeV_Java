package contador01;

public class Contador01 {

    public static void main(String[] args) {

//        int cc = 1;
//        while (cc<=4){
//            System.out.println("cambalhota " + cc);
//            cc++;
//        }
            int cc = 0;
            while (cc<10){
                cc++;
                if(cc==5 || cc==7 || cc==9){
                    continue; // Interronte o fluxo e retorna
                }
                if (cc==8){
                    break;
                }
                System.out.println("cambalhota " + cc);
        }
    }
    
}
