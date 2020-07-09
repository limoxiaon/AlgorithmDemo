package Other;

//第一个错误的版本
public class Solution_2 extends VersionControl {

    public int firstBadVersion(int n) {

        int end=n;
        int start=1;

        if(isBadVersion(1)){
            return 1;
        }

        while(start<end-1){
            int middle=start+(end-start)/2;
            boolean temp=isBadVersion(middle);
            if(temp){
                end=middle;
            }else {
                start=middle;
            }
        }
        return end;
    }
}


