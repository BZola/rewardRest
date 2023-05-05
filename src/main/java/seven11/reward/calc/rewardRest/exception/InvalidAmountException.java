package seven11.reward.calc.rewardRest.exception;


public class InvalidAmountException extends RuntimeException{
    private static final long serialVersionUID = -9079454849611061074L;

    public  InvalidAmountException(String message){
        super(message);
    }
}
