import com.sun.org.apache.bcel.internal.generic.ATHROW;

import java.util.Arrays;

public class MyArrayList {

    public int[] elem;//数组
    public int usedSize;//有效的数据个数
    public static final int intCapacity = 10;//初始容量

    public MyArrayList() {
        this.elem = new int[intCapacity];
        this.usedSize = 0;
    }
    //判断顺序表是否满
    private boolean isFull(){
//        if(this.usedSize==this.elem.length){
//            return true;
//        }
//        return false;
        return this.usedSize==this.elem.length;
    }
    //打印顺序表
    public void display(){
        for (int i=0;i<this.usedSize;i++){
            System.out.print(this.elem[i]+" ");
        }
    }
//插入数据
    public void add(int pos,int data){
        if(isFull()){
           this.elem=Arrays.copyOf(this.elem,2*this.elem.length);
            return;
        }
        if(pos<0||pos>this.usedSize){return;}
        //移动数据
        for (int i=this.usedSize-1;i>=pos;i--){
            this.elem[i+1]=this.elem[i];

        }
        this.elem[pos]=data;
        usedSize++;
    }
    //查找元素是否在顺序表中
    public boolean contains(int toFind){
        for (int i = 0; i <=this.usedSize ; i++) {
            if(toFind==elem[i]){
                return true;
            }
        }
        return false;
    }
    //查找元素对应位置
    public int search(int toFind){
        for (int i = 0; i <=this.usedSize ; i++) {
            if(toFind==elem[i]){
                return i;
            }
        }
        return -1;
    }
    //获取pos位置的元素
    public int getPos(int pos){
        //1，顺序表是否为空，true，否则返回-1
        //2，pos合法性
        if(this.usedSize==0){
            throw new RuntimeException("位置不合法");
        }
        else if(pos<0||pos>=this.usedSize){
            throw new RuntimeException("位置不合法");
        }
        else return elem[pos];
        //return pos位置的数据就ok

    }
    public void remove(int toRemove){
        //找到下标
        //下标后一个元素覆盖前面元素
        //usesize--
        int index= search(toRemove);
        if(index==-1){
            System.out.println("没有这个数据");
            return;
        }
        for (int i = index; i < usedSize-1; i++) {
            elem[i]=elem[i+1];
        }
       this.usedSize--;

    }
    //清空数据表
    public void clear(){
        this.usedSize=0;
    }

}