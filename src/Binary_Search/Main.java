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
        int high = 100;

        while (low <= high) {
            int mid = (high - low) / 2;
            int choose = (int) arrayList.get(mid);

            if (choose < guess) {
                low = mid + 1;
                System.out.println("mid<guess");


            }
            if (choose > guess) {
                high = mid - 1;

                System.out.println("mid>guess");



            }
            if (choose == guess) {
                return mid;
            }

        }
        return 0 ;
    }
}