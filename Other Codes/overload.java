class overload
{   int a;  float x,y;
    overload()
        {   a=5;    }
    overload(float q)
        {   x=q;    }
    void accept()
        {   y=3.9f; }
    void show()
        {    System.out.println(a);
             System.out.println(x);
             System.out.println(y);    }
    void main()
        {   overload ob=new overload(11.5f);
            ob.accept();
            ob.show();  }
    }