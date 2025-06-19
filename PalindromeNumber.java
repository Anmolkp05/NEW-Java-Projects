class PalindromeNumber {

         public boolean isPalindrome(int x){
        int rev=0 , target =x;
        while (x>0){
            int r =x%10;
            rev =rev*10+r;
            x=x/10;
        }
        if (rev == target)
        {
            return true;
        }
            return false;
    }
}
    
