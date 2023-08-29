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
      return (PolicyHolderWeight * 703) / Math.pow(PolicyHolderHeight, 2);
   }
   
   public double CalculatePolicyPrice()
   {
      double baseFee = 600;
      double additionalFee = 0;
      
      if (PolicyHolderAge > 50)
         additionalFee += 75;

      if (PolicyHolderSmokingStatus.equals("smoker"))
         additionalFee += 100;
         
      double BMI = CalculateBMI();
      if (BMI > 35)
         additionalFee += (BMI - 35) * 20;
         
      return baseFee + additionalFee;
   }
}