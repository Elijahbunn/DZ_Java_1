import java.io.*;

public class DZ2 {

    public static void main(String[] args) throws Exception{
        BufferedReader fr = new BufferedReader(new FileReader("my_text.txt"));
        // int lines = 0;
        // while (fr.readLine() != null){
        //     lines++;
        // }
        //int[] array = new int [lines];
        int[] array = new int [2];
        int i = 0;
        String str1 = fr.readLine();
        while (str1 != null){
            String[] str2 = str1.split(" ");
            int number = Integer.parseInt(str2[2]);
            System.out.println(number);
            array[i] = number;
            i++;
            str1 = fr.readLine();
        }
        
        int sum1 = array[0] + array[1];
        System.out.println(sum1);
        int number3 = array[0] * array[1];
        System.out.println(number3);

        int number4 = (int) Math.pow(array[0], array[1]);
        String number4_1 = Integer.toString(array[0]);
        String number4_2 = Integer.toString(array[1]);
        String number4_3 = Integer.toString(number4);
        System.out.println(number4_3);

        FileWriter fw = new FileWriter("file.txt", false);
            fw.write(number4_1);
            fw.append(" ^ ");
            fw.write(number4_2);
            fw.append(" = ");
            fw.write(number4_3);
            fw.flush();
        
    fr.close();
    fw.close();
    }
}