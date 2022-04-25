// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FlockerVolumeSource {
    /**
     * @return Name of the dataset stored as metadata -&gt; name on the dataset for Flocker should be considered as deprecated
     * 
     */
    private final @Nullable String datasetName;
    /**
     * @return UUID of the dataset. This is unique identifier of a Flocker dataset
     * 
     */
    private final @Nullable String datasetUUID;

    @CustomType.Constructor
    private FlockerVolumeSource(
        @CustomType.Parameter("datasetName") @Nullable String datasetName,
        @CustomType.Parameter("datasetUUID") @Nullable String datasetUUID) {
        this.datasetName = datasetName;
        this.datasetUUID = datasetUUID;
    }

    /**
     * @return Name of the dataset stored as metadata -&gt; name on the dataset for Flocker should be considered as deprecated
     * 
     */
    public Optional<String> datasetName() {
        return Optional.ofNullable(this.datasetName);
    }
    /**
     * @return UUID of the dataset. This is unique identifier of a Flocker dataset
     * 
     */
    public Optional<String> datasetUUID() {
        return Optional.ofNullable(this.datasetUUID);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlockerVolumeSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String datasetName;
        private @Nullable String datasetUUID;

        public Builder() {
    	      // Empty
        }

        public Builder(FlockerVolumeSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetName = defaults.datasetName;
    	      this.datasetUUID = defaults.datasetUUID;
        }

        public Builder datasetName(@Nullable String datasetName) {
            this.datasetName = datasetName;
            return this;
        }
        public Builder datasetUUID(@Nullable String datasetUUID) {
            this.datasetUUID = datasetUUID;
            return this;
        }        public FlockerVolumeSource build() {
            return new FlockerVolumeSource(datasetName, datasetUUID);
        }
    }
}
