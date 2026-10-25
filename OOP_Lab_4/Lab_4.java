class Hello
{
    void h()
    {
        System.out.println("Hello World");
    }
}

class Info
{

   private String name_1 = "Aman Ali";
    private String name_2;

    public String getName_2()
    {
        return name_2;
    }

    public void setName_2(String name_2) {
        this.name_2 = name_2;
    }

    String name_3 = "Ali";

    public String getName_1()
    {
        return name_1;
    }
}

class Lab_4
{
    void main(String[] args)
    {
        Hello s = new Hello();
        Hello v = new Hello();
        s.h();
        v.h();
        Info i = new Info();
        i.setName_2("Abdul Rehman");
        System.out.println("Name_1:\t" + i.getName_1());
        System.out.println("Name_2:\t" + i.getName_2());
        System.out.println("Name_3:\t" + i.name_3);

    }
}