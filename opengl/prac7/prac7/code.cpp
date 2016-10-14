#include<iostream>
#include<math.h>
#include<GL/glut.h>
#include<GL/samarth.h>

using namespace std;

Point obj[10];
int n,I,i,minx,maxx,temp,p,x,y,cnt,flag;
int ch;

void draw(void)
{
	glClear(GL_COLOR_BUFFER_BIT);
	glColor3f(0.0,0.0,0.0);//black
	glBegin(GL_POINTS);
	Bresenhans X_axis, Y_axis;
	X_axis.line(0, 240, 640, 240);	
	Y_axis.line(320, 0, 320, 480);
	glEnd();
	glFlush();

	Point newObj[10];
	cout<<"Enter the number of vertices of polygon: ";
	cin>>n;
	for(i=0; i<n; i++)
	{
		cout<<"Enter the "<<i+1<<" point: ";
		cin>>obj[i].x;
		newObj[i].x = obj[i].x + 320;
		cin>>obj[i].y;
		newObj[i].y = obj[i].y + 240;
	}

	glColor3f(1.0,0.0,0.0);//red
	glBegin(GL_POINTS);
	dda poly;
	poly.polygon(n, newObj);	
	glEnd();
	glFlush();

	Transformation t;
	Point img[10];

	cout<<"\nMenu:-"<<endl;
	cout<<"1.Translation"<<endl;
	cout<<"2.Scaling"<<endl;
	cout<<"3.Reflection about X-axis"<<endl;
	cout<<"4.Rotation"<<endl;
	cout<<"5.Shearing"<<endl;
	cout<<"Enter your choice: ";
	cin>> ch;
	switch(ch)
	{
	case 1: int Tx, Ty;
			cout<<"\nEnter translating factors(Tx, Ty):";
			cin>>Tx>>Ty;
			t.translate(n, obj, img, Tx, Ty);
			break;

	case 2: int Sx, Sy;
			cout<<"\nEnter scaling factors(Sx, Sy):";
			cin>>Sx>>Sy;
			t.scale(n, obj, img, Sx, Sy);
			break;

	case 3: int axis;
			cout<<"\nEnter the choice of Axis:-"<<endl;
			cout<<"1.about X-axis"<<endl;
			cout<<"2.about Y-axis"<<endl;
			cout<<"3.about Y = X"<<endl;
			cout<<"4.about Y = -X"<<endl;
			cout<<"5.about Origin"<<endl;
			cout<<"Enter your choice: ";
			cin>> axis;
			t.reflect(n, obj, img, axis);
			break;

	case 4: float angle;
			int rt;
			cout<<"\nEnter the choice for Rotation:-"<<endl;
			cout<<"1.Clockwise"<<endl;
			cout<<"2.Anti-clockwise"<<endl;
			cout<<"Enter your choice: ";
			cin>> rt;
			cout<<"\nEnter the angle:";
			cin>>angle;
			t.rotate(n, obj, img, angle, rt);
			break;

	case 5: int sh;
			cout<<"\nEnter the choice for Shearing:-"<<endl;
			cout<<"1.X-shearing"<<endl;
			cout<<"2.Y-shearing"<<endl;
			cout<<"Enter your choice: ";
			cin>> sh;
			int she;
			cout<<"Enter shearing factor:";
			cin>>she;
			t.shear(n, obj, img, she, sh);
			break;
	default:cout<<"\n\n\tWrong Choice!!!";
	}

	//glClear(GL_COLOR_BUFFER_BIT);
	glColor3f(0.0,1.0,0.0);//blue
	glBegin(GL_POINTS);
	for(i=0; i<n; i++)
	{
		img[i].x += 320;
		img[i].y += 240;
	}
	poly.polygon(n, img);	
	glEnd();
	glFlush();
	
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
	glutDisplayFunc(draw);
	glutMainLoop();
	return 0;
}