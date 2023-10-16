class Solution {
    public boolean isPalindrome(int x) {


     
    
    int reversedNum = 0, remainder;
    
    // store the number to originalNum
    int originalNum = x;
    
    // get the reverse of originalNum
    // store it in variable
    while (x != 0) {
      remainder = x % 10;
      reversedNum = reversedNum * 10 + remainder;
      x /= 10;
    }
    if(reversedNum<0) {return false;}
    // check if reversedNum and originalNum are equal
    else if (originalNum == reversedNum) {
    return true;
    }
    else {
        return false;
        }
  }
}



   