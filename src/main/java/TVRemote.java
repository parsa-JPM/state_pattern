public class TVRemote {
    public static void main(String[] args) {

        /**
         * we can have a state variable in the Object. Then use if-else condition block to perform different actions based on the state.
         * State design pattern is used to provide a systematic and loosely coupled way to achieve this through Context and State implementations.
         */
        TVContext context = new TVContext();

        context.setState(new TVStartState());
        context.doAction();

        context.setState(new TVStopState());
        context.doAction();

    }
}
