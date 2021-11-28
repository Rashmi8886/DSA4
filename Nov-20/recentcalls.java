class RecentCounter {
    Queue<Integer> Q;
    public RecentCounter() {
        Q=new LinkedList<>();
    }
    
    public int ping(int t) {
        if(Q.size()==0)
        {
            Q.add(t);
            return 1;
        }
        else{
        if(t<3000)
            Q.add(t);
        else
        {   int margin=t-3000;
            while(!Q.isEmpty()&&Q.peek()<margin)
                Q.poll();
                
                Q.add(t);
                
        }
        }
        return Q.size();
    }
}