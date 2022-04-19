package mypackage; //this means package where the classes are.

import java.util.ArrayList; //it means this is a resizable
import java.util.List;

public class CreditCard {
    public Integer cardNumber;
    public Integer balance;
    public String cardName;

    public void setCardNumber(Integer cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Integer getCardNumber() {
        return cardNumber;
    }

    public Integer getBalance() {
        return balance;
    }

    public String getCardName() {
        return cardName;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public static void main(String[] args) {


        CreditCard creditCard1 = new CreditCard();
        creditCard1.setCardNumber(1322268866);
        // System.out.println("The card Number is " +creditCard1.getCardNumber());
        creditCard1.setCardName("amex");
        creditCard1.setBalance(100);

        CreditCard creditCard2 = new CreditCard();
        creditCard2.setCardNumber(1439990807);
        // System.out.println("The card Number is " +creditCard1.getCardNumber());
        creditCard2.setCardName("Chase");
        creditCard2.setBalance(100112);

        CreditCard creditCard3 = new CreditCard();
        creditCard3.setCardNumber(1439330807);
        // System.out.println("The card Number is " +creditCard1.getCardNumber());
        creditCard3.setCardName("BOA");
        creditCard3.setBalance(102312);

        List<CreditCard> list = new ArrayList<CreditCard>();
        list.add(creditCard1);
        list.add(creditCard2);
        list.add(creditCard3);
        Integer bal = 0;
        Integer itr = 0;
        CreditCard maxval = null;

        for (CreditCard c : list) {
            if (itr == 0) {
                bal = c.getBalance();
                maxval = c;
            }
            if (bal > c.getBalance()) {
                continue;
            } else {
                bal = c.getBalance();
                maxval = c;
            }
            itr++;

        }


        System.out.println(maxval.getCardName() + " has the max balance with balance = " + maxval.getBalance());


        /**
         *
         */
        Card x = new AmexCard();
        x.balance(100);
        Card z = new BOACard();
        z.balance(200);
        List<Card> y = new ArrayList<Card>();
        y.add(x);
        y.add(z);
        for (Card card : y) {
            System.out.println(card.getBal());
        }



        List<BrandCar> list1 = new ArrayList<BrandCar>();
        BrandCar honda = new Honda() ;
        honda.price(25000);
        BrandCar mazda = new Mazda();
        mazda.price(28500);
       // BrandCar toyota = new Toyota();

        list1.add(honda);
        list1.add(mazda);
        Integer price = 0;
        Integer itr1 =0;
        BrandCar maxprice = null;
        for (BrandCar b: list1){
            if (itr1 ==0) {
                price = b.price();
                maxprice = b;
            }
            if (price> b.price()) {
                continue;
            }  else {
                price = b.price();
                maxprice = b;
            }
            itr++;

        }

        System.out.println(maxprice.name() + " is having max price = "+ maxprice.price());

        //end

        List<Zoo> list2 = new ArrayList<>();
        Zoo open = new Open();
        open.number(3);
        Zoo closed = new Closed();
        closed.number(6);

        list2.add(open);
        list2.add(closed);
        Integer number = 0;
        Integer itr2 = 0 ;
        Zoo maxnumber = null;
        for (Zoo g: list2){
            if (itr2 ==0) {
                number = g.number();
                maxnumber = g;
            }
            if (number> g.number()) {
                continue;
            } else {
                number = g.number();
                maxnumber = g;

            }
            itr2++;
        }
        System.out.println("The maximum number of zoo is "+maxnumber.number() );




        List<Shape> list3 = new ArrayList<>();
        Shape square = new Square();
        square.sides(4);
        Shape rectangle = new Rectangle();
        rectangle.sides(3);

        list3.add(square);
        list3.add(rectangle);
        Integer sides = 0;
        Integer itr3 = 0;
        Shape maxsides = null;
        for (Shape s : list3) {
            if (itr3 ==0){
                sides = s.sides();
                maxsides = s;
            }

            if (sides> s.sides()) {
                continue;

            }else {
                sides = s.sides();
                maxsides = s;
            }
            itr3++;
        }
        System.out.println("The maximum sides of a square is "+ maxsides.sides());









    }


    }

















