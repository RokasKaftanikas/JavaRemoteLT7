package DesignPatters.decorator;

public interface FragStatistics {
    int incrementFragCount();
    int incrementDeathCount();
    void reset();
}
