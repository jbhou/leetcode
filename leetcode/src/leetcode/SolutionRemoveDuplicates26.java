package leetcode;

public class SolutionRemoveDuplicates26 {


    //    给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
//
//    不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
//
//    示例 1:
//
//    给定数组 nums = [1,1,2],
//
//    函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
//
//    你不需要考虑数组中超出新长度后面的元素。
//    示例 2:
//
//    给定 nums = [0,0,1,1,1,2,2,3,3,4],
//
//    函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
//
//    你不需要考虑数组中超出新长度后面的元素。
//
//
//    来源：力扣（LeetCode）
//    链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array
//    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
//
    public static void main(String[] args) {


        int[] a = new int[]{1, 1, 2};

        System.err.println(removeDuplicates(a));

        for (int x : a) {
            System.err.println(x);
        }

    }


    /**
     * 插入排序法的变种
     *
     * @param nums
     * @return
     */

    public static int removeDuplicates(int[] nums) {

        if (nums.length <= 1) {
            return nums.length;
        }
        int lastIndex = nums.length - 1;

        int sortedIndex = 0;
        for (int i = 1; i <= lastIndex; i++) {
            boolean needSwap = false;
            for (int j = 0; j <= sortedIndex; j++) {
                if (nums[i] == nums[j]) {
                    needSwap = true;
                    break;
                }
            }
            if (needSwap) {
                swap(nums, i, lastIndex);
                lastIndex--;
                i--;
            } else {
                int j = i;
                while (nums[j - 1] > nums[j]) {
                    swap(nums, j - 1, j);
                    j--;
                }
                sortedIndex++;
            }

        }
        return sortedIndex+1;

    }


    public static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }


}
