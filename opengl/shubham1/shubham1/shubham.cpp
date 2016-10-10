#include<iostream>
#include<gl/glut.h>
#include<Windows.h>

using namespace std;

int l,m,n;

class Point
{
public:
	int x,y;
public:
	Point()
	{}
	Point(const Point &p)
	{
		x=p.x;
		y=p.y;
	}
	Point(int a,int b)
	{
		x=a;
		y=b;
	}
	void setValue(int a,int b)
	{
		x=a;
		y=b;
	}
	void display()
	{
		cout<<"("<<x<<","<<y<<")"<<endl;
	}
};

Point v[10],seed,bv[500];

class Stack
{
public:
	Point pixel[10000];
	int top;
public:
	Stack()
	{
		top=-1;
	}
	void push(Point p)
	{
		top=top+1;
		//cout<<"Pushed top="<<top<<endl;
		pixel[top]=p;
	}
	Point pop()
	{
		Point ret(pixel[top]);
		top=top-1;
		//cout<<"Popped top="<<top<<endl;
		return ret;
	}
	bool isEmpty()
	{
		if(top==-1)
			return true;
		else
			return false;
	}
};

Stack s;

void Init()
{ 
	glClearColor(1.0,1.0,1.0,0); 
	glColor3f(1.0,0.0,0.0); // red
	glViewport(0 , 0 , 640 , 480);
	glMatrixMode(GL_PROJECTION);
	glLoadIdentity();
	gluOrtho2D(0 , 640 , 0 , 480);
}

int sign(double x)
{
	if(x==0)
		return 0;
	else if(x<0)
		return -1;
	else
		return 1;
}

bool isEqual(Point p1,Point p2)
{
	if((p1.x==p2.x) && (p1.y==p2.y))
		return true;
	else
		return false;
}

bool isFilled(Point p)
{
	unsigned char pixel[4];
	glReadPixels(p.x,p.y,1,1,GL_RGB,GL_UNSIGNED_BYTE,pixel);
	int r=(int)pixel[0],g=(int)pixel[1],b=(int)pixel[2];
	//cout<<"r="<<r<<"g="<<g<<"b="<<b<<endl;
	if((r==255)&&(g==255)&&(b==255))
		return false;
	else
		return true;
}

bool isBV(Point p)
{
	int flag=0;
	for(int i=0;i<l;i++)
	{
		if(isEqual(p,bv[i]))
		{
			flag=1;
			break;
		}
	}
	if(flag==1)
		return true;
	else
		return false;
}

void SeedFillAlgorithm()
{
	glClear(GL_COLOR_BUFFER_BIT);
	glColor3f(0.0f, 0.0f, 0.0f);

	l=0;

	for(int k=0;k<n;k++)
	{
		int x,y,dx,dy,len;
		int s1,s2,inter,e;
		x=v[k].x;
		y=v[k].y;
		//cout<<x<<","<<y<<endl;
		dx=abs(v[(k+1)%n].x-v[k].x);
		dy=abs(v[(k+1)%n].y-v[k].y);
		s1=sign(v[(k+1)%n].x-v[k].x);
		s2=sign(v[(k+1)%n].y-v[k].y);
		if(dy>dx)
		{
			inter=1;
			int temp=dx;
			dx=dy;
			dy=temp;
		}
		else
			inter=0;
		e=2*dy-dx;

		for(int i=1;i<=dx;i++)
		{
		    glBegin(GL_POINTS);
			glVertex2d(x,y);
			bv[l].setValue(x,y);
			l++;
			//cout<<"top="<<s.top<<endl;
			glEnd();
			while(e>0)
			{
				if(inter==1)
					x=x+s1;
				else
					y=y+s2;
				e=e-2*dx;
			}
			if(inter==1)
				y=y+s2;
			else
				x=x+s1;
			e=e+2*dy;
		}
	}

	Point p(seed);
	s.push(p);

	while(!s.isEmpty())
	{
		p=s.pop();

		//cout<<"Popped-";
		//p.display();

		if(!isFilled(p))
		{
			glBegin(GL_POINTS);
			glVertex2d(p.x,p.y);
			glEnd();
			//Sleep(10);
		}

		Point p1(p.x+1,p.y);
		if(!isFilled(p1) && !isBV(p1))
			s.push(p1);

		Point p2(p.x,p.y+1);
		if(!isFilled(p2) && !isBV(p2))
			s.push(p2);

		Point p3(p.x-1,p.y);
		if(!isFilled(p3) && !isBV(p3))
			s.push(p3);

		Point p4(p.x,p.y-1);
		if(!isFilled(p4) && !isBV(p4))
			s.push(p4);
	}

	glFlush();

}

int main(int argc, char **argv)
{
glutInit(&argc,argv); 
glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB); 
glutInitWindowSize(640,480); 
glutInitWindowPosition(0,0); 
glutCreateWindow("Seed Fill Algorithm"); 
Init();
cout<<"Enter no of edges:"<<endl;
cin>>n;
cout<<"Enter points:"<<endl;
for(int i=0;i<n;i++)
	cin>>v[i].x>>v[i].y;
cout<<"Enter seed pixel:"<<endl;
cin>>seed.x>>seed.y;
glutDisplayFunc(SeedFillAlgorithm);
glutMainLoop();
return 0;
}