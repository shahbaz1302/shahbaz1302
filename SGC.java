import java.util.Scanner;

public class SGC {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of subjects:");
        int subjects=input.nextInt();
        int[] marks=new int[subjects];
        int total=0;
        for (int i = 0; i < subjects; i++) {
            System.out.print("Enter marks obtained in subject " + (i+1) + " out of 100:");
            marks[i]=input.nextInt();
            total+=marks[i];
        }
        double averagePercentage=(double)total/subjects;
        char grade;
        if(averagePercentage>=90) grade='A';
        else if(averagePercentage>=80) grade='B';
        else if(averagePercentage>=70) grade='C';
        else if(averagePercentage>=60) grade='D';
        else if(averagePercentage>=50) grade='E';
        else grade='F';
        System.out.println("Results are as follows:");
        System.out.println("Total Marks Obtained:" + total);
        System.out.println("Average Percentage:" + averagePercentage);
        System.out.println("Grade:" + grade);
    }
}
