class ReverseAnInteger {
    public int reverse(int x) {
      int r,rev=0 , target =x;
        while (x!=0){
            r =x%10;
            if (rev>0&&rev>(Integer.MAX_VALUE-r)/10 || rev<0&&rev<(Integer.MIN_VALUE-r)/10)
            return 0;
            rev =rev*10+r;
            x=x/10;
        }
        
            return rev;
        
        
          
    }
}
