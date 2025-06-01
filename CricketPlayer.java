/*Slip - 2 and Slip - 18
Q.2) Define a class CricketPlayer (name,no_of_innings,no_of_times_notout, totalruns, 
bat_avg). Create an array of n player objects .Calculate the batting average for each player
using static method avg(). Define a static sort method which sorts the array on the basis 
of average. Display the player details in sorted order.*/

import java.util.*;
class CricketPlayer
{
     int innings,notout,totalruns;
     float batavg;
     String name;
     void accept()
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Name : ");
         name=sc.next();
         System.out.println("Enter No. of Innings : ");
         innings=sc.nextInt();
         System.out.println("Enter No. of Notout : ");
         notout=sc.nextInt();
         System.out.println("Enter Total Runs : ");
         totalruns=sc.nextInt();
         batavg=avg(totalruns,innings,notout);
     }
     static float avg(int totalruns,int innings,int notout)
     {
         return totalruns/(innings-notout);
     }
     static void sort(CricketPlayer ob[],int n)
     {
         int pass,i;
         for(pass=1; pass<n; pass++)
         {
              for(i=0; i<n-pass; i++)
              {
                  if(ob[i].batavg<ob[i+1].batavg)
                  {
                      CricketPlayer t=ob[i];
                      ob[i]=ob[i+1];
                      ob[i+1]=t;
                  }
              }
         }
         System.out.println("\nName\t"+"Total Runs\t"+"Innings\t\t"+"Notout\t\t"+"Bat Average");
         for(i=0; i<n; i++)
         {
            System.out.println(ob[i].name+"\t\t\t"+ob[i].totalruns+"\t\t\t"+ob[i].innings+"\t\t\t"+ob[i].notout+"\t\t\t"+ob[i].batavg+"\n");
         }
     }
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Limit : ");
         int n=sc.nextInt();
         CricketPlayer ob[]=new CricketPlayer[n];
         System.out.println("Enter n Players Information : \n");
         for(int i=0; i<n; i++)
         {
             ob[i]=new CricketPlayer();
             ob[i].accept();
         }
         sort(ob,n);
     }
}