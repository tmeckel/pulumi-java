// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.timeseriesinsights;

import io.pulumi.azurenative.timeseriesinsights.enums.EnvironmentKind;
import io.pulumi.azurenative.timeseriesinsights.inputs.SkuArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentArgs Empty = new EnvironmentArgs();

    /**
     * Name of the environment
     * 
     */
    @Import(name="environmentName")
      private final @Nullable Output<String> environmentName;

    public Output<String> getEnvironmentName() {
        return this.environmentName == null ? Codegen.empty() : this.environmentName;
    }

    /**
     * The kind of the environment.
     * 
     */
    @Import(name="kind", required=true)
      private final Output<Either<String,EnvironmentKind>> kind;

    public Output<Either<String,EnvironmentKind>> getKind() {
        return this.kind;
    }

    /**
     * The location of the resource.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The sku determines the type of environment, either Gen1 (S1 or S2) or Gen2 (L1). For Gen1 environments the sku determines the capacity of the environment, the ingress rate, and the billing rate.
     * 
     */
    @Import(name="sku", required=true)
      private final Output<SkuArgs> sku;

    public Output<SkuArgs> getSku() {
        return this.sku;
    }

    /**
     * Key-value pairs of additional properties for the resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public EnvironmentArgs(
        @Nullable Output<String> environmentName,
        Output<Either<String,EnvironmentKind>> kind,
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        Output<SkuArgs> sku,
        @Nullable Output<Map<String,String>> tags) {
        this.environmentName = environmentName;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = Objects.requireNonNull(sku, "expected parameter 'sku' to be non-null");
        this.tags = tags;
    }

    private EnvironmentArgs() {
        this.environmentName = Codegen.empty();
        this.kind = Codegen.empty();
        this.location = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.sku = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> environmentName;
        private Output<Either<String,EnvironmentKind>> kind;
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private Output<SkuArgs> sku;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.environmentName = defaults.environmentName;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
        }

        public Builder environmentName(@Nullable Output<String> environmentName) {
            this.environmentName = environmentName;
            return this;
        }
        public Builder environmentName(@Nullable String environmentName) {
            this.environmentName = Codegen.ofNullable(environmentName);
            return this;
        }
        public Builder kind(Output<Either<String,EnvironmentKind>> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder kind(Either<String,EnvironmentKind> kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder sku(Output<SkuArgs> sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }
        public Builder sku(SkuArgs sku) {
            this.sku = Output.of(Objects.requireNonNull(sku));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public EnvironmentArgs build() {
            return new EnvironmentArgs(environmentName, kind, location, resourceGroupName, sku, tags);
        }
    }
}
