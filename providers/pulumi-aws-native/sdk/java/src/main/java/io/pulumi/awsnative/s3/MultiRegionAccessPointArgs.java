// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3;

import io.pulumi.awsnative.s3.inputs.MultiRegionAccessPointPublicAccessBlockConfigurationArgs;
import io.pulumi.awsnative.s3.inputs.MultiRegionAccessPointRegionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MultiRegionAccessPointArgs extends io.pulumi.resources.ResourceArgs {

    public static final MultiRegionAccessPointArgs Empty = new MultiRegionAccessPointArgs();

    /**
     * The name you want to assign to this Multi Region Access Point.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The PublicAccessBlock configuration that you want to apply to this Multi Region Access Point. You can enable the configuration options in any combination. For more information about when Amazon S3 considers a bucket or object public, see https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status 'The Meaning of Public' in the Amazon Simple Storage Service Developer Guide.
     * 
     */
    @Import(name="publicAccessBlockConfiguration")
      private final @Nullable Output<MultiRegionAccessPointPublicAccessBlockConfigurationArgs> publicAccessBlockConfiguration;

    public Output<MultiRegionAccessPointPublicAccessBlockConfigurationArgs> getPublicAccessBlockConfiguration() {
        return this.publicAccessBlockConfiguration == null ? Codegen.empty() : this.publicAccessBlockConfiguration;
    }

    /**
     * The list of buckets that you want to associate this Multi Region Access Point with.
     * 
     */
    @Import(name="regions", required=true)
      private final Output<List<MultiRegionAccessPointRegionArgs>> regions;

    public Output<List<MultiRegionAccessPointRegionArgs>> getRegions() {
        return this.regions;
    }

    public MultiRegionAccessPointArgs(
        @Nullable Output<String> name,
        @Nullable Output<MultiRegionAccessPointPublicAccessBlockConfigurationArgs> publicAccessBlockConfiguration,
        Output<List<MultiRegionAccessPointRegionArgs>> regions) {
        this.name = name;
        this.publicAccessBlockConfiguration = publicAccessBlockConfiguration;
        this.regions = Objects.requireNonNull(regions, "expected parameter 'regions' to be non-null");
    }

    private MultiRegionAccessPointArgs() {
        this.name = Codegen.empty();
        this.publicAccessBlockConfiguration = Codegen.empty();
        this.regions = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MultiRegionAccessPointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<MultiRegionAccessPointPublicAccessBlockConfigurationArgs> publicAccessBlockConfiguration;
        private Output<List<MultiRegionAccessPointRegionArgs>> regions;

        public Builder() {
    	      // Empty
        }

        public Builder(MultiRegionAccessPointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.publicAccessBlockConfiguration = defaults.publicAccessBlockConfiguration;
    	      this.regions = defaults.regions;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder publicAccessBlockConfiguration(@Nullable Output<MultiRegionAccessPointPublicAccessBlockConfigurationArgs> publicAccessBlockConfiguration) {
            this.publicAccessBlockConfiguration = publicAccessBlockConfiguration;
            return this;
        }
        public Builder publicAccessBlockConfiguration(@Nullable MultiRegionAccessPointPublicAccessBlockConfigurationArgs publicAccessBlockConfiguration) {
            this.publicAccessBlockConfiguration = Codegen.ofNullable(publicAccessBlockConfiguration);
            return this;
        }
        public Builder regions(Output<List<MultiRegionAccessPointRegionArgs>> regions) {
            this.regions = Objects.requireNonNull(regions);
            return this;
        }
        public Builder regions(List<MultiRegionAccessPointRegionArgs> regions) {
            this.regions = Output.of(Objects.requireNonNull(regions));
            return this;
        }
        public Builder regions(MultiRegionAccessPointRegionArgs... regions) {
            return regions(List.of(regions));
        }        public MultiRegionAccessPointArgs build() {
            return new MultiRegionAccessPointArgs(name, publicAccessBlockConfiguration, regions);
        }
    }
}
