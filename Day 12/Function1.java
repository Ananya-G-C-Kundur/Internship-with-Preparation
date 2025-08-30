//Day 12 of Learing
//Function part 2

public class Function1 {
    public static void main(String[] args) {
        String studentName = getTopperNameForSubject(1, "Maths");  //you can also write var

        System.out.println(studentName);

        printStudentDetails(1);
    }

    //Who is the Topper
    //Which subject ?
    //Which grade ?
    //Response name of the student

    public static String getTopperNameForSubject(int grade ,String subject){
        String name = "Ananya";
        return name;        
    }

    //get the total number of BOYS and GIRLS
    //returns array in which at 0 index boys count is present and 1 index girls count is present
    public static int[] getTotalCountOfBoysGirls(int schoolID){
        // Dummy
        int[] results = {200,300};
        return results;
    }

    //print student details
    public static void printStudentDetails(int studentID){
        //Dummy
        String name = "Jyothi";
        int age = 22;
        int grade = 14;
        float CGPA = 8.5f;
        boolean isRegularToCollage = true;
        
        System.out.println(name);
        System.out.println(age);
        System.out.println(grade);
        System.out.println(CGPA);
        System.out.println(isRegularToCollage);
    }
}
