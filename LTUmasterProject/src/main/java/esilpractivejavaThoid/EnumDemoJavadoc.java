package esilpractivejavaThoid;

/*
 enum**** : An enum type is a special data type that enables for a variable to be a set of predefined constants. 
The variable must be equal to one of the values that have been predefined for it
https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
 */

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY 
}

public class EnumDemoJavadoc {
    Day day;
    
    public EnumDemoJavadoc(Day day) {
        this.day = day;
    }
    
    public void tellItLikeItIs() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
                    
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
                         
            case SATURDAY: case SUNDAY:
                System.out.println("Weekends are best.");
                break;
                        
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }
    
    public static void main(String[] args) {
        EnumDemoJavadoc firstDay = new EnumDemoJavadoc(Day.MONDAY);
        firstDay.tellItLikeItIs();
        EnumDemoJavadoc thirdDay = new EnumDemoJavadoc(Day.WEDNESDAY);
        thirdDay.tellItLikeItIs();
        EnumDemoJavadoc fifthDay = new EnumDemoJavadoc(Day.FRIDAY);
        fifthDay.tellItLikeItIs();
        EnumDemoJavadoc sixthDay = new EnumDemoJavadoc(Day.SATURDAY);
        sixthDay.tellItLikeItIs();
        EnumDemoJavadoc seventhDay = new EnumDemoJavadoc(Day.SUNDAY);
        seventhDay.tellItLikeItIs();
    }
}
