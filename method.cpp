#include<iostream>
#include<vector>
#include<set>

using namespace std;

/************************************************
 * 循环宏定义，简化代码结构
 * *********************************************/
#define _for(i,a,b) for(int i = (a);i < (b); ++i)
#define _rep(i,a,b) for(int i = (a);i <= (b); ++i)


/*************************************************
 * 此处为简化序列输出的代码，重载ostream类中的 << 运算符
 * ***********************************************/
template<typename T>
ostream& operator<<(ostream& os,const vector<T>& v){
    for(int i = 0;i < v.size();i++){
        os << v[i] << " ";
    }
    return os;
}

template<typename T>
ostream& operator<<(ostream& os,const set<T>& v){
    for(typename set<T>::iterator it = v.begin();it != v.end();it++){
        os << *it << " ";
    }
    return os;
}


/************************************************
 * 字符输入并存入vector中
 * *********************************************/
int readint(){
    int x;
    cin >> x;
    return x;
}

vector<int> vc;
vc.push_back(readint());


/***********************************************
 * 二维几何运算操作
 * *********************************************/
struct Point{
    int x,y;
    Point(int x = 0,int y = 0):x(x),y(y) {}
    Point& operator=(Point& p) : {x = p.x;y = p.y;return *this;}
};
typedef Point Vector;

Vector operator+(const Vector& A,const Vector& B){
    return Vector(A.x + B.x,A.y + B.y);
}

Vector operator-(const Vector& A,const Vector& B){
    return Vector(A.x - B.x,A.y - B.y);
}

Vector operator*(const Vector& A,int p){
    return Vector(A.x * p,A.y * p);
}

bool operator==(const Point &a,const Point &b){
    return a.x == b.x && a.y == b.y;
}

bool operator< (const Point& p1,const Point& p2){
    return p1.x < p2.x || (p1.x == p2.x && p1.y < p2.y);
}

istream& operator>>(istream& is,Point& p){
    return is>>p.x>>p.y;
}


/**********************************************
 * 内存池
 * ********************************************/
template<typename T>
struct Pool{
    vector<T*> buf;
    T* creatNew(){
        buf.push_back(new T());
        return buf.back();
    }

    void dispose(){
        for(int i = 0;i < buf.size();i++){
            delete buf[i];
        }
        buf.clear();
    }
};

int main(){
    vector<int> a;
    a.push_back(1);
    a.push_back(2);
    a.push_back(3);

    cout << a;

    set<string> b;
    b.insert("a");
    b.insert("b");
    b.insert("c");
    cout << b;

    return 0;
}
