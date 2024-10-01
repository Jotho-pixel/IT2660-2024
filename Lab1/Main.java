//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: 
 */

public class Main {
  public static void main(String[] args) {
    System.out.println("hello, world!");

    Lab1 lab = new Lab1();
    System.out.println(lab.increment(1));

//Create Array
    int[] a = {5, 9, 3, 12, 7, 3, 11, 5};

//Sort array
    for (int i = 0; i < a.length -1; i++){
      int currentMin = a[i];
      int currentMinIndex = i;
      for( int x = i + 1; x < a.length; x++){
        if (currentMin> a[x]){
          currentMin = a[x];
          currentMinIndex = x;
        }}
      if (currentMinIndex != i) {
        a[currentMinIndex] = a[i];
        a[i] = currentMin;
      
      }
    }

  //print array forwards then backwards
  int i = 0;
  System.out.println("Array printed Forwards:");
  while(i < a.length){
    System.out.print(a[i] +" ");
    i++;
  }

  System.out.println("\nArray printed backwards:");

  for(i= a.length-1; i >= 0; i--){
    System.out.print(a[i] + " ");
  }
  System.out.println();
  System.out.println("First value: " + a[0]);
  System.out.println("Last value: " + a[a.length-1]);
  System.out.println("Max value: " + lab.max(a[2],a[7]));
  System.out.println("Min value: "+ lab.min(a[7],a[3]));
  System.out.println("Sum of array: "+ lab.sum(a));
  System.out.println("Average of array: " + lab.average(a));
  System.out.println("Array Max: " + lab.max(a));
  System.out.println("Array Min: " + lab.min(a));
  }
}     

// Add all of the methods here
class Lab1 {
  public int increment(int num) {
    return ++num;
  }
  public int max(int a, int b){
    int higher;
    if ( a > b){
      higher = a;
    }
    else {
      higher = b;
    }
    return higher;
  }
  public int min (int a, int b){
    int lower;
    if(a < b){
      lower = a;
    }
    else{
      lower = b;
    }
    return lower;
  }
  public int sum(int[] nums){
    int total = 0;
    for (int x=0;x <= 7;x++){
      total += nums[x];
    }
    return total;
  }
  public int average(int[] nums){
    int avg = sum(nums) / nums.length;
    return avg;
  }
  public int max(int[] nums){
    int max = 0;
    for (int x = 0; x>= 7; x++){
      max += nums[x];
    }
    return max;
  }
  public int min(int[] nums){
    int min = 0;
    for (int x = 0; x>= 7; x++){
      min += nums[x];
    }
    return min;
  }
}