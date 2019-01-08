package leetcode.greedy;

public class SolutionLemonadeChange {


    public static void main(String[] args) {


//        int a[]=new int[]{5,5,10,20,};

        int a[] = {5, 5, 5, 10, 5, 5, 10, 20, 20, 20};
        System.err.println(new SolutionLemonadeChange().lemonadeChange(a));
//        new SolutionLemonadeChange().lemonadeChange(a);


    }

    public boolean lemonadeChange(int[] bills) {
        if (bills[0] > 5) {
            return false;
        }
        int five = 0;
        int ten = 0;
        for (int i = 0; i < bills.length; i++) {
            switch (bills[i]) {
                case 5: {
                    five++;
                    break;
                }
                case 10: {
                    if (five > 0) {
                        five--;
                        ten++;
                        break;
                    } else {
                        return false;
                    }
                }
                case 20: {
                    int change = 20 - 5;
                    int sum = 0;
                    boolean needTen = true;
                    while (sum < change) {
                        if (ten > 0 && needTen) {
                            sum += 10;
                            ten--;
                            if (sum > change) {
                                sum -= 10;
                                needTen = false;
                                ten++;

                            }
                        } else {
                            if (five > 0) {
                                five--;
                                sum += 5;
                            } else {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}


