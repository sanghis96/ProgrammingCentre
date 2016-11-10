#include <iostream>
#include <math.h>
#include <GL/glut.h>
using namespace std;

int xmin,ymin,xmax,ymax,x1,Y1,x2,y2,xm,ym,txm,tym,tx2,ty2,tx1,tY1,p3[4],ix1,ix2,iY1,iy2;
int p1[4]={0,0,0,0};
int p2[4]={0,0,0,0};
void outcode(int a,int b,int c[4])
{
	if(a<xmin)
		c[3]=1;
	if(a>xmax)
		c[2]=1;
	if(b<ymin)
		c[1]=1;
	if(b>ymax)
		c[0]=1;



}
void Primitives(void)
{
glClear(GL_COLOR_BUFFER_BIT);
glColor3f(0.0f, 1.0f, 0.0f); // green 

glBegin(GL_LINE_LOOP);
glVertex2i(xmin,ymin);
glVertex2i(xmax,ymin);
glVertex2i(xmax,ymax);
glVertex2i(xmin,ymax);
glEnd();
glBegin(GL_LINES);
glVertex2i(x1,Y1);
glVertex2i(x2,y2);
glEnd();
outcode(x1,Y1,p1);
outcode(x2,y2,p2);
if((p1[0]*p2[0]==0)&&(p1[1]*p2[1]==0)&&(p1[2]*p2[2]==0)&&(p1[3]*p2[3]==0))
{
	printf("point is partially visible\n");
	ix1=x1;
	ix2=x2;
	iY1=Y1;
	iy2=y2;
	xm=(x1+x2)/2;
	ym=(Y1+y2)/2;
	txm=xm;
	tym=ym;
	tx1=x1;
	tY1=Y1;
	tx2=x2;
	ty2=y2;
	x2=xm;
	y2=ym;
if((p2[0]==1)||(p2[1]==1)||(p2[2]==1)||(p2[3]==1))
{	
	if(p1[3]==1)
	{
		while(xm!=xmin)
		{	
			p3[0]=0;
			p3[1]=0;
			p3[2]=0;
			p3[3]=0;
			xm=(x1+x2)/2;
			ym=(Y1+y2)/2;
			printf("%d  %d | %d %d -> %d %d\n",x1,Y1,x2,y2,xm,ym);
			outcode(xm,ym,p3);
			if((p3[0]==0)&&(p3[1]==0)&&(p3[2]==0)&&(p3[3]==0))
			{
				x2=xm;
				y2=ym;
			}
			else
			{
				x1=xm;
				Y1=ym;

			}

		}
		if((ym<ymax)&&(ym>ymin))
		{
			ix1=xm;
			iY1=ym;
		}
	}
	x1=tx1;
	Y1=tY1;
	xm=txm;
	ym=tym;
	x2=xm;
	y2=ym;
	if(p1[2]==1)
	{
		while(xm!=xmax)
		{	p3[0]=0;
			p3[1]=0;
			p3[2]=0;
			p3[3]=0;
			xm=(x1+x2)/2;
			ym=(Y1+y2)/2;
			printf("%d  %d | %d %d -> %d %d\n",x1,Y1,x2,y2,xm,ym);
			outcode(xm,ym,p3);
			if((p3[0]==0)&&(p3[1]==0)&&(p3[2]==0)&&(p3[3]==0))
			{
				x2=xm;
				y2=ym;
			}
			else
			{
				x1=xm;
				Y1=ym;

			}

		}
		if((ym<ymax)&&(ym>ymin))
		{
			ix1=xm;
			iY1=ym;
		}
	}
	x1=tx1;
	Y1=tY1;
	xm=txm;
	ym=tym;
	x2=xm;
	y2=ym;
	if(p1[1]==1)
	{
		while(ym!=ymin)
		{	p3[0]=0;
			p3[1]=0;
			p3[2]=0;
			p3[3]=0;
			xm=(x1+x2)/2;
			ym=(Y1+y2)/2;
			printf("%d  %d | %d %d -> %d %d\n",x1,Y1,x2,y2,xm,ym);
			outcode(xm,ym,p3);
			if((p3[0]==0)&&(p3[1]==0)&&(p3[2]==0)&&(p3[3]==0))
			{
				x2=xm;
				y2=ym;
			}
			else
			{
				x1=xm;
				Y1=ym;

			}

		}
		if((xm>xmin)&&(xm<xmax))
		{
			ix1=xm;
			iY1=ym;
		}
	}
	x1=tx1;
	Y1=tY1;
	xm=txm;
	ym=tym;
	x2=xm;
	y2=ym;
	if(p1[0]==1)
	{
		while(ym!=ymax)
		{	p3[0]=0;
			p3[1]=0;
			p3[2]=0;
			p3[3]=0;
			xm=(x1+x2)/2;
			ym=(Y1+y2)/2;
			printf("%d  %d | %d %d -> %d %d\n",x1,Y1,x2,y2,xm,ym);
			outcode(xm,ym,p3);
			if((p3[0]==0)&&(p3[1]==0)&&(p3[2]==0)&&(p3[3]==0))
			{
				x2=xm;
				y2=ym;
			}
			else
			{
				x1=xm;
				Y1=ym;

			}

		}
		if((xm>xmin)&&(xm<xmax))
		{
			ix1=xm;
			iY1=ym;
		}
	}
}
if(p1[0]!=0||p1[1]!=0||p1[2]!=0||p1[3]!=0)
{
	
	x1=tx2;
	Y1=ty2;
	x2=txm;
	y2=tym;
	if(p2[3]==1)
	{	
		while(xm!=xmin)
		{	
			p3[0]=0;
			p3[1]=0;
			p3[2]=0;
			p3[3]=0;
			xm=(x1+x2)/2;
			ym=(Y1+y2)/2;
			printf("%d  %d | %d %d -> %d %d\n",x1,Y1,x2,y2,xm,ym);
			outcode(xm,ym,p3);
			if((p3[0]==0)&&(p3[1]==0)&&(p3[2]==0)&&(p3[3]==0))
			{
				x2=xm;
				y2=ym;
			}
			else
			{
				x1=xm;
				Y1=ym;

			}

		}
		if((ym<ymax)&&(ym>ymin))
		{
			ix2=xm;
			iy2=ym;
		}
	}
	x1=tx2;
	Y1=ty2;
	x2=txm;
	y2=tym;
	if(p2[2]==1)
	{
		while(xm!=xmax)
		{	p3[0]=0;
			p3[1]=0;
			p3[2]=0;
			p3[3]=0;
			xm=(x1+x2)/2;
			ym=(Y1+y2)/2;
			printf("%d  %d | %d %d -> %d %d\n",x1,Y1,x2,y2,xm,ym);
			outcode(xm,ym,p3);
			if((p3[0]==0)&&(p3[1]==0)&&(p3[2]==0)&&(p3[3]==0))
			{
				x2=xm;
				y2=ym;
			}
			else
			{
				x1=xm;
				Y1=ym;

			}

		}
		if((ym<ymax)&&(ym>ymin))
		{
			ix2=xm;
			iy2=ym;
		}
	}
	x1=tx2;
	Y1=ty2;
	x2=txm;
	y2=tym;
	if(p2[1]==1)
	{
		while(ym!=ymin)
		{	p3[0]=0;
			p3[1]=0;
			p3[2]=0;
			p3[3]=0;
			xm=(x1+x2)/2;
			ym=(Y1+y2)/2;
			printf("%d  %d | %d %d -> %d %d\n",x1,Y1,x2,y2,xm,ym);
			outcode(xm,ym,p3);
			if((p3[0]==0)&&(p3[1]==0)&&(p3[2]==0)&&(p3[3]==0))
			{
				x2=xm;
				y2=ym;
			}
			else
			{
				x1=xm;
				Y1=ym;

			}

		}
		if((xm<xmax)&&(xm>xmin))
		{
			ix2=xm;
			iy2=ym;
		}
	}
	x1=tx2;
	Y1=ty2;
	x2=txm;
	y2=tym;
	if(p2[0]==1)
	{
		while(ym!=ymax)
		{	p3[0]=0;
			p3[1]=0;
			p3[2]=0;
			p3[3]=0;
			xm=(x1+x2)/2;
			ym=(Y1+y2)/2;
			printf("%d  %d | %d %d -> %d %d\n",x1,Y1,x2,y2,xm,ym);
			outcode(xm,ym,p3);
			if((p3[0]==0)&&(p3[1]==0)&&(p3[2]==0)&&(p3[3]==0))
			{
				x2=xm;
				y2=ym;
			}
			else
			{
				x1=xm;
				Y1=ym;

			}

		}
		if((xm<xmax)&&(xm>xmin))
		{
			ix2=xm;
			iy2=ym;
		}
	}
	}




}
printf("intersection points are %d,%d || %d,%d\n",ix1,iY1,ix2,iy2);

glColor3f(1.0,0.0,0.0);
glBegin(GL_LINES);
glVertex2i(ix1,iY1);
glVertex2i(ix2,iy2);
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
glutInit(&argc,argv); 
glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB); 
glutInitWindowSize(640,480); 
glutInitWindowPosition(0,0); 
glutCreateWindow("midpoint");
Init(); 
printf("enter xmin\n");
scanf("%d",&xmin);
printf("enter ymin\n");
scanf("%d",&ymin);
printf("enter xmax\n");
scanf("%d",&xmax);
printf("enter ymax\n");
scanf("%d",&ymax);
printf("enter the 1st point\n");
scanf("%d %d",&x1,&Y1);
printf("enter the 2st point\n");
scanf("%d %d",&x2,&y2);
glutDisplayFunc(Primitives); 

glutMainLoop();

return 0;
}