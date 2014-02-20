//============================================================================
// Name        : stack.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

class Stack
{
	int a[5];
	int top;

public:
	void push(int);
	void pop();
	void display();
	void topofstack();

	Stack()
	{
		top=-1;
	}

};

void Stack::push(int x){
	if(top==4)
	{cout<<"stack overflow";

	}
	else
	{
		top++;
		a[top]=x;
	}


}
void Stack::pop()
{
	if(top==-1)
{cout<<"Stack underflow";
}
	else
		top--;
}

void Stack::display()
{
	cout<<"The current stack is\n";
	for(int i=0;i>=top;i--)
	{
		cout<<a[i]<<"\n";


	}
}

void Stack::topofstack()
{
	 cout<<"The element on top of the stack is:";
	 cout<<a[top];
	}


int main() {
	Stack s;
	cout << "Stack:" << endl;
//s.push(67);
//s.push(56);
//s.push(34);
//s.push(78);
//s.display();
//s.pop();
//s.display();
//s.pop();
//s.display();
//s.topofstack();
//s.pop();
//s.display();

	return 0;
}
