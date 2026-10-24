import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomPairing implements PairingStrategy {
    @Override
    public List<Participant> arrange(List<Participant> participants) {
        List<Participant> shuffled = new ArrayList<>(participants);
        Collections.shuffle(shuffled);
        return shuffled;
    }
}
