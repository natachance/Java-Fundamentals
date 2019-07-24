package labs_examples.input_output.labs;

import java.io.*;

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

class BufferedStreamExample {
    public static void main(String[] args) {
        String filePath = "src/labs_examples/input_output/files/byte_data";

        try(BufferedInputStream bufferedInput = new BufferedInputStream(new FileInputStream(filePath))) {
            byte[] buffer = new byte[8];
            int x = 0;
            while ((x = bufferedInput.read(buffer)) != -1) {
                System.out.println(new String(buffer, 0, x));
            }
        } catch (IOException exception){
                exception.printStackTrace();
            }
        }
    }

class BufferedCharacterStreamExample {
    public static void main(String[] args) {
        String newFilePath = "src/labs_examples/input_output/files/BufferedWriterExample.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(newFilePath))){
            String x = "This is a String.";
            bw.write(x);
        } catch (IOException e){
            e.printStackTrace();
        }

        try(BufferedReader br = new BufferedReader(new FileReader(newFilePath))){
            String y;
            while((y = br.readLine()) != null){
                System.out.println(y);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

class DataStreamExample {
    public static void main(String[] args) {
        String newfilePath = "src/labs_examples/input_output/files/DataInputStreamExampleFile";

        int a = 1;
        double b = 2.3;
        char c = 'x';

        try(DataOutputStream output = new DataOutputStream(new FileOutputStream(newfilePath))){ //why must have FileOutputStream too?
            output.writeInt(a);
            output.writeDouble(b);
            output.writeChar(c);

        } catch(IOException e){
            e.printStackTrace();
        }

        try(DataInputStream input = new DataInputStream(new FileInputStream(newfilePath))){
            a = input.readInt();
            System.out.println(a);

            b = input.readDouble();
            System.out.println(b);

            c = input.readChar();
            System.out.println(c);

        } catch(IOException e){
            e.printStackTrace();
        }
    }
}