#include<math.h>
#include<iostream>
#include<GL/glut.h>
#include<stdio.h>
int X1, Y1, X2, Y2 , ch,ch2,s1,s2,ic,p,inside,j,Xm,Ym,count=0;
int Xmin,Ymin,Xmax,Ymax,Vxmin,Vymin,Vxmax,Vymax;
int one[4],two[4],flag[4];
float dx,dx1,dy1, dy, x, l,y,q,r,s,temp,e,m;
int i = 0;
using namespace std;
float ver[4][2],Sx,Sy;
void edgeflag(void);
void seedfill(int ,int );
unsigned int pixel[3];
void calcode(void);
void linedraw(void);
void intertop(void);
void interbot(void);
void interright(void);
void interleft(void);
void full(void);
void clip(void);
void view(void);
void viewline(void);
void Init()
{
    glClearColor(1.0, 1.0, 1.0, 0);
    glColor3f(1.0, 0.0, 0.0); // red
    glViewport(0, 0, 640, 480);// Set the vieWport for viewing with lower left corner & Width & height
    glMatrixMode(GL_PROJECTION);
    glLoadIdentity();
    gluOrtho2D(0, 640, 0, 480);
}

void draw()
{
    glClear(GL_COLOR_BUFFER_BIT);
    glColor3f(1.0f, 0.0f, 0.0f); 
	glBegin(GL_LINE_LOOP);
	{
		glVertex2d(Xmin,Ymin);
		glVertex2d(Xmax,Ymin);
		glVertex2d(Xmax,Ymax);		
		glVertex2d(Xmin,Ymax);
	}
    glEnd();
    glFlush();
	linedraw();
}
void linedraw(void)
{
	for(i=0;i<4;i++)
	{
		one[i]=0;
		two[i]=0;
		flag[i]=0;
	}
	printf("\nEnter the line's starting coordinates :");
	scanf_s("%d %d",&X1,&Y1);
	printf("\nEnter the line's ending coordinates :");
	scanf_s("%d %d",&X2,&Y2);
	    glColor3f(0.0f, 0.0f, 1.0f); 
	glBegin(GL_LINE_LOOP);
	{
		glVertex2d(X1,Y1);
		glVertex2d(X2,Y2);
	}
    glEnd();
	glFlush();
	calcode();

}
void calcode(void)
{
	m=(Y2-Y1)/(X2-X1);
	if(X1<Xmin)
		one[3]=1;
	else if(X1>Xmax)
		one[2]=1;
	if(Y1<Ymin)
		one[1]=1;
	else if(Y1>Ymax)
		one[0]=1;
	if(X2<Xmin)
		one[3]=1;
	else if(X2>Xmax)
		one[2]=1;
	if(Y2<Ymin)
		one[1]=1;
	else if(Y2>Ymax)
		one[0]=1;
	for(i=0;i<4;i++){
		flag[i]=one[i]+two[i];
	
	}
	if(one[0]==0 && one[1]==0 && one[2]==0 && one[3]==0 && two[0]==0 && two[1]==0 && two[2]==0 && two[3]==0  )
		full();
	if(flag[0]==1)
		intertop();
	if(flag[1]==1)
		interbot();
	if(flag[2]==1)
		interright();
	if(flag[3]==1)
		interleft();

	clip();
}
void clip(void)
{
	glColor3f(0.0f, 1.0f, 0.0f); 
	glBegin(GL_LINE_LOOP);
	{
		glVertex2d(ver[0][0],ver[0][1]);
		glVertex2d(ver[1][0],ver[1][1]);
	}
    glEnd();
	glFlush();
	view();
}
void view(void)
{
	printf("Enter the Vxmin :	");
	scanf_s("%d",&Vxmin);
	printf("Enter the Vxmax :	");
	scanf_s("%d",&Vxmax);
	printf("Enter the Vymin :	");
	scanf_s("%d",&Vymin);
	printf("Enter the Vymax :	");
	scanf_s("%d",&Vymax);
    glColor3f(1.0f, 0.0f, 0.0f); 
	glBegin(GL_LINE_LOOP);
	{
		glVertex2d(Vxmin,Vymin);
		glVertex2d(Vxmax,Vymin);
		glVertex2d(Vxmax,Vymax);		
		glVertex2d(Vxmin,Vymax);
	}
    glEnd();
    glFlush();
	viewline();
}
void viewline(void)
{
	Sx=(float)(Vxmax-Vxmin)/(float)(Xmax-Xmin);
	Sy=(float)(Vymax-Vymin)/(float)(Ymax-Ymin);
	printf("\n%f %f\n",Sx,Sy);
	//	printf("\n%d %d\n",Vxmin,Vymin);
	//	printf("\n%d %d\n",Vxmax,Vymax);
	//	printf("\n%d %d\n",Vxmax-Vxmin,Vymax-Vymin);

	ver[0][0]=Vxmin+(ver[0][0]-Xmin)*Sx;
	ver[1][0]=Vxmin+(ver[1][0]-Xmin)*Sx;
	ver[0][1]=Vymin+(ver[0][1]-Ymin)*Sy;
	ver[1][1]=Vymin+(ver[1][1]-Ymin)*Sy;
	glColor3f(0.0f, 1.0f, 0.0f); 
	glBegin(GL_LINE_LOOP);
	{
		glVertex2f(ver[0][0],ver[0][1]);
		glVertex2f(ver[1][0],ver[1][1]);
	}
    glEnd();
	glFlush();
}
void full(void)
{
	ver[0][1]=Y1;
	ver[0][0]=X1;
		ver[1][1]=Y2;
	ver[1][0]=X2;
	
	
}
void intertop(void)
{
	ver[count][1]=Ymax;
	ver[count][0]=(Ymax-Y1)/m + X1;
	count++;
	
}
void interbot(void)
{
	ver[count][1]=Ymin;
	ver[count][0]=(Ymin-Y1)/m + X1;
	count++;

}
void interright(void)
{
	ver[count][0]=Xmax;
	ver[count][1]=(Xmax-X1)*m + Y1;
	count++;

}
void interleft(void)
{
	ver[count][0]=Xmin;
	ver[count][1]=(Xmin-X1)*m + Y1;
	count++;

}

int main(int argc, char **argv)
{
    glutInit(&argc, argv);
	printf("Enter the XL : ");
    scanf_s("%d",&Xmin);
		printf("Enter the XR : ");
    scanf_s("%d",&Xmax);
	printf("Enter the YB  : ");
    scanf_s("%d",&Ymin);
		printf("Enter the YT : ");
    scanf_s("%d",&Ymax);
    glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB);
    glutInitWindowSize(640, 480);
    glutInitWindowPosition(0, 0);
    glutCreateWindow("Draw");
    Init();
    glutDisplayFunc(draw);
    //glutDisplayFunc(edgeflag);
    glutMainLoop(); // Enters the Glut event processing loop
    return 0;
}