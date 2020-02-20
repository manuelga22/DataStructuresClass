package Searching;
import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;
/**
 * Timing the sequential search and binary search
 */

public class Prog20_02 {

public static void main(String[]args){
int[] list = {1,4,3,5,8,7,2,1,4,7,6,1,2,5,8,9,7,5,2,1,3,5,7,9,9};



long start = Instant.now().toEpochMilli();

System.out.println(Searching.sequencialSearch(list, 8));

long end = Instant.now().toEpochMilli();
long interval = end - start;
System.out.println(" The search took: "+ interval + "  MilliSECONDS");


start = Instant.now().toEpochMilli();
System.out.println(Searching.binarySearch(list, 8));
end = Instant.now().toEpochMilli();
interval = end - start;
System.out.println(" The second search took: "+ interval + "  MilliSECONDS");




}

  
}