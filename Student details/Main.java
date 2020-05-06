#include<iostream>
#include<algorithm>
using namespace std;
struct Student{
char name[30];
char department[20];
int yearOfStudy;
float cgpa;
};
bool compareStudents(Student a, Student b){
	return a.name<b.name;
}

int main()
{
  //Type your code here.
  int n;
  cout<<"Enter the number of students\n";
  cin>>n;
  struct Student s[n];
  for(int i=0;i<n;i++){
  	cout<<"Enter the details of student "<<i+1<<"\n";
    cout<<"Enter name\n";
    cin>>s[i].name;
    cout<<"Enter department\n";
    cin>>s[i].department;
    cout<<"Enter year of study\n";
    cin>>s[i].yearOfStudy;
    cout<<"Enter cgpa\n";
    cin>>s[i].cgpa;
  }
  sort(s,s+n,compareStudents);
  cout<<"Details of students\n";
  for(int i=0;i<n;i++){
  cout<<"Student "<<i+1<<"\n";
    cout<<"Name:"<<s[i].name<<"\n";
    cout<<"Department:"<<s[i].department<<"\n";
    cout<<"Year of study:"<<s[i].yearOfStudy<<"\n";
    cout<<"CGPA:"<<s[i].cgpa<<"\n";
  }
}