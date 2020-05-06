#include<iostream>
using namespace std;
int main()
{
  int a = 3,b=4,x,y;
  cin>>x>>y;
  int jump;
  if((x-a)<(y-b))
    cout<<y-b;
  else
    cout<<x-a;
}