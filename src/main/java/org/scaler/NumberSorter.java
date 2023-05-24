package org.scaler;
import java.io.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class NumberSorter {

    public static void main(String[] args) throws IOException {
try{
        List<Integer> numbers = new ArrayList<>();
        BufferedReader bufferedReader1 = new BufferedReader(new FileReader("File/num1.txt"));
        BufferedReader bufferedReader2 = new BufferedReader(new FileReader("File/num2.txt"));
        String val;
        while ((val = bufferedReader1.readLine()) != null) {
            numbers.add(Integer.parseInt(val));
        }
        bufferedReader1.close();

        while ((val = bufferedReader2.readLine()) != null) {
            numbers.add(Integer.parseInt(val));
        }
        bufferedReader2.close();


        // Sort the list of integers
        Collections.sort(numbers);

        // Write sorted list of elements to the output file
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("File/sortedOutput.txt"));
        for (int i = 0; i < numbers.size(); i++) {
            bufferedWriter.write(numbers.get(i).toString() + "\n");
        }

        bufferedWriter.close();
    }
                catch(Exception e)
        {
            System.out.println("Exception occured");
            throw e;

        }
    }
}
