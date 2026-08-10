package me.wikimor.lpc;

import me.wikmor.lpc.LPC;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SqueezeSpacesTest {

  @Test
  public void shouldSqueezeSpaces() {
    assertEquals(" ", LPC.squeezeSpaces("    "));
    assertEquals("[A] [B] C", LPC.squeezeSpaces("[A]  [B]  C"));
    assertEquals(" first second third ", LPC.squeezeSpaces("     first      second                third      "));
  }
}
