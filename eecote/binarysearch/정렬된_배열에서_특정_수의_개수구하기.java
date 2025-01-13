    package eecote.binarysearch;

    import java.io.*;

    public class 정렬된_배열에서_특정_수의_개수구하기 {
        public static int lowerBound(int [] arr, int target){
            int start = 0;
            int end = arr.length;

            while(start < end){
                int mid = (start + end) / 2;
                if(arr[mid] >= target){
                    end = mid;
                }else{
                    start = mid + 1;
                }
            }
            return start;
        }

        public static int upperBound(int [] arr, int target){
            int start = 0;
            int end = arr.length;

            while(start < end){
                int mid = (start + end) / 2;
                if(arr[mid] > target){
                    end = mid;
                }else{
                    start = mid + 1;
                }
            }
            return start;
        }

        public static int countElements(int[] arr, int x) {
            int first = lowerBound(arr, x);
            int last = upperBound(arr, x);
            return first == arr.length || arr[first] != x ? -1 : last - first;
        }

        public static void main(String [] args) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String [] NX = br.readLine().split(" ");
            int n = Integer.parseInt(NX[0]);
            int x = Integer.parseInt(NX[1]);

            String [] input = br.readLine().split(" ");
            int [] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(input[i]);
            }

            System.out.print(countElements(arr, x));

        }
    }
