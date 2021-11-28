class Solution {
    
        public boolean uniqueOccurrences(int[] arr) {
      Map<Integer, Integer> map = new HashMap<>();
      for(int n : arr){
          map.put(n, map.getOrDefault(n, 0)+1);
      }
        HashSet<Integer> set = new HashSet<>();
        for(int key : map.keySet()){
            if(set.contains(map.get(key))){
                return false;
            }
            set.add(map.get(key));
        }
      
       return true; 
    }
    }