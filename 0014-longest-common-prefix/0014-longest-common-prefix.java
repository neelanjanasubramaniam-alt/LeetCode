class Solution {
    public String longestCommonPrefix(String[] string) {
        if(string == null || string.length == 0){
            return "";
        }
        String prefix = string[0] ;
        for (int i= 0;i<string.length;i++){
            while(!string[i].startsWith(prefix) )
            prefix =prefix.substring(0,prefix.length()-1);
            if(prefix.isEmpty())
            return "";
        }
        return prefix;

    }
    
}