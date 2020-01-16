import java.io.*;
import java.util.Scanner;
public class Visitor {
    String fullName;
    int age;
    String dateOfVisit;
    String timeOfVisit;
    String comments;
    String nameOfAssist;
    String fileName;
    public Visitor(String full_name, int Age, String date_of_visit, String time_of_visit, String comms, String name_of_assistant){
        fullName = full_name;
        age = Age;
        dateOfVisit = date_of_visit;
        timeOfVisit = time_of_visit;
        comments = comms;
        nameOfAssist = name_of_assistant;
        fileName = "visitor_"+full_name.split(" ")[0].toLowerCase()+"_"+full_name.split(" ")[1].toLowerCase()+".txt";
    }
    public String save(){
        String result;
        try{
            File myFile = new File(fileName);
            //myFile.exists() method checks if the file created already exists or not
            if(myFile.exists()) {
                result = "File already exists, results in "+fileName;
            }else {
                FileWriter write = new FileWriter(myFile);
                write.write("Name: "+fullName+" Age: "+age+" Date: "+dateOfVisit+" Time: "+timeOfVisit+" Comments: "+comments+" Assistant: "+ nameOfAssist);
                write.close();
                result = "results in "+ fileName;
            }
        } catch (IOException e){
            result = "An error occurred";
        }
        return result;
    }
    public String load(String Name){
        String result;
        try {
            File myFile = new File("visitor_" + Name.split(" ")[0].toLowerCase() + "_" + Name.split(" ")[1].toLowerCase() + ".txt");
            Scanner myReader = new Scanner(myFile);
            result = myReader.nextLine();
            myReader.close();
        }catch (FileNotFoundException e){
            result = "An error occurred";
        }
        return result;
    }
}