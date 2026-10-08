package Items;

import main.LateFeeCalc;

/**
 * Single Responsibility Principle
 */
public interface LibraryItem extends LateFeeCalc {
    String getTitle();
    String getUniqueId();
    double getValue();
}
