import java.util.Scanner;

public class Project_Brent_Croal
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);
   
      System.out.println("Please enter the Policy Number: ");
      int policyNumber = scanner.nextInt();
      scanner.nextLine();
      
      System.out.println("Please enter the Provider Name: ");      
      String providerName = scanner.nextLine();
       
      System.out.println("Please enter the Policyholder's First Name: ");
      String firstName = scanner.nextLine();
      
      System.out.println("Please enter the Policyholder's Last Name: ");
      String lastName = scanner.nextLine();
      
      System.out.println("Please enter the Policyholder's Age: ");
      int age = scanner.nextInt();
      scanner.nextLine();
      
      System.out.println("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      String smokingStatus = scanner.nextLine();
      
      System.out.println("Please enter the Policyholder's Height (in inches): ");
      double height = scanner.nextDouble();
      
      System.out.println("Please enter the Policyholder's Weight (in pounds): ");
      double weight = scanner.nextDouble();
      
      
      
      Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
      
      
      System.out.println("Policy Number: " + policy.PolicyNumber);
      System.out.println("Provider Name: " + policy.ProviderName);
      System.out.println("Policyholder's First Name: " + policy.PolicyHolderFirstName);
      System.out.println("Policyholder's Last Name: " + policy.PolicyHolderLastName);
      System.out.println("Policyholder's Age: " + policy.PolicyHolderAge);
      System.out.println("Policyholder's Smoking Status: " + policy.PolicyHolderSmokingStatus);
      System.out.println("Policyholder's Height: " + policy.PolicyHolderHeight + " inches");
      System.out.println("Policyholder's Weight: " + policy.PolicyHolderWeight + " pounds");
      System.out.println("System.out.println(Policyholder's BMI: " + String.format("%.2f", policy.CalculateBMI()));
      System.out.println("Policy Price: " + String.format("$%,.2f", policy.CalculatePolicyPrice()));
      }
}