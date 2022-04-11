// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicediscovery.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PrivateDnsNamespaceState extends io.pulumi.resources.ResourceArgs {

    public static final PrivateDnsNamespaceState Empty = new PrivateDnsNamespaceState();

    /**
     * The ARN that Amazon Route 53 assigns to the namespace when you create it.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The description that you specify for the namespace when you create it.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The ID for the hosted zone that Amazon Route 53 creates when you create a namespace.
     * 
     */
    @Import(name="hostedZone")
      private final @Nullable Output<String> hostedZone;

    public Output<String> getHostedZone() {
        return this.hostedZone == null ? Codegen.empty() : this.hostedZone;
    }

    /**
     * The name of the namespace.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * A map of tags to assign to the namespace. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    /**
     * The ID of VPC that you want to associate the namespace with.
     * 
     */
    @Import(name="vpc")
      private final @Nullable Output<String> vpc;

    public Output<String> getVpc() {
        return this.vpc == null ? Codegen.empty() : this.vpc;
    }

    public PrivateDnsNamespaceState(
        @Nullable Output<String> arn,
        @Nullable Output<String> description,
        @Nullable Output<String> hostedZone,
        @Nullable Output<String> name,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> vpc) {
        this.arn = arn;
        this.description = description;
        this.hostedZone = hostedZone;
        this.name = name;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.vpc = vpc;
    }

    private PrivateDnsNamespaceState() {
        this.arn = Codegen.empty();
        this.description = Codegen.empty();
        this.hostedZone = Codegen.empty();
        this.name = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
        this.vpc = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateDnsNamespaceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> description;
        private @Nullable Output<String> hostedZone;
        private @Nullable Output<String> name;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> vpc;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateDnsNamespaceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.hostedZone = defaults.hostedZone;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.vpc = defaults.vpc;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder hostedZone(@Nullable Output<String> hostedZone) {
            this.hostedZone = hostedZone;
            return this;
        }
        public Builder hostedZone(@Nullable String hostedZone) {
            this.hostedZone = Codegen.ofNullable(hostedZone);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }
        public Builder vpc(@Nullable Output<String> vpc) {
            this.vpc = vpc;
            return this;
        }
        public Builder vpc(@Nullable String vpc) {
            this.vpc = Codegen.ofNullable(vpc);
            return this;
        }        public PrivateDnsNamespaceState build() {
            return new PrivateDnsNamespaceState(arn, description, hostedZone, name, tags, tagsAll, vpc);
        }
    }
}
