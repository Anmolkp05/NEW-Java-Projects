class PowerOfFour {
    public boolean isPowerOfFour(int n) {
      long i = 1;
      while (i < n)
     {
         i = i * 4;
     }  
    
    if (i == n)
    {
        return true;
    }
    else
    {
         return false;
    }
}
}
