/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.storm.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)")
public class ExecutorAggregateStats implements org.apache.storm.thrift.TBase<ExecutorAggregateStats, ExecutorAggregateStats._Fields>, java.io.Serializable, Cloneable, Comparable<ExecutorAggregateStats> {
  private static final org.apache.storm.thrift.protocol.TStruct STRUCT_DESC = new org.apache.storm.thrift.protocol.TStruct("ExecutorAggregateStats");

  private static final org.apache.storm.thrift.protocol.TField EXEC_SUMMARY_FIELD_DESC = new org.apache.storm.thrift.protocol.TField("exec_summary", org.apache.storm.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.storm.thrift.protocol.TField STATS_FIELD_DESC = new org.apache.storm.thrift.protocol.TField("stats", org.apache.storm.thrift.protocol.TType.STRUCT, (short)2);

  private static final org.apache.storm.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ExecutorAggregateStatsStandardSchemeFactory();
  private static final org.apache.storm.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ExecutorAggregateStatsTupleSchemeFactory();

  private @org.apache.storm.thrift.annotation.Nullable ExecutorSummary exec_summary; // optional
  private @org.apache.storm.thrift.annotation.Nullable ComponentAggregateStats stats; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.storm.thrift.TFieldIdEnum {
    EXEC_SUMMARY((short)1, "exec_summary"),
    STATS((short)2, "stats");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.storm.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // EXEC_SUMMARY
          return EXEC_SUMMARY;
        case 2: // STATS
          return STATS;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.storm.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.EXEC_SUMMARY,_Fields.STATS};
  public static final java.util.Map<_Fields, org.apache.storm.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.storm.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.storm.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.EXEC_SUMMARY, new org.apache.storm.thrift.meta_data.FieldMetaData("exec_summary", org.apache.storm.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.storm.thrift.meta_data.StructMetaData(org.apache.storm.thrift.protocol.TType.STRUCT, ExecutorSummary.class)));
    tmpMap.put(_Fields.STATS, new org.apache.storm.thrift.meta_data.FieldMetaData("stats", org.apache.storm.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.storm.thrift.meta_data.StructMetaData(org.apache.storm.thrift.protocol.TType.STRUCT, ComponentAggregateStats.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.storm.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ExecutorAggregateStats.class, metaDataMap);
  }

  public ExecutorAggregateStats() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ExecutorAggregateStats(ExecutorAggregateStats other) {
    if (other.is_set_exec_summary()) {
      this.exec_summary = new ExecutorSummary(other.exec_summary);
    }
    if (other.is_set_stats()) {
      this.stats = new ComponentAggregateStats(other.stats);
    }
  }

  public ExecutorAggregateStats deepCopy() {
    return new ExecutorAggregateStats(this);
  }

  @Override
  public void clear() {
    this.exec_summary = null;
    this.stats = null;
  }

  @org.apache.storm.thrift.annotation.Nullable
  public ExecutorSummary get_exec_summary() {
    return this.exec_summary;
  }

  public void set_exec_summary(@org.apache.storm.thrift.annotation.Nullable ExecutorSummary exec_summary) {
    this.exec_summary = exec_summary;
  }

  public void unset_exec_summary() {
    this.exec_summary = null;
  }

  /** Returns true if field exec_summary is set (has been assigned a value) and false otherwise */
  public boolean is_set_exec_summary() {
    return this.exec_summary != null;
  }

  public void set_exec_summary_isSet(boolean value) {
    if (!value) {
      this.exec_summary = null;
    }
  }

  @org.apache.storm.thrift.annotation.Nullable
  public ComponentAggregateStats get_stats() {
    return this.stats;
  }

  public void set_stats(@org.apache.storm.thrift.annotation.Nullable ComponentAggregateStats stats) {
    this.stats = stats;
  }

  public void unset_stats() {
    this.stats = null;
  }

  /** Returns true if field stats is set (has been assigned a value) and false otherwise */
  public boolean is_set_stats() {
    return this.stats != null;
  }

  public void set_stats_isSet(boolean value) {
    if (!value) {
      this.stats = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.storm.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case EXEC_SUMMARY:
      if (value == null) {
        unset_exec_summary();
      } else {
        set_exec_summary((ExecutorSummary)value);
      }
      break;

    case STATS:
      if (value == null) {
        unset_stats();
      } else {
        set_stats((ComponentAggregateStats)value);
      }
      break;

    }
  }

  @org.apache.storm.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case EXEC_SUMMARY:
      return get_exec_summary();

    case STATS:
      return get_stats();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case EXEC_SUMMARY:
      return is_set_exec_summary();
    case STATS:
      return is_set_stats();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof ExecutorAggregateStats)
      return this.equals((ExecutorAggregateStats)that);
    return false;
  }

  public boolean equals(ExecutorAggregateStats that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_exec_summary = true && this.is_set_exec_summary();
    boolean that_present_exec_summary = true && that.is_set_exec_summary();
    if (this_present_exec_summary || that_present_exec_summary) {
      if (!(this_present_exec_summary && that_present_exec_summary))
        return false;
      if (!this.exec_summary.equals(that.exec_summary))
        return false;
    }

    boolean this_present_stats = true && this.is_set_stats();
    boolean that_present_stats = true && that.is_set_stats();
    if (this_present_stats || that_present_stats) {
      if (!(this_present_stats && that_present_stats))
        return false;
      if (!this.stats.equals(that.stats))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((is_set_exec_summary()) ? 131071 : 524287);
    if (is_set_exec_summary())
      hashCode = hashCode * 8191 + exec_summary.hashCode();

    hashCode = hashCode * 8191 + ((is_set_stats()) ? 131071 : 524287);
    if (is_set_stats())
      hashCode = hashCode * 8191 + stats.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ExecutorAggregateStats other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(is_set_exec_summary()).compareTo(other.is_set_exec_summary());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_exec_summary()) {
      lastComparison = org.apache.storm.thrift.TBaseHelper.compareTo(this.exec_summary, other.exec_summary);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(is_set_stats()).compareTo(other.is_set_stats());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_stats()) {
      lastComparison = org.apache.storm.thrift.TBaseHelper.compareTo(this.stats, other.stats);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.storm.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.storm.thrift.protocol.TProtocol iprot) throws org.apache.storm.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.storm.thrift.protocol.TProtocol oprot) throws org.apache.storm.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ExecutorAggregateStats(");
    boolean first = true;

    if (is_set_exec_summary()) {
      sb.append("exec_summary:");
      if (this.exec_summary == null) {
        sb.append("null");
      } else {
        sb.append(this.exec_summary);
      }
      first = false;
    }
    if (is_set_stats()) {
      if (!first) sb.append(", ");
      sb.append("stats:");
      if (this.stats == null) {
        sb.append("null");
      } else {
        sb.append(this.stats);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.storm.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (exec_summary != null) {
      exec_summary.validate();
    }
    if (stats != null) {
      stats.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.storm.thrift.protocol.TCompactProtocol(new org.apache.storm.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.storm.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.storm.thrift.protocol.TCompactProtocol(new org.apache.storm.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.storm.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ExecutorAggregateStatsStandardSchemeFactory implements org.apache.storm.thrift.scheme.SchemeFactory {
    public ExecutorAggregateStatsStandardScheme getScheme() {
      return new ExecutorAggregateStatsStandardScheme();
    }
  }

  private static class ExecutorAggregateStatsStandardScheme extends org.apache.storm.thrift.scheme.StandardScheme<ExecutorAggregateStats> {

    public void read(org.apache.storm.thrift.protocol.TProtocol iprot, ExecutorAggregateStats struct) throws org.apache.storm.thrift.TException {
      org.apache.storm.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.storm.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // EXEC_SUMMARY
            if (schemeField.type == org.apache.storm.thrift.protocol.TType.STRUCT) {
              struct.exec_summary = new ExecutorSummary();
              struct.exec_summary.read(iprot);
              struct.set_exec_summary_isSet(true);
            } else { 
              org.apache.storm.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STATS
            if (schemeField.type == org.apache.storm.thrift.protocol.TType.STRUCT) {
              struct.stats = new ComponentAggregateStats();
              struct.stats.read(iprot);
              struct.set_stats_isSet(true);
            } else { 
              org.apache.storm.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.storm.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.storm.thrift.protocol.TProtocol oprot, ExecutorAggregateStats struct) throws org.apache.storm.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.exec_summary != null) {
        if (struct.is_set_exec_summary()) {
          oprot.writeFieldBegin(EXEC_SUMMARY_FIELD_DESC);
          struct.exec_summary.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.stats != null) {
        if (struct.is_set_stats()) {
          oprot.writeFieldBegin(STATS_FIELD_DESC);
          struct.stats.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ExecutorAggregateStatsTupleSchemeFactory implements org.apache.storm.thrift.scheme.SchemeFactory {
    public ExecutorAggregateStatsTupleScheme getScheme() {
      return new ExecutorAggregateStatsTupleScheme();
    }
  }

  private static class ExecutorAggregateStatsTupleScheme extends org.apache.storm.thrift.scheme.TupleScheme<ExecutorAggregateStats> {

    @Override
    public void write(org.apache.storm.thrift.protocol.TProtocol prot, ExecutorAggregateStats struct) throws org.apache.storm.thrift.TException {
      org.apache.storm.thrift.protocol.TTupleProtocol oprot = (org.apache.storm.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.is_set_exec_summary()) {
        optionals.set(0);
      }
      if (struct.is_set_stats()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.is_set_exec_summary()) {
        struct.exec_summary.write(oprot);
      }
      if (struct.is_set_stats()) {
        struct.stats.write(oprot);
      }
    }

    @Override
    public void read(org.apache.storm.thrift.protocol.TProtocol prot, ExecutorAggregateStats struct) throws org.apache.storm.thrift.TException {
      org.apache.storm.thrift.protocol.TTupleProtocol iprot = (org.apache.storm.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.exec_summary = new ExecutorSummary();
        struct.exec_summary.read(iprot);
        struct.set_exec_summary_isSet(true);
      }
      if (incoming.get(1)) {
        struct.stats = new ComponentAggregateStats();
        struct.stats.read(iprot);
        struct.set_stats_isSet(true);
      }
    }
  }

  private static <S extends org.apache.storm.thrift.scheme.IScheme> S scheme(org.apache.storm.thrift.protocol.TProtocol proto) {
    return (org.apache.storm.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

