#include<iostream>
#include<math.h>
#include<GL/glut.h>

using namespace std;

unsigned char pixel[3];
int point[10][2];
float fr,len,X,Y,DX,DY;
int n,I,i,minx,maxx,temp,p,x,y,cnt,flag;

int sign(float f)
{
	if(f==0)
		return f;
	else if(f>0)
		return 1;
	else
		return -1;
}

void dda(int X1,int Y1,int X2,int Y2)
{
	if(abs(X2-X1) >= abs(Y2-Y1))
		len=abs(X2-X1);
	else
		len=abs(Y2-Y1);
	DX=(X2-X1)/len;
	DY=(Y2-Y1)/len;
	X=X1+(0.5*sign(DX));
	Y=Y1+(0.5*sign(DY));
	for(I=1;I<=len;I++)
	{
		glColor3f(0.0f,0.0f,0.0f);
		glBegin(GL_POINTS);
		glVertex2d(X,Y);
		glEnd();
		glFlush();
		X=X+DX;
		Y=Y+DY;
	}
}

void seedfill(int x,int y)
{
	
	glColor3f(1.0f,0.0f,0.0f);
	glBegin(GL_POINTS);
	glVertex2d(x,y);
	glEnd();
	
	glReadPixels(x+1,y,1,1,GL_RGB,GL_UNSIGNED_BYTE,pixel);
	if((int)pixel[0]==255 && (int)pixel[1]==255 && (int)pixel[2]==255)
		seedfill(x+1,y);
	
	glReadPixels(x,y+1,1,1,GL_RGB,GL_UNSIGNED_BYTE,pixel);
	if((int)pixel[0]==255 && (int)pixel[1]==255 && (int)pixel[2]==255)
		seedfill(x,y+1);
	
	glReadPixels(x-1,y,1,1,GL_RGB,GL_UNSIGNED_BYTE,pixel);
	if((int)pixel[0]==255 && (int)pixel[1]==255 && (int)pixel[2]==255)
		seedfill(x-1,y);
	
	glReadPixels(x,y-1,1,1,GL_RGB,GL_UNSIGNED_BYTE,pixel);
	if((int)pixel[0]==255 && (int)pixel[1]==255 && (int)pixel[2]==255)
		seedfill(x,y-1);
	
	glFlush();
}

void draw(void)
{
	glClear(GL_COLOR_BUFFER_BIT);
	glColor3f(0.0,0.0,0.0);//black
	glBegin(GL_POINTS);
	for(i=0;i<n;i++)
	{
		fr=(i+1)% n;
		temp=(int)fr;
		dda(point[i][0],point[i][1],point[temp][0],point[temp][1]);		
	}
	cout<<"\nEnter the seed pixel: ";
	cin>>x>>y;

	//Inside-Outside Test
	for(i=x; i>=minx; i--)
	{
		glReadPixels(i,y,1,1,GL_RGB,GL_UNSIGNED_BYTE,pixel);
		if((int)pixel[0]==0 && (int)pixel[1]==0 && (int)pixel[2]==0)
			cnt++;
	}
	if(cnt%2==0)
		cout<<"\nThe pixel is outside";
	else
	{
		cout<<"\nThe pixel is inside";
		flag=1;
	}
	if(flag==1)
		seedfill(x,y);
	glEnd();
	glFlush();
}

void Init()
{
	glClearColor(1.0,1.0,1.0,0); 
	glColor3f(1.0,0.0,0.0);
	glViewport(0 , 0 , 640 , 480);
	glMatrixMode(GL_PROJECTION);
	glLoadIdentity();
	gluOrtho2D(0 , 640 , 0 , 480);
}

int main(int argc, char **argv)
{
	glutInit(&argc,argv); 
	glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB); 
	glutInitWindowSize(640,480); 
	glutInitWindowPosition(0,0); 
	glutCreateWindow("SEEDFILL");
	Init();
	cout<<"Enter the number of vertices: ";
	cin>>n;
	for(i=0;i<n;i++)
	{
		cout<<"Enter the "<<i+1<<" point: ";
		cin>>point[i][0];
		cin>>point[i][1];
	}
	int z;
	minx=640;
	maxx=0;
	for(z=0;z<n;z++)
	{
		if(point[z][0]<=minx)
			minx=point[z][0];
		if(point[z][0]>=maxx)
			maxx=point[z][0];
	}
	glutDisplayFunc(draw); 
	glutMainLoop(); 
	return 0;
}