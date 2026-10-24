import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class WeightBasedPairing implements PairingStrategy {
    @Override
    public List<Participant> arrange(List<Participant> participants) {
        List<Participant> ordered = new ArrayList<>(participants);
        ordered.sort(Comparator.comparingInt(Participant::getWeight));
        return ordered;
    }
}