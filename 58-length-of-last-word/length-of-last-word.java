class Solution {
    public int lengthOfLastWord(String s) {
        int number = 0;
        if(s.length() > 0){
            int space = s.length()-1;
            while(s.charAt(space) == ' '){
                space = space - 1;
            }
            for(int i = space; i >=0; i--){
                if(s.charAt(i) == ' '){
                    break;
                }
                else{
                    number=number+1;
                }
            }
        }
        return number;
    }
    
}