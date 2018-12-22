package h.h908714124.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnimalTest {

  @Test
  void testBuilder() {
    Animal bonnie = Animal_Builder.builder()
        .legs(4)
        .name("Bonnie")
        .build();
    assertEquals(4, bonnie.legs());
  }
}