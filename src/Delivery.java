import java.util.Scanner ;
import java.io.InputStream;

public class Delivery
{
    public static void main(String[] args) {
        order(System.in);
    }

    public static double order(InputStream in)
    {
        Scanner keyboard = new Scanner(in);

        System.out.println("Welcome to Chick-fil-A! \nCheck out our Menu!!!!");
        System.out.println("1. Fries $1.99, 2. Chicken Nuggets 8 pieces $2.99, 3. Chicken Nuggets 12 pieces  $3.99, 4. Chicken Burger $4.99  ");
        double first_cost = 0;
        double second_cost = 0;
        double delivery = 5.99;
        double fries = 1.99;
        double chiceknugeight = 2.99;
        double chickenugtw = 3.99;
        double chickensn = 4.99;
        double second_tip = 0;
        double tipcost = 0;
        double last = 0;
        double firs_tax = 0;
        boolean cond = true;

        while (cond)
        {
            System.out.println("Please type the number next to the order you want,\n then type the letter p to proceed to check out.");
            String item_answer = keyboard.nextLine();
            if (item_answer.equals("1"))
            {
                first_cost = second_cost + fries;
            }
            else if (item_answer.equals("2"))
            {
                first_cost = second_cost + chiceknugeight;
            }
            else if (item_answer.equals("3"))
            {
                first_cost = second_cost + chickenugtw;
            }
            else if (item_answer.equals("4"))
            {
                first_cost = second_cost + chickensn;
            }

            else if (item_answer.equals("p"))
            {
                Scanner second_keyboard = new Scanner(System.in);

                System.out.println("Delivery costs $5.99. Do you want us to deliver your order?\n" +
                        " Please type y for yes and n for no.");

                String delivery_answer = second_keyboard.nextLine();

                if (delivery_answer.equals("n"))
                {
                    double another_tax = (first_cost * 0.10);
                    last = first_cost + another_tax;
                    System.out.println("Your final cost for the order is: $" + first_cost +
                            "The tax in your order is $" + another_tax + "\n" + ".  So the total is: $" + (last));
                }

                else if (delivery_answer.equals("y"))

                {
                    Scanner third_keyboard = new Scanner((System.in));

                    System.out.println("Do you want to add a tip for the driver?\n" +
                            " Please type y for yes and n for no");
                    String tip_answer = third_keyboard.nextLine();


                    if (tip_answer.equals("y"))
                    {
                        System.out.println("Please choose a number from 1 to 7 for the tip percentage\n" +
                                "1. 10%, 2. 15%, 3. 20%, 4. 25%, 5. 30%, 6. 35%, 7. 40%");

                        String tip = third_keyboard.nextLine();

                        if (tip.equals("1"))
                        {
                            second_tip = (first_cost + delivery) * 0.10;
                            tipcost = first_cost + second_tip;
                            System.out.println("The tip is: $" + second_tip);

                        }

                        if (tip.equals("2"))
                        {
                            second_tip = (first_cost + delivery) * 0.15;
                            tipcost = first_cost + second_tip;
                            System.out.println("The tip is: $" + second_tip);
                        }

                        if (tip.equals("3"))
                        {
                            second_tip = (first_cost + delivery) * 0.20;
                            tipcost = first_cost + second_tip;
                            System.out.println("The tip is: $" + second_tip);
                        }
                        if (tip.equals("4"))

                        {
                            second_tip = (first_cost + delivery) * 0.25;
                            tipcost = first_cost + second_tip;
                            System.out.println("The tip is: $" + second_tip);

                        }

                        if (tip.equals("5"))
                        {
                            second_tip = (first_cost + delivery) * 0.30;
                            tipcost = first_cost + second_tip;
                            System.out.println("The tip is: $ " + second_tip);
                        }
                        if (tip.equals("6"))

                        {
                            second_tip = (first_cost + delivery) * 0.35;
                            tipcost = first_cost + second_tip;
                            System.out.println("The tip is: $" + second_tip);
                        }

                        if (tip.equals("7"))
                        {
                            second_tip = (first_cost +delivery) * 0.40;
                            tipcost = first_cost + second_tip;
                            System.out.println("The tip is: $" + second_tip);
                        }

                        firs_tax = (first_cost +delivery)* 0.10;
                        double tipdelivcost = tipcost + delivery;
                        last = (firs_tax + tipdelivcost);
                        System.out.println("Your final cost for the order is: $" + tipdelivcost +
                                ". The tax in your order is $" + firs_tax + ".  So the total is: $" + (firs_tax + tipdelivcost));

                    }
                    else if (tip_answer.equals("n"))
                    {
                        double notip = (first_cost + delivery);
                        double notiptax = (notip*0.10);
                        last = (notiptax+notip);
                        System.out.println("Your final cost for the order is: $" + notip +
                                ". The tax in your order is $" + notiptax + ".  So the total is: $" + (last));

                    }
                    else
                    {
                        return -1;
                    }



                    cond = false;
                }

                else
                {
                    return -1;
                }
            }
            // I tried to do an else statement to return -1 but the code would always terminate

        }
        return last ;
    }
}