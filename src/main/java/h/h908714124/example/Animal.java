package h.h908714124.example;

import com.google.auto.value.AutoValue;
import net.autobuilder.AutoBuilder;

@AutoBuilder
@AutoValue
abstract class Animal {

  abstract String name();

  abstract int legs();

}
