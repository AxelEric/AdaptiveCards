/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.adaptivecards.objectmodel;

public enum IconPlacement {
  AboveTitle(0),
  LeftOfTitle;

  public final int swigValue() {
    return swigValue;
  }

  public static IconPlacement swigToEnum(int swigValue) {
    IconPlacement[] swigValues = IconPlacement.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (IconPlacement swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + IconPlacement.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private IconPlacement() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private IconPlacement(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private IconPlacement(IconPlacement swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

