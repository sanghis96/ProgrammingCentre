#include<iostream>
#include<math.h>
#include<GL/glut.h>
#include<GL/samarth.h>

using namespace std;

Point obj[10];
int n,I,i,minx,maxx,temp,p,x,y,cnt,flag;



void draw(void)
{
	glClear(GL_COLOR_BUFFER_BIT);
	glColor3f(0.0,0.0,0.0);//black
	glBegin(GL_POINTS);
	for(i=0; i<n; i++)
	{
		Bresenhans l;
		l.line(obj[i].x,obj[i].y,obj[(i+1)%n].x,obj[(i+1)%n].y);	
	}
	glEnd();
	glFlush();

	Bresenhans c;
	c.ellipse(100, 100, 20, 40);
	
	Transformation t;
	/*
	t.translate(n, obj, -100, -100);
	
	//glClear(GL_COLOR_BUFFER_BIT);
	glColor3f(1.0,0.0,0.0);//red
	glBegin(GL_POINTS);
	for(i=0; i<n; i++)
	{
		dda l;
		l.line(obj[i].x,obj[i].y,obj[(i+1)%n].x,obj[(i+1)%n].y);	
	}
	glEnd();
	glFlush();
	*/
	Point img1[10];
	t.scale(n, obj, img1, 2, 2);
	//glClear(GL_COLOR_BUFFER_BIT);
	glColor3f(0.0,1.0,0.0);//green
	glBegin(GL_POINTS);
	for(i=0; i<n; i++)
	{
		dda l;
		l.line(img1[i].x,img1[i].y,img1[(i+1)%n].x,img1[(i+1)%n].y);	
	}
	glEnd();
	glFlush();
	/*
	Point img2[10];
	t.translate(n, img1, img2, 0, 200);
	//glClear(GL_COLOR_BUFFER_BIT);
	dda p;
	p.polygon(4, img2);

	fillPolygon fp;
	fp.edgeflag();
	*/
}
void Init()
{
	glClearColor(1.0,1.0,1.0,0); 
	glColor3f(1.0,0.0,0.0);
	glViewport(0,0,640,480);
	glMatrixMode(GL_PROJECTION);
	glLoadIdentity();
	gluOrtho2D(0,640,0,480);
}

int main(int argc, char **argv)
{
	glutInit(&argc,argv); 
	glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB); 
	glutInitWindowSize(640,480); 
	glutInitWindowPosition(0,0); 
	glutCreateWindow("Transpose");
	Init();
	cout<<"Enter the number of vertices: ";
	cin>>n;
	for(i=0; i<n; i++)
	{
		cout<<"Enter the "<<i+1<<" point: ";
		cin>>obj[i].x;
		cin>>obj[i].y;
	}
	glutDisplayFunc(draw);
	glutMainLoop();
	
	
	
	glutDisplayFunc(draw); 
	glutMainLoop();
	return 0;
}