import java.util.*; 
import java.io.*;

public class Project_Brent_Croal
{
   public static void main(String[] args)
   {
      ArrayList<Policy> Policies = new ArrayList<Policy>();      
      
      try 
      {
         File file = new File("C:\\Users\\brent\\Documents\\GitHub\\bcroal00\\CSC251Project\\PolicyInformation.txt");
             
         Scanner inputFile = new Scanner(file);
         
         while(inputFile.hasNext())       
         {      
            int policyNumber = inputFile.nextInt(); 
               inputFile.nextLine(); 
            String providerName = inputFile.nextLine();
            String firstName = inputFile.nextLine();
            String lastName = inputFile.nextLine();
            int age = inputFile.nextInt();
               inputFile.nextLine();
            String smokingStatus = inputFile.nextLine();
            double height = inputFile.nextDouble();
            double weight = inputFile.nextDouble();
         
            if(inputFile.hasNext())
            { 
               inputFile.nextLine();
               inputFile.nextLine();
            }
         
            Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
         
            Policies.add(policy);
         }
      
         inputFile.close();
         
      }
      catch(IOException ex)
      {
         System.out.println("Error: " + ex.getMessage());
      }
   }
}