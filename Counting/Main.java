#include<iostream>
#include<string>
using namespace std;
int main()
{
  //Type your code here.
  string s;
  getline(cin,s);
  int v=0,c=0,dg=0,sy=0,sp=0;
  for(int i=0;i<s.length();i++)
  {
    if((s[i]>='a' && s[i]<='z')||(s[i]>='A' && s[i]<='Z')){
      if(s[i]=='a' || s[i]=='e' || s[i]=='i' || s[i]=='o' || s[i]=='u' || 
         s[i]=='A' || s[i]=='E' || s[i]=='I' ||s[i]=='O' || s[i]=='U'){
         v++;
      }
      else{
        c++;
      }
    }
    else if(s[i]>='0' && s[i]<='9'){
      dg++;
    }
     else if(s[i]==' ')
             sp++;
     else
          sy++;
      }
  cout<<"Vowels:"<<v<<"\nConsonants:"<<c;
  cout<<"\nWhite Spaces:"<<sp;
  cout<<"\nDigits:"<<dg;
  cout<<"\nSymbols:"<<sy;
  return 0;
    }