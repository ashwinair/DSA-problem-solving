package SlidingWindow;

public class GrumpyOwner {

// 1. Use sliding window to find out the total customers impaced in 'minutes' minutes
// 2. Find max of above
// 3. Substract the max from the total unstasfied customers
// 4. Substract above form total served customers

    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;

        int i = 0, j = 0, sum = 0, max = Integer.MIN_VALUE, total = 0, unstasified = 0;

        while (j < n) {
            if (grumpy[j] == 1) {
                sum += customers[j];

                unstasified += customers[j];
            }

            total += customers[j];

            if (j - i + 1 == minutes) {
                max = Math.max(max, sum);

                if (grumpy[i] == 1) sum -= customers[i];

                i++;
            }

            j++;
        }

        return total - (unstasified - max);
    }


    //Complicated and not working in some cases........

//        public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
//            int max=0,i=0,j=0,winStart =0,curTotal =0;
//            int n= customers.length;
//            int sum=0;
//            int winEnd =0;
//
//            if(n==1)
//            {
//                sum = customers[i];
//            }
//            else{
//
//
//                while(j<n){
//                    curTotal+=customers[j];
//                    if(j-i+1<minutes) j++;
//
//                    else{
//                        if(curTotal>max && grumpy[j] == 1){
//                            max = curTotal;
//                            winStart = i;
//                            winEnd = j;
//                        }
//                        curTotal-=customers[i];
//                        i++;
//                        j++;
//                    }
//                }
//
//                if(winStart == 0)winStart = n;
//                for(int x =0;x<winStart;x++){
//                    if(grumpy[x]==0) sum+=customers[x];
//                }
//
//                if(winStart < winEnd){
//                    for(int y =winStart;y<=winEnd;y++){
//                        sum+=customers[y];
//                    }}
//
//
//
//            }
//
//            return sum;
//        }
}

