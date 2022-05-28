class FibonacciR{   //using recursion
    static int a=0,b=1,c=0;
    static void printFibo(int n){
        if(n>0){
            c = a + b;
            a= b;
            b = c;
            System.out.print(" "+c);
            printFibo(n-1);
        }
    }
    public static void main(String args[]){
        int n=10;
        System.out.print(a+" "+b);  //printing 0 1
        printFibo(n-2);   //2 numbers are already printed above
    }
}
