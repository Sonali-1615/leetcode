class Solution {
    public int countVowelSubstrings(String word) {
        int count = 0;
        int n = word.length();
        for(int i=0;i<n;i++){
            if(isValid(word.charAt(i))){
                HashSet<Character> set = new HashSet<>();
                for(int j=i;j<n;j++){
                    if(isValid(word.charAt(j))){
                        set.add(word.charAt(j));
                        if(set.size()==5){
                            count++;
                        }
                    }
                    else{
                        break;
                    }   
                }
            }
        }
        return count;
    }
    public boolean isValid(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
        
    }
}