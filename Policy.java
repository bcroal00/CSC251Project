public class Policy {
   public int PolicyNumber;
   public String ProviderName;
      
   public static int PolicyCount = 0;
      
   public Policy()
   {
      PolicyNumber = 0;
      ProviderName = "";
      
      PolicyCount++;
   }
   
   public Policy(
      int policyNumber,
      String providerName
   )
   {
      PolicyNumber = policyNumber;
      ProviderName = providerName;
      
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
      
      if (PolicyHolderAge > 50)
         additionalFee += 75;

      if (PolicyHolderSmokingStatus.equals("smoker"))
         additionalFee += 100;
         
      double BMI = CalculateBMI();
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