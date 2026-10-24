import java.util.ArrayList;
import java.util.List;

public class ArmwrestlingTournament {
    private final List<Participant> participants = new ArrayList<>();
    private PairingStrategy pairingStrategy;

    public ArmwrestlingTournament(PairingStrategy pairingStrategy) {
        this.pairingStrategy = pairingStrategy;
    }

    public void addParticipant(Participant participant) {
        participants.add(participant);
    }

    public void setPairingStrategy(PairingStrategy pairingStrategy) {
        this.pairingStrategy = pairingStrategy;
    }

    public List<Participant> arrangeParticipants() {
        return pairingStrategy.arrange(new ArrayList<>(participants));
    }
}