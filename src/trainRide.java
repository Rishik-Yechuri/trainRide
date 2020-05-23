import java.util.Scanner;

public class trainRide {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int capacity = scan.nextInt();
            int pplInside = 0;
            int stations = scan.nextInt();
            boolean triggerWarning = true;

            for (int s = 0; s < stations; s++) {
                int left = scan.nextInt();
                int join = scan.nextInt();
                int wait = scan.nextInt();

                if (pplInside + join > capacity) {
                    triggerWarning = false;
                }
                pplInside = pplInside + join;

                if (left > pplInside) {
                    triggerWarning = false;
                }
                pplInside = pplInside -left;

                if (s + 1 >= stations && wait != 0 || wait != 0 && pplInside < capacity) {
                    triggerWarning = false;
                }

                if(s==stations-1&&(join>0||pplInside>0||wait>0)){
                    triggerWarning = false;
                }

            }
            if(triggerWarning){
                System.out.println("possible");
            }
            else if(triggerWarning == false){
                System.out.println("impossible");
            }
        }
    }

