package Project2.MultiBitVariants.Tests;

public class StateMachine {

   private enum State {
      POWERING_SHOOTER(100),
      RAISING_LIFT(130),
      SHOT1(150),
      IDLE1(175),
      SHOT2(200),
      IDLE2(225),
      SHOT3(250),
      IDLE3(300),
      STOP_AND_RETRACT(350);

      public final long timeStamp;

      State(long timeStamp) {
         this.timeStamp = timeStamp;
      }
   }

   public void run(){
      State state = State.POWERING_SHOOTER;
      //shooter.powerOn();

      long startTime = System.currentTimeMillis();

      while (true){
         long elapsedTime = System.currentTimeMillis() - startTime;

         boolean progressState = (elapsedTime >= state.timeStamp);

         switch (state) {
            case POWERING_SHOOTER:
               if (progressState) {
                  //lift.raise();
                  state = State.RAISING_LIFT;
               }
            case RAISING_LIFT:
               if(progressState) {
                  //indexServo.setPosition(1);
                  state = State.SHOT1;
               }
            case SHOT1:
               if(progressState){
                  //indexServo.setPosition(0);
                  state = State.IDLE1;
               }
            case IDLE1:
               if (progressState){
                  //indexServo.setPosition(1);
                  state = State.SHOT2;
               }
            case SHOT2:
               if (progressState){
                  //indexServo.setPosition(0);
               }
         }
      }
   }
}
