//Convert Day Month in digit to Word 
//Example : if input is 5 then return May

public class Switch {

    public static String get_Month_Str(int month){

        switch(month){
            case 1 : 
                return "Jan";
            case 2 : 
                return "Feb";
            case 3 : 
                return "March";
            case 4 : 
                return "April";
            case 5 : 
                return "May";
            case 6 : 
                return "June";
            case 7 : 
                return "July";
            case 8 : 
                return "August";
            case 9 : 
                return "Sept";
            case 10 : 
                return "Oct";
            case 11 : 
                return "Nov";
            case 12 : 
                return "Dec";
            default : 
                return "Invaild month";
        }
    }
    public static void main(String[] args){

        System.out.println(get_Month_Str(12));
    }
}
