#include<iostream> 
#include<cmath>
int main()
{
	int m,n,req,a;
  std::cin>>m;
  std::cin>>n;
  std::cin>>req;
  a=pow(m,n);
  if(a>=req)
  {
  	std::cout<<"Doctor, you can proceed with your experiment.";
  }
  else
  {
  	std::cout<<"Sorry Doctor! You need more bacteria.";
  }
}