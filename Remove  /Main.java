#include<iostream>
#include<string>
using namespace std;
int main()
{
  //Type your code here.
  string s;
  getline(cin,s);
  int p = s.find("the");
  while(p!=string::npos)
  {
  s.erase(p,4);
  p=s.find("the");
  }
  cout<<s;
  return 0;
}