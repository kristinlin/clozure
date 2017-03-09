public class QuickSortTester 
{
    //create an array
    public static int[] generate(int size){
	int[] bois = new int[size];
	for(int i = 0; i < size; i++){
	    bois[i] = (int)(Math.random() * 100);
	}
	return bois;
    }
    
    //returns time taken to sort the array
    public static long timeTaken(int[] arr) {
	long startTime = System.nanoTime();
	QuickSort.qsort(arr);
	long endTime = System.nanoTime();
	return endTime - startTime;
    }

    //returns the average time taken for sorting numTimes arrays of length size
    public static long average(int size, int numTimes) {
	long sum = 0;
	for (int i = 0; i < numTimes; i++) {
	    sum += timeTaken(generate(size));
	}
	return sum / numTimes;
    }
    
    /******************************
     * execution time analysis 
     * the average function takes in the size of the array and the batch size.
     * First we run the average 100000 times to avoid outliers in runtime.
     * Timetaken calcuates the time it takes for a sort to occur. 
     * Average out the timetaken for each sort by batch size
     ******************************/
    public static void main( String[] args ) 
    {
        average(100, 100000); //warm up
	System.out.println("Average of size 1, with 2 000 times: " + average(1, 2000));
	
	/*
	System.out.println("Average of size 10, with 2 000 times: " + average(10, 1000));
	System.out.println("Average of size 100, with 2 000 times: " + average(100, 1000));
	System.out.println("Average of size 1 000, with 2 000 times: " + average(1000, 1000));
        System.out.println("Average of size 5 000, with 2 000 times: " + average(5000, 1000));
        System.out.println("Average of size 10 000, with 2 000 times: " + average(10000, 1000));
        System.out.println("Average of size 50 000, with 2 000 times: " + average(50000, 1000));
        System.out.println("Average of size 100 000, with 2 000 times: " + average(100000, 1000));
	System.out.println("Average of size 500 000, with 2 000 times: " + average(500000, 1000));
	System.out.println("Average of size 1 000 000, with 2 000 times: " + average(1000000, 1000));
	System.out.println("Average of size 5 000 000, with 2 000 times: " + average(5000000, 1000));
	System.out.println("Average of size 10 000 000, with 2 000 times: " + average(10000000, 1000));
        System.out.println("Average of size 50 000 000, with 2 000 times: " + average(50000000, 1000));
        System.out.println("Average of size 100 000 000, with 2 000 times: " + average(100000000, 1000));*/
	     
    }//end main

}//end class
