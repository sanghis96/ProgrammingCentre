
#include<stdlib.h>
#include<GL/glut.h>
#include<iostream>
#include<math.h>
using namespace std;
float list[640][2], scanline[480];
int slpos= 0, lspos = 0;
int sign(float tmp) 
{
    if (tmp > 0) 
    { 
        return 1;
    }
    if (tmp < 0)
    {
        return -1;
    }
    if (tmp == 0)
    {
        return 0;
    }
}
void dda(float xl, float yl, float x2, float y2)
{
    float length, dx, dy, x, y;
    int i = 1;
    if (abs(x2 - xl) >= abs(y2 - yl))
    {
        length = abs(x2 - xl);
    }
    else 
    {
 length = abs(y2 - yl);
    } 
    dx = (x2 - xl) / length;
    dy = (y2 - yl) / length;
    x = xl + (0.5*sign(dx));
    y = yl + (0.5*sign(dy));
    glColor3f(1.0, 0.0, 0.0);
    while (i <= length)
    {
        glBegin(GL_POINTS);
        glVertex2d(x + 320, y + 240);
        for (int k = 0; k < slpos; k++)
        {
            if (y == scanline[k])
            {
                list[lspos][0] = x;
                list[lspos++][1] = y;
            }
        }
        x += dx;
        y += dy;
        i++;
        glEnd();
    }
}
void pr4() 
{
    glClear(GL_COLOR_BUFFER_BIT);
    glColor3f(1.0, 0.0, 0.0);
    int no_points;
    cout << "\nEnter no of points:";
    cin >> no_points;
    float x, y;
    float points[100][2];
    glColor3f(0.0, 1.0, 1.0);
    glBegin(GL_LINES);
    glVertex2d(0, 240);
    glVertex2d(640, 240);
    glVertex2d(320, 480);
    glVertex2d(320, 0);
    glEnd();
    for (int i = 0; i < no_points; i++)
    {
        cout << "Enter the point" << (i + 1) << ":";
        cin >> x;
        cin >> y;
        points[i][0] = x;
        points[i][1] = y;
    }
    float ymin = 999, ymax = 0;
    int count = 0;
    for (int i = 0; i < no_points; i++)
    {
        if (ymin >= points[i][1]) 
        {
            ymin = points[i][1]; 
        }
        if (ymax < points[i][1]) 
        { 
            ymax = points[i][1]; 
        } 
    } 
    for (float i = ymin; i < ymax; i++)
    {
        scanline[slpos++] = i + .5;
    }
    for (int i = 0; i < no_points; i++)
    {
        if (i < (no_points - 1))
        { 
            dda(points[i][0], points[i][1], points[i + 1][0], points[i + 1][1]);
        }
        else
        {
            dda(points[i][0], points[i][1], points[0][0], points[0][1]);
        }
    }
cout << endl << endl << "Scan Line\t Intersection points\n";
float tmp;
for (int j = 0; j < slpos; j++)
{
    tmp = scanline[j];
    cout << endl << "scan line" << tmp << ":";
    for (int i = 0; i < lspos; i++)
    {
        if (list[i][1] == tmp)
        {
            cout << "(" << list[i][0] << "," << list[i][1] << ")";
        }

}
}
for (int i = 0; i < lspos; i++)
{
    float t0 = list[i][0], t1 = list[i][1];
    for (int j = 0; j < lspos; j++)
    {
        if (t1 == list[j][1] || t1>list[j][1] && t0 <= list[j][0])
        {
            list[i][0] = list[j][0];
            list[i][1] = list[j][1];
            list[j][0] = t0;
            list[j][1] = t1;
            t0 = list[i][0], t1 = list[i][1];
        }
    }
}
cout << endl << "Sorted points" << endl; cout << endl << endl << "Scan line\t\tIntersection points\n";
for (int j = slpos - 1; j >= 0; j--)
{
    tmp = scanline[j];
    cout << endl << "Scan line" << tmp << ":";
    for (int i = 0; i < lspos; i++)
    {
        if (list[i][1] == tmp)
        {
            cout << "(" << list[i][0] << ";" << list[i][1] << ")";
        }
    }
}
glBegin(GL_POINTS);
glColor3f(0.0, 1.0, 1.0);
for (int i = 0; i < lspos - 1; i++)
{
    int j = i + 1;
    int x = list[i][0], y = list[i][1];
    while ((list[i][0] <= x +.5) && (x +.5 <= list[j][0]))
    {
        glVertex2d(x + 320, y+240); x += 1;
    }
}
glEnd();
glFlush();
 }
 int main(int argc, char**argv)
 {
     glutInit(&argc, argv);
     glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB);
     glutInitWindowSize(640, 480);
     glutInitWindowPosition(0, 0);
     glutCreateWindow(".....Polygon.....");
     glClearColor(1.0, 1.0, 1.0, 0);
     glMatrixMode(GL_PROJECTION);
     glViewport(0, 0, 640, 480);
     glLoadIdentity();
     gluOrtho2D(0, 640, 0, 480);
     glutDisplayFunc(pr4);
     glutMainLoop();
     return 0;
 }