#include<iostream>
using namespace std;
int main()
{
	int a[30],i=0,odd=1;
	float score=0;
 while(odd!=4)
 {
   cin>>a[i];
   if(a[i]>0)
   {
   	
   	 if(a[i]%2!=0){//odd
   	   score += 1;
   	    odd++;
   	    i++;
   	    continue;
   	}
   	else{
	   
	   score -= 0.5;
	    i++;
   	    continue;   
   }
   	
   	
   	
   }
   else{
   	score-=1;
   	break;
   	
   }   	
 	
 	
 }
 
 cout<<score;
}