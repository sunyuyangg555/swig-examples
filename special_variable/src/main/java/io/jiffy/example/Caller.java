/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.jiffy.example;

public class Caller {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Caller(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Caller obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        special_variableJNI.delete_Caller(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Caller() {
    this(special_variableJNI.new_Caller(), true);
  }

  public void delCallback() {
    special_variableJNI.Caller_delCallback(swigCPtr, this);
  }

  public void setCallback(Callback cb) {
    special_variableJNI.Caller_setCallback(swigCPtr, this, Callback.getCPtr(cb), cb);
  }

  public void call() {
    special_variableJNI.Caller_call(swigCPtr, this);
  }

}