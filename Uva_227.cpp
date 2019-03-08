#include<iostream>
#include<string>

using namespace std;

struct Point{
    int x;  int y;
    Point(int x = 0,int y = 0) : x(x),y(y) {}
};
typedef Point Vector;
