public class MergeSortedArray {
     public void merge(int[] nums1, int m, int[] nums2, int n) {
        //approach 1
    //   for(int i=0;i<n;i++){
    //     nums1[i+m]=nums2[i];
    //   }
    //   Arrays.sort(nums1);
    // }


    // approach 2
    int p1=m-1;
    int p2=n-1;
    int lastIndex=m+n-1;
    for(int p=lastIndex;p>=0;p--){
        if(p2<0){
            break;
        }
        if(p1>=0 && nums1[p1]>nums2[p2]){
            nums1[p]=nums1[p1];
            p1--;
        }else{
            nums1[p]=nums2[p2];
            p2--;
        }

    }
  }

    
}
