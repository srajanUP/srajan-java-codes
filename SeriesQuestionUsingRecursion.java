m(i) = 1+1/2+1/3+...+1/i  using recursion
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //getting input from the user
        System.out.print("enter the range of the series : ");
        int range=input.nextInt();
        //invoking the function
       System.out.println(seriesSum(range));
    }
    


    public static double seriesSum(double range){
        if (range==1){
            //base case
            return 1;
        }

        else {
            // recursive case
            return seriesSum(range-1)+(1/range);
        }        
    }
