// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: environment.proto

// Protobuf Java Version: 3.25.3
package sensor;

public interface CalibrationDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sensor.CalibrationData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string sensor_id = 1;</code>
   * @return The sensorId.
   */
  java.lang.String getSensorId();
  /**
   * <code>string sensor_id = 1;</code>
   * @return The bytes for sensorId.
   */
  com.google.protobuf.ByteString
      getSensorIdBytes();

  /**
   * <code>double t_offset = 2;</code>
   * @return The tOffset.
   */
  double getTOffset();

  /**
   * <code>double h_offset = 3;</code>
   * @return The hOffset.
   */
  double getHOffset();

  /**
   * <code>double pm25_factor = 4;</code>
   * @return The pm25Factor.
   */
  double getPm25Factor();
}
