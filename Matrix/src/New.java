import java.util.Arrays;

public class New {
	
	public static int median(int m[][]) {
		int min=Integer.MAX_VALUE;
		int max=Integer.MAX_VALUE;
		
		int r=m.length;
		int c=m[0].length;
		
		for(int i=0;i<r;i++) {
			if(m[i][0]<min) 
				min=m[i][0];
			if(m[i][c-1] > max)
                max = m[i][c-1];
		}
		
		 int desired = (r * c + 1) / 2;
	        while(min < max)
	        {
	            int mid = min + (max - min) / 2;
	            int place = 0;
	            int get = 0;
	              
	            for(int i = 0; i < r; ++i)
	            {
	                  
	                get = Arrays.binarySearch(m[i],mid);
	  
	                if(get < 0)
	                    get = Math.abs(get) - 1;

	                else
	                {
	                    while(get < m[i].length && m[i][get] == mid)
	                        get += 1;
	                }
	                  
	                place = place + get;
	            }
	              
	            if (place < desired)
	                min = mid + 1;
	            else
	                max = mid;
	        }
	        return min;
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m[][]= {{1,2,3},{4,50,6},{11,25,320}};
		int r=3, c=3;
		System.out.println("Median is " + median(m));

	}

}
