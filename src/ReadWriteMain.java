import java.io.*;

public class ReadWriteMain {
    public static void main(String[] args) {
        FileReader fileReader;
        BufferedReader bufferedReader;
        try{
            fileReader = new FileReader("resources/studentdetails.csv");
            bufferedReader = new BufferedReader(fileReader);
          /*  bufferedReader.readLine();*/
            // to create array One must be aware of number of lines
            // count lines
            String line;
            int numberOfLines = 0;
            while ((line = bufferedReader.readLine()) != null){
                numberOfLines++;
            }
            System.out.println("numberOfLines = " + numberOfLines);
            Student[] studentsList = new Student[numberOfLines - 1];
            int index = 0;
            fileReader = new FileReader("resources/studentdetails.csv");
            bufferedReader = new BufferedReader(fileReader);
            bufferedReader.readLine();//skipping header
            while ((line = bufferedReader.readLine()) != null) {
                //reading line, that contains comma separated value for student details
                Student student = new Student();
                //123,Ria sharma,14,ria@gmail.com,89876543
                String[] split = line.split(",");
                student.setRollNo(Integer.parseInt(split[0]));
                student.setName(split[1]);
                student.setAge(Integer.parseInt(split[2]));
                student.setEmail(split[3]);
                student.setMobile(split[4]);
                studentsList[index] = student;
                index++;


            }

            System.out.println("index = " + index);
            for (Student studentObject : studentsList) {
                System.out.println(studentObject);
            }
            bufferedReader.close();
            fileReader.close();
            //write details of one student into file
            //Student student = new Student(1000, "Ramesh", 500, "ramesh@ramesh.com", "123456");
            //to write
            // we need filewriter
            FileWriter fileWriter = new FileWriter("resources/studentdetails.csv",true);
            for (Student student : studentsList) {


                String studentData = "\n" + student.getRollNo() + "," + student.getName() + "," + student.getAge() + "," + student.getEmail() +
                        "," + student.getMobile();
                fileWriter.write(studentData);
            }
            fileWriter.flush();
            //fileWriter.flush();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
