public class WrongSolution {
    private String state="";

    public void setState(String state){
        this.state=state;
    }

    /**
     *  if number of states increase then the tight coupling between implementation and
     *  the client code will be very hard to maintain and extend.
     */
    public void doAction(){
        if(state.equalsIgnoreCase("ON")){
            System.out.println("TV is turned ON");
        }else if(state.equalsIgnoreCase("OFF")){
            System.out.println("TV is turned OFF");
        }
    }

    public static void main(String args[]){
        WrongSolution remote = new WrongSolution();

        remote.setState("ON");
        remote.doAction();

        remote.setState("OFF");
        remote.doAction();
    }
}
