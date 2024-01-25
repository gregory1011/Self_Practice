package day34_abstraction.carTask;

import day34_abstraction.carTask.AutoPark;

public interface AutoPilot extends AutoPark {
    boolean hasAutoPilot = true;

    void selfDrive();

    @Override
    default void autoPark() {

    }
}
