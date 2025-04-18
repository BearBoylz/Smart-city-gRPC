// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: environment.proto

// Protobuf Java Version: 3.25.3
package sensor;

public final class Environment {
  private Environment() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensor_GetReadingRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensor_GetReadingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensor_SensorReading_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensor_SensorReading_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensor_CalibrationData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensor_CalibrationData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensor_CalibrationResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensor_CalibrationResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_sensor_TuneCmd_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_sensor_TuneCmd_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021environment.proto\022\006sensor\"&\n\021GetReadin" +
      "gRequest\022\021\n\tsensor_id\030\001 \001(\t\"j\n\rSensorRea" +
      "ding\022\021\n\tsensor_id\030\001 \001(\t\022\023\n\013temperature\030\002" +
      " \001(\001\022\020\n\010humidity\030\003 \001(\001\022\014\n\004pm25\030\004 \001(\001\022\021\n\t" +
      "timestamp\030\005 \001(\003\"]\n\017CalibrationData\022\021\n\tse" +
      "nsor_id\030\001 \001(\t\022\020\n\010t_offset\030\002 \001(\001\022\020\n\010h_off" +
      "set\030\003 \001(\001\022\023\n\013pm25_factor\030\004 \001(\001\"7\n\021Calibr" +
      "ationResult\022\021\n\tsensor_id\030\001 \001(\t\022\017\n\007applie" +
      "d\030\002 \001(\010\"1\n\007TuneCmd\022\021\n\tsensor_id\030\001 \001(\t\022\023\n" +
      "\013sample_rate\030\002 \001(\0012\241\002\n\032EnvironmentalSens" +
      "orService\022>\n\nGetReading\022\031.sensor.GetRead" +
      "ingRequest\032\025.sensor.SensorReading\022D\n\016Str" +
      "eamReadings\022\031.sensor.GetReadingRequest\032\025" +
      ".sensor.SensorReading0\001\022C\n\013UploadCalib\022\027" +
      ".sensor.CalibrationData\032\031.sensor.Calibra" +
      "tionResult(\001\0228\n\nLiveTuning\022\017.sensor.Tune" +
      "Cmd\032\025.sensor.SensorReading(\0010\001B\002P\001b\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_sensor_GetReadingRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_sensor_GetReadingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensor_GetReadingRequest_descriptor,
        new java.lang.String[] { "SensorId", });
    internal_static_sensor_SensorReading_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_sensor_SensorReading_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensor_SensorReading_descriptor,
        new java.lang.String[] { "SensorId", "Temperature", "Humidity", "Pm25", "Timestamp", });
    internal_static_sensor_CalibrationData_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_sensor_CalibrationData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensor_CalibrationData_descriptor,
        new java.lang.String[] { "SensorId", "TOffset", "HOffset", "Pm25Factor", });
    internal_static_sensor_CalibrationResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_sensor_CalibrationResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensor_CalibrationResult_descriptor,
        new java.lang.String[] { "SensorId", "Applied", });
    internal_static_sensor_TuneCmd_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_sensor_TuneCmd_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_sensor_TuneCmd_descriptor,
        new java.lang.String[] { "SensorId", "SampleRate", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
