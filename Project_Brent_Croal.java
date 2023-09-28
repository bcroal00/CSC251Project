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
            if (policy.PolicyHolderSmokingStatus.equalsIgnoreCase("non-smoker"))
               totalNonSmokers += 1;
            else
               totalSmokers += 1;
               
         
            System.out.println("Policy Number: " + policy.PolicyNumber);
            System.out.println("Provider Name: " + policy.ProviderName);
            System.out.println("Policyholder's First Name: " + policy.PolicyHolderFirstName);
            System.out.println("Policyholder's Last Name: " + policy.PolicyHolderLastName);
            System.out.println("Policyholder's Age: " + policy.PolicyHolderAge);
            System.out.println("Policyholder's Smoking Status: " + policy.PolicyHolderSmokingStatus);
            System.out.println("Policyholder's Height: " + policy.PolicyHolderHeight + " inches");
            System.out.println("Policyholder's Weight: " + policy.PolicyHolderWeight + " pounds");
            System.out.println("Policyholder's BMI: " + String.format("%.2f", policy.CalculateBMI()));
            System.out.println("Policy Price: " + String.format("$%,.2f", policy.CalculatePolicyPrice()));
            System.out.println();
         }
         
          System.out.println("The number of policies with a smoker is: " + totalSmokers);
          System.out.println("The number of policies with a non-smoker is: " + totalNonSmokers);
      }
      catch(IOException ex)
      {
         System.out.println("Error: " + ex.getMessage());
      }
   }
}