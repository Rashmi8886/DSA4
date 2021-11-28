 HashSet<Character> jewelSet = new HashSet<Character>();
        for(int i=0;i<jewels.length();i++)
            jewelSet.add(jewels.charAt(i));
        
        int answer = 0;
        for(int i=0;i<stones.length();i++){
            if(jewelSet.contains(stones.charAt(i)) == true)
                answer++;
        }
        return answer;