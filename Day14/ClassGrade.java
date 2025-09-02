//Classify student percentage into distinction , first class , second class ect

public class ClassGrade {

    //Defination
    public static String getClassForPercentage(float percentage){
        if (percentage >= 75){
            return "Distinction";
        }
        else if (percentage >= 60){
            return "First class";
        }
        else if (percentage >= 35){
            return "Second class";
        }
        else if (percentage >= 35){
            return "Third class";
        }
        else{
            return "Fail";
        }
    }
    public static void main(String[] args) {
        //Function Invocation or Call
        float Student = 23;
        
        System.out.println("The result of Student : " +getClassForPercentage(Student));
    }
}
