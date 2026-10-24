# Armwrestling Tournament — Strategy Pattern

This educational Java application demonstrates three interchangeable
participant ordering algorithms for tournament pairing.

Adjacent participants in the resulting list form a match.
An unpaired participant advances without a match.

## Pattern Components

- Strategy: PairingStrategy
- Concrete strategies: RegistrationOrderPairing, WeightBasedPairing,
  RandomPairing
- Context: ArmwrestlingTournament
- Client: Main

Main switches strategies at runtime on the same tournament object.
The context delegates ordering through the PairingStrategy interface.

## Clean Code Principles

1. Single Responsibility
   Each strategy handles one ordering algorithm.
   Main handles console output.

2. Meaningful Names
   Names such as WeightBasedPairing and arrangeParticipants
   clearly describe their purpose.

3. Polymorphism Instead of Type Conditionals
   The context delegates to the selected strategy without
   checking its concrete type using if or switch.

4. Dependency on Abstraction
   ArmwrestlingTournament depends on PairingStrategy,
   not on concrete strategy classes.

5. Open/Closed Principle
   RandomPairing adds a new ordering algorithm by implementing
   PairingStrategy. The context and other strategies remain unchanged.
   Main selects the additional strategy.

## Run

Open the project in IntelliJ IDEA and run Main.java.

## Scope

Weight-based pairing sorts all participants by weight and pairs
neighbors. It does not enforce official weight categories.
Random pairing may produce the same order on different runs.