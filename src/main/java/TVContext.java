/**
 * Notice that Context also implements State and
 * keep a reference of its current state and forwards the request to the state implementation.
 */
public class TVContext implements State {
    private State tvState;

    public void setState(State tvState) {
        this.tvState = tvState;
    }

    public State getTvState() {
        return tvState;
    }


    @Override
    public void doAction() {
        this.tvState.doAction();
    }
}
