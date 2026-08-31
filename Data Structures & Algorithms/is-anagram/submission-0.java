class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length())
        return false;
      //we need to use hashmap datastructure for this problem
      HashMap<Character, Integer> mapfors = new HashMap();
      HashMap<Character, Integer> mapfort = new HashMap();

      for( char i : s.toCharArray()){
        mapfors.put(i,mapfors.getOrDefault(i,0)+1);
      }

      for( char i : t.toCharArray()){
        mapfort.put(i,mapfort.getOrDefault(i,0)+1);
      }
       return mapfors.equals(mapfort);
    }
}
