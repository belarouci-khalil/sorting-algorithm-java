import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        System.out.print("enter the number of array elements :");
        int number_of_elements = reader.nextInt();
        int t[]= new int [number_of_elements];
        app1 a= new app1(); 
        System.out.println("Enter the elements of the matrix :"); 
        for (int i = 0; i<number_of_elements; i++)
        {
            System.out.print(("t["+(i+1)+"]=" ));
            t[i]=reader.nextInt(); 
        }
        a.sorttab(t, number_of_elements);
    }
}
