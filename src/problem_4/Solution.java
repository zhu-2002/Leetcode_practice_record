package problem_4;

//给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
//
// 算法的时间复杂度应该为 O(log (m+n)) 。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums1 = [1,3], nums2 = [2]
//输出：2.00000
//解释：合并数组 = [1,2,3] ，中位数 2
// 
//
// 示例 2： 
//
// 
//输入：nums1 = [1,2], nums2 = [3,4]
//输出：2.50000
//解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
// 
//
// 
//
// 
//
// 提示： 
//
// 
// nums1.length == m 
// nums2.length == n 
// 0 <= m <= 1000 
// 0 <= n <= 1000 
// 1 <= m + n <= 2000 
// -10⁶ <= nums1[i], nums2[i] <= 10⁶ 
// 
//
// Related Topics 数组 二分查找 分治 👍 7246 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int stop = (nums1.length + nums2.length) / 2;
        int steps = 0, i = 0, j = 0;
        boolean isOdd = (nums1.length + nums2.length) % 2 == 1;
        double resFormer = 0, resNext = 0 ;
        if (nums1.length==0 && nums2.length==0) {
            return 0;
        }
        while (steps <= stop){
            resFormer = resNext ;
            if ( i < nums1.length && j < nums2.length){
                if ( nums1[i] < nums2[j] ){
                    resNext = nums1[i];
                    i++;
                }else{
                    resNext = nums2[j];
                    j++;
                }
            }else if ( i < nums1.length ) {
                resNext = nums1[i];
                i++;
            }else {
                resNext = nums2[j];
                j++;
            }
            steps += 1 ;
        }
        if (isOdd){
            return Double.parseDouble(String.format("%.5f", resNext)) ;
        }else {
            return Double.parseDouble(String.format("%.5f", (resFormer + resNext) / 2.0)) ;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
