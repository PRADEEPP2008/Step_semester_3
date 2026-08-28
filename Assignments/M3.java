public class M3{
    public static void classifyWithAttendence(int marks,int attendence){
        if(attendence >=75 && marks >= 40){
            if (marks >= 90){
                System.out.println("Grade:A");
            }
            else if (marks >=75){
                System.out.println("Grade:B");
            }
            else if(marks >=60){
                System.out.println("Grade:C");
            }
            else {
                System.out.println("Grade:D");
            }
        }
        else{
            System.out.println("Detained");
        }
    }
    public static void main(String[] args){
        classifyWithAttendence(82,80);
        classifyWithAttendence(91,60);
    }
}