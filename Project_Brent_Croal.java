import java.util.*; 
import java.io.*;

public class Project_Brent_Croal
{
   public static void main(String[] args)
   {
      ArrayList<Policy> Policies = new ArrayList<Policy>();      
      
      try 
      {
         File file = new File("C:\\Users\\brent\\Documents\\GitHub\\CSC251Project\\PolicyInformation.txt");
             
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
               
         int totalSmokers = 0;
         int totalNonSmokers = 0;
         for (Policy policy : Policies) {
            if (policy.PolicyHolder.PolicyHolderSmokingStatus.equalsIgnoreCase("non-smoker"))
               totalNonSmokers += 1;
            else
               totalSmokers += 1;
               
         
            System.out.println(policy.toString());
            System.out.println(policy.PolicyHolder.toString());
            System.out.println("Policy Price: " + String.format("$%,.2f", policy.CalculatePolicyPrice()));
            System.out.println();
         }
         
         System.out.println("The were " + Policies.size() + " Policy objects created");
         System.out.println("The number of policies with a smoker is: " + totalSmokers);
         System.out.println("The number of policies with a non-smoker is: " + totalNonSmokers);
      }
      catch(IOException ex)
      {
         System.out.println("Error: " + ex.getMessage());
      }
   }
}