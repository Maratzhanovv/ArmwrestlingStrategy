import java.util.List;

public interface PairingStrategy {
    List<Participant> arrange(List<Participant> participants);
}