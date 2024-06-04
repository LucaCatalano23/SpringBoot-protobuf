// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: ErrorInfo.proto
// Protobuf Java Version: 4.27.0

package com.luca.error.protobuf;

public final class ErrorInfoProto {
  private ErrorInfoProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 0,
      /* suffix= */ "",
      ErrorInfoProto.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ErrorInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.luca.proto.ErrorInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string timestamp = 1;</code>
     * @return The timestamp.
     */
    java.lang.String getTimestamp();
    /**
     * <code>string timestamp = 1;</code>
     * @return The bytes for timestamp.
     */
    com.google.protobuf.ByteString
        getTimestampBytes();

    /**
     * <code>string path = 2;</code>
     * @return The path.
     */
    java.lang.String getPath();
    /**
     * <code>string path = 2;</code>
     * @return The bytes for path.
     */
    com.google.protobuf.ByteString
        getPathBytes();

    /**
     * <code>int32 httpStatus = 3;</code>
     * @return The httpStatus.
     */
    int getHttpStatus();

    /**
     * <code>string message = 4;</code>
     * @return The message.
     */
    java.lang.String getMessage();
    /**
     * <code>string message = 4;</code>
     * @return The bytes for message.
     */
    com.google.protobuf.ByteString
        getMessageBytes();
  }
  /**
   * Protobuf type {@code com.luca.proto.ErrorInfo}
   */
  public static final class ErrorInfo extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:com.luca.proto.ErrorInfo)
      ErrorInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 0,
        /* suffix= */ "",
        ErrorInfo.class.getName());
    }
    // Use ErrorInfo.newBuilder() to construct.
    private ErrorInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private ErrorInfo() {
      timestamp_ = "";
      path_ = "";
      message_ = "";
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.luca.error.protobuf.ErrorInfoProto.internal_static_com_luca_proto_ErrorInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.luca.error.protobuf.ErrorInfoProto.internal_static_com_luca_proto_ErrorInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.luca.error.protobuf.ErrorInfoProto.ErrorInfo.class, com.luca.error.protobuf.ErrorInfoProto.ErrorInfo.Builder.class);
    }

    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object timestamp_ = "";
    /**
     * <code>string timestamp = 1;</code>
     * @return The timestamp.
     */
    @java.lang.Override
    public java.lang.String getTimestamp() {
      java.lang.Object ref = timestamp_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        timestamp_ = s;
        return s;
      }
    }
    /**
     * <code>string timestamp = 1;</code>
     * @return The bytes for timestamp.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTimestampBytes() {
      java.lang.Object ref = timestamp_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        timestamp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PATH_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object path_ = "";
    /**
     * <code>string path = 2;</code>
     * @return The path.
     */
    @java.lang.Override
    public java.lang.String getPath() {
      java.lang.Object ref = path_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        path_ = s;
        return s;
      }
    }
    /**
     * <code>string path = 2;</code>
     * @return The bytes for path.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getPathBytes() {
      java.lang.Object ref = path_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        path_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int HTTPSTATUS_FIELD_NUMBER = 3;
    private int httpStatus_ = 0;
    /**
     * <code>int32 httpStatus = 3;</code>
     * @return The httpStatus.
     */
    @java.lang.Override
    public int getHttpStatus() {
      return httpStatus_;
    }

    public static final int MESSAGE_FIELD_NUMBER = 4;
    @SuppressWarnings("serial")
    private volatile java.lang.Object message_ = "";
    /**
     * <code>string message = 4;</code>
     * @return The message.
     */
    @java.lang.Override
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      }
    }
    /**
     * <code>string message = 4;</code>
     * @return The bytes for message.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(timestamp_)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 1, timestamp_);
      }
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(path_)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 2, path_);
      }
      if (httpStatus_ != 0) {
        output.writeInt32(3, httpStatus_);
      }
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(message_)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 4, message_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(timestamp_)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(1, timestamp_);
      }
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(path_)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(2, path_);
      }
      if (httpStatus_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, httpStatus_);
      }
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(message_)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(4, message_);
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
      if (!(obj instanceof com.luca.error.protobuf.ErrorInfoProto.ErrorInfo)) {
        return super.equals(obj);
      }
      com.luca.error.protobuf.ErrorInfoProto.ErrorInfo other = (com.luca.error.protobuf.ErrorInfoProto.ErrorInfo) obj;

      if (!getTimestamp()
          .equals(other.getTimestamp())) return false;
      if (!getPath()
          .equals(other.getPath())) return false;
      if (getHttpStatus()
          != other.getHttpStatus()) return false;
      if (!getMessage()
          .equals(other.getMessage())) return false;
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
      hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + getTimestamp().hashCode();
      hash = (37 * hash) + PATH_FIELD_NUMBER;
      hash = (53 * hash) + getPath().hashCode();
      hash = (37 * hash) + HTTPSTATUS_FIELD_NUMBER;
      hash = (53 * hash) + getHttpStatus();
      hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getMessage().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.luca.error.protobuf.ErrorInfoProto.ErrorInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.luca.error.protobuf.ErrorInfoProto.ErrorInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.luca.error.protobuf.ErrorInfoProto.ErrorInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.luca.error.protobuf.ErrorInfoProto.ErrorInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.luca.error.protobuf.ErrorInfoProto.ErrorInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.luca.error.protobuf.ErrorInfoProto.ErrorInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.luca.error.protobuf.ErrorInfoProto.ErrorInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static com.luca.error.protobuf.ErrorInfoProto.ErrorInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.luca.error.protobuf.ErrorInfoProto.ErrorInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.luca.error.protobuf.ErrorInfoProto.ErrorInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.luca.error.protobuf.ErrorInfoProto.ErrorInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static com.luca.error.protobuf.ErrorInfoProto.ErrorInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.luca.error.protobuf.ErrorInfoProto.ErrorInfo prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.luca.proto.ErrorInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.luca.proto.ErrorInfo)
        com.luca.error.protobuf.ErrorInfoProto.ErrorInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.luca.error.protobuf.ErrorInfoProto.internal_static_com_luca_proto_ErrorInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.luca.error.protobuf.ErrorInfoProto.internal_static_com_luca_proto_ErrorInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.luca.error.protobuf.ErrorInfoProto.ErrorInfo.class, com.luca.error.protobuf.ErrorInfoProto.ErrorInfo.Builder.class);
      }

      // Construct using com.luca.error.protobuf.ErrorInfoProto.ErrorInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        timestamp_ = "";
        path_ = "";
        httpStatus_ = 0;
        message_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.luca.error.protobuf.ErrorInfoProto.internal_static_com_luca_proto_ErrorInfo_descriptor;
      }

      @java.lang.Override
      public com.luca.error.protobuf.ErrorInfoProto.ErrorInfo getDefaultInstanceForType() {
        return com.luca.error.protobuf.ErrorInfoProto.ErrorInfo.getDefaultInstance();
      }

      @java.lang.Override
      public com.luca.error.protobuf.ErrorInfoProto.ErrorInfo build() {
        com.luca.error.protobuf.ErrorInfoProto.ErrorInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.luca.error.protobuf.ErrorInfoProto.ErrorInfo buildPartial() {
        com.luca.error.protobuf.ErrorInfoProto.ErrorInfo result = new com.luca.error.protobuf.ErrorInfoProto.ErrorInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(com.luca.error.protobuf.ErrorInfoProto.ErrorInfo result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.timestamp_ = timestamp_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.path_ = path_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.httpStatus_ = httpStatus_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.message_ = message_;
        }
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.luca.error.protobuf.ErrorInfoProto.ErrorInfo) {
          return mergeFrom((com.luca.error.protobuf.ErrorInfoProto.ErrorInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.luca.error.protobuf.ErrorInfoProto.ErrorInfo other) {
        if (other == com.luca.error.protobuf.ErrorInfoProto.ErrorInfo.getDefaultInstance()) return this;
        if (!other.getTimestamp().isEmpty()) {
          timestamp_ = other.timestamp_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (!other.getPath().isEmpty()) {
          path_ = other.path_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        if (other.getHttpStatus() != 0) {
          setHttpStatus(other.getHttpStatus());
        }
        if (!other.getMessage().isEmpty()) {
          message_ = other.message_;
          bitField0_ |= 0x00000008;
          onChanged();
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
              case 10: {
                timestamp_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                path_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              case 24: {
                httpStatus_ = input.readInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              case 34: {
                message_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000008;
                break;
              } // case 34
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

      private java.lang.Object timestamp_ = "";
      /**
       * <code>string timestamp = 1;</code>
       * @return The timestamp.
       */
      public java.lang.String getTimestamp() {
        java.lang.Object ref = timestamp_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          timestamp_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string timestamp = 1;</code>
       * @return The bytes for timestamp.
       */
      public com.google.protobuf.ByteString
          getTimestampBytes() {
        java.lang.Object ref = timestamp_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          timestamp_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string timestamp = 1;</code>
       * @param value The timestamp to set.
       * @return This builder for chaining.
       */
      public Builder setTimestamp(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        timestamp_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string timestamp = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearTimestamp() {
        timestamp_ = getDefaultInstance().getTimestamp();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string timestamp = 1;</code>
       * @param value The bytes for timestamp to set.
       * @return This builder for chaining.
       */
      public Builder setTimestampBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        timestamp_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private java.lang.Object path_ = "";
      /**
       * <code>string path = 2;</code>
       * @return The path.
       */
      public java.lang.String getPath() {
        java.lang.Object ref = path_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          path_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string path = 2;</code>
       * @return The bytes for path.
       */
      public com.google.protobuf.ByteString
          getPathBytes() {
        java.lang.Object ref = path_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          path_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string path = 2;</code>
       * @param value The path to set.
       * @return This builder for chaining.
       */
      public Builder setPath(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        path_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>string path = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearPath() {
        path_ = getDefaultInstance().getPath();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <code>string path = 2;</code>
       * @param value The bytes for path to set.
       * @return This builder for chaining.
       */
      public Builder setPathBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        path_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      private int httpStatus_ ;
      /**
       * <code>int32 httpStatus = 3;</code>
       * @return The httpStatus.
       */
      @java.lang.Override
      public int getHttpStatus() {
        return httpStatus_;
      }
      /**
       * <code>int32 httpStatus = 3;</code>
       * @param value The httpStatus to set.
       * @return This builder for chaining.
       */
      public Builder setHttpStatus(int value) {

        httpStatus_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>int32 httpStatus = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearHttpStatus() {
        bitField0_ = (bitField0_ & ~0x00000004);
        httpStatus_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object message_ = "";
      /**
       * <code>string message = 4;</code>
       * @return The message.
       */
      public java.lang.String getMessage() {
        java.lang.Object ref = message_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          message_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string message = 4;</code>
       * @return The bytes for message.
       */
      public com.google.protobuf.ByteString
          getMessageBytes() {
        java.lang.Object ref = message_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          message_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string message = 4;</code>
       * @param value The message to set.
       * @return This builder for chaining.
       */
      public Builder setMessage(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        message_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>string message = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearMessage() {
        message_ = getDefaultInstance().getMessage();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }
      /**
       * <code>string message = 4;</code>
       * @param value The bytes for message to set.
       * @return This builder for chaining.
       */
      public Builder setMessageBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        message_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.luca.proto.ErrorInfo)
    }

    // @@protoc_insertion_point(class_scope:com.luca.proto.ErrorInfo)
    private static final com.luca.error.protobuf.ErrorInfoProto.ErrorInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.luca.error.protobuf.ErrorInfoProto.ErrorInfo();
    }

    public static com.luca.error.protobuf.ErrorInfoProto.ErrorInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ErrorInfo>
        PARSER = new com.google.protobuf.AbstractParser<ErrorInfo>() {
      @java.lang.Override
      public ErrorInfo parsePartialFrom(
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

    public static com.google.protobuf.Parser<ErrorInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ErrorInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.luca.error.protobuf.ErrorInfoProto.ErrorInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_luca_proto_ErrorInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_luca_proto_ErrorInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017ErrorInfo.proto\022\016com.luca.proto\"Q\n\tErr" +
      "orInfo\022\021\n\ttimestamp\030\001 \001(\t\022\014\n\004path\030\002 \001(\t\022" +
      "\022\n\nhttpStatus\030\003 \001(\005\022\017\n\007message\030\004 \001(\tB)\n\027" +
      "com.luca.error.protobufB\016ErrorInfoProtob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_luca_proto_ErrorInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_luca_proto_ErrorInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_luca_proto_ErrorInfo_descriptor,
        new java.lang.String[] { "Timestamp", "Path", "HttpStatus", "Message", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}