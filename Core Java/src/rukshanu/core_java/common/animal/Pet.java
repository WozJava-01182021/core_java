package rukshanu.core_java.common.animal;

import rukshanu.core_java.common.Nameable;

public interface Pet extends Domesticatable, Nameable {
 public abstract boolean hasLicense();
 public abstract void beFriendly();
}
