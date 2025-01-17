import java.util.*;
public class Majority {
    //find 2 majority element from array ans that will be 1/3 of an total element.

    static List<Integer> findMajority(int arr[]){
        int n = arr.length;
        int ele1 =-1, ele2=-1;
        int count1 =0 , count2=0;

        for (int ele : arr){
            if(ele1 == ele){
                count1++;
            }
            else if(ele2==ele){
                count2++;
            }
            else if(count1 == 0){
                ele1 = ele;
                count1++;
            }
            else if (count2 == 0){
                ele2 = ele;
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        List <Integer> res = new ArrayList<>();
        count1=0;
        count2=0;

        for (int ele :arr){
            if (ele1 == ele){
                count1++;
            }
            if (ele2==ele){
                count2++;
            }
        }
            // majority element of 2.
            if (count1 >n/3) res.add(ele1);
            if (count2 >n/3 && ele1 !=ele2)res.add(ele2);

            if (res.size() == 2 && res.get(0)> res.get(1)){
                int temp = res.get(0);
                res.set(0,res.get(1));
                res.set(1,temp);
            }
            return res;
        }
        public static void main(String[] args) {
            int[] arr = {3, 2, 3, 4, 2, 2, 3, 3};
            System.out.println(findMajority(arr));
    }
}
