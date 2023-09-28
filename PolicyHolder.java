public class PolicyHolder {
   public String PolicyHolderFirstName;
   public String PolicyHolderLastName;
   public int PolicyHolderAge;
   public String PolicyHolderSmokingStatus;
   public double PolicyHolderHeight;
   public double PolicyHolderWeight;

   public PolicyHolder()
   {
      PolicyHolderFirstName = "";
      PolicyHolderLastName = "";
      PolicyHolderAge = 0;
      PolicyHolderSmokingStatus = "";
      PolicyHolderHeight = 0.0;
      PolicyHolderWeight = 0.0;
   }

   public PolicyHolder(
      String firstName,
      String lastName,
      int age,
      String smokingStatus,
      double height,
      double weight
   )
   {
      PolicyHolderFirstName = firstName;
      PolicyHolderLastName = lastName;
      PolicyHolderAge = age;
      PolicyHolderSmokingStatus = smokingStatus;
      PolicyHolderHeight = height;
      PolicyHolderWeight = weight;
   }

   public double CalculateBMI()
   {
      //@param PolicyHolderWeight The weight of the policy holder;
      //@param PolicyHolderHeight The height of the policy holder;
   
      //@return Returns the BMI of the policy holder;
      return (PolicyHolderWeight * 703) / Math.pow(PolicyHolderHeight, 2);
   }

}