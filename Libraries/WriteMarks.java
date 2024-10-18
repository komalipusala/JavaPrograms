//37. Write 20 marks into Marks.data.

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteMarks {
    public static void main(String[] args) {
        int[] marks = {85, 78, 92, 60, 75, 88, 90, 66, 80, 70, 
                       95, 82, 68, 77, 83, 74, 89, 91, 64, 87};
        
        try (FileOutputStream fos = new FileOutputStream("Marks.data");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            
            oos.writeObject(marks);
            System.out.println("20 marks have been written to Marks.data");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
