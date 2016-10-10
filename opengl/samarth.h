#include<GL/glut.h>

class Point
{
	public:
		int x,y;
	public:
		Point()
		{
			x = 0;
			y = 0;
		}
		Point(const Point &p)
		{
			x = p.x;
			y = p.y;
		}
		Point(int a, int b)
		{
			x = a;
			y = b;
		}
		void setValue(int a, int b)
		{
			x = a;
			y = b;
		}
		/*void display()
		{
			cout<<"("<<x<<","<<y<<")"<<endl;
		}*/

};

class dda
{
	int sign(float f)
	{
		if(f==0)
			return f;
		else if(f>0)
			return 1;
		else
			return -1;
	}
   public:
	dda(){}	

	void line(int X1, int Y1, int X2, int Y2)
	{
		float len, Dx, Dy, X, Y;
		if(abs(X2-X1) >= abs(Y2-Y1))
			len = abs(X2-X1);
		else
			len = abs(Y2-Y1);
		Dx = (X2-X1)/len;
		Dy = (Y2-Y1)/len;
		X = X1+(0.5*sign(Dx));
		Y = Y1+(0.5*sign(Dy));
		for(int i=0; i<len; i++)
		{
			glColor3f(0.0f,0.0f,0.0f);
			glBegin(GL_POINTS);
			glVertex2d(X,Y);
			glEnd();
			glFlush();
			X += Dx;
			Y += Dy;
		}
	}

	void polygon(int n, Point obj[])
	{
		glColor3f(0.0,0.0,1.0);//blue
		glBegin(GL_POINTS);
		for(int i=0; i<n; i++)
			line(obj[i].x,obj[i].y,obj[(i+1)%n].x,obj[(i+1)%n].y);
		glEnd();
		glFlush();
	}
};

class Bresenhans
{
	int i, d, a, b, xi, yi, AC;

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
	
	int sign(int f)
	{
		if(f==0)
			return f;
		else if(f>0)
			return 1;
		else
			return -1;
	}

	public:
		Bresenhans(){}

		void line(int X1, int Y1, int X2, int Y2)
		{
			float x, y, dx, dy, len, p, q;
			int s1, s2, inter, e;
			x = X1;
            y = Y1;
            dx = abs(X2-X1);
            dy = abs(Y2-Y1);
            s1 = sign(X2-X1);
            s2 = sign(Y2-Y1);
            if(dy > dx)
            {
                inter = 1;
                int temp = dx;
                dx = dy;
                dy = temp;
            }
            else
                inter = 0;
            e = 2*dy-dx;

			glColor3f(0.0f, 0.0f, 0.0f);
			for(int i=1; i<=dx; i++)
			{
				glBegin(GL_POINTS);
				glVertex2d(x,y);
				while(e > 0)
				{
					if(inter == 1)
						x = x+s1;
					else
						y = y+s2;
					e = e-(2*dx);
				}
				if(inter == 1)
					y = y+s2;
				else
					x = x+s1;
				e = e+(2*dy);
			}
			glEnd();
			glFlush();
		}

		void circle(int X, int Y, int R)
		{
			a = b =1;
			xi = 0;
			yi = R;
			i = 2*(1-R);
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
		}
		
		void ellipse(int X, int Y, int A, int B)
		{
			a = A;
			b = B;
			xi = 0;
			yi = b;
			i = (a*a)*(1-(2*b));
			while (yi >= 0)
			{
				glColor3f(0.0f, 0.0f, 0.0f);
				glBegin(GL_POINTS);
				glPointSize(5);
				glVertex2d(xi+X, yi+Y);
				glVertex2d(xi+X, -yi+Y);
				glVertex2d((-xi)+X, yi+Y);
				glVertex2d((-xi)+X, -yi+Y);
				glEnd();
				
				if(i < 0)
				{
					d = (2*i)+(2*a*a*yi)-a*a;
					if (d <= 0)
						mh();
					else
						md();
				}
				else if (i>0)
				{
					d = (2*i)+(2*b*b*xi)-a*a;
					if (d <= 0)
						md();
					else
						mv();
				}
				else
					md();
			}
			glFlush();
		}
};

class fillPolygon
{
	public:
	fillPolygon(){}

	void edgeflag()
	{
		unsigned int pixel[3];
		int inside;

		for(int i=0; i<480; i++)
		{
			inside = 0;
			for(int j=200; j<640; j++)
			{
				glReadPixels(j,i,1,1,GL_RGB,GL_UNSIGNED_BYTE,pixel);
				if(pixel[0]==0 && pixel[1]==0 && pixel[2]==0)
				{
					if(inside == 0)
						inside = 1;
					else
						inside = 0;	
				}
				
				if(inside == 1)
				{
					glColor3f(0.0f, 0.0f, 1.0f);
					glBegin(GL_POINTS);
					glVertex2d(j,i);
					glEnd();
				}
			}
		}
		glFlush();
	}

};

class Transformation
{
	public:
	Transformation(){}

	void translate(int n, Point obj[], Point img[], int Tx, int Ty)
	{
		int T[3][3] = {{1,0,0},{0,1,0},{Tx,Ty,1}};
		int object[10][3];
		for(int i=0; i<n; i++)
		{
			object[i][0] = obj[i].x;
			object[i][1] = obj[i].y;
			object[i][2] = 1;
		}
		int result[10][3];
		for(int i=0; i<n; i++)
			for(int j=0; j<3; j++)
			{
				result[i][j] = 0;
				for(int k=0; k<3; k++)
					result[i][j] += object[i][k]*T[k][j];
				if(j==0)
					img[i].x = result[i][j];
				if(j==1)
					img[i].y = result[i][j];
			}
	}
	void scale(int n, Point obj[], Point img[], int Sx, int Sy)
	{
		int T[3][3] = {{Sx,0,0},{0,Sy,0},{0,0,1}};
		int object[10][3];
		for(int i=0; i<n; i++)
		{
			object[i][0] = obj[i].x;
			object[i][1] = obj[i].y;
			object[i][2] = 1;
		}
		int result[10][3];
		for(int i=0; i<n; i++)
			for(int j=0; j<3; j++)
			{
				result[i][j] = 0;
				for(int k=0; k<3; k++)
					result[i][j] += object[i][k]*T[k][j];
				if(j==0)
					img[i].x = result[i][j];
				if(j==1)
					img[i].y = result[i][j];
			}
	}

};