// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The properties of the source resource that this restore point collection is created from.
 * 
 */
public final class RestorePointCollectionSourcePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final RestorePointCollectionSourcePropertiesArgs Empty = new RestorePointCollectionSourcePropertiesArgs();

    /**
     * Resource Id of the source resource used to create this restore point collection
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    public RestorePointCollectionSourcePropertiesArgs(@Nullable Output<String> id) {
        this.id = id;
    }

    private RestorePointCollectionSourcePropertiesArgs() {
        this.id = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestorePointCollectionSourcePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> id;

        public Builder() {
    	      // Empty
        }

        public Builder(RestorePointCollectionSourcePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }        public RestorePointCollectionSourcePropertiesArgs build() {
            return new RestorePointCollectionSourcePropertiesArgs(id);
        }
    }
}
