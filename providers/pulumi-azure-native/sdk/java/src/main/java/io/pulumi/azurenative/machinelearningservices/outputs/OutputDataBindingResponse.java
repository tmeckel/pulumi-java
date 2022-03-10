// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OutputDataBindingResponse {
    /**
     * ARM resource ID of the datastore where the data output will be stored.
     * 
     */
    private final @Nullable String datastoreId;
    /**
     * Mechanism for data movement to datastore.
     * 
     */
    private final @Nullable String mode;
    /**
     * Location of data inside the container process.
     * 
     */
    private final @Nullable String pathOnCompute;
    /**
     * Path within the datastore to the data.
     * 
     */
    private final @Nullable String pathOnDatastore;

    @OutputCustomType.Constructor
    private OutputDataBindingResponse(
        @OutputCustomType.Parameter("datastoreId") @Nullable String datastoreId,
        @OutputCustomType.Parameter("mode") @Nullable String mode,
        @OutputCustomType.Parameter("pathOnCompute") @Nullable String pathOnCompute,
        @OutputCustomType.Parameter("pathOnDatastore") @Nullable String pathOnDatastore) {
        this.datastoreId = datastoreId;
        this.mode = mode;
        this.pathOnCompute = pathOnCompute;
        this.pathOnDatastore = pathOnDatastore;
    }

    /**
     * ARM resource ID of the datastore where the data output will be stored.
     * 
    */
    public Optional<String> getDatastoreId() {
        return Optional.ofNullable(this.datastoreId);
    }
    /**
     * Mechanism for data movement to datastore.
     * 
    */
    public Optional<String> getMode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * Location of data inside the container process.
     * 
    */
    public Optional<String> getPathOnCompute() {
        return Optional.ofNullable(this.pathOnCompute);
    }
    /**
     * Path within the datastore to the data.
     * 
    */
    public Optional<String> getPathOnDatastore() {
        return Optional.ofNullable(this.pathOnDatastore);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OutputDataBindingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String datastoreId;
        private @Nullable String mode;
        private @Nullable String pathOnCompute;
        private @Nullable String pathOnDatastore;

        public Builder() {
    	      // Empty
        }

        public Builder(OutputDataBindingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datastoreId = defaults.datastoreId;
    	      this.mode = defaults.mode;
    	      this.pathOnCompute = defaults.pathOnCompute;
    	      this.pathOnDatastore = defaults.pathOnDatastore;
        }

        public Builder datastoreId(@Nullable String datastoreId) {
            this.datastoreId = datastoreId;
            return this;
        }

        public Builder mode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }

        public Builder pathOnCompute(@Nullable String pathOnCompute) {
            this.pathOnCompute = pathOnCompute;
            return this;
        }

        public Builder pathOnDatastore(@Nullable String pathOnDatastore) {
            this.pathOnDatastore = pathOnDatastore;
            return this;
        }
        public OutputDataBindingResponse build() {
            return new OutputDataBindingResponse(datastoreId, mode, pathOnCompute, pathOnDatastore);
        }
    }
}
