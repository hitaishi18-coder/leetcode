class Solution 
{
    public static int countPrimes(int n) 
    {
        n = n-1;
        
        int a[] = new int[n+1];
        
        for(int i=0; i<=n; i++)
        {
            a[i] = i;
        }
        
        for(int i=2; i<=Math.sqrt(n) ; i++)
        {
            if(a[i]!=0)
            {
                for(int j=2; i*j<=n; j++)
                {
                    // Cross multiple of i
                    if(a[i*j]!=0)
                    {
                        a[i*j] = 0;
                    }
                }
            }
        }
        
        //System.out.println(Arrays.toString(a));
        
        int count = 0;
        
        for(int i=2; i<=n ; i++)
        {
            if(a[i]!=0)
            {
                count++;
            }
        }
        
        return count;
    }
}