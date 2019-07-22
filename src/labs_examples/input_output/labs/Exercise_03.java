package labs_examples.input_output.labs;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Input/Output Exercise 3: variety
 *
 *    1) Demonstrate the usage of at least two additional Byte Streams
 *    2) Demonstrate the usage of at least two additional Character Streams
 *    3) Demonstrate using a buffer on one of the Byte Streams and one of the Character Streams
 *    4) Demonstrate the use of the DataInputStream and DataOutputStream
 *
 */

class ByteArrayInputStreamExample {
    public static void main(String[] args) {

        byte[] byteArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        try (ByteArrayInputStream input = new ByteArrayInputStream(byteArray)){
            int i;
            while((i = input.read()) != -1){
                System.out.println(i);
            }
        } catch (IOException exc){
            exc.printStackTrace();
        }
    }
}

//class DataInputStreamExample {
//    public static void main(String[] args) {
//        String filePath = "src/labs_examples/input_output/files/RWData.dat";
//
//        try(DataInputStream input = new DataInputStream(new FileInputStream(filePath)){
//
//        } catch(IOException exception){
//            exception
//        }
//    }
//}