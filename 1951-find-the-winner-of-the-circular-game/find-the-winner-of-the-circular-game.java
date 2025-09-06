class Solution {
    public int findTheWinner(int n, int k) {
        if(n == 1)
        {
            return 1 ;
        }
        else 
        {
            ArrayList<Integer> al = new ArrayList<>();
            for(int i=1 ; i<=n ; i++)
            {
                al.add(i);
            }
            int i = -1 ;
            while(true)
            {
                System.out.println(al);

                i = (i+k) % al.size();
                al.remove(i);

                i = i-1 ;
                if(al.size()==1)
                {
                    break;
                }
            }

            return al.get(0);
        }
    }
}