// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/file_system_master.proto

package alluxio.grpc;

public interface OpenFilePOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.file.OpenFilePOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .alluxio.grpc.file.ReadPType readType = 1;</code>
   */
  boolean hasReadType();
  /**
   * <code>optional .alluxio.grpc.file.ReadPType readType = 1;</code>
   */
  alluxio.grpc.ReadPType getReadType();

  /**
   * <code>optional int32 maxUfsReadConcurrency = 2;</code>
   */
  boolean hasMaxUfsReadConcurrency();
  /**
   * <code>optional int32 maxUfsReadConcurrency = 2;</code>
   */
  int getMaxUfsReadConcurrency();

  /**
   * <code>optional .alluxio.grpc.file.FileSystemMasterCommonPOptions commonOptions = 3;</code>
   */
  boolean hasCommonOptions();
  /**
   * <code>optional .alluxio.grpc.file.FileSystemMasterCommonPOptions commonOptions = 3;</code>
   */
  alluxio.grpc.FileSystemMasterCommonPOptions getCommonOptions();
  /**
   * <code>optional .alluxio.grpc.file.FileSystemMasterCommonPOptions commonOptions = 3;</code>
   */
  alluxio.grpc.FileSystemMasterCommonPOptionsOrBuilder getCommonOptionsOrBuilder();
}