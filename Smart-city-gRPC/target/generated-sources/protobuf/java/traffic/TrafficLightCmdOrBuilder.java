// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: traffic_light.proto

// Protobuf Java Version: 3.25.3
package traffic;

public interface TrafficLightCmdOrBuilder extends
    // @@protoc_insertion_point(interface_extends:traffic.TrafficLightCmd)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string intersection_id = 1;</code>
   * @return The intersectionId.
   */
  java.lang.String getIntersectionId();
  /**
   * <code>string intersection_id = 1;</code>
   * @return The bytes for intersectionId.
   */
  com.google.protobuf.ByteString
      getIntersectionIdBytes();

  /**
   * <code>.traffic.LightColor override = 2;</code>
   * @return The enum numeric value on the wire for override.
   */
  int getOverrideValue();
  /**
   * <code>.traffic.LightColor override = 2;</code>
   * @return The override.
   */
  traffic.LightColor getOverride();
}
