// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.datasync.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskOptionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskOptionsGetArgs Empty = new TaskOptionsGetArgs();

    /**
     * A file metadata that shows the last time a file was accessed (that is when the file was read or written to). If set to `BEST_EFFORT`, the DataSync Task attempts to preserve the original (that is, the version before sync `PREPARING` phase) `atime` attribute on all source files. Valid values: `BEST_EFFORT`, `NONE`. Default: `BEST_EFFORT`.
     * 
     */
    @InputImport(name="atime")
      private final @Nullable Input<String> atime;

    public Input<String> getAtime() {
        return this.atime == null ? Input.empty() : this.atime;
    }

    /**
     * Limits the bandwidth utilized. For example, to set a maximum of 1 MB, set this value to `1048576`. Value values: `-1` or greater. Default: `-1` (unlimited).
     * 
     */
    @InputImport(name="bytesPerSecond")
      private final @Nullable Input<Integer> bytesPerSecond;

    public Input<Integer> getBytesPerSecond() {
        return this.bytesPerSecond == null ? Input.empty() : this.bytesPerSecond;
    }

    /**
     * Group identifier of the file's owners. Valid values: `BOTH`, `INT_VALUE`, `NAME`, `NONE`. Default: `INT_VALUE` (preserve integer value of the ID).
     * 
     */
    @InputImport(name="gid")
      private final @Nullable Input<String> gid;

    public Input<String> getGid() {
        return this.gid == null ? Input.empty() : this.gid;
    }

    /**
     * Determines the type of logs that DataSync publishes to a log stream in the Amazon CloudWatch log group that you provide. Valid values: `OFF`, `BASIC`, `TRANSFER`. Default: `OFF`.
     * 
     */
    @InputImport(name="logLevel")
      private final @Nullable Input<String> logLevel;

    public Input<String> getLogLevel() {
        return this.logLevel == null ? Input.empty() : this.logLevel;
    }

    /**
     * A file metadata that indicates the last time a file was modified (written to) before the sync `PREPARING` phase. Value values: `NONE`, `PRESERVE`. Default: `PRESERVE`.
     * 
     */
    @InputImport(name="mtime")
      private final @Nullable Input<String> mtime;

    public Input<String> getMtime() {
        return this.mtime == null ? Input.empty() : this.mtime;
    }

    /**
     * Determines whether files at the destination should be overwritten or preserved when copying files. Valid values: `ALWAYS`, `NEVER`. Default: `ALWAYS`.
     * 
     */
    @InputImport(name="overwriteMode")
      private final @Nullable Input<String> overwriteMode;

    public Input<String> getOverwriteMode() {
        return this.overwriteMode == null ? Input.empty() : this.overwriteMode;
    }

    /**
     * Determines which users or groups can access a file for a specific purpose such as reading, writing, or execution of the file. Valid values: `NONE`, `PRESERVE`. Default: `PRESERVE`.
     * 
     */
    @InputImport(name="posixPermissions")
      private final @Nullable Input<String> posixPermissions;

    public Input<String> getPosixPermissions() {
        return this.posixPermissions == null ? Input.empty() : this.posixPermissions;
    }

    /**
     * Whether files deleted in the source should be removed or preserved in the destination file system. Valid values: `PRESERVE`, `REMOVE`. Default: `PRESERVE`.
     * 
     */
    @InputImport(name="preserveDeletedFiles")
      private final @Nullable Input<String> preserveDeletedFiles;

    public Input<String> getPreserveDeletedFiles() {
        return this.preserveDeletedFiles == null ? Input.empty() : this.preserveDeletedFiles;
    }

    /**
     * Whether the DataSync Task should preserve the metadata of block and character devices in the source files system, and recreate the files with that device name and metadata on the destination. The DataSync Task can’t sync the actual contents of such devices, because many of the devices are non-terminal and don’t return an end of file (EOF) marker. Valid values: `NONE`, `PRESERVE`. Default: `NONE` (ignore special devices).
     * 
     */
    @InputImport(name="preserveDevices")
      private final @Nullable Input<String> preserveDevices;

    public Input<String> getPreserveDevices() {
        return this.preserveDevices == null ? Input.empty() : this.preserveDevices;
    }

    /**
     * Determines whether tasks should be queued before executing the tasks. Valid values: `ENABLED`, `DISABLED`. Default `ENABLED`.
     * 
     */
    @InputImport(name="taskQueueing")
      private final @Nullable Input<String> taskQueueing;

    public Input<String> getTaskQueueing() {
        return this.taskQueueing == null ? Input.empty() : this.taskQueueing;
    }

    /**
     * Determines whether DataSync transfers only the data and metadata that differ between the source and the destination location, or whether DataSync transfers all the content from the source, without comparing to the destination location. Valid values: `CHANGED`, `ALL`. Default: `CHANGED`
     * 
     */
    @InputImport(name="transferMode")
      private final @Nullable Input<String> transferMode;

    public Input<String> getTransferMode() {
        return this.transferMode == null ? Input.empty() : this.transferMode;
    }

    /**
     * User identifier of the file's owners. Valid values: `BOTH`, `INT_VALUE`, `NAME`, `NONE`. Default: `INT_VALUE` (preserve integer value of the ID).
     * 
     */
    @InputImport(name="uid")
      private final @Nullable Input<String> uid;

    public Input<String> getUid() {
        return this.uid == null ? Input.empty() : this.uid;
    }

    /**
     * Whether a data integrity verification should be performed at the end of a task execution after all data and metadata have been transferred. Valid values: `NONE`, `POINT_IN_TIME_CONSISTENT`, `ONLY_FILES_TRANSFERRED`. Default: `POINT_IN_TIME_CONSISTENT`.
     * 
     */
    @InputImport(name="verifyMode")
      private final @Nullable Input<String> verifyMode;

    public Input<String> getVerifyMode() {
        return this.verifyMode == null ? Input.empty() : this.verifyMode;
    }

    public TaskOptionsGetArgs(
        @Nullable Input<String> atime,
        @Nullable Input<Integer> bytesPerSecond,
        @Nullable Input<String> gid,
        @Nullable Input<String> logLevel,
        @Nullable Input<String> mtime,
        @Nullable Input<String> overwriteMode,
        @Nullable Input<String> posixPermissions,
        @Nullable Input<String> preserveDeletedFiles,
        @Nullable Input<String> preserveDevices,
        @Nullable Input<String> taskQueueing,
        @Nullable Input<String> transferMode,
        @Nullable Input<String> uid,
        @Nullable Input<String> verifyMode) {
        this.atime = atime;
        this.bytesPerSecond = bytesPerSecond;
        this.gid = gid;
        this.logLevel = logLevel;
        this.mtime = mtime;
        this.overwriteMode = overwriteMode;
        this.posixPermissions = posixPermissions;
        this.preserveDeletedFiles = preserveDeletedFiles;
        this.preserveDevices = preserveDevices;
        this.taskQueueing = taskQueueing;
        this.transferMode = transferMode;
        this.uid = uid;
        this.verifyMode = verifyMode;
    }

    private TaskOptionsGetArgs() {
        this.atime = Input.empty();
        this.bytesPerSecond = Input.empty();
        this.gid = Input.empty();
        this.logLevel = Input.empty();
        this.mtime = Input.empty();
        this.overwriteMode = Input.empty();
        this.posixPermissions = Input.empty();
        this.preserveDeletedFiles = Input.empty();
        this.preserveDevices = Input.empty();
        this.taskQueueing = Input.empty();
        this.transferMode = Input.empty();
        this.uid = Input.empty();
        this.verifyMode = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> atime;
        private @Nullable Input<Integer> bytesPerSecond;
        private @Nullable Input<String> gid;
        private @Nullable Input<String> logLevel;
        private @Nullable Input<String> mtime;
        private @Nullable Input<String> overwriteMode;
        private @Nullable Input<String> posixPermissions;
        private @Nullable Input<String> preserveDeletedFiles;
        private @Nullable Input<String> preserveDevices;
        private @Nullable Input<String> taskQueueing;
        private @Nullable Input<String> transferMode;
        private @Nullable Input<String> uid;
        private @Nullable Input<String> verifyMode;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskOptionsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.atime = defaults.atime;
    	      this.bytesPerSecond = defaults.bytesPerSecond;
    	      this.gid = defaults.gid;
    	      this.logLevel = defaults.logLevel;
    	      this.mtime = defaults.mtime;
    	      this.overwriteMode = defaults.overwriteMode;
    	      this.posixPermissions = defaults.posixPermissions;
    	      this.preserveDeletedFiles = defaults.preserveDeletedFiles;
    	      this.preserveDevices = defaults.preserveDevices;
    	      this.taskQueueing = defaults.taskQueueing;
    	      this.transferMode = defaults.transferMode;
    	      this.uid = defaults.uid;
    	      this.verifyMode = defaults.verifyMode;
        }

        public Builder atime(@Nullable Input<String> atime) {
            this.atime = atime;
            return this;
        }

        public Builder atime(@Nullable String atime) {
            this.atime = Input.ofNullable(atime);
            return this;
        }

        public Builder bytesPerSecond(@Nullable Input<Integer> bytesPerSecond) {
            this.bytesPerSecond = bytesPerSecond;
            return this;
        }

        public Builder bytesPerSecond(@Nullable Integer bytesPerSecond) {
            this.bytesPerSecond = Input.ofNullable(bytesPerSecond);
            return this;
        }

        public Builder gid(@Nullable Input<String> gid) {
            this.gid = gid;
            return this;
        }

        public Builder gid(@Nullable String gid) {
            this.gid = Input.ofNullable(gid);
            return this;
        }

        public Builder logLevel(@Nullable Input<String> logLevel) {
            this.logLevel = logLevel;
            return this;
        }

        public Builder logLevel(@Nullable String logLevel) {
            this.logLevel = Input.ofNullable(logLevel);
            return this;
        }

        public Builder mtime(@Nullable Input<String> mtime) {
            this.mtime = mtime;
            return this;
        }

        public Builder mtime(@Nullable String mtime) {
            this.mtime = Input.ofNullable(mtime);
            return this;
        }

        public Builder overwriteMode(@Nullable Input<String> overwriteMode) {
            this.overwriteMode = overwriteMode;
            return this;
        }

        public Builder overwriteMode(@Nullable String overwriteMode) {
            this.overwriteMode = Input.ofNullable(overwriteMode);
            return this;
        }

        public Builder posixPermissions(@Nullable Input<String> posixPermissions) {
            this.posixPermissions = posixPermissions;
            return this;
        }

        public Builder posixPermissions(@Nullable String posixPermissions) {
            this.posixPermissions = Input.ofNullable(posixPermissions);
            return this;
        }

        public Builder preserveDeletedFiles(@Nullable Input<String> preserveDeletedFiles) {
            this.preserveDeletedFiles = preserveDeletedFiles;
            return this;
        }

        public Builder preserveDeletedFiles(@Nullable String preserveDeletedFiles) {
            this.preserveDeletedFiles = Input.ofNullable(preserveDeletedFiles);
            return this;
        }

        public Builder preserveDevices(@Nullable Input<String> preserveDevices) {
            this.preserveDevices = preserveDevices;
            return this;
        }

        public Builder preserveDevices(@Nullable String preserveDevices) {
            this.preserveDevices = Input.ofNullable(preserveDevices);
            return this;
        }

        public Builder taskQueueing(@Nullable Input<String> taskQueueing) {
            this.taskQueueing = taskQueueing;
            return this;
        }

        public Builder taskQueueing(@Nullable String taskQueueing) {
            this.taskQueueing = Input.ofNullable(taskQueueing);
            return this;
        }

        public Builder transferMode(@Nullable Input<String> transferMode) {
            this.transferMode = transferMode;
            return this;
        }

        public Builder transferMode(@Nullable String transferMode) {
            this.transferMode = Input.ofNullable(transferMode);
            return this;
        }

        public Builder uid(@Nullable Input<String> uid) {
            this.uid = uid;
            return this;
        }

        public Builder uid(@Nullable String uid) {
            this.uid = Input.ofNullable(uid);
            return this;
        }

        public Builder verifyMode(@Nullable Input<String> verifyMode) {
            this.verifyMode = verifyMode;
            return this;
        }

        public Builder verifyMode(@Nullable String verifyMode) {
            this.verifyMode = Input.ofNullable(verifyMode);
            return this;
        }
        public TaskOptionsGetArgs build() {
            return new TaskOptionsGetArgs(atime, bytesPerSecond, gid, logLevel, mtime, overwriteMode, posixPermissions, preserveDeletedFiles, preserveDevices, taskQueueing, transferMode, uid, verifyMode);
        }
    }
}
