#include <iostream>
#include <math.h>
#include<Windows.h>
#include<gl\GL.h>
#include<gl\GLU.h>
#include<glut.h>

using namespace std;

void draw()
{
	glClear(GL_COLOR_BUFFER_BIT);
    glColor3f(1.0f, 0.0f, 0.0f); 
	glBegin(GL_LINE_LOOP);
	{
		glVertex2d(100,100);
		glVertex2d(150,200);
		glVertex2d(200,100);		
		glVertex2d(80,170);
		glVertex2d(220,170);
	}
	glEnd();
    glFlush();
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
	glutCreateWindow("Star");
	Init();
	glutDisplayFunc(draw);
	glutMainLoop(); // Enters the Glut event processing loop
	return 0;
}