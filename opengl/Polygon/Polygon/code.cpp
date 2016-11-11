#include <iostream>
#include <math.h>
#include <glut.h>
using namespace std;

int X1,Y1,X2,Y2;
float x,y,dx,dy,len,p,q;
int s1,s2,inter,e;
int n, point[10][2];

int sign(double x)
{
    if(x==0)
        return 0;
    else if(x<0)
        return -1;
    else
        return 1;
}

void simple(void)
{
    glClear(GL_COLOR_BUFFER_BIT);
	glColor3f(1.0f, 0.0f, 0.0f); 
	for(int k=0; k<n; k++)
	{
		X1 = point[k][0];
		Y1 = point[k][1];
		X2 = point[(k+1)%n][0];
		Y2 = point[(k+1)%n][1];
		glColor3f(1.0f, 0.0f, 0.0f); 
		if(abs(X2-X1) > abs(Y2-Y1))
			len = abs(X2-X1);
		else
			len = abs(Y2-Y1);
		dx = (X2-X1)/len;
		dy = (Y2-Y1)/len;
		x = X1+0.5*sign(dx);
		y = Y1+0.5*sign(dy);  
    int i=1;
    glBegin(GL_POINTS);
    while(i<=len)
    {
        glVertex2d(x,y);
        x=x+dx;
        y=y+dy;
        i=i+1;
    }
	}
    glEnd();
    glFlush();
}

void dotted(void)
{
    glClear(GL_COLOR_BUFFER_BIT);
    glColor3f(1.0f, 0.0f, 0.0f); 
    
	for(int k=0; k<n; k++)
	{
		X1 = point[k][0];
		Y1 = point[k][1];
		X2 = point[(k+1)%n][0];
		Y2 = point[(k+1)%n][1];
		glColor3f(1.0f, 0.0f, 0.0f); 
		if(abs(X2-X1) > abs(Y2-Y1))
			len = abs(X2-X1);
		else
			len = abs(Y2-Y1);
		dx = (X2-X1)/len;
		dy = (Y2-Y1)/len;
		x = X1+0.5*sign(dx);
		y = Y1+0.5*sign(dy);int i=1;
    glBegin(GL_POINTS);
    while(i<=len)
    {
        if(i%2==0)
            glVertex2d(x,y);
        x=x+dx;
        y=y+dy;
        i=i+1;
    }
	}
    glEnd();
    glFlush();
}

void dashed(void)
{
    glClear(GL_COLOR_BUFFER_BIT);
	glColor3f(1.0f, 0.0f, 0.0f);
	for(int k=0; k<n; k++)
	{
		X1 = point[k][0];
		Y1 = point[k][1];
		X2 = point[(k+1)%n][0];
		Y2 = point[(k+1)%n][1];
		glColor3f(1.0f, 0.0f, 0.0f); 
		if(abs(X2-X1) > abs(Y2-Y1))
			len = abs(X2-X1);
		else
			len = abs(Y2-Y1);
		dx = (X2-X1)/len;
		dy = (Y2-Y1)/len;
		x = X1+0.5*sign(dx);
		y = Y1+0.5*sign(dy);   
		int i=1;
		glBegin(GL_POINTS);
		while(i<=len)
		{
			if(i%7!=0)
				glVertex2d(x,y);
			x=x+dx;
			y=y+dy;
			i=i+1;
		}
	}
    glEnd();
    glFlush();
}

void thick(void)
{
    glClear(GL_COLOR_BUFFER_BIT);
    glColor3f(1.0f, 0.0f, 0.0f); 
    for(int k=0; k<n; k++)
	{
		X1 = point[k][0];
		Y1 = point[k][1];
		X2 = point[(k+1)%n][0];
		Y2 = point[(k+1)%n][1];
		glColor3f(1.0f, 0.0f, 0.0f); 
		if(abs(X2-X1) > abs(Y2-Y1))
			len = abs(X2-X1);
		else
			len = abs(Y2-Y1);
		dx = (X2-X1)/len;
		dy = (Y2-Y1)/len;
		x = X1+0.5*sign(dx);
		y = Y1+0.5*sign(dy);
	int i=1;
    glBegin(GL_POINTS);
    while(i<=len)
    {        
        glVertex2d(x,y);
        p=y+1;
        q=y-1;
        glVertex2d(x,p);
        glVertex2d(x,q);
        x=x+dx;
        y=y+dy;
        i=i+1;
    }
	}
    glEnd();
    glFlush();
}

void Init()
{ 
    glClearColor(1.0,1.0,1.0,0); 
    glColor3f(1.0,0.0,0.0); // red
    glViewport(0 , 0 , 640 , 480);
    glMatrixMode(GL_PROJECTION);
    glLoadIdentity();
    gluOrtho2D(0 , 640 , 0 , 480);
}

int main(int argc, char **argv)
{
    int ch;
    glutInit(&argc,argv); 
    glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB); 
    glutInitWindowSize(640,480); 
    glutInitWindowPosition(0,0);
	cout<<"\nEnter no of vertices: ";
	cin>>n;
	cout<<"Enter Points:-\n";
	for(int i=0; i<n; i++)
	{
		cin>>point[i][0];
		cin>>point[i][1];
	}
	cout<<"\n1.Simple Line   2. Dotted Line   3.Dashed Line   4.Thick Line"<<endl<<": ";
    cin>>ch;
	glutCreateWindow("Polygon");
    Init();
	switch(ch)
    {
        case 1:glutDisplayFunc(simple); 
                break;
        case 2:glutDisplayFunc(dotted);   
                break;
        case 3: glutDisplayFunc(dashed);
                break;
        case 4: glutDisplayFunc(thick);
				break;
        default:cout<<"\n\n\tWrong Choice !!!";
    }
    glutMainLoop();
    return 0;
}