/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package mcl.bn254;

public class Ec1 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Ec1(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Ec1 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        BN254JNI.delete_Ec1(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof Ec1)) return false;
    return equals((Ec1)obj);
  }

  public Ec1() {
    this(BN254JNI.new_Ec1__SWIG_0(), true);
  }

  public Ec1(Ec1 x) {
    this(BN254JNI.new_Ec1__SWIG_1(Ec1.getCPtr(x), x), true);
  }

  public Ec1(Fp x, Fp y) {
    this(BN254JNI.new_Ec1__SWIG_2(Fp.getCPtr(x), x, Fp.getCPtr(y), y), true);
  }

  public Ec1(Fp x, Fp y, Fp z) {
    this(BN254JNI.new_Ec1__SWIG_3(Fp.getCPtr(x), x, Fp.getCPtr(y), y, Fp.getCPtr(z), z), true);
  }

  public boolean isValid() {
    return BN254JNI.Ec1_isValid(swigCPtr, this);
  }

  public void set(Fp x, Fp y) {
    BN254JNI.Ec1_set__SWIG_0(swigCPtr, this, Fp.getCPtr(x), x, Fp.getCPtr(y), y);
  }

  public void set(Fp x, Fp y, Fp z) {
    BN254JNI.Ec1_set__SWIG_1(swigCPtr, this, Fp.getCPtr(x), x, Fp.getCPtr(y), y, Fp.getCPtr(z), z);
  }

  public void set(String str) {
    BN254JNI.Ec1_set__SWIG_2(swigCPtr, this, str);
  }

  public String toString() {
    return BN254JNI.Ec1_toString(swigCPtr, this);
  }

  public boolean equals(Ec1 rhs) {
    return BN254JNI.Ec1_equals(swigCPtr, this, Ec1.getCPtr(rhs), rhs);
  }

  public boolean isZero() {
    return BN254JNI.Ec1_isZero(swigCPtr, this);
  }

  public void clear() {
    BN254JNI.Ec1_clear(swigCPtr, this);
  }

  public void dbl() {
    BN254JNI.Ec1_dbl(swigCPtr, this);
  }

  public void neg() {
    BN254JNI.Ec1_neg(swigCPtr, this);
  }

  public void add(Ec1 rhs) {
    BN254JNI.Ec1_add(swigCPtr, this, Ec1.getCPtr(rhs), rhs);
  }

  public void sub(Ec1 rhs) {
    BN254JNI.Ec1_sub(swigCPtr, this, Ec1.getCPtr(rhs), rhs);
  }

  public void mul(Mpz rhs) {
    BN254JNI.Ec1_mul(swigCPtr, this, Mpz.getCPtr(rhs), rhs);
  }

  public Fp getX() {
    return new Fp(BN254JNI.Ec1_getX(swigCPtr, this), false);
  }

  public Fp getY() {
    return new Fp(BN254JNI.Ec1_getY(swigCPtr, this), false);
  }

  public Fp getZ() {
    return new Fp(BN254JNI.Ec1_getZ(swigCPtr, this), false);
  }

}
