package com.tco.challenges;

/**
 * Created by atp3rxk on 1/25/2017.
 */

/**
 * Problem Statement

 You are working in an advertising agency. There are 100 billboards owned by your agency, numbered from 1 to 100.

 You clients send you requests, one after another. Each request is the number of the billboard on which the client would like to place his advertisement.

 Initially all billboards are empty. Each time you receive a request, you act as follows. If the corresponding billboard is empty, you satisfy the request and occupy the billboard with the client's advertisement. If the corresponding billboard is occupied, you reject the request.

 You are given a int[] requests containing the requests in the order you receive them. Return the number of rejected requests.


 Definition

 Class:	AdvertisingAgency
 Method:	numberOfRejections
 Parameters:	int[]
 Returns:	int
 Method signature:	int numberOfRejections(int[] requests)
 (be sure your method is public)


 Constraints
 -	requests will contain between 1 and 50 elements, inclusive.
 -	Each element of requests will be between 1 and 100, inclusive.
 */
public class AdvertisingAgency {

    private int[] advertiseLog = new int[100];
    public int numberOfRejections(int[] requests){

        return 0;
    }


}
