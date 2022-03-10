// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ebs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SnapshotImportClientData {
    /**
     * A user-defined comment about the disk upload.
     * 
     */
    private final @Nullable String comment;
    /**
     * The time that the disk upload ends.
     * 
     */
    private final @Nullable String uploadEnd;
    /**
     * The size of the uploaded disk image, in GiB.
     * 
     */
    private final @Nullable Double uploadSize;
    /**
     * The time that the disk upload starts.
     * 
     */
    private final @Nullable String uploadStart;

    @OutputCustomType.Constructor
    private SnapshotImportClientData(
        @OutputCustomType.Parameter("comment") @Nullable String comment,
        @OutputCustomType.Parameter("uploadEnd") @Nullable String uploadEnd,
        @OutputCustomType.Parameter("uploadSize") @Nullable Double uploadSize,
        @OutputCustomType.Parameter("uploadStart") @Nullable String uploadStart) {
        this.comment = comment;
        this.uploadEnd = uploadEnd;
        this.uploadSize = uploadSize;
        this.uploadStart = uploadStart;
    }

    /**
     * A user-defined comment about the disk upload.
     * 
    */
    public Optional<String> getComment() {
        return Optional.ofNullable(this.comment);
    }
    /**
     * The time that the disk upload ends.
     * 
    */
    public Optional<String> getUploadEnd() {
        return Optional.ofNullable(this.uploadEnd);
    }
    /**
     * The size of the uploaded disk image, in GiB.
     * 
    */
    public Optional<Double> getUploadSize() {
        return Optional.ofNullable(this.uploadSize);
    }
    /**
     * The time that the disk upload starts.
     * 
    */
    public Optional<String> getUploadStart() {
        return Optional.ofNullable(this.uploadStart);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SnapshotImportClientData defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String comment;
        private @Nullable String uploadEnd;
        private @Nullable Double uploadSize;
        private @Nullable String uploadStart;

        public Builder() {
    	      // Empty
        }

        public Builder(SnapshotImportClientData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.uploadEnd = defaults.uploadEnd;
    	      this.uploadSize = defaults.uploadSize;
    	      this.uploadStart = defaults.uploadStart;
        }

        public Builder comment(@Nullable String comment) {
            this.comment = comment;
            return this;
        }

        public Builder uploadEnd(@Nullable String uploadEnd) {
            this.uploadEnd = uploadEnd;
            return this;
        }

        public Builder uploadSize(@Nullable Double uploadSize) {
            this.uploadSize = uploadSize;
            return this;
        }

        public Builder uploadStart(@Nullable String uploadStart) {
            this.uploadStart = uploadStart;
            return this;
        }
        public SnapshotImportClientData build() {
            return new SnapshotImportClientData(comment, uploadEnd, uploadSize, uploadStart);
        }
    }
}
