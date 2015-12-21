/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.navercorp.pinpoint.thrift.dto;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-12-21")
public class TJvmThreads implements org.apache.thrift.TBase<TJvmThreads, TJvmThreads._Fields>, java.io.Serializable, Cloneable, Comparable<TJvmThreads> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TJvmThreads");

  private static final org.apache.thrift.protocol.TField TIMED_WAITING_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("timedWaitingCount", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField WAITING_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("waitingCount", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField NEW_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("newCount", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField BLOCKED_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("blockedCount", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField RUNNABLE_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("runnableCount", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField TERMINATED_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("terminatedCount", org.apache.thrift.protocol.TType.I64, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TJvmThreadsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TJvmThreadsTupleSchemeFactory());
  }

  private long timedWaitingCount; // optional
  private long waitingCount; // optional
  private long newCount; // optional
  private long blockedCount; // optional
  private long runnableCount; // optional
  private long terminatedCount; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TIMED_WAITING_COUNT((short)1, "timedWaitingCount"),
    WAITING_COUNT((short)2, "waitingCount"),
    NEW_COUNT((short)3, "newCount"),
    BLOCKED_COUNT((short)4, "blockedCount"),
    RUNNABLE_COUNT((short)5, "runnableCount"),
    TERMINATED_COUNT((short)6, "terminatedCount");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TIMED_WAITING_COUNT
          return TIMED_WAITING_COUNT;
        case 2: // WAITING_COUNT
          return WAITING_COUNT;
        case 3: // NEW_COUNT
          return NEW_COUNT;
        case 4: // BLOCKED_COUNT
          return BLOCKED_COUNT;
        case 5: // RUNNABLE_COUNT
          return RUNNABLE_COUNT;
        case 6: // TERMINATED_COUNT
          return TERMINATED_COUNT;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TIMEDWAITINGCOUNT_ISSET_ID = 0;
  private static final int __WAITINGCOUNT_ISSET_ID = 1;
  private static final int __NEWCOUNT_ISSET_ID = 2;
  private static final int __BLOCKEDCOUNT_ISSET_ID = 3;
  private static final int __RUNNABLECOUNT_ISSET_ID = 4;
  private static final int __TERMINATEDCOUNT_ISSET_ID = 5;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.TIMED_WAITING_COUNT,_Fields.WAITING_COUNT,_Fields.NEW_COUNT,_Fields.BLOCKED_COUNT,_Fields.RUNNABLE_COUNT,_Fields.TERMINATED_COUNT};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TIMED_WAITING_COUNT, new org.apache.thrift.meta_data.FieldMetaData("timedWaitingCount", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.WAITING_COUNT, new org.apache.thrift.meta_data.FieldMetaData("waitingCount", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.NEW_COUNT, new org.apache.thrift.meta_data.FieldMetaData("newCount", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.BLOCKED_COUNT, new org.apache.thrift.meta_data.FieldMetaData("blockedCount", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.RUNNABLE_COUNT, new org.apache.thrift.meta_data.FieldMetaData("runnableCount", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.TERMINATED_COUNT, new org.apache.thrift.meta_data.FieldMetaData("terminatedCount", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TJvmThreads.class, metaDataMap);
  }

  public TJvmThreads() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TJvmThreads(TJvmThreads other) {
    __isset_bitfield = other.__isset_bitfield;
    this.timedWaitingCount = other.timedWaitingCount;
    this.waitingCount = other.waitingCount;
    this.newCount = other.newCount;
    this.blockedCount = other.blockedCount;
    this.runnableCount = other.runnableCount;
    this.terminatedCount = other.terminatedCount;
  }

  public TJvmThreads deepCopy() {
    return new TJvmThreads(this);
  }

  @Override
  public void clear() {
    setTimedWaitingCountIsSet(false);
    this.timedWaitingCount = 0;
    setWaitingCountIsSet(false);
    this.waitingCount = 0;
    setNewCountIsSet(false);
    this.newCount = 0;
    setBlockedCountIsSet(false);
    this.blockedCount = 0;
    setRunnableCountIsSet(false);
    this.runnableCount = 0;
    setTerminatedCountIsSet(false);
    this.terminatedCount = 0;
  }

  public long getTimedWaitingCount() {
    return this.timedWaitingCount;
  }

  public void setTimedWaitingCount(long timedWaitingCount) {
    this.timedWaitingCount = timedWaitingCount;
    setTimedWaitingCountIsSet(true);
  }

  public void unsetTimedWaitingCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TIMEDWAITINGCOUNT_ISSET_ID);
  }

  /** Returns true if field timedWaitingCount is set (has been assigned a value) and false otherwise */
  public boolean isSetTimedWaitingCount() {
    return EncodingUtils.testBit(__isset_bitfield, __TIMEDWAITINGCOUNT_ISSET_ID);
  }

  public void setTimedWaitingCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TIMEDWAITINGCOUNT_ISSET_ID, value);
  }

  public long getWaitingCount() {
    return this.waitingCount;
  }

  public void setWaitingCount(long waitingCount) {
    this.waitingCount = waitingCount;
    setWaitingCountIsSet(true);
  }

  public void unsetWaitingCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __WAITINGCOUNT_ISSET_ID);
  }

  /** Returns true if field waitingCount is set (has been assigned a value) and false otherwise */
  public boolean isSetWaitingCount() {
    return EncodingUtils.testBit(__isset_bitfield, __WAITINGCOUNT_ISSET_ID);
  }

  public void setWaitingCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __WAITINGCOUNT_ISSET_ID, value);
  }

  public long getNewCount() {
    return this.newCount;
  }

  public void setNewCount(long newCount) {
    this.newCount = newCount;
    setNewCountIsSet(true);
  }

  public void unsetNewCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NEWCOUNT_ISSET_ID);
  }

  /** Returns true if field newCount is set (has been assigned a value) and false otherwise */
  public boolean isSetNewCount() {
    return EncodingUtils.testBit(__isset_bitfield, __NEWCOUNT_ISSET_ID);
  }

  public void setNewCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NEWCOUNT_ISSET_ID, value);
  }

  public long getBlockedCount() {
    return this.blockedCount;
  }

  public void setBlockedCount(long blockedCount) {
    this.blockedCount = blockedCount;
    setBlockedCountIsSet(true);
  }

  public void unsetBlockedCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __BLOCKEDCOUNT_ISSET_ID);
  }

  /** Returns true if field blockedCount is set (has been assigned a value) and false otherwise */
  public boolean isSetBlockedCount() {
    return EncodingUtils.testBit(__isset_bitfield, __BLOCKEDCOUNT_ISSET_ID);
  }

  public void setBlockedCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __BLOCKEDCOUNT_ISSET_ID, value);
  }

  public long getRunnableCount() {
    return this.runnableCount;
  }

  public void setRunnableCount(long runnableCount) {
    this.runnableCount = runnableCount;
    setRunnableCountIsSet(true);
  }

  public void unsetRunnableCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __RUNNABLECOUNT_ISSET_ID);
  }

  /** Returns true if field runnableCount is set (has been assigned a value) and false otherwise */
  public boolean isSetRunnableCount() {
    return EncodingUtils.testBit(__isset_bitfield, __RUNNABLECOUNT_ISSET_ID);
  }

  public void setRunnableCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __RUNNABLECOUNT_ISSET_ID, value);
  }

  public long getTerminatedCount() {
    return this.terminatedCount;
  }

  public void setTerminatedCount(long terminatedCount) {
    this.terminatedCount = terminatedCount;
    setTerminatedCountIsSet(true);
  }

  public void unsetTerminatedCount() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TERMINATEDCOUNT_ISSET_ID);
  }

  /** Returns true if field terminatedCount is set (has been assigned a value) and false otherwise */
  public boolean isSetTerminatedCount() {
    return EncodingUtils.testBit(__isset_bitfield, __TERMINATEDCOUNT_ISSET_ID);
  }

  public void setTerminatedCountIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TERMINATEDCOUNT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TIMED_WAITING_COUNT:
      if (value == null) {
        unsetTimedWaitingCount();
      } else {
        setTimedWaitingCount((Long)value);
      }
      break;

    case WAITING_COUNT:
      if (value == null) {
        unsetWaitingCount();
      } else {
        setWaitingCount((Long)value);
      }
      break;

    case NEW_COUNT:
      if (value == null) {
        unsetNewCount();
      } else {
        setNewCount((Long)value);
      }
      break;

    case BLOCKED_COUNT:
      if (value == null) {
        unsetBlockedCount();
      } else {
        setBlockedCount((Long)value);
      }
      break;

    case RUNNABLE_COUNT:
      if (value == null) {
        unsetRunnableCount();
      } else {
        setRunnableCount((Long)value);
      }
      break;

    case TERMINATED_COUNT:
      if (value == null) {
        unsetTerminatedCount();
      } else {
        setTerminatedCount((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TIMED_WAITING_COUNT:
      return Long.valueOf(getTimedWaitingCount());

    case WAITING_COUNT:
      return Long.valueOf(getWaitingCount());

    case NEW_COUNT:
      return Long.valueOf(getNewCount());

    case BLOCKED_COUNT:
      return Long.valueOf(getBlockedCount());

    case RUNNABLE_COUNT:
      return Long.valueOf(getRunnableCount());

    case TERMINATED_COUNT:
      return Long.valueOf(getTerminatedCount());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TIMED_WAITING_COUNT:
      return isSetTimedWaitingCount();
    case WAITING_COUNT:
      return isSetWaitingCount();
    case NEW_COUNT:
      return isSetNewCount();
    case BLOCKED_COUNT:
      return isSetBlockedCount();
    case RUNNABLE_COUNT:
      return isSetRunnableCount();
    case TERMINATED_COUNT:
      return isSetTerminatedCount();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TJvmThreads)
      return this.equals((TJvmThreads)that);
    return false;
  }

  public boolean equals(TJvmThreads that) {
    if (that == null)
      return false;

    boolean this_present_timedWaitingCount = true && this.isSetTimedWaitingCount();
    boolean that_present_timedWaitingCount = true && that.isSetTimedWaitingCount();
    if (this_present_timedWaitingCount || that_present_timedWaitingCount) {
      if (!(this_present_timedWaitingCount && that_present_timedWaitingCount))
        return false;
      if (this.timedWaitingCount != that.timedWaitingCount)
        return false;
    }

    boolean this_present_waitingCount = true && this.isSetWaitingCount();
    boolean that_present_waitingCount = true && that.isSetWaitingCount();
    if (this_present_waitingCount || that_present_waitingCount) {
      if (!(this_present_waitingCount && that_present_waitingCount))
        return false;
      if (this.waitingCount != that.waitingCount)
        return false;
    }

    boolean this_present_newCount = true && this.isSetNewCount();
    boolean that_present_newCount = true && that.isSetNewCount();
    if (this_present_newCount || that_present_newCount) {
      if (!(this_present_newCount && that_present_newCount))
        return false;
      if (this.newCount != that.newCount)
        return false;
    }

    boolean this_present_blockedCount = true && this.isSetBlockedCount();
    boolean that_present_blockedCount = true && that.isSetBlockedCount();
    if (this_present_blockedCount || that_present_blockedCount) {
      if (!(this_present_blockedCount && that_present_blockedCount))
        return false;
      if (this.blockedCount != that.blockedCount)
        return false;
    }

    boolean this_present_runnableCount = true && this.isSetRunnableCount();
    boolean that_present_runnableCount = true && that.isSetRunnableCount();
    if (this_present_runnableCount || that_present_runnableCount) {
      if (!(this_present_runnableCount && that_present_runnableCount))
        return false;
      if (this.runnableCount != that.runnableCount)
        return false;
    }

    boolean this_present_terminatedCount = true && this.isSetTerminatedCount();
    boolean that_present_terminatedCount = true && that.isSetTerminatedCount();
    if (this_present_terminatedCount || that_present_terminatedCount) {
      if (!(this_present_terminatedCount && that_present_terminatedCount))
        return false;
      if (this.terminatedCount != that.terminatedCount)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_timedWaitingCount = true && (isSetTimedWaitingCount());
    list.add(present_timedWaitingCount);
    if (present_timedWaitingCount)
      list.add(timedWaitingCount);

    boolean present_waitingCount = true && (isSetWaitingCount());
    list.add(present_waitingCount);
    if (present_waitingCount)
      list.add(waitingCount);

    boolean present_newCount = true && (isSetNewCount());
    list.add(present_newCount);
    if (present_newCount)
      list.add(newCount);

    boolean present_blockedCount = true && (isSetBlockedCount());
    list.add(present_blockedCount);
    if (present_blockedCount)
      list.add(blockedCount);

    boolean present_runnableCount = true && (isSetRunnableCount());
    list.add(present_runnableCount);
    if (present_runnableCount)
      list.add(runnableCount);

    boolean present_terminatedCount = true && (isSetTerminatedCount());
    list.add(present_terminatedCount);
    if (present_terminatedCount)
      list.add(terminatedCount);

    return list.hashCode();
  }

  @Override
  public int compareTo(TJvmThreads other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTimedWaitingCount()).compareTo(other.isSetTimedWaitingCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimedWaitingCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timedWaitingCount, other.timedWaitingCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWaitingCount()).compareTo(other.isSetWaitingCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWaitingCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.waitingCount, other.waitingCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNewCount()).compareTo(other.isSetNewCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNewCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.newCount, other.newCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBlockedCount()).compareTo(other.isSetBlockedCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBlockedCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.blockedCount, other.blockedCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRunnableCount()).compareTo(other.isSetRunnableCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRunnableCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.runnableCount, other.runnableCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTerminatedCount()).compareTo(other.isSetTerminatedCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTerminatedCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.terminatedCount, other.terminatedCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TJvmThreads(");
    boolean first = true;

    if (isSetTimedWaitingCount()) {
      sb.append("timedWaitingCount:");
      sb.append(this.timedWaitingCount);
      first = false;
    }
    if (isSetWaitingCount()) {
      if (!first) sb.append(", ");
      sb.append("waitingCount:");
      sb.append(this.waitingCount);
      first = false;
    }
    if (isSetNewCount()) {
      if (!first) sb.append(", ");
      sb.append("newCount:");
      sb.append(this.newCount);
      first = false;
    }
    if (isSetBlockedCount()) {
      if (!first) sb.append(", ");
      sb.append("blockedCount:");
      sb.append(this.blockedCount);
      first = false;
    }
    if (isSetRunnableCount()) {
      if (!first) sb.append(", ");
      sb.append("runnableCount:");
      sb.append(this.runnableCount);
      first = false;
    }
    if (isSetTerminatedCount()) {
      if (!first) sb.append(", ");
      sb.append("terminatedCount:");
      sb.append(this.terminatedCount);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TJvmThreadsStandardSchemeFactory implements SchemeFactory {
    public TJvmThreadsStandardScheme getScheme() {
      return new TJvmThreadsStandardScheme();
    }
  }

  private static class TJvmThreadsStandardScheme extends StandardScheme<TJvmThreads> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TJvmThreads struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TIMED_WAITING_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.timedWaitingCount = iprot.readI64();
              struct.setTimedWaitingCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // WAITING_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.waitingCount = iprot.readI64();
              struct.setWaitingCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NEW_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.newCount = iprot.readI64();
              struct.setNewCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // BLOCKED_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.blockedCount = iprot.readI64();
              struct.setBlockedCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // RUNNABLE_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.runnableCount = iprot.readI64();
              struct.setRunnableCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // TERMINATED_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.terminatedCount = iprot.readI64();
              struct.setTerminatedCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TJvmThreads struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetTimedWaitingCount()) {
        oprot.writeFieldBegin(TIMED_WAITING_COUNT_FIELD_DESC);
        oprot.writeI64(struct.timedWaitingCount);
        oprot.writeFieldEnd();
      }
      if (struct.isSetWaitingCount()) {
        oprot.writeFieldBegin(WAITING_COUNT_FIELD_DESC);
        oprot.writeI64(struct.waitingCount);
        oprot.writeFieldEnd();
      }
      if (struct.isSetNewCount()) {
        oprot.writeFieldBegin(NEW_COUNT_FIELD_DESC);
        oprot.writeI64(struct.newCount);
        oprot.writeFieldEnd();
      }
      if (struct.isSetBlockedCount()) {
        oprot.writeFieldBegin(BLOCKED_COUNT_FIELD_DESC);
        oprot.writeI64(struct.blockedCount);
        oprot.writeFieldEnd();
      }
      if (struct.isSetRunnableCount()) {
        oprot.writeFieldBegin(RUNNABLE_COUNT_FIELD_DESC);
        oprot.writeI64(struct.runnableCount);
        oprot.writeFieldEnd();
      }
      if (struct.isSetTerminatedCount()) {
        oprot.writeFieldBegin(TERMINATED_COUNT_FIELD_DESC);
        oprot.writeI64(struct.terminatedCount);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TJvmThreadsTupleSchemeFactory implements SchemeFactory {
    public TJvmThreadsTupleScheme getScheme() {
      return new TJvmThreadsTupleScheme();
    }
  }

  private static class TJvmThreadsTupleScheme extends TupleScheme<TJvmThreads> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TJvmThreads struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTimedWaitingCount()) {
        optionals.set(0);
      }
      if (struct.isSetWaitingCount()) {
        optionals.set(1);
      }
      if (struct.isSetNewCount()) {
        optionals.set(2);
      }
      if (struct.isSetBlockedCount()) {
        optionals.set(3);
      }
      if (struct.isSetRunnableCount()) {
        optionals.set(4);
      }
      if (struct.isSetTerminatedCount()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetTimedWaitingCount()) {
        oprot.writeI64(struct.timedWaitingCount);
      }
      if (struct.isSetWaitingCount()) {
        oprot.writeI64(struct.waitingCount);
      }
      if (struct.isSetNewCount()) {
        oprot.writeI64(struct.newCount);
      }
      if (struct.isSetBlockedCount()) {
        oprot.writeI64(struct.blockedCount);
      }
      if (struct.isSetRunnableCount()) {
        oprot.writeI64(struct.runnableCount);
      }
      if (struct.isSetTerminatedCount()) {
        oprot.writeI64(struct.terminatedCount);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TJvmThreads struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.timedWaitingCount = iprot.readI64();
        struct.setTimedWaitingCountIsSet(true);
      }
      if (incoming.get(1)) {
        struct.waitingCount = iprot.readI64();
        struct.setWaitingCountIsSet(true);
      }
      if (incoming.get(2)) {
        struct.newCount = iprot.readI64();
        struct.setNewCountIsSet(true);
      }
      if (incoming.get(3)) {
        struct.blockedCount = iprot.readI64();
        struct.setBlockedCountIsSet(true);
      }
      if (incoming.get(4)) {
        struct.runnableCount = iprot.readI64();
        struct.setRunnableCountIsSet(true);
      }
      if (incoming.get(5)) {
        struct.terminatedCount = iprot.readI64();
        struct.setTerminatedCountIsSet(true);
      }
    }
  }

}

