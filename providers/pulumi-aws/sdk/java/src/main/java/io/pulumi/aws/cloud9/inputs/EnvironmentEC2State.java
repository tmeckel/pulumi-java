// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloud9.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentEC2State extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentEC2State Empty = new EnvironmentEC2State();

    /**
     * The ARN of the environment.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The number of minutes until the running instance is shut down after the environment has last been used.
     * 
     */
    @Import(name="automaticStopTimeMinutes")
      private final @Nullable Output<Integer> automaticStopTimeMinutes;

    public Output<Integer> getAutomaticStopTimeMinutes() {
        return this.automaticStopTimeMinutes == null ? Codegen.empty() : this.automaticStopTimeMinutes;
    }

    /**
     * The description of the environment.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The type of instance to connect to the environment, e.g., `t2.micro`.
     * 
     */
    @Import(name="instanceType")
      private final @Nullable Output<String> instanceType;

    public Output<String> getInstanceType() {
        return this.instanceType == null ? Codegen.empty() : this.instanceType;
    }

    /**
     * The name of the environment.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The ARN of the environment owner. This can be ARN of any AWS IAM principal. Defaults to the environment's creator.
     * 
     */
    @Import(name="ownerArn")
      private final @Nullable Output<String> ownerArn;

    public Output<String> getOwnerArn() {
        return this.ownerArn == null ? Codegen.empty() : this.ownerArn;
    }

    /**
     * The ID of the subnet in Amazon VPC that AWS Cloud9 will use to communicate with the Amazon EC2 instance.
     * 
     */
    @Import(name="subnetId")
      private final @Nullable Output<String> subnetId;

    public Output<String> getSubnetId() {
        return this.subnetId == null ? Codegen.empty() : this.subnetId;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    /**
     * The type of the environment (e.g., `ssh` or `ec2`)
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public EnvironmentEC2State(
        @Nullable Output<String> arn,
        @Nullable Output<Integer> automaticStopTimeMinutes,
        @Nullable Output<String> description,
        @Nullable Output<String> instanceType,
        @Nullable Output<String> name,
        @Nullable Output<String> ownerArn,
        @Nullable Output<String> subnetId,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> type) {
        this.arn = arn;
        this.automaticStopTimeMinutes = automaticStopTimeMinutes;
        this.description = description;
        this.instanceType = instanceType;
        this.name = name;
        this.ownerArn = ownerArn;
        this.subnetId = subnetId;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.type = type;
    }

    private EnvironmentEC2State() {
        this.arn = Codegen.empty();
        this.automaticStopTimeMinutes = Codegen.empty();
        this.description = Codegen.empty();
        this.instanceType = Codegen.empty();
        this.name = Codegen.empty();
        this.ownerArn = Codegen.empty();
        this.subnetId = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentEC2State defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<Integer> automaticStopTimeMinutes;
        private @Nullable Output<String> description;
        private @Nullable Output<String> instanceType;
        private @Nullable Output<String> name;
        private @Nullable Output<String> ownerArn;
        private @Nullable Output<String> subnetId;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentEC2State defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.automaticStopTimeMinutes = defaults.automaticStopTimeMinutes;
    	      this.description = defaults.description;
    	      this.instanceType = defaults.instanceType;
    	      this.name = defaults.name;
    	      this.ownerArn = defaults.ownerArn;
    	      this.subnetId = defaults.subnetId;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.type = defaults.type;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder automaticStopTimeMinutes(@Nullable Output<Integer> automaticStopTimeMinutes) {
            this.automaticStopTimeMinutes = automaticStopTimeMinutes;
            return this;
        }
        public Builder automaticStopTimeMinutes(@Nullable Integer automaticStopTimeMinutes) {
            this.automaticStopTimeMinutes = Codegen.ofNullable(automaticStopTimeMinutes);
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
        public Builder instanceType(@Nullable Output<String> instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = Codegen.ofNullable(instanceType);
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
        public Builder ownerArn(@Nullable Output<String> ownerArn) {
            this.ownerArn = ownerArn;
            return this;
        }
        public Builder ownerArn(@Nullable String ownerArn) {
            this.ownerArn = Codegen.ofNullable(ownerArn);
            return this;
        }
        public Builder subnetId(@Nullable Output<String> subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = Codegen.ofNullable(subnetId);
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
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public EnvironmentEC2State build() {
            return new EnvironmentEC2State(arn, automaticStopTimeMinutes, description, instanceType, name, ownerArn, subnetId, tags, tagsAll, type);
        }
    }
}
