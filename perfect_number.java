/*A perfect number in C is a positive integer that equals the sum of its proper divisors, excluding itself. To determine if a number is perfect, iterate through its divisors and sum them. If the sum equals the number itself, it's perfect. Examples include 6 (1+2+3=6) and 28 (1+2+4+7+14=28).*/

class perfect_number {
    public static void main(String[] args) {
        int num=6;
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(num==sum){
            System.out.println("perfect number");
        }
        else{
            System.out.println("not a perfect number");
        }
    }
}