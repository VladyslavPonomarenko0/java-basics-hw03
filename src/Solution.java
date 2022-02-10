public class Solution {
    public static void main(String[] args) {
        Student student1 = new Student("Petro");
        student1.setRating(15);
        Student student2 = new Student("Volodymyr");
        student2.setRating(30);
        Student student3 = new Student("Vadym");
        student3.setRating(35);


        Student.getAvgRating();
        System.out.println("-------- Changing the rating --------");
        student1.changeRating(100);
        Student.getAvgRating();




    }




}
