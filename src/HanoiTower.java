/*汉诺塔的递归方法相信很好理解，不过作为Java初学者，我暂时不知道怎样才能在递归解法的基础上添加某些方法，来展示具体在某一步移动前后A、B、C三根柱子的状态（分别有哪些圆盘，在哪个柱子上面。）这个暂放，待思考。若您有好的方法也希望不吝赐教。以下是递归的简单写法。*/
public class HanoiTower
{
    private int n;
    private String a;
    private String b;
    private String c;

    public void move(int n , String a ,String b ,String c)
    {
        if(n<1)
        {
            System.out.println("Wrong Number <0");
        }
        else if(n == 1)
        {
            System.out.println(a + ">>"+ c);
        }
        else
        {
            this.move(n-1, a, c, b);
            System.out.println(a + ">>"+c);
            this.move(n-1, b, a, c);
        }
    }

}
/*因希望能得知在移动前后，三根柱子的状态。同时既知道汉诺塔有非递归的解法，查阅其具体循环原理后，得出了以下非递归的方法。

//本方法建立在以下三个基本理论上面，若这些理论无效，则无法通过这种方式解出。
//1.汉诺塔的总步数为2^n-1。
//2.汉诺塔的移动第一步总是将顶盘（最小盘top），以A>>B>>C>>A>>B>>C……的顺序移动一步。
//3.汉诺塔第二部移动总是在非顶盘（not-top）的两个柱间进行移动。若其中一个为空柱，则移动到空柱。否则，将小盘移动到大盘。
//重复第2、3两部，当移动步数等于2^n-1的时候，则移动结束。
//注意，若n为奇数的时候，实际移动结果为，所有的盘都移动到了B柱位置。此时只需要在移动前，将B和C交换(B和C对应的引用交换一下)位置即可。
//介于所有的实现，都必须是建立在以上的基础理论上。所以其实仅仅是把这种现实方法转换成计算机方法而已。
//只需要用计算机方法描述该过程就可以了。

因为该方法是基于一套简单的循环思路，所以虽自己摸索写出了该方法，似乎也仅是对汉诺塔该解法有所得，但并没有其它方面的提高。仅仅是把初学的一些知识融会贯通而已。同时该方法并非一次成型，本是希望能在一个类中处理，奈何逻辑太混乱，所以拆分成了2个类。也方便理解。

第一个类，用于创建汉诺塔的A，B，C三根柱子。
*/
//import java.util.ArrayList;
//
//public class HanoiPillar
//{
//    int n;//用于传递hanoi的圆盘数量;
//    public String name;// 记录柱子的名称。
//    ArrayList<Integer> arr = new ArrayList<>();// 记录柱子上的圆盘以及统计该柱子上圆盘数量（arr.size())。
//
//    public HanoiPillar()//默认构造方法。
//    {
//
//    }
//
//    //建立B柱和C柱时使用的构造方法。
//    public HanoiPillar(String name)
//    {
//        this.name = name;
//    }
//
//    //仅用于第一次初始化第一柱A柱的构造方法。用于将n个圆盘添加到A柱的arr里。
//    public HanoiPillar(String name, int n)
//    {
//        this.name = name;
//        //此处的循环条件是n到1.因为n个圆盘的情况下，编号是1到n.没有0号。
//        for(int i = n; i>=1; i--)
//        {
//            this.arr.add(i);
//        }
//    }
//
//    //判断该柱子上方是否为顶盘top
//    public boolean top()
//    {
//        boolean result = false;
//        //当当前柱子的arr.size() == 0 即说明该柱子上方没有圆盘。
//        if(arr.size() == 0)
//        {
//
//        }else if (arr.get(arr.size()-1).equals(1))
//        {
//            result = true;
//        }
//        return result;
//    }
//
//    //将当前柱子移动到下一个柱子。并打印移动流程。
//    public void moveTo(HanoiPillar b)
//    {
//        //移动过程是b会增加一个圆盘。同时this会减少一个圆盘。一定是先增加，后减少。
//        b.arr.add(this.getDiskSize());
//        this.arr.remove(this.arr.size() - 1);
//        System.out.println(this.name + ">>" + b.name);
//    }
//
//    //得到该柱子下面存储的圆盘列表，转化为String。
//    public String getStore()
//    {
//        if (this.arr.size() == 0)
//        {
//            return null;
//        } else
//        {
//            String result = "";
//            for (int i = this.arr.size()-1; i >= 0; i--)
//            {
//                result = result + this.arr.get(i) + ",";
//            }
//            result = result.trim();
//            return result;
//        }
//    }
//
//    //得到该柱子下面最小的圆盘数值。以1、2、3、4、……、n来表示各圆盘的大小。方便比较。
//    public int getDiskSize()
//    {
//        return (int) this.arr.get(this.arr.size()-1);
//    }
//
//}
/*第二个类，汉诺塔的解法*/
//import java.math.*;

