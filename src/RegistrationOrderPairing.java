import java.util.ArrayList;
import java.util.List;

public class RegistrationOrderPairing implements PairingStrategy {
    @Override
    public List<Participant> arrange(List<Participant> participants) {
        return new ArrayList<>(participants);
    }
}