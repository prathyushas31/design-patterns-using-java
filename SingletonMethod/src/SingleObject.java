public class SingleObject {
   private static SingleObject instance = new SingleObject();
   private SingleObject(){}
   public static SingleObject getInstance(){
      return instance;
   }

   public void showMessage(){
      System.out.println("this is the singleton design pattern program");
   }
}
