package labs_examples.input_output.labs;

import java.io.*;
import java.util.ArrayList;

public class Cars_CSV_Parse {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();
        String filePath = "src/labs_examples/input_output/files/Cars.csv";
        String newFilePath = "src/labs_examples/input_output/files/Cars_Copy.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;

            while((line = br.readLine()) != null){
                String[] values = line.split(",");
                cars.add(mapValuesToCarObject(values));
            }
        } catch (IOException e){
            e.printStackTrace();
        }

        for(Car car : cars) {
            System.out.println(car.toString());
        }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(newFilePath))){

        for(Car car : cars){
            bw.write(car.getMake());
            bw.write(',');
            bw.write(car.getModel());
            bw.write(',');
            bw.write(car.getYear(Integer.parseInt()));
            bw.write(',');
            bw.write(car.getMiles());
            bw.newLine();
        }
            } catch (IOException e){
                e.printStackTrace();
            }
    }

    private static Car mapValuesToCarObject(String[] values){
        Car car = new Car();

        car.setMake(values[0]);
        car.setModel(values[1]);
        car.setYear(Integer.parseInt(values[2]));
        car.setMiles(Integer.parseInt(values[3]));

        return car;
    }
}
