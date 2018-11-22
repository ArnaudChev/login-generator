package geco;

import java.util.Random;

/**
 * Classe generant un mot de passe aleatoire.
 */
public class PasswordGeneration {
    /**
     * Genere un mot de passe aleatoire contenant 8 caracteres
     * @return le mot de passe genere
     */
    public String getRandomPassword(){
        String passwd = "";
        Random c = new Random();
        String alphabet = "123456789abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < 8; i++) {
            passwd += alphabet.charAt(c.nextInt(alphabet.length()));
        }
        return passwd;
    }
}
