package labs_examples.input_output.labs;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Input/Output Exercise 2: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      Then, read back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */

class Exercise_2 {
    public static void main(String[] args) {

        String filepath = "src/labs_examples/input_output/files/char_data.txt";
        String newFilepath = "src/labs_examples/input_output/files/encrypted_data.txt";

        readWriteCharacters(filepath, newFilepath);
        readEncryptedCharacters(newFilepath);
    }

    private static void readEncryptedCharacters(String newFilepath) {
        try (FileReader reader = new FileReader(newFilepath)) {
            int i;
            char character;
            while ((i = reader.read()) != -1) {
                character = decryption((char) i);
                System.out.print(character);
            }
        } catch (IOException exc){
            exc.printStackTrace();
        }
    }

    public static void readWriteCharacters (String filepath, String newFilepath) {
        try (FileReader reader = new FileReader(filepath);
        FileWriter writer = new FileWriter(newFilepath)) {
            int i;
            char character;
            while ((i = reader.read()) != -1) {
                character = encryption((char) i);
                writer.write((int) character);
            }
        } catch (IOException exc){
            exc.printStackTrace();
        }
    }

    public static char encryption (char character){
        char encryptedCharacter = 'a';

        switch(character){
            case 'a':
                encryptedCharacter = 'z';
                break;
            case 'b':
                encryptedCharacter = 'y';
                break;
            case 'c':
                encryptedCharacter = 'x';
                break;
            case 'd':
                encryptedCharacter = 'w';
                break;
            case 'e':
                encryptedCharacter = 'v';
                break;
            case 'f':
                encryptedCharacter = 'u';
                break;
            case 'g':
                encryptedCharacter = 't';
                break;
            case 'h':
                encryptedCharacter = 's';
                break;
            case 'i':
                encryptedCharacter = 'r';
                break;
            case 'j':
                encryptedCharacter = 'q';
                break;
            case 'k':
                encryptedCharacter = 'p';
                break;
            case 'l':
                encryptedCharacter = 'o';
                break;
            case 'm':
                encryptedCharacter = 'n';
                break;
            case 'n':
                encryptedCharacter = 'm';
                break;
            case 'o':
                encryptedCharacter = 'l';
                break;
            case 'p':
                encryptedCharacter = 'k';
                break;
            case 'q':
                encryptedCharacter = 'j';
                break;
            case 'r':
                encryptedCharacter = 'i';
                break;
            case 's':
                encryptedCharacter = 'h';
                break;
            case 't':
                encryptedCharacter = 'g';
                break;
            case 'u':
                encryptedCharacter = 'f';
                break;
            case 'v':
                encryptedCharacter = 'e';
                break;
            case 'w':
                encryptedCharacter = 'd';
                break;
            case 'x':
                encryptedCharacter = 'c';
                break;
            case 'y':
                encryptedCharacter = 'b';
                break;
            case 'z':
                encryptedCharacter = 'a';
                break;
            case 'A':
                encryptedCharacter = 'Z';
                break;
            case 'B':
                encryptedCharacter = 'Y';
                break;
            case 'C':
                encryptedCharacter = 'X';
                break;
            case 'D':
                encryptedCharacter = 'W';
                break;
            case 'E':
                encryptedCharacter = 'V';
                break;
            case 'F':
                encryptedCharacter = 'U';
                break;
            case 'G':
                encryptedCharacter = 'T';
                break;
            case 'H':
                encryptedCharacter = 'S';
                break;
            case 'I':
                encryptedCharacter = 'R';
                break;
            case 'J':
                encryptedCharacter = 'Q';
                break;
            case 'K':
                encryptedCharacter = 'P';
                break;
            case 'L':
                encryptedCharacter = 'O';
                break;
            case 'M':
                encryptedCharacter = 'N';
                break;
            case 'N':
                encryptedCharacter = 'M';
                break;
            case 'O':
                encryptedCharacter = 'L';
                break;
            case 'P':
                encryptedCharacter = 'K';
                break;
            case 'Q':
                encryptedCharacter = 'J';
                break;
            case 'R':
                encryptedCharacter = 'I';
                break;
            case 'S':
                encryptedCharacter = 'H';
                break;
            case 'T':
                encryptedCharacter = 'G';
                break;
            case 'U':
                encryptedCharacter = 'F';
                break;
            case 'V':
                encryptedCharacter = 'E';
                break;
            case 'W':
                encryptedCharacter = 'D';
                break;
            case 'X':
                encryptedCharacter = 'C';
                break;
            case 'Y':
                encryptedCharacter = 'B';
                break;
            case 'Z':
                encryptedCharacter = 'A';
                break;
            case '.':
                encryptedCharacter = '-';
                break;
            case ',':
                encryptedCharacter = '/';
                break;
            case '’':
                encryptedCharacter = ',';
                break;
            case ':':
                encryptedCharacter = ']';
                break;
            case ' ':
                encryptedCharacter = '+';
                break;
            case '\n':
                encryptedCharacter = '\n';
                break;
        }
        return encryptedCharacter;
    }

