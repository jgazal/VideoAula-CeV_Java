package exerciciorepita;

import javax.swing.JOptionPane;

public class ExercicioRepita {

    public static void main(String[] args) {
        
        //JOptionPane.showMessageDialog(null, "Olá Mundo!", "Boas Vindas", JOptionPane.INFORMATION_MESSAGE);
        //int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número: "));
        //JOptionPane.showMessageDialog(null, "Você digitou o valor: " + n );
        int n, s=0,tv=0, tp=0, ti=0, ac=0, m=0;
        do{
           n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número: <br><em>(Valor 0 interrompe)</em></html>")); 
           s += n; //Somatório
           tv++; // Total de valores
           if (n%2==0)tp++; // total de pares
           else ti++; // total de ímpares
           if (n>100)ac++; //acima de 100
           m = s/tv; // média
        }while(n!=0);
        tv--;
        tp--;
        ti--;
        JOptionPane.showMessageDialog(null, "<html>Resultado Final <hr>" + 
                "<br>Somatório Vale: " + s + "<br>Total de Valores: " + tv + 
                "<br>Total de Pares: " + tp + "<br>Total de Ímpares: " + ti + 
                "<br>Acida de 100: " + ac + "<br>Média dos Valores: " + m +"</html>");
    }    
}
