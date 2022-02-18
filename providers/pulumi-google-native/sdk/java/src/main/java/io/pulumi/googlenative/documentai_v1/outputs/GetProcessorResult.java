// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.documentai_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetProcessorResult {
    /**
     * The time the processor was created.
     * 
     */
    private final String createTime;
    /**
     * The default processor version.
     * 
     */
    private final String defaultProcessorVersion;
    /**
     * The display name of the processor.
     * 
     */
    private final String displayName;
    /**
     * The KMS key used for encryption/decryption in CMEK scenarios. See https://cloud.google.com/security-key-management.
     * 
     */
    private final String kmsKeyName;
    /**
     * Immutable. The resource name of the processor. Format: `projects/{project}/locations/{location}/processors/{processor}`
     * 
     */
    private final String name;
    /**
     * Immutable. The http endpoint that can be called to invoke processing.
     * 
     */
    private final String processEndpoint;
    /**
     * The state of the processor.
     * 
     */
    private final String state;
    /**
     * The processor type, e.g., INVOICE_PARSING, W2_PARSING, etc.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"createTime","defaultProcessorVersion","displayName","kmsKeyName","name","processEndpoint","state","type"})
    private GetProcessorResult(
        String createTime,
        String defaultProcessorVersion,
        String displayName,
        String kmsKeyName,
        String name,
        String processEndpoint,
        String state,
        String type) {
        this.createTime = Objects.requireNonNull(createTime);
        this.defaultProcessorVersion = Objects.requireNonNull(defaultProcessorVersion);
        this.displayName = Objects.requireNonNull(displayName);
        this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
        this.name = Objects.requireNonNull(name);
        this.processEndpoint = Objects.requireNonNull(processEndpoint);
        this.state = Objects.requireNonNull(state);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The time the processor was created.
     * 
     */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * The default processor version.
     * 
     */
    public String getDefaultProcessorVersion() {
        return this.defaultProcessorVersion;
    }
    /**
     * The display name of the processor.
     * 
     */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The KMS key used for encryption/decryption in CMEK scenarios. See https://cloud.google.com/security-key-management.
     * 
     */
    public String getKmsKeyName() {
        return this.kmsKeyName;
    }
    /**
     * Immutable. The resource name of the processor. Format: `projects/{project}/locations/{location}/processors/{processor}`
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Immutable. The http endpoint that can be called to invoke processing.
     * 
     */
    public String getProcessEndpoint() {
        return this.processEndpoint;
    }
    /**
     * The state of the processor.
     * 
     */
    public String getState() {
        return this.state;
    }
    /**
     * The processor type, e.g., INVOICE_PARSING, W2_PARSING, etc.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProcessorResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String defaultProcessorVersion;
        private String displayName;
        private String kmsKeyName;
        private String name;
        private String processEndpoint;
        private String state;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProcessorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.defaultProcessorVersion = defaults.defaultProcessorVersion;
    	      this.displayName = defaults.displayName;
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.name = defaults.name;
    	      this.processEndpoint = defaults.processEndpoint;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setDefaultProcessorVersion(String defaultProcessorVersion) {
            this.defaultProcessorVersion = Objects.requireNonNull(defaultProcessorVersion);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setKmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProcessEndpoint(String processEndpoint) {
            this.processEndpoint = Objects.requireNonNull(processEndpoint);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetProcessorResult build() {
            return new GetProcessorResult(createTime, defaultProcessorVersion, displayName, kmsKeyName, name, processEndpoint, state, type);
        }
    }
}
