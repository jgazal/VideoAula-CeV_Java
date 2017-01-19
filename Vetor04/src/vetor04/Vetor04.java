package vetor04;

import java.util.Arrays;

public class Vetor04 {

    public static void main(String[] args) {
        
        int v[] = {3,7,6,1,9,4,2};
        for (int i: v){
            System.out.print(i + " ");
        }
        System.out.println("");
        int p = Arrays.binarySearch(v, 1);
        System.out.println("Encontrei o vetor na posição: " + p);
    }
    
}
