// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: public_transpot.proto

// Protobuf Java Version: 3.25.3
package transport;

/**
 * Protobuf type {@code transport.FleetSummary}
 */
public final class FleetSummary extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:transport.FleetSummary)
    FleetSummaryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FleetSummary.newBuilder() to construct.
  private FleetSummary(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FleetSummary() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FleetSummary();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return transport.PublicTranspot.internal_static_transport_FleetSummary_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return transport.PublicTranspot.internal_static_transport_FleetSummary_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            transport.FleetSummary.class, transport.FleetSummary.Builder.class);
  }

  public static final int VEHICLES_FIELD_NUMBER = 1;
  private int vehicles_ = 0;
  /**
   * <code>uint32 vehicles = 1;</code>
   * @return The vehicles.
   */
  @java.lang.Override
  public int getVehicles() {
    return vehicles_;
  }

  public static final int AVG_SPEED_FIELD_NUMBER = 2;
  private double avgSpeed_ = 0D;
  /**
   * <code>double avg_speed = 2;</code>
   * @return The avgSpeed.
   */
  @java.lang.Override
  public double getAvgSpeed() {
    return avgSpeed_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (vehicles_ != 0) {
      output.writeUInt32(1, vehicles_);
    }
    if (java.lang.Double.doubleToRawLongBits(avgSpeed_) != 0) {
      output.writeDouble(2, avgSpeed_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (vehicles_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, vehicles_);
    }
    if (java.lang.Double.doubleToRawLongBits(avgSpeed_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, avgSpeed_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof transport.FleetSummary)) {
      return super.equals(obj);
    }
    transport.FleetSummary other = (transport.FleetSummary) obj;

    if (getVehicles()
        != other.getVehicles()) return false;
    if (java.lang.Double.doubleToLongBits(getAvgSpeed())
        != java.lang.Double.doubleToLongBits(
            other.getAvgSpeed())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + VEHICLES_FIELD_NUMBER;
    hash = (53 * hash) + getVehicles();
    hash = (37 * hash) + AVG_SPEED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getAvgSpeed()));
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static transport.FleetSummary parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static transport.FleetSummary parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static transport.FleetSummary parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static transport.FleetSummary parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static transport.FleetSummary parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static transport.FleetSummary parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static transport.FleetSummary parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static transport.FleetSummary parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static transport.FleetSummary parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static transport.FleetSummary parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static transport.FleetSummary parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static transport.FleetSummary parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(transport.FleetSummary prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code transport.FleetSummary}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:transport.FleetSummary)
      transport.FleetSummaryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return transport.PublicTranspot.internal_static_transport_FleetSummary_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return transport.PublicTranspot.internal_static_transport_FleetSummary_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              transport.FleetSummary.class, transport.FleetSummary.Builder.class);
    }

    // Construct using transport.FleetSummary.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      vehicles_ = 0;
      avgSpeed_ = 0D;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return transport.PublicTranspot.internal_static_transport_FleetSummary_descriptor;
    }

    @java.lang.Override
    public transport.FleetSummary getDefaultInstanceForType() {
      return transport.FleetSummary.getDefaultInstance();
    }

    @java.lang.Override
    public transport.FleetSummary build() {
      transport.FleetSummary result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public transport.FleetSummary buildPartial() {
      transport.FleetSummary result = new transport.FleetSummary(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(transport.FleetSummary result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.vehicles_ = vehicles_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.avgSpeed_ = avgSpeed_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof transport.FleetSummary) {
        return mergeFrom((transport.FleetSummary)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(transport.FleetSummary other) {
      if (other == transport.FleetSummary.getDefaultInstance()) return this;
      if (other.getVehicles() != 0) {
        setVehicles(other.getVehicles());
      }
      if (other.getAvgSpeed() != 0D) {
        setAvgSpeed(other.getAvgSpeed());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              vehicles_ = input.readUInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 17: {
              avgSpeed_ = input.readDouble();
              bitField0_ |= 0x00000002;
              break;
            } // case 17
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private int vehicles_ ;
    /**
     * <code>uint32 vehicles = 1;</code>
     * @return The vehicles.
     */
    @java.lang.Override
    public int getVehicles() {
      return vehicles_;
    }
    /**
     * <code>uint32 vehicles = 1;</code>
     * @param value The vehicles to set.
     * @return This builder for chaining.
     */
    public Builder setVehicles(int value) {

      vehicles_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 vehicles = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearVehicles() {
      bitField0_ = (bitField0_ & ~0x00000001);
      vehicles_ = 0;
      onChanged();
      return this;
    }

    private double avgSpeed_ ;
    /**
     * <code>double avg_speed = 2;</code>
     * @return The avgSpeed.
     */
    @java.lang.Override
    public double getAvgSpeed() {
      return avgSpeed_;
    }
    /**
     * <code>double avg_speed = 2;</code>
     * @param value The avgSpeed to set.
     * @return This builder for chaining.
     */
    public Builder setAvgSpeed(double value) {

      avgSpeed_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>double avg_speed = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAvgSpeed() {
      bitField0_ = (bitField0_ & ~0x00000002);
      avgSpeed_ = 0D;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:transport.FleetSummary)
  }

  // @@protoc_insertion_point(class_scope:transport.FleetSummary)
  private static final transport.FleetSummary DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new transport.FleetSummary();
  }

  public static transport.FleetSummary getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FleetSummary>
      PARSER = new com.google.protobuf.AbstractParser<FleetSummary>() {
    @java.lang.Override
    public FleetSummary parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<FleetSummary> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FleetSummary> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public transport.FleetSummary getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

