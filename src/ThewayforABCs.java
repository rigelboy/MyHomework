public class ThewayforABCs {
    public static void getNums(String str) {
        int[] nums = new int[26];

        for(char i : str.toCharArray()) {
            if(i >= 97 && i <= 123) {
                nums[i - 97]++;
            }
        }
        for(int i = 0; i<nums.length; i++) {
            if(nums[i] != 0) {
                char j = (char) (i + 97);
                System.out.println(j + "出现次数为" + nums[i]);
            }}}}

