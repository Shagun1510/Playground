#include<iostream>
#include<string>
using namespace std;
int main()
{
  string a,b;
  getline(cin,a);
  getline(cin,b);
  char rev[a.length()];
  int k=0;
  for(string::reverse_iterator i = a.rbegin();i<a.rend();i++)
  {
  		rev[k++]=*i;
    	
  }
  rev[k]='\0';
  string s(rev);
  if(rev==b)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}