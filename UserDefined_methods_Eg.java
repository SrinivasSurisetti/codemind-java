public class UserDefined_methods_Eg{
    void sayHello(){ //Defining Fxn Without using static ==>then wwe need to create Obj
        System.out.println("HII");
    }
    static boolean isFactor(int a,int b){ //Using Satic ==> then we don't to create objs , Directly call the fxn
        return a%b==0;
    }
        public static void main(String[] sri){
            UserDefined_methods_Eg obj1=new UserDefined_methods_Eg();
        obj1.sayHello();
        System.out.println(isFactor(10,5));
        System.out.println(isFactor(500,23));
    }
}