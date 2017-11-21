class Problem_3
{
	public static void main(String[] args) 
    {
		long startTime = System.currentTimeMillis();
        long num = 6000000000000L; 
        long primeFactor = 1L;

        for(long i = 3L; i <= num / i; ) 
        {
            if( num % i == 0) 
            {
                primeFactor = i;
                num = num / i;
            }
            else 
            {
                i++;
            }
        }
        if( primeFactor < num )
        { 
        	primeFactor = num; 
        }
        
        System.out.println(primeFactor);
        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
    }
}
