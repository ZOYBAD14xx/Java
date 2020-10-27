import java.util.Scanner;
class Grade{
    public static void main(String[] args) {
        Scanner ey = new Scanner(System.in);

        System.out.print("Enter Grade:");
        int Grade = ey.nextInt();
        if(Grade <= 100 && Grade > 80){
            System.out.print("Grade A");
        }else if (Grade <= 80 && Grade > 75){
            System.out.print("Grade B+");
        }else if (Grade <= 75 && Grade > 70 ){
            System.out.print("Grade B");
        }else if (Grade <= 70 && Grade > 65){
            System.out.print("Grade C+");
        }else if (Grade <= 65 && Grade > 60){
            System.out.print("Grade C");
        }else if (Grade <= 60 && Grade > 55){
            System.out.print("Grade D+");
        }else if (Grade <= 55 && Grade > 50){
            System.out.print("Grade D+");
        }else if( Grade < 50 && Grade == 0){
            System.out.print("Grade F");
        }else{
            System.out.print("Please Enter Only 0 - 100");
        }

    }
}
