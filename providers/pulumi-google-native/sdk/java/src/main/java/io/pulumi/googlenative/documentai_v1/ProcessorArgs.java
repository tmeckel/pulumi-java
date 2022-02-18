// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.documentai_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProcessorArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProcessorArgs Empty = new ProcessorArgs();

    /**
     * The time the processor was created.
     * 
     */
    @InputImport(name="createTime")
    private final @Nullable Input<String> createTime;

    public Input<String> getCreateTime() {
        return this.createTime == null ? Input.empty() : this.createTime;
    }

    /**
     * The default processor version.
     * 
     */
    @InputImport(name="defaultProcessorVersion")
    private final @Nullable Input<String> defaultProcessorVersion;

    public Input<String> getDefaultProcessorVersion() {
        return this.defaultProcessorVersion == null ? Input.empty() : this.defaultProcessorVersion;
    }

    /**
     * The display name of the processor.
     * 
     */
    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * The KMS key used for encryption/decryption in CMEK scenarios. See https://cloud.google.com/security-key-management.
     * 
     */
    @InputImport(name="kmsKeyName")
    private final @Nullable Input<String> kmsKeyName;

    public Input<String> getKmsKeyName() {
        return this.kmsKeyName == null ? Input.empty() : this.kmsKeyName;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The processor type, e.g., INVOICE_PARSING, W2_PARSING, etc.
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public ProcessorArgs(
        @Nullable Input<String> createTime,
        @Nullable Input<String> defaultProcessorVersion,
        @Nullable Input<String> displayName,
        @Nullable Input<String> kmsKeyName,
        @Nullable Input<String> location,
        @Nullable Input<String> project,
        @Nullable Input<String> type) {
        this.createTime = createTime;
        this.defaultProcessorVersion = defaultProcessorVersion;
        this.displayName = displayName;
        this.kmsKeyName = kmsKeyName;
        this.location = location;
        this.project = project;
        this.type = type;
    }

    private ProcessorArgs() {
        this.createTime = Input.empty();
        this.defaultProcessorVersion = Input.empty();
        this.displayName = Input.empty();
        this.kmsKeyName = Input.empty();
        this.location = Input.empty();
        this.project = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProcessorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> createTime;
        private @Nullable Input<String> defaultProcessorVersion;
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> kmsKeyName;
        private @Nullable Input<String> location;
        private @Nullable Input<String> project;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ProcessorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.defaultProcessorVersion = defaults.defaultProcessorVersion;
    	      this.displayName = defaults.displayName;
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.type = defaults.type;
        }

        public Builder setCreateTime(@Nullable Input<String> createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder setCreateTime(@Nullable String createTime) {
            this.createTime = Input.ofNullable(createTime);
            return this;
        }

        public Builder setDefaultProcessorVersion(@Nullable Input<String> defaultProcessorVersion) {
            this.defaultProcessorVersion = defaultProcessorVersion;
            return this;
        }

        public Builder setDefaultProcessorVersion(@Nullable String defaultProcessorVersion) {
            this.defaultProcessorVersion = Input.ofNullable(defaultProcessorVersion);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setKmsKeyName(@Nullable Input<String> kmsKeyName) {
            this.kmsKeyName = kmsKeyName;
            return this;
        }

        public Builder setKmsKeyName(@Nullable String kmsKeyName) {
            this.kmsKeyName = Input.ofNullable(kmsKeyName);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public ProcessorArgs build() {
            return new ProcessorArgs(createTime, defaultProcessorVersion, displayName, kmsKeyName, location, project, type);
        }
    }
}
