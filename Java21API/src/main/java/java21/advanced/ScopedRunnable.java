package java21.advanced;

public class ScopedRunnable implements Runnable {

   private Long longParameter;

   private static ScopedValue<Long> scopedContext
           = ScopedValue.newInstance();

   public ScopedRunnable(Long parameter) {
       this.longParameter = parameter;
   }

   @Override
   public void run() {
       ScopedValue.where(scopedContext, longParameter).run(
               () -> System.out.println("Thread: " + Thread.currentThread().getName()
                       + "; parameter: " + scopedContext.get()));
   }
  
}