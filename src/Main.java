import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArmwrestlingTournament tournament =
                new ArmwrestlingTournament(new RegistrationOrderPairing());

        tournament.addParticipant(new Participant("Madi", 68));
        tournament.addParticipant(new Participant("Dias", 102));
        tournament.addParticipant(new Participant("Miras", 82));
        tournament.addParticipant(new Participant("Aibek", 70));
        tournament.addParticipant(new Participant("Arman", 95));
        tournament.addParticipant(new Participant("Ali", 88));

        System.out.println("Registration order:");
        printMatches(tournament.arrangeParticipants());

        tournament.setPairingStrategy(new WeightBasedPairing());
        System.out.println("\nWeight based:");
        printMatches(tournament.arrangeParticipants());

        tournament.setPairingStrategy(new RandomPairing());
        System.out.println("\nRandom:");
        printMatches(tournament.arrangeParticipants());
    }

    private static void printMatches(List<Participant> participants) {
        for (int i = 0; i < participants.size(); i += 2) {
            if (i + 1 < participants.size()) {
                System.out.println(
                        participants.get(i) + " vs " + participants.get(i + 1)
                );
            } else {
                System.out.println(
                        participants.get(i) + " advances without a match"
                );
            }
        }
    }
}