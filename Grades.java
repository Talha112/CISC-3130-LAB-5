import java.util.Objects;

public class Grades {                   //A node class for the Array List. I declared everything that contributes
                                        // to the final grade as a field and generated getters and setters for each
    private int test1;
    private int test2;
    private int finalTest;
    private int PPSum;
    private int labSum;
    private String firstName;
    private String lastName;
    private int sumAll;


    public Grades(String firstName, String lastName,int test1, int test2, int finalTest, int PPSum, int labSum) {   //The constructor takes all fields except sumAll
        this.test1 = test1;                                                                                         // and calculates it in itself
        this.test2 = test2;
        this.finalTest = finalTest;
        this.PPSum = PPSum;
        this.labSum = labSum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sumAll = test1+test2+finalTest+PPSum+labSum;

    }

    public int getSumAll() {                                     //getters and setters for fields
        return sumAll;
    }

    public int getTest1() {
        return test1;
    }

    public void setTest1(int test1) {
        this.test1 = test1;
    }

    public int getTest2() {
        return test2;
    }

    public void setTest2(int test2) {
        this.test2 = test2;
    }

    public int getFinalTest() {
        return finalTest;
    }

    public void setFinalTest(int finalTest) {
        this.finalTest = finalTest;
    }

    public int getPPSum() {
        return PPSum;
    }

    public void setPPSum(int PPSum) {
        this.PPSum = PPSum;
    }

    public int getLabSum() {
        return labSum;
    }

    public void setLabSum(int labSum) {
        this.labSum = labSum;
    }

    @Override
    public String toString() {                     //toString method Overridden to make it possible to view the elements
                                                  // of the ArrayList and not the reference numbers to the objects
        return "Grades{" +
                "test1=" + test1 +
                ", test2=" + test2 +
                ", finalTest=" + finalTest +
                ", PPSum=" + PPSum +
                ", labSum=" + labSum +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sumAll=" + sumAll +
                '}';
    }

    @Override
    public boolean equals(Object o) {                        //equals and hashcode methods generated to make it possible
        if (this == o) return true;                         //to search for specific elements in the Array List
        if (o == null || getClass() != o.getClass()) return false;
        Grades grades = (Grades) o;
        return test1 == grades.test1 &&
                test2 == grades.test2 &&
                finalTest == grades.finalTest &&
                PPSum == grades.PPSum &&
                labSum == grades.labSum &&
                sumAll == grades.sumAll &&
                Objects.equals(firstName, grades.firstName) &&
                Objects.equals(lastName, grades.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(test1, test2, finalTest, PPSum, labSum, firstName, lastName, sumAll);
    }
}
