package Binary_Search;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i<101; i++){
            arrayList.add(i);
        }
        System.out.println(arrayList);
        BinarySearch binarySearch = new BinarySearch();
        int res = binarySearch.search((int) (Math.random() * arrayList.size()),arrayList);
        System.out.println(res);

    }
}

class BinarySearch {
    int search(int guess, ArrayList arrayList) {

        int low = 0;
        int high = (int) arrayList.get(arrayList.size() - 1);
        int mid = (high - low) / 2;

        while (low != high) {

            if (mid < guess) {
                low = mid + 1;
                high = (int) arrayList.get(arrayList.size() - 1);
                mid = (high - low) / 2;
                System.out.println("mid<guess");


            }
            if (mid > guess) {
                high = mid - 1;
                mid = (high - low) / 2;
                low = 0;
                System.out.println("mid>guess");



            }
            if (mid == guess) {
                return mid;
            }

        }
        return 0;
    }
}