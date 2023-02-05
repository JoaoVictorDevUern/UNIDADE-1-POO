package questao1A;

import java.util.ArrayList; 
import java.util.Scanner;

public class QuestaoA {
	public static void main(String[] args) {
        System.out.print("Insira uma palavra de cinco letras: ");
        String palavra = extracted().nextLine();
        ArrayList<String> combinacaoletras = new ArrayList<String>();
        
        for (int i = 0; i < palavra.length(); i++) {
            for (int j = i + 1; j < palavra.length(); j++) {
                for (int k = j + 1; k < palavra.length(); k++) {
                    combinacaoletras.add(palavra.charAt(i) + "" + palavra.charAt(j) + "" + palavra.charAt(k));
                }
            }
        }
        
        System.out.println("Palavras geradas: ");
        for (String novapalavra : combinacaoletras) {
            System.out.print(novapalavra + " ");
        }
    }

	private static Scanner extracted() {
		return new Scanner(System.in);
	}
}
        




    
    
