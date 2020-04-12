import java.util.Scanner;

/**
 * 模拟登陆
 *
 *
 * 编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,密码错误， 可以重新输 入，最多输入三次。三次均错，则提示退出程序
 */
public class simulateLogin {
    public static void main(String[] args) {

        String password=new String("123456");

        System.out.println("请输入密码:");
        int count=0;
       do{
            Scanner sc = new Scanner(System.in);
            String pw = sc.next();

            if(password.equals(pw)){
                System.out.println("登陆成功");
                break;
            }
            else {
                System.out.println("密码错误");
            }
            count++;
        }while (count<3);
            if(count==3){
                System.out.println("三次密码错误，退出程序！");
            }
    }
}
