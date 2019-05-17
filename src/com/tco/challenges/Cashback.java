package com.tco.challenges;

/**
 * Created by atp3rxk on 1/31/2017.
 */
/**
*
* Problem Statement
    	You have n credit cards, numbered 0 through n-1. Each credit card has some limit. For example, if the limit on one of the cards is $50, the sum of amounts paid using the card cannot exceed $50. You are given the limits in the int[] limit with n elements. In addition to those n cards, you have an unlimited supply of cash money.



You have to make m transactions, numbered 0 through m-1. You are given the amounts to pay in the int[] amount with m elements.



Some of your cards may offer cashback when used for some types of transaction. Cashback means that the credit card company will pay you back some percentage of the amount you paid. For example, if you pay $1000 using a card that offers 1% cashback, the credit card company will pay you back $1000 * 1% = $1000 * 0.01 = $10.



Note that the cashback payments don't influence the limits on the cards. Continuing the above example, suppose that the card you used to make that payment had a limit of $1000. Even though you did get the $10 cashback, the card is still maxed out: you have reached the limit on the card and you cannot use it to make additional payments. (E.g., you may imagine that the $10 cashback is a check you'll only receive at the end of the month.)



You are given a int[] rate. For each i and j, the value rate[i*m+j] is the cashback rate in percent you'll get if you use card i to pay any amount towards transaction j.



Each transaction can be split between arbitrarily many cards and a cash payment. For example, you may pay one transaction of $1000 as follows:



Pay $100 using a card that gives you 7% cashback for this transaction type. Get $7 cashback.
Pay $510 using a card that only gives you 1% cashback. Get $5.10 cashback.
Pay the remaining $390 in cash. There is no cashback for cash payments.
Please compute and return the maximal total amount of cashback you can get.

Definition

Class:	Cashback
Method:	findMax
Parameters:	int[], int[], int[]
Returns:	double
Method signature:	double findMax(int[] limit, int[] rate, int[] amount)
(be sure your method is public)


Notes
-	Your return value must have absolute or relative error less than 1e-9.

Constraints
-	n, m will be between 1 and 20, inclusive.
-	limit will contain exactly n elements.
-	Each element in limit will be between 1 and 1,000, inclusive.
-	rate will contain exactly n*m elements.
-	Each element in rate will be between 0 and 100, inclusive.
-	amount will contain exactly m elements.
-	Each element in amount will be between 1 and 1,000, inclusive.

Examples
0)

{1000,1000}
{1,2}
{58}
Returns: 1.16
You have two cards, each with a limit of $1000. There is a single transaction: you are supposed to pay $58. Your card 0 offers you 1% cashback, and your card 1 offers you 2% cashback. The optimal solution is to use card 1 to pay the whole amount and to get $58 * 2% = $1.16.
1)

{1,2}
{1,2}
{58}
Returns: 0.05
In this example we have the same transaction and the same cashback rates as in Example 0, but now your credit card limits are very low. The optimal solution is to pay as much as you can: $1 using card 0, $2 using card 1, and the rest in cash. The total amount of cashback will be $1 * 1% + $2 * 2%.
2)

{100,100}
{0,5,
 5,0}
{10,10}
Returns: 1.0
Here you should use each card on the transaction where you get some cashback: use card 0 to pay the entire $10 for transaction 1, and use card 1 to pay $10 for transaction 0.
3)

{7,8,9}
{2, 3, 1,
 5, 7, 10,
 7, 6, 8}
{20, 30, 40}
Returns: 1.73
4)

{12,34,56,78,910}
{100, 100, 0, 0, 0,
 0, 100, 100, 0, 0,
 0, 0, 100, 100, 0,
 0, 0, 0, 100, 100,
 100, 0, 0, 0, 100}
{111,111,111,111,111}
Returns: 402.0
 */
public class Cashback {
}
