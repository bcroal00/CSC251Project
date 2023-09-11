public class Policy {
   public int PolicyNumber;
   public String ProviderName;
   public String PolicyHolderFirstName;
   public String PolicyHolderLastName;
   public int PolicyHolderAge;
   public String PolicyHolderSmokingStatus;
   public double PolicyHolderHeight;
   public double PolicyHolderWeight;
   
   public Policy()
   {
      PolicyNumber = 0;
      ProviderName = "";
      PolicyHolderFirstName = "";
      PolicyHolderLastName = "";
      PolicyHolderAge = 0;
      PolicyHolderSmokingStatus = "";
      PolicyHolderHeight = 0.0;
      PolicyHolderWeight = 0.0;
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
      PolicyHolderFirstName = firstName;
      PolicyHolderLastName = lastName;
      PolicyHolderAge = age;
      PolicyHolderSmokingStatus = smokingStatus;
      PolicyHolderHeight = height;
      PolicyHolderWeight = weight;
   }
   
   public double CalculateBMI()
   {
      @param PolicyHolderWeight The weight of the policy holder
      @param PolicyHolderHeight The height of the policy holder
   
      @return Returns the BMI of the policy holder
      return (PolicyHolderWeight * 703) / Math.pow(PolicyHolderHeight, 2);
   }
   
   public double CalculatePolicyPrice()
   {
      @param baseFee The base fee of the policy
      @param additionalFee The additional fees based on the policy holder
      @param PolicyHolderAge The age of the policy holder
      @param PolicyHolderSmokingStatus The smoking status of the policy holder
      @param BMI The BMI of the policy holder
   
      double baseFee = 600;
      double additionalFee = 0;
      
      if (PolicyHolderAge > 50)
         additionalFee += 75;

      if (PolicyHolderSmokingStatus.equals("smoker"))
         additionalFee += 100;
         
      double BMI = CalculateBMI();
      if (BMI > 35)
         additionalFee += (BMI - 35) * 20;
         
      @return Returns the policy price based on base fee and additional fees
      return baseFee + additionalFee;
   }
}