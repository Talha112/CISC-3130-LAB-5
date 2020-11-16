import java.util.ArrayList;
import java.util.List;

public class Assignment { // The main class that contains the main function and representations
                            // of the data structures implemented


    public static void main(String[] args) { //The main function

        List<Grades> gradeList = new ArrayList<>(50);       // A List is created using the ArrayList class, I declared it with just List without
                                                                        // specifying because that makes it easier to change implementation later if needed


        gradeList.add(new Grades("Talha", "Ardahan", 9, 5, 15, 34, 12));  //An object added to the List


        System.out.println(gradeCalculator(new Grades ("Talha","Ardahan", 9,5,15,34,12)));
        System.out.println(gradeList.get(0));

    }


    public static char gradeCalculator(Grades grade) {            //A static method for calculating and returning
                                                                 // the corresponding letter grade as a char data type
        if (grade.getSumAll() < 60) {
            return 'F';
        }else if (grade.getSumAll()>=60 && grade.getSumAll()<70){
            return 'D';
        }else if (grade.getSumAll()>=70 && grade.getSumAll()<80){
            return 'C';
        }else if (grade.getSumAll()>=80 && grade.getSumAll()<90){
            return 'B';
        }else {
            return 'A';
        }

    }
}
