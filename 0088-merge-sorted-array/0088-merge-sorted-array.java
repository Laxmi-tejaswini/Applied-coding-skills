class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0,k=0;
        int[] r = new int [m+n];
        while(i<=m-1 && j<=n-1)
        {
            if(nums1[i]<=nums2[j])
            {
                r[k] = nums1[i];i++;k++;
            }
            else{
                r[k]=nums2[j];j++;k++;
            }
        }
        while(i<=m-1)
        {
            r[k]=nums1[i];i++;k++;
        }
        while(j<=n-1)
        {
            r[k]=nums2[j];j++;k++;
        }
        for(int x=0;x<m+n;x++){
            nums1[x]=r[x];
        }
    }
}