    public static char decryption (char character){
        char decryptedCharacter = 'a';

        switch(character){
            case 'a':
                decryptedCharacter = 'z';
                break;
            case 'b':
                decryptedCharacter = 'y';
                break;
            case 'c':
                decryptedCharacter = 'x';
                break;
            case 'd':
                decryptedCharacter = 'w';
                break;
            case 'e':
                decryptedCharacter = 'v';
                break;
            case 'f':
                decryptedCharacter = 'u';
                break;
            case 'g':
                decryptedCharacter = 't';
                break;
            case 'h':
                decryptedCharacter = 's';
                break;
            case 'i':
                decryptedCharacter = 'r';
                break;
            case 'j':
                decryptedCharacter = 'q';
                break;
            case 'k':
                decryptedCharacter = 'p';
                break;
            case 'l':
                decryptedCharacter = 'o';
                break;
            case 'm':
                decryptedCharacter = 'n';
                break;
            case 'n':
                decryptedCharacter = 'm';
                break;
            case 'o':
                decryptedCharacter = 'l';
                break;
            case 'p':
                decryptedCharacter = 'k';
                break;
            case 'q':
                decryptedCharacter = 'j';
                break;
            case 'r':
                decryptedCharacter = 'i';
                break;
            case 's':
                decryptedCharacter = 'h';
                break;
            case 't':
                decryptedCharacter = 'g';
                break;
            case 'u':
                decryptedCharacter = 'f';
                break;
            case 'v':
                decryptedCharacter = 'e';
                break;
            case 'w':
                decryptedCharacter = 'd';
                break;
            case 'x':
                decryptedCharacter = 'c';
                break;
            case 'y':
                decryptedCharacter = 'b';
                break;
            case 'z':
                decryptedCharacter = 'a';
                break;
            case 'A':
                decryptedCharacter = 'Z';
                break;
            case 'B':
                decryptedCharacter = 'Y';
                break;
            case 'C':
                decryptedCharacter = 'X';
                break;
            case 'D':
                decryptedCharacter = 'W';
                break;
            case 'E':
                decryptedCharacter = 'V';
                break;
            case 'F':
                decryptedCharacter = 'U';
                break;
            case 'G':
                decryptedCharacter = 'T';
                break;
            case 'H':
                decryptedCharacter = 'S';
                break;
            case 'I':
                decryptedCharacter = 'R';
                break;
            case 'J':
                decryptedCharacter = 'Q';
                break;
            case 'K':
                decryptedCharacter = 'P';
                break;
            case 'L':
                decryptedCharacter = 'O';
                break;
            case 'M':
                decryptedCharacter = 'N';
                break;
            case 'N':
                decryptedCharacter = 'M';
                break;
            case 'O':
                decryptedCharacter = 'L';
                break;
            case 'P':
                decryptedCharacter = 'K';
                break;
            case 'Q':
                decryptedCharacter = 'J';
                break;
            case 'R':
                decryptedCharacter = 'I';
                break;
            case 'S':
                decryptedCharacter = 'H';
                break;
            case 'T':
                decryptedCharacter = 'G';
                break;
            case 'U':
                decryptedCharacter = 'F';
                break;
            case 'V':
                decryptedCharacter = 'E';
                break;
            case 'W':
                decryptedCharacter = 'D';
                break;
            case 'X':
                decryptedCharacter = 'C';
                break;
            case 'Y':
                decryptedCharacter = 'B';
                break;
            case 'Z':
                decryptedCharacter = 'A';
                break;
            case '-':
                decryptedCharacter = '.';
                break;
            case '/':
                decryptedCharacter = ',';
                break;
            case ',':
                decryptedCharacter = '’';
                break;
            case ']':
                decryptedCharacter = ':';
                break;
            case '+':
                decryptedCharacter = ' ';
                break;
            case '\n':
                decryptedCharacter = '\n';
                break;
        }
        return decryptedCharacter;
    }
}

