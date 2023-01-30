public class random_card_shuffle {
    public static void main(String[] args) {
        int cards[]=new int[52];
        for (int i=0;i<=51;i++){
            cards[i]=i;
        }
        

        
        System.out.print("cards before shuffing  = ");
        System.out.print("[");
        for (int i=0;i<=51;i++){
            System.out.print(cards[i]);                      // displaying of cards before shuffling
            if (i!=51){
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println(" ");

        
       

        int count=0;
        
        for (int i=0;i<=51;i++){
            int x=(int)(0+Math.random()*52);
            if (x>=i){
                
            count=cards[i];                       // shuffling of an array
            cards[i]=cards[x];
            cards[x]=count;
            
            }
        }


        System.out.println();

        System.out.print("cards after shuffling = ");
        System.out.print("[");
        for (int i=0;i<=51;i++){                                   // displaying of cards after shuffling
            System.out.print(cards[i]);
            if (i!=51){
                System.out.print(", ");
            }
        }
        System.out.print("]");


       System.out.println( );
       System.out.println();
       int ccount=0;
        for (int i=1; i<=4 ;i++){
            ccount=cards[i-1];
            if ((ccount/13)<=1){
                System.out.print((int)(i)+"st card is of sphade and ");
                System.out.println("rank of the card is "+(ccount%13));
            }
            else if ((ccount)/13<=2){                                                  // determining the suit and rank of the card
                System.out.print((int)(i)+"st card is of heart and ");
                System.out.println("rank of the card is "+(ccount%13));

            }
            else if ((ccount)/13<=3){
                System.out.print((int)(i)+"st card is of diamond and ");
                System.out.println("rank of the card is "+(ccount%13));

            }else if ((ccount)/13<=4){
                System.out.print((int)(i)+"st card is of club and ");
                System.out.println("rank of the card is "+(ccount%13));

            }
        System.out.println();
        }
    }

