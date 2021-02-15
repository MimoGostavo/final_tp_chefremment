/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

/**
 *
 * @author save
 */
import java.io.*;       

public class Vigenere {
      String fileContent;
    String keyContent;
    char[][] matrice;
    char[] Lettre;
    String longKey;
    // ↓ le constructeur qui va récepter les parametres
    public Vigenere(String pFileContent,String pkeyContent,char[][] pmatrice,char[] pLettre){
        this.fileContent=pFileContent;
        this.keyContent=pkeyContent;
        this.matrice=pmatrice;
        this.Lettre=pLettre;
    }

    Vigenere() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public char[][] CreateMatrice(){
        /**
         * le principe de cette fonction est la création du matrice[26][26] qui contient les valeur de tableau Vigenere
         * donc pour faire ca on met un counteur "m" avec deux boucles et la matrice sera remplir ligne par ligne 
         * à l'aide d'incrumentation du conteur "m" Exemple : A B C D E F G H 
         *                                                    B C D E F G H I
         *                                                    C D E F G H I G
         */
        int m = 0;
        for(int i=0; i<matrice.length; i++){
            m = i;
           for(int j=0; j<matrice.length; j++){
             matrice[i][j] = Lettre[m];
              if(m == 25) // cette condition permet la retour à la lettre A 
                 m = 0;
              else
                 m = m+1;
           }   
        }
        
        // ↓ Cette partie just pour l'affichage du contenu du matrice dans le console de l'execution
        for(int i=0; i < matrice.length; i++)
    	{
      	    for(int j=0; j < matrice.length; j++)
            {
          	System.out.print(matrice[i][j]+" ");
            }
            System.out.println(" ");
        }
        return matrice;
    }
    
    // Fonction de Cryptage de Vigenere
    public String VigenereCrypte(){
        /**↓ cette partie responsable de l'étirement du KEY selon le contenu du text original 
        * Exemple: Text =  "bonjour monde"   et     KEY est = "fce" 
        * donc   longKey = "fcefcef fcefc"
        */
        longKey = "";
        if(keyContent.length() > fileContent.length())
            System.out.println("il faut que le KEY est inférieure ou égale au Text à crypter");
        else{
            int  textLength = fileContent.length(); // "textLength" pour connu la longueur du text original car le "longKey" va prendre la meme longueur que le text original
            int p = 0;
            for(int i=0; i<textLength; i++){
                if(fileContent.charAt(i) == ' ')
                    longKey = longKey.concat(" ");
                else{
                    longKey = longKey.concat(String.valueOf(keyContent.charAt(p))); // longKey va remplir les lettres sans supprimer les précédentes
                    p = p+1;
                    if(p == keyContent.length()) // si le conteur p = la longuer de key "Original" donc on retour au premier lettre du cette key on utilisant p = 0;
                        p = 0;                        
                }
            }
        }
        
        /**
         * ↓ aprés la création du matrice et l'étirement du KEY donc on chiffré maintenant le text dans cette partie ↓
         * 
         */
        String cryptedText = "";
        int colonne;
        int ligne;
        for(int i=0; i<fileContent.length(); i++){
            colonne = -1;   ligne = -1;
            for(int j=0; j<Lettre.length; j++){
                if(fileContent.charAt(i) == ' '){ // si le current lettre est un espace " " alor siser sur le text q'on va chiffré un espace" "
                    cryptedText = cryptedText.concat(" ");
                    j=26; // pour quiter cette boucle et paser vers le suivant lettre puisque on a trouver un espace " "
                }
                else{
                    if(fileContent.charAt(i) == Lettre[j]) // si le current lettre du text original est égal a un des lettres du liste de a à z alors
                        colonne = j; // alors on gardon la position de cette lettre dans le variable colonne
                    if(longKey.charAt(i) == Lettre[j]) // si le current lettre du KEY étendu  est égal a un des lettres du liste de a à z alors
                        ligne = j;  // alors on gardon la position de cette lettre dans le variable ligne
                    if(ligne != -1 && colonne != -1){ // si ligne et colonne sont différent de -1 on prend l'intersection de ces deux variable 
                       cryptedText = cryptedText.concat(String.valueOf(matrice[ligne][colonne])); // et donc par cette intersection on trouve le nouveau lettre "chiffré" et on metter le dans cryptedText et on repeter l'opération sans supprimer les précedentes lettres chiffrées
                       colonne = -1;   ligne = -1; // mettons colonne et ligne  = -1 pour passer au lettre suivant
                    }
                }

            }
        }
        return cryptedText; // return le contenu du text crypté pour l'afficher à l'utilisateur
    }
    
    
    // Fonction de Décryptage de Vigenere
    public String VigenereDecrypte(){
        /**
         * ↓ cette partie responsable de Decryptage donc le principe ici est de prendre le text Chiffré caractère par caractère 
         * et on compare chaque caractère par toutes les caractères du matrice carré 
         * et en simultanité on prendre le KEY Etendu caractère par caractère et on compare aussi chaque caractère just par les
         * caractères du premier colonne du matrice carré et si on trouve un similitude dans les deux cas précédentes alors on peut
         * trouver le text Déchiffrée par l'accédont dans le premiér ligne du matrice carré
         */
        String decryptedText = "";
        int p =0;
        while(p<fileContent.length()){ // fileContent contient ici le text Chiffré 
            for(int i=0; i<matrice.length; i++){
             for(int j=0; j<matrice.length; j++){
                 if(fileContent.charAt(p) == ' '){ // si le current lettre est un espace " " alor siser sur le text q'on va déchiffré un espace" "
                    decryptedText = decryptedText.concat(" ");
                    i=matrice.length; // pour quiter les deux boucle "for" et paser vers le suivant lettre puisque on a trouver un espace " "  
                    j=matrice.length; // pour quiter les deux boucle "for" et paser vers le suivant lettre puisque on a trouver un espace " "
                 }
                 else{
                     if(matrice[i][j] == fileContent.charAt(p) && matrice[i][0] == longKey.charAt(p)) // passon pour tout le contenu du matrice carré et comparons chaque item de cette matrice par le current caractère du text chiffré et le current caractère du KEY Etendu
                       decryptedText = decryptedText.concat(String.valueOf(matrice[0][j]));  // si lacondition est vrai alors on trouve le caractère original sur le premiér ligne du matrice carré et on répeter cette opération pour chaque caractète sans supprimer les précedentes caractères déchiffrées
                 }
             }   
            }
            p = p+1;
        }
        return decryptedText;// return le contenu du text Decrypté pour l'afficher à l'utilisateur
    }
}
