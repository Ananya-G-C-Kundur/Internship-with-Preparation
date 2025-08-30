public class Operators {

    public static void arithmeticOperators(){
        int countofMangos = 10;
        int countofApples = 3;

        System.out.println("Arithmetic operators");

        //Addition
        System.out.println("Addition :" + countofMangos + "+" + countofApples + "=>"+(countofMangos + countofApples));

        //Subtraction
        System.out.println("Subttaction : " + countofMangos + "-" + countofApples + "=>"+(countofMangos - countofApples));

        //Multiplication
        System.out.println("Multiplication:" + countofMangos + "*" + countofApples + "=>"+(countofMangos * countofApples));

        //Division
        System.out.println("Division:" + countofMangos + "/" + countofApples + "=>"+(countofMangos / countofApples));

        //Modulus
        System.out.println("Modulus:" + countofMangos + "%" + countofApples + "=>" +(countofMangos % countofApples));

        //Exponentiation

        //Floor division

        System.out.println();
        
    }

    public static void relationalOperators(){
        int countofMangos = 10;
        int countofApples = 3; 

        System.out.println("Relational Operators");

        //Equal to
        System.out.println("Equal to :" + countofMangos + "==" + countofApples + "=>"
        +(countofMangos == countofApples));

        //Not Equal to
        System.out.println("Not Equal to :" + countofMangos + "!=" + countofApples + "=>"
        +(countofMangos != countofApples));

        //Greater than
        System.out.println("Greater than :" + countofMangos + ">" + countofApples + "=>"
        +(countofMangos > countofApples));

        //Less than
        System.out.println("Less Than :" + countofMangos + "<" + countofApples + "=>"
        +(countofMangos < countofApples));

        //Greater Than or equal to
        System.out.println("Greater than equal to :" + countofMangos + ">=" + countofApples + "=>"
        +(countofMangos >= countofApples));

        //Less than or equal to 
        System.out.println("Less than equal to :" + countofMangos + "<=" + countofApples + " => "
        +(countofMangos <= countofApples));

        System.out.println();

    }

    public static void logicalOperator(){
        boolean isReady = true;
        boolean isGood = false;

        System.out.println("Logical operators :");

        //AND 
        System.out.println(" Logical AND :" + isReady + " AND " + isGood + " => " +(isReady && isGood));

        //OR
        System.out.println("Logical OR :" + isReady + " OR " + isGood + " => " +(isReady || isGood));

        //NOT
        System.out.println("Logical NOT :" + "!" + isReady + " => " +(! isReady));

        System.out.println("Logical NOT :" + "!" + isGood + " => " +(! isGood));

        System.out.println();

    }

    public static void bitwiseOperator(){
        int redTeamScore = 5;
        int whiteTeamScore = 2;

        System.out.println("Bitwise Operator :");

        //Bitwise AND " & "
        System.out.println("Bitwise & :" + redTeamScore + " & " + whiteTeamScore + " => " +(redTeamScore & whiteTeamScore));

        //Bitwise OR " | "
        System.out.println("Bitwise | :" + redTeamScore + " | " + whiteTeamScore + " => " +(redTeamScore | whiteTeamScore));

        //Bitwise XOR " ^ "
        System.out.println("Bitwise ^ :" + redTeamScore + " ^ " + whiteTeamScore + " => " +(redTeamScore ^ whiteTeamScore));

        //NOT " ~ "
        System.out.println("Bitwise NOT ~ :" + " ~ " + redTeamScore + (~redTeamScore));

        System.out.println("Bitwise NOT ~ :" + " ~ " + whiteTeamScore + (~whiteTeamScore));

        //Left shift " << "
        System.out.println("Bitwise << :" + redTeamScore + " << " + whiteTeamScore + " => " +(redTeamScore << whiteTeamScore));

        //Right shift
        System.out.println("Bitwise >> :" + redTeamScore + " >> " + whiteTeamScore + " => " +(redTeamScore >> whiteTeamScore));

        System.out.println();
    }

    public static void assignmentOperator(){
        int totalScore = 5;

        System.out.println("Assignment Operators");

        //Assign " = "
        int assign = totalScore;
        System.out.println("Assign :" +assign);

        //Add and assign
        totalScore += 2;
        System.out.println("Add and assign :" +totalScore);

        //Subtract and assign
        totalScore -= 2;
        System.out.println("Subtract and assign :" +totalScore);

        //Multiple and assign
        totalScore *= 2;
        System.out.println("Multiple and assign :" +totalScore);

        //Divide and assign
        totalScore /= 2;
        System.out.println("Divide and assign :" +totalScore);

        //Modulus and assign
        totalScore %= 2;
        System.out.println("Modulus and assign :" +totalScore);
        
        System.out.println();
    }

    public static void allOperators(){
        arithmeticOperators();
        relationalOperators();
        logicalOperator();
        bitwiseOperator();
        assignmentOperator();
    }
    public static void main(String[] args){
        allOperators();
    }
}
