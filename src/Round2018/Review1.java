package Round2018;

import java.util.*;

public class Review1 {
    public static void main(String args[]){
        Scanner input  = new Scanner(System.in);
        int NoOfTestCases = input.nextInt();
        for (int i = 1; i <= NoOfTestCases; i++) {
            int N = input.nextInt(); //the single integer N, lets say it is 2
            String s = input.nextLine();
            String name[];
            name = new String[N]; //this says that the name array has the number of names
            for (int j = 0; j < N; j++) {
                name[j] = input.nextLine();
            }
            ArrangeCards arrc = new ArrangeCards(N);
            //arrc.sort(name);
            System.out.println("Case #" +i+ ": " + arrc.sort(name));
        }
    }
}

class ArrangeCards{
    String arr[];
    ArrangeCards(int size){
        arr = new String[size];
    }

    public int sort(String arr[]){
        int cost = 0;
        for(int j=0; j<arr.length-1; j++){ //1st name j=0
            for(int k=j+1; k<arr.length; k++){ //2nd name k=1
                /*int num = arr[j].compareTo(arr[k]);
                if(num > 0){
                    cost++;
                }*/
                if(arr[j].compareTo(arr[k]) > 0){
                    cost++;
                }
            }
        }
        return cost;

        //System.out.printf("The cost is $ %d ", cost);
        //System.out.println(cost);
    }
}

/*String[] name = { "John","Remo","Mixy","Julie","Ronny"};
        int n = 5;
        System.out.println("Before Sorting");
        for(int i = 0; i < n; i++) {
            System.out.println(name[i]);
        }
        for(int i = 0; i < n-1; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (name[i].compareTo(name[j]) > 0) {
                    String temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;
                }
            }
        }
        System.out.println("\nAfter performing lexicographical order: ");
        for(int i = 0; i < n; i++) {
            System.out.println(name[i]);
        }*/
