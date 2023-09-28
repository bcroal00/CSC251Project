public class Policy {
   public int PolicyNumber;
   public String ProviderName;
   public PolicyHolder PolicyHolder;
      
   public static int PolicyCount = 0;
      
   public Policy()
   {
      PolicyNumber = 0;
      ProviderName = "";
      
      PolicyCount++;
   }
   
   public Policy(
      int policyNumber,
      String providerName,
      String firstName,
      String lastName,
      int age,
      String smokingStatus,
      double height,
      double weight
   )
   {
      PolicyNumber = policyNumber;
      ProviderName = providerName;
      PolicyHolder = new PolicyHolder(firstName, lastName, age, smokingStatus, height, weight);
      
      PolicyCount++;
   }
         
   public double CalculatePolicyPrice()
   {
      //@param baseFee The base fee of the policy;
      //@param additionalFee The additional fees based on the policy holder;
      //@param PolicyHolderAge The age of the policy holder;
      //@param PolicyHolderSmokingStatus The smoking status of the policy holder;
      //@param BMI The BMI of the policy holder;
   
      double baseFee = 600;
      double additionalFee = 0;
      
      if (PolicyHolder.PolicyHolderAge > 50)
         additionalFee += 75;

      if (PolicyHolder.PolicyHolderSmokingStatus.equals("smoker"))
         additionalFee += 100;
         
      double BMI = PolicyHolder.CalculateBMI();
      if (BMI > 35)
         additionalFee += (BMI - 35) * 20;
         
      //@return Returns the policy price based on base fee and additional fees;
      return baseFee + additionalFee;
   }
   
   public String toString() {
      return "Policy Number: " + PolicyNumber +
              "\nProvider Name: " + ProviderName;
   }
}