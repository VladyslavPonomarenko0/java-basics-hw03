
public class Student {
    private int rating;
    private String name;
    public static int count; // variable to track the number of students, will be initialized with object creation
    public static double storeSumm = 0.0d; // variable to store the total rating of all students

    /**
     * default constructor with parameters
     */
    private Student() {
    }

    /**
     * Constructor with parameters
     *
     * @param name is a name to set
     */
    public Student(String name) {
        this.name = name;
        count++;
    }

    /**
     * Total rating "storeSumm" for all students is divided by the number "count" of student
     *
     * @return average rating if storeSumm != 0 , or in the other case - 0.0 instead of NaN
     */
    public static double getAvgRating() {
        if (storeSumm == 0.0d) {
            return 0.0d;
        } else {
            //System.out.println("total rating = " + storeSumm);
            System.out.println("average rating = " + storeSumm / count);
            return storeSumm / count;
        }
    }

    /**
     * Method changes rating of particular student
     *
     * @param rating is a rating to change on.
     */
    public void changeRating(int rating) {
        storeSumm = storeSumm - this.rating;
        setRating(rating);
    }

    /**
     * Student's Name getter
     *
     * @return student name
     */
    public String getName() {
        return name;
    }

    /**
     * Student's Name setter
     *
     * @param name is a name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Student's rating getter
     *
     * @return the rating value
     */
    public int getRating() {
        return rating;
    }

    /**
     * Student's rating setter. Here we also record rating value to the variable  storeSum
     *
     * @param rating is a rating to set
     */
    public void setRating(int rating) {
        this.rating = rating;
        storeSumm += rating;
    }

    /**
     * Method to compare 2 students
     *
     * @param student is a Student to compare with
     * @return true if the raiting of this.student is bigger than student rating
     */
    public boolean betterStudent(Student student) {
        return this.rating > student.rating;
    }

    /**
     * Method to remove student
     *
     * @param student is a student to delete
     */
    public static void removeStudent(Student student) {
        student.name = null;
        student.rating = 0;
        storeSumm = 0;
        count = 0;
    }

    /**
     * Method to output Student's info. Overriding standard toString method
     *
     * @return string with Student's name and rating
     */
    @Override
    public String toString() {
        System.out.println("Student info: Name - " + this.name + " /Rating - " + rating);
        return this.name + rating;
    }
}
