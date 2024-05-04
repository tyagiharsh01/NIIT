package file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class G {
    public static void main(String[] args) throws IOException {
        List<Mobile> mobiles = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\NIIT\\a.csv"));
        String line = bufferedReader.readLine();
        while((line=bufferedReader.readLine())!=null){
            String[] data = line.split(",");
            mobiles.add(new Mobile(data[0],data[1],Double.parseDouble(data[2]),data[3],data[4],data[5],Integer.parseInt(data[6]) ));

        }
        System.out.println(mobiles);


    }
}
