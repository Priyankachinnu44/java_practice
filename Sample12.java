class Sample12
  {
    public static void main(String args[])
    {
      double principle,rate, time, compound_interest;
      principle=1000;
      rate=6;
      time=4;
      System.out.println("The principle ammount is"+principle);

      System.out.println("The interest rate is:"+rate);
      System.out.println("The time period is:"+time);
      compound_interest= principle *(Math.pow((1+rate/100),time))-principle;
      System.out.println("\nThe Compound Interest is: " +compound_interest);
      
    }
  }