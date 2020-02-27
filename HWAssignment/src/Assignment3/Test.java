package Assignment3;

public class Test {

/**
* @param args
 * @throws Exception 
*/
public static void main(String[] args) throws Exception {
int a=divide(4,2);
System.out.println(a);
int b=divide(4,0);

System.out.println(b);

}
public static int divide(int a,int b) throws Exception{
int result = a/b;
return result;
}
}