//本方法建立在以下三个基本理论上面，若这些理论无效，则无法通过这种方式解出。
//1.汉诺塔的总步数为2^n-1。
//2.汉诺塔的移动第一步总是将顶盘（最小盘top），以A>>B>>C>>A>>B>>C……的顺序移动一步。
//3.汉诺塔第二部移动总是在非顶盘（not-top）的两个柱间进行移动。若其中一个为空柱，则移动到空柱。否则，将小盘移动到大盘。
//重复第2、3两部，当移动步数等于2^n-1的时候，则移动结束。
//注意，若n为奇数的时候，实际移动结果为，所有的盘都移动到了B柱位置。此时只需要在移动前，将B和C交换(B和C对应的引用交换一下)位置即可。
//介于所有的实现，都必须是建立在以上的基础理论上。所以其实仅仅是把这种现实方法转换成计算机方法而已。
//只需要用计算机方法描述该过程就可以了。

//public class Hanoi3
//{
//    public int n;	//圆盘层数。
//    public int step;//总共的步数。
//    public HanoiPillar a;//a柱。
//    public HanoiPillar b;//b柱。
//    public HanoiPillar c;//c柱。
//
//    public Hanoi3()//默认构造方法。
//    {
//
//    }
//
//    //主方法。
//    public void hanoi3(int n, String a, String b, String c)
//    {
//        //关键点01：汉诺塔的总步数为2^n-1。若没有这个结论的话，则本方法无效。
//        step = (int)(Math.pow(2, n)-1);
//        this.a = new HanoiPillar(a,n);
//        this.b = new HanoiPillar(b);
//        this.c = new HanoiPillar(c);
//        this.n = n;
//        //如果n为奇数，则将b和c交换。
//        if(n%2 != 0)
//        {
//            HanoiPillar temp = this.b;
//            this.b = this.c;
//            this.c = temp;
//        }
//        //每次循环移动2步骤，首先移动top，其次移动not top。
//        while(step>0)
//        {
//            //以下是移动的第一步top判断和移动。需参考HanoiPillar类进行理解。
//            if(this.a.top())
//            {
//                list();
//                this.a.moveTo(this.b);
//                step--;
//            }else if(this.b.top())
//            {
//                list();
//                this.b.moveTo(this.c);
//                step--;
//            }else if(this.c.top())
//            {
//                list();
//                this.c.moveTo(this.a);
//                step--;
//            }
//            //因step是奇数，而最终移动完成后step=0；
//            //同时可以理解的是最后一次移动一定是top的移动，所以本循环需要在此处跳出。
//            if (step == 0)
//            {
//                break;
//            }
//
//            //以下是移动的第二步not top的判断和移动。需参考HanoiPillar进行理解。
//            if(this.a.top())
//            {
//                if(this.b.arr.size() == 0)
//                {
//                    list();
//                    this.c.moveTo(this.b);
//                    step--;
//                }else if(this.c.arr.size() == 0)
//                {
//                    list();
//                    this.b.moveTo(this.c);
//                    step--;
//                }else if(this.b.getDiskSize() > this.c.getDiskSize())
//                {
//                    list();
//                    this.c.moveTo(this.b);
//                    step--;
//                }else
//                {
//                    list();
//                    this.b.moveTo(this.c);
//                    step--;
//                }
//            }else if(this.b.top())
//            {
//                if(this.a.arr.size() == 0)
//                {
//                    list();
//                    this.c.moveTo(this.a);
//                    step--;
//                }else if(this.c.arr.size() == 0)
//                {
//                    list();
//                    this.a.moveTo(this.c);
//                    step--;
//                }else if(this.a.getDiskSize() > this.c.getDiskSize())
//                {
//                    list();
//                    this.c.moveTo(this.a);
//                    step--;
//                }else
//                {
//                    list();
//                    this.a.moveTo(this.c);
//                    step--;
//                }
//            }else if(this.c.top())
//            {
//                if(this.a.arr.size() == 0)
//                {
//                    list();
//                    this.b.moveTo(this.a);
//                    step--;
//                }else if(this.b.arr.size() == 0)
//                {
//                    list();
//                    this.a.moveTo(this.b);
//                    step--;
//                }else if(this.a.getDiskSize() > this.b.getDiskSize())
//                {
//                    list();
//                    this.b.moveTo(this.a);
//                    step--;
//                }else
//                {
//                    list();
//                    this.a.moveTo(this.b);
//                    step--;
//                }
//            }
//        }
//    }
//
//    //打印出当前每个柱的圆盘结构。需要结合HnoiPillar类来理解。
//    public void list()
//    {
//        if(n%2 == 0)
//        {
//            System.out.print(this.a.name + "柱：" + this.a.getStore() +
//                    "		"+ this.b.name + "柱：" + this.b.getStore() +
//                    "		" + this.c.name + "柱：" + this.c.getStore() + "			");
//        }
//        else
//        {
//            System.out.print(this.a.name + "柱：" + this.a.getStore() +
//                    "		"+ this.c.name + "柱：" + this.c.getStore() +
//                    "		" + this.b.name + "柱：" + this.b.getStore() + "			");
//        }
//    }
//}
