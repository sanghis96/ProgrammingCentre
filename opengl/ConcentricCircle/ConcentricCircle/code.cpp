#include <iostream>
#include <math.h>
#include<Windows.h>
#include<gl\GL.h>
#include<gl\GLU.h>
#include<glut.h>

using namespace std;

int X, Y, i, d, r, a, b, n;
int xi, yi, AC;

void mh()
{
	xi = xi+1;
	i = i+(2*a*a*xi)+a*a;
}
void mv()
{
	yi = yi-1;
	i = i-(2*b*b*yi)+b*b;
}
void md()
{
	xi = xi+1;
	yi = yi-1;
	i = i+(2*a*a*xi)-(2*b*b*yi)+b*b;
}

void circles()
{
	glClear(GL_COLOR_BUFFER_BIT);
	int R = r;
	for(int j=0; j<n; j++) {
	xi = 0;
	yi = r;
	i = 2*(1-r);
	while (yi >= 0)
	{
		glBegin(GL_POINTS);
		glPointSize(5);
		glVertex2d(xi + X, yi + Y);
		glVertex2d(xi + X, -yi + Y);
		glVertex2d((-xi) + X, yi + Y);
		glVertex2d((-xi) + X, -yi + Y);
		glEnd();
		
		if(i < 0)
		{
			d = (2*i)+(2*yi)-1;
			if (d <= 0)
				mh();
			else
				md();
		}
		else if(i > 0)
		{
			d = (2*i)+(2*xi)-1;
			if (d <= 0)
				md();
			else
				mv();
		}
		else
			md();
	}
	glFlush();
	r -= R/n;
	}
}

void Init()
{
	glClearColor(1.0, 1.0, 1.0, 0);
	glColor3f(1.0, 0.0, 0.0);
	glViewport(0, 0, 640, 480);
	glMatrixMode(GL_PROJECTION);
	glLoadIdentity();
	gluOrtho2D(0, 640, 0, 480);
}

int main(int argc, char **argv)
{
	glutInit(&argc, argv);
	glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB);
	glutInitWindowSize(640, 480);
	glutInitWindowPosition(0, 0);
	glutCreateWindow("Concentric Circles");
	Init();
	cout << "Enter no of Circles:";
	cin >> n;
	a = b = 1;
	cout << "Enter Center Points: ";
	cin >> X >> Y;
	cout << "Enter outermost Radius: ";
	cin >> r;
	glutDisplayFunc(circles);
	glutMainLoop(); // Enters the Glut event processing loop
	return 0;
}