class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n= nums1.length;
        int m= nums2.length;
        int i=0, j=0;
        double m1=-1, m2=-1;
        for(int count =0; count<=(m+n)/2; count++){
            m2= m1;
            if(i!= n && j!=m)
                m1 = (nums1[i]> nums2[j]) ? nums2[j++] : nums1[i++];
            else if(i<n)
                m1 = nums1[i++];
            else
                m1 = nums2[j++];
            
        }
            if((m+n)%2 ==1)
                return m1;
            else
                return (m1+m2)/ 2.0;
    }
}