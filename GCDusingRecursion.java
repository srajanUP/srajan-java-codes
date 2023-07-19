public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter the first integer : ");
        int first=input.nextInt();
        System.out.print("enter the first integer : ");
        int second=input.nextInt();
        

        //invoking the method gcd
        System.out.println(gcd(first,second));
    }

    public static int gcd(int m,int n){
        //base case
        if (m%n==0){
            return n;
        }

        //recursive case
        else{
            return gcd(n,m%n);
        }
    }
