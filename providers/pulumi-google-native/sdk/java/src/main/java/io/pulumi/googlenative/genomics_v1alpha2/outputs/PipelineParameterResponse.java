// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.genomics_v1alpha2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.genomics_v1alpha2.outputs.LocalCopyResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class PipelineParameterResponse {
    /**
     * The default value for this parameter. Can be overridden at runtime. If `localCopy` is present, then this must be a Google Cloud Storage path beginning with `gs://`.
     * 
     */
    private final String defaultValue;
    /**
     * Human-readable description.
     * 
     */
    private final String description;
    /**
     * If present, this parameter is marked for copying to and from the VM. `LocalCopy` indicates where on the VM the file should be. The value given to this parameter (either at runtime or using `defaultValue`) must be the remote path where the file should be.
     * 
     */
    private final LocalCopyResponse localCopy;
    /**
     * Name of the parameter - the pipeline runner uses this string as the key to the input and output maps in RunPipeline.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"defaultValue","description","localCopy","name"})
    private PipelineParameterResponse(
        String defaultValue,
        String description,
        LocalCopyResponse localCopy,
        String name) {
        this.defaultValue = Objects.requireNonNull(defaultValue);
        this.description = Objects.requireNonNull(description);
        this.localCopy = Objects.requireNonNull(localCopy);
        this.name = Objects.requireNonNull(name);
    }

    /**
     * The default value for this parameter. Can be overridden at runtime. If `localCopy` is present, then this must be a Google Cloud Storage path beginning with `gs://`.
     * 
     */
    public String getDefaultValue() {
        return this.defaultValue;
    }
    /**
     * Human-readable description.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * If present, this parameter is marked for copying to and from the VM. `LocalCopy` indicates where on the VM the file should be. The value given to this parameter (either at runtime or using `defaultValue`) must be the remote path where the file should be.
     * 
     */
    public LocalCopyResponse getLocalCopy() {
        return this.localCopy;
    }
    /**
     * Name of the parameter - the pipeline runner uses this string as the key to the input and output maps in RunPipeline.
     * 
     */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String defaultValue;
        private String description;
        private LocalCopyResponse localCopy;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultValue = defaults.defaultValue;
    	      this.description = defaults.description;
    	      this.localCopy = defaults.localCopy;
    	      this.name = defaults.name;
        }

        public Builder setDefaultValue(String defaultValue) {
            this.defaultValue = Objects.requireNonNull(defaultValue);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setLocalCopy(LocalCopyResponse localCopy) {
            this.localCopy = Objects.requireNonNull(localCopy);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public PipelineParameterResponse build() {
            return new PipelineParameterResponse(defaultValue, description, localCopy, name);
        }
    }
}
