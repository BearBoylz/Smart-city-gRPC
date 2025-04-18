// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: public_transpot.proto

// Protobuf Java Version: 3.25.3
package transport;

public final class PublicTranspot {
  private PublicTranspot() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_transport_VehicleRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_transport_VehicleRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_transport_VehiclePosition_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_transport_VehiclePosition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_transport_RouteRecord_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_transport_RouteRecord_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_transport_FleetSummary_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_transport_FleetSummary_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025public_transpot.proto\022\ttransport\"$\n\016Ve" +
      "hicleRequest\022\022\n\nvehicle_id\030\001 \001(\t\"Z\n\017Vehi" +
      "clePosition\022\022\n\nvehicle_id\030\001 \001(\t\022\013\n\003lat\030\002" +
      " \001(\001\022\013\n\003lon\030\003 \001(\001\022\r\n\005speed\030\004 \001(\001\022\n\n\002ts\030\005" +
      " \001(\003\"0\n\013RouteRecord\022\022\n\nvehicle_id\030\001 \001(\t\022" +
      "\r\n\005stops\030\002 \003(\t\"3\n\014FleetSummary\022\020\n\010vehicl" +
      "es\030\001 \001(\r\022\021\n\tavg_speed\030\002 \001(\0012\257\002\n\026PublicTr" +
      "ansportService\022C\n\nGetVehicle\022\031.transport" +
      ".VehicleRequest\032\032.transport.VehiclePosit" +
      "ion\022F\n\013StreamFleet\022\031.transport.VehicleRe" +
      "quest\032\032.transport.VehiclePosition0\001\022@\n\013U" +
      "ploadRoute\022\026.transport.RouteRecord\032\027.tra" +
      "nsport.FleetSummary(\001\022F\n\014FleetControl\022\026." +
      "transport.RouteRecord\032\032.transport.Vehicl" +
      "ePosition(\0010\001B\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_transport_VehicleRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_transport_VehicleRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_transport_VehicleRequest_descriptor,
        new java.lang.String[] { "VehicleId", });
    internal_static_transport_VehiclePosition_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_transport_VehiclePosition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_transport_VehiclePosition_descriptor,
        new java.lang.String[] { "VehicleId", "Lat", "Lon", "Speed", "Ts", });
    internal_static_transport_RouteRecord_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_transport_RouteRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_transport_RouteRecord_descriptor,
        new java.lang.String[] { "VehicleId", "Stops", });
    internal_static_transport_FleetSummary_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_transport_FleetSummary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_transport_FleetSummary_descriptor,
        new java.lang.String[] { "Vehicles", "AvgSpeed", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